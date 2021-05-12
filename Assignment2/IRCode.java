// Generated from cal.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;
import java.util.*;

public class IRCode extends calBaseVisitor<String> {

	private static SymbolTable st = new SymbolTable();
    private static int getparam_counter = 0;
    private static int condition_counter = 0;
    private static int value_counter_main = 0;
    private static int temp_counter = 0;
    private static boolean expr_arglist = true;    
    private static boolean expr_binop = false;
    private static LinkedList<String> outputs = new LinkedList<String>();

	@Override
	public String visitProg(calParser.ProgContext ctx) {
        return visitChildren(ctx);
	}

	@Override
	public String visitDecl(calParser.DeclContext ctx){
		return visitChildren(ctx);
	}

	@Override
	public String visitDecl_list(calParser.Decl_listContext ctx){
		return visitChildren(ctx);
	}

	@Override
	public String visitVar_decl(calParser.Var_declContext ctx){
		visitChildren(ctx);
		String id = ctx.ID().getText();
        String type = ctx.type().getText();

		//st.insert(false, id, type);
        // System.out.println();
		return "void";
	}

	@Override
	public String visitConst_decl(calParser.Const_declContext ctx){
		String id = ctx.ID().getText();
		String type = ctx.type().getText();
        String expr = visit(ctx.expr());

		st.insert(false, id, expr);	
        System.out.println("\t" + id + " = " + expr);
		return "void";
	}

	@Override
	public String visitFunction_list(calParser.Function_listContext ctx){
		return visitChildren(ctx);
	}

	@Override
	public String visitFunction(calParser.FunctionContext ctx){
		String id = ctx.ID().getText();
		String type = ctx.type().getText();
        System.out.println(id + ":");
        visitChildren(ctx);
		st.insert_LL("parameters", id, type);
        //clear counter for getparam
        getparam_counter = 0;
		return type;
	}

	@Override
	public String visitType(calParser.TypeContext ctx){
		return visitChildren(ctx);
	}

	@Override
	public String visitParameter_list(calParser.Parameter_listContext ctx){
		return visitChildren(ctx);
	}

	@Override
	public String visitNemp_parameter_list(calParser.Nemp_parameter_listContext ctx){
		visitChildren(ctx);
        getparam_counter ++;
		String id = ctx.ID().getText();
		String type = ctx.type().getText();
        System.out.println("\t" + id + " = getparam " + getparam_counter);
		//st.insert(true, id, type);
        getparam_counter = 0;
		st.add_to_LL("parameters", type);
		return type;
	}
	
	@Override
	public String visitMain(calParser.MainContext ctx){
        System.out.println("main:");
		visitChildren(ctx);
        print_LinkedList();
        return "void";
	}
	
	@Override
	public String visitStatement_block(calParser.Statement_blockContext ctx){
		return visitChildren(ctx);
	}

	@Override
	public String visitIDExprStm(calParser.IDExprStmContext ctx) {
		String id = ctx.ID().getText();
		String value_from_expr = visit(ctx.expr());
        //If it comes from arg list -> id = value
        //if it comes from binop -> dont print
        //else print print it
        if(expr_arglist) {
            System.out.println("\t" + id + " = " + value_from_expr);
            expr_arglist = true;
        }
        
        else if(expr_binop){
            expr_binop = false;
        }
        //If it comes from compopExpr -> value
		String id_type = st.get_type(id);
		return id_type;

	}
	@Override
	public String visitIDArgListStm(calParser.IDArgListStmContext ctx) {
		String id = ctx.ID().getText();
		String type = st.get_type(id);
        visit(ctx.arg_list());
        st.get_LL("arguments");
        expr_arglist = true;
        // System.out.println(st.get_LL("arguments").toString());
		return type;
	}
	@Override
	public String visitBlockStm(calParser.BlockStmContext ctx) {
		return visitChildren(ctx);
	}
	@Override
	public String visitIfBlocktm(calParser.IfBlocktmContext ctx) {
		return visitChildren(ctx);
	}	
	@Override
	public String visitWhileStm(calParser.WhileStmContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public String visitIDFrag(calParser.IDFragContext ctx) {
		//Look up id in symbol table
		String id = ctx.ID().getText();
		String value = st.get_type(id);
        st.insert(false, id, id);
		return id;
	}

	@Override
	public String visitNegIDFrag(calParser.NegIDFragContext ctx) {
		String id = ctx.ID().getText();
		String neg = ctx.NEG().getText();
		String type = st.get_type(id);

		return neg+id;
	}
		
	@Override
	public String visitNumberFrag(calParser.NumberFragContext ctx) {
        return ctx.NUMBER().getText();
	}

	@Override
	public String visitTrueFrag(calParser.TrueFragContext ctx) {
		return ctx.True().getText();
	}

	@Override
	public String visitFalseFrag(calParser.FalseFragContext ctx) {
		return ctx.False().getText();
	}

	@Override
	public String visitBinOpExpr(calParser.BinOpExprContext ctx) {
        expr_arglist = false;
		String expr1 = visit(ctx.expr(0));
		String expr2 = visit(ctx.expr(1));

        if(st.get_type(expr1) != "notExist")
            expr1 = st.get_type(expr1);
        if(st.get_type(expr2) != "notExist")
            expr1 = st.get_type(expr2);

        String temp = "t" + temp_counter;
        temp_counter++;
        String oper = visit(ctx.binary_arith_op());
	    System.out.println("\t" + temp + " = " + expr1 + " " + oper + " " + expr2);
        expr_binop = true;
        return temp;
	}

    public void temp_handler(String tmp) {

    }
	
	@Override
	public String visitBracExpr(calParser.BracExprContext ctx) {     
		return visit(ctx.expr());
	}

	@Override
	public String visitIDExpr(calParser.IDExprContext ctx) {
		String id = ctx.ID().getText();
        visit(ctx.arg_list());
        int number_of_values = st.get_LL("arguments").size();

        String return_value = "call " + id + ", " + number_of_values;
        st.clear_LL("arguments");
        return return_value;
	}

	@Override
	public String visitFragExpr(calParser.FragExprContext ctx) {
		return visit(ctx.frag());
	}

	@Override
	public String visitBinary_arith_op(calParser.Binary_arith_opContext ctx){
        //return plus or minus
        return ctx.getText();
	}
	
	public String visitNegCond(calParser.NegCondContext ctx) {
		return visitChildren(ctx);
	}


	public String visitBrackCond(calParser.BrackCondContext ctx) {
		return visitChildren(ctx);
	}

	public String visitOrAndCond(calParser.OrAndCondContext ctx) {
		String cond1 = visit(ctx.condition(0));
		String cond2 = visit(ctx.condition(1));
        int orOrAnd = ctx.op.getType();
		// could through error
		return cond1 + " " + orOrAnd + " " + cond2;
	}

	public String visitExprCompOpCond(calParser.ExprCompOpCondContext ctx) {
		String expr1 = visit(ctx.expr(0));
		String expr2 = visit(ctx.expr(1));
		String compop = ctx.comp_op().getText();
        ArrayList<String> expr = new ArrayList<String>();
        //try getting from symbol table -> if you can then push that param
        // String ex1 = st.get_type(expr);
        // if any of the expressisions is a frag we need to push to stack
        System.out.println();
        
        if((Character.isDigit(expr1.charAt(0)) == false)) {
            System.out.println("\t" + "param " + expr1);
            expr.add(expr1);
            getparam_counter ++;
        }
        if((Character.isDigit(expr2.charAt(0)) == false)) {
            System.out.println("\t" + "param " + expr2);
            expr.add(expr2);
            getparam_counter++;
        }
        System.out.println("\tv" + value_counter_main + " = call " + "con" + condition_counter + ", " + getparam_counter);

        
        for(int i =0; i<expr.size();i++) {
            outputs.add("con" + condition_counter + ":");
            for(int j =0;j<getparam_counter;j++) {
                outputs.add("\t" + expr.get(j) + " = getparam " + j);
            }
            outputs.add("\tIf " + expr1 + " " + compop + " " + expr2 + " goto v1");
            outputs.add("\tgoto v2");
            outputs.add("\tv1:");
            outputs.add("\t\treturn true");
            outputs.add("\tv2:");
            outputs.add("\t\treturn false");
        }

        if(getparam_counter == 2) System.out.println("\tif v0 && v1 goto test1");
        condition_counter++;
        getparam_counter = 0;
        value_counter_main++;
		return expr1 + " " + compop + " " + expr2;
	}
		
	@Override
	public String visitComp_op(calParser.Comp_opContext ctx){
		return visitChildren(ctx);
	}

	@Override
	public String visitArg_list(calParser.Arg_listContext ctx){
		return visitChildren(ctx);
	}

	@Override
	public String visitNemp_arg_list(calParser.Nemp_arg_listContext ctx){
        visitChildren(ctx);
		String id = ctx.ID().getText();
        //print out one by one param arg_1
        System.out.println("\t" + "param " + id);
		st.add_to_LL("arguments", id);
        return id;
	}

    public void print_LinkedList() {
        for (Iterator i = outputs.iterator(); i.hasNext();) {
            System.out.println(i.next());
        }
    }
}