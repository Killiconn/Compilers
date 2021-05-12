// Generated from cal.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;
import java.util.*;

public class CalVisitor extends calBaseVisitor<String> {

	private static SymbolTable st = new SymbolTable();
	private static HashMap<String, Integer> variable_decl = new HashMap<String, Integer>();
	private static HashMap<String, Integer> constants_decl = new HashMap<String, Integer>();
	private static Set<String> functionChecker = new HashSet<>();
	@Override
	public String visitMain(calParser.MainContext ctx){
		visitChildren(ctx);
        return "";
	}
	

	@Override
	public String visitDecl_list(calParser.Decl_listContext ctx){
		visitChildren(ctx);
		variable_decl.clear();
		return "void";
	}

	@Override
	public String visitVar_decl(calParser.Var_declContext ctx){
		visitChildren(ctx);
		String id = ctx.ID().getText();
		String type = ctx.type().getText();

		if(constants_decl.containsKey(id)) {
			System.out.println("Error: " + id + " is a constant, cannot be declared again.");
			System.exit(-1);
		}
		if(variable_decl.containsKey(id)) {
			System.out.println("Error: " + id + " is already declared in symbol table.");
			System.exit(-1);
		}
		else variable_decl.put(id, 1);

		st.insert(false, id, type);

		return "void";
	}

	@Override
	public String visitConst_decl(calParser.Const_declContext ctx){
		visitChildren(ctx);
		String id = ctx.ID().getText();
		String type = ctx.type().getText();
		String type_from_expr = visit(ctx.expr());
		if(!type.equals(type_from_expr)){
			System.out.println("Error: " + id + " requires type " + type + ", type " + type_from_expr + " received.");
			System.exit(-1);
		}
		if(constants_decl.containsKey(id)) {
			System.out.println("Error: " + id + " is a constant, cannot be declared again.");
			System.exit(-1);
		}
		else constants_decl.put(id, 1);

		st.insert(false, id, type);	

		return "void";
	}

	@Override
	public String visitFunction(calParser.FunctionContext ctx){
		visitChildren(ctx);
		String id = ctx.ID().getText();
		String type = ctx.type().getText();
		st.insert_LL("parameters", id, type);
		st.remove_stack();

		return type;
	}

	@Override
	public String visitNemp_parameter_list(calParser.Nemp_parameter_listContext ctx){
		visitChildren(ctx);
		String id = ctx.ID().getText();
		String type = ctx.type().getText();

		st.insert(true, id, type);
		st.add_to_LL("parameters", type);
		return type;
	}

	@Override
	public String visitIDExprStm(calParser.IDExprStmContext ctx) {
		String id = ctx.ID().getText();
		String type_from_expr = visit(ctx.expr());
		String id_type = st.get_type(id);
		if(type_from_expr.equals("notExist")) {
			System.out.println("Identifier " + id + " does not exist");
			System.exit(-1);
		}
		if(!id_type.equals(type_from_expr) || type_from_expr == null) {
			System.out.println("Error:" + type_from_expr + " cannot be compared to " + id_type);
			System.exit(-1);
			// If we continue to compile the type would be assigned to undefined
			return "undefined";
		}
		return id_type;

	}
	@Override
	public String visitIDArgListStm(calParser.IDArgListStmContext ctx) {
		String id = ctx.ID().getText();
		String type = st.get_type(id);
		LinkedList<String> arguments_inHashMap = st.get_function_table(id);
		LinkedList<String> arguments_Given = st.get_LL("arguments");
		if(arguments_inHashMap.size()==0) {
			System.out.println("Identifier " + id + " does not exist");
			System.exit(-1);
		}
		arguments_inHashMap.removeLast();
		visitChildren(ctx);

		//Length of parameters given is false
		if (arguments_inHashMap.size() != arguments_Given.size()){
			System.out.println("Incorrect number of arguments given :");
			System.out.println("Arguments required: " + arguments_inHashMap.toString());
			System.out.println("Arguments received: " + arguments_Given.toString());
			System.exit(-1);
		}

		else if(!arguments_inHashMap.toString().equals(arguments_Given.toString())) {
			System.out.println("Incorrect type of arguments given :");
			System.out.println("Arguments required: " + arguments_inHashMap.toString());
			System.out.println("Arguments received: " + arguments_Given.toString());
			System.exit(-1);
		}
		st.clear_LL("arguments");
		
		return "void";
	}

	@Override
	public String visitIDFrag(calParser.IDFragContext ctx) {
		//Look up id in symbol table
		String id = ctx.ID().getText();
		String type = st.get_type(id);
		if(type.equals("notExist")) {
			System.out.println("Error: Identifier " + id + " does not exist. Define identifiers before passing.");
			System.exit(-1);
		}
		return type;
	}

	@Override
	public String visitNegIDFrag(calParser.NegIDFragContext ctx) {
		String id = ctx.ID().getText();
		String neg = ctx.NEG().getText();
		String type = st.get_type(id);
		if(!type.equals("integer")) {
			System.out.println("Error: " + type + " is not an integer");
			System.exit(-1);
		}
		return "integer";
	}
		
	@Override
	public String visitNumberFrag(calParser.NumberFragContext ctx) {
		return "integer";
	}

	@Override
	public String visitTrueFrag(calParser.TrueFragContext ctx) {
		return "boolean";
	}

	@Override
	public String visitFalseFrag(calParser.FalseFragContext ctx) {
		return "boolean";
	}

	@Override
	public String visitBinOpExpr(calParser.BinOpExprContext ctx) {
		String expr1 = visit(ctx.expr(0));
		String expr2 = visit(ctx.expr(1));
		//Both have to be integer
		if(!expr1.equals("integer") && !expr2.equals("integer")) {
			System.out.println("Error: " + expr1 + " cannot be compared to " + expr2);
			System.out.println("Both are required to be integers.");
			System.exit(-1);
		}
		return "integer";
	}

	@Override
	public String visitIDExpr(calParser.IDExprContext ctx) {
		String id = ctx.ID().getText();
		LinkedList<String> functionLL = st.get_function_table(id);
		String type = "";
		// type is the last node in the linked list
		try {
			type = functionLL.getLast();
		}
		catch (Exception e) {
			System.out.println("Error: Identifier " + id + " does not exist");
			System.exit(-1);
		}
		visitChildren(ctx);
		//Unsafe operators
		LinkedList<String> arguments_inHashMap = st.get_function_table(id);
		LinkedList<String> arguments_Given = st.get_LL("arguments");
		arguments_Given.add(type);

		if (arguments_inHashMap.size() != arguments_Given.size()){
			System.out.println("Incorrect number of arguments given :");
			System.out.println("Arguments required: " + arguments_inHashMap.toString());
			System.out.println("Arguments recieved: " + arguments_Given.toString());
			System.exit(-1);
		}

		else if(!arguments_inHashMap.toString().equals(arguments_Given.toString())) {
			System.out.println("Incorrect type of arguments given :");
			System.out.println("Arguments required: " + arguments_inHashMap.toString());
			System.out.println("Arguments recieved: " + arguments_Given.toString());
			System.exit(-1);
		}

		st.clear_LL("arguments");
		return type;
	}

	public String visitOrAndCond(calParser.OrAndCondContext ctx) {
		String cond1 = visit(ctx.condition(0));
		String cond2 = visit(ctx.condition(1));
		try {
			if(!cond1.equals("boolean") || !cond2.equals("boolean")) {
				System.out.println("Error: Incompatible Expression: : " + cond1 + " cannot be compared to " + cond2);
				System.exit(-1);
			}
		}
		catch (Exception e) {}	
		return "boolean";
	}

	public String visitExprCompOpCond(calParser.ExprCompOpCondContext ctx) {
		String expr1 = visit(ctx.expr(0));
		String expr2 = visit(ctx.expr(1));
		String compop = ctx.comp_op().getText();
		
		if(!expr1.equals("integer") || !expr2.equals("integer")) {
			//Unless they are boolean 
			//In this case they comp op should be equals or not equals
			if(compop.equals("=") || compop.equals("!=")) {
				return "boolean";
			}
			else {
				System.out.println("Error: Incompatible expression, " + expr1 + " " + compop + " " + expr2);
				System.exit(-1);
			}
		}
		return "boolean";
	}

	@Override
	public String visitNemp_arg_list(calParser.Nemp_arg_listContext ctx){
		visitChildren(ctx);
		String id = ctx.ID().getText();
		String type = st.get_type(id);
		if(type.equals("notExist")) {
			System.out.println("Error: Identifier " + id + " does not exist. Define identifiers before passing.");
			System.exit(-1);
		}
		st.add_to_LL("arguments", type);
		return type;
	}
}