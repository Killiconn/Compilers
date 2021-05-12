import java.util.*;

public class SymbolTable {
    private HashMap<String, LinkedList<String>> st;
    private HashMap<String, LinkedList<String>> st_functions;
	private Stack<String> undoStack;
    private LinkedList<String> parametersLL;
    private LinkedList<String> argumentsLL;

    SymbolTable() {
        st = new HashMap<>();
        st_functions = new HashMap<>();
        undoStack = new Stack<String>();
        parametersLL = new LinkedList<String>();
        argumentsLL = new LinkedList<String>();
    }   

    public void add_to_LL(String linkedlist, String type) {
        if(linkedlist.equals("parameters")) parametersLL.add(type);
        else if(linkedlist.equals("arguments")) argumentsLL.add(type);
    }

    public LinkedList get_LL(String linkedlist) {
        if(linkedlist.equals("arguments")) return argumentsLL;
        else return parametersLL;
    }

    public LinkedList get_saved_LL(String id) {
        return st.get(id);
    }

    public void insert_LL(String linkedlist, String function_name, String function_type){
        LinkedList<String> clone = new LinkedList<String>();
        if(linkedlist.equals("parameters")) {
            for(String a : parametersLL) {
                clone.add(a);
            }
            clone.add(function_type);
            st_functions.put(function_name, clone);
            undoStack.push("Function Marker");
        }
        else {
            for(String a : argumentsLL) {
                clone.add(a);
            }
            clone.add(function_type);
            st_functions.put(function_name, clone);
        }
    }

    public void clear_LL(String linkedlist) {
        if(linkedlist.equals("parameters")) parametersLL.clear();
        else if(linkedlist.equals("arguments")) argumentsLL.clear();
    }

    public boolean stack_empty() {
        return st_functions.isEmpty();
    }

    public void insert(boolean function, String id, String type) {
        LinkedList<String> tmp = st.get(id);
        if(function == false) {  
            if (tmp == null) {   
                LinkedList<String> newLL = new LinkedList<String>();      
                newLL.addFirst(type);
                st.put(id, newLL);
            }
            else {
                tmp.addFirst(type);
                st.put(id, tmp);
            }         
        }
        else if(function == true) {
            if(st.containsKey(id)) {
                tmp.addFirst(type);
                st.put(id, tmp);
            }
            else {
                LinkedList<String> newLL = new LinkedList<String>();      
                newLL.addFirst(type);
                st.put(id, newLL);
            }
            undoStack.push(id);
        }
        }

    public LinkedList<String> get_function_table(String id) {
        LinkedList<String> tmp = st_functions.get(id);
        if (!st_functions.isEmpty() && tmp!=null) {
            return tmp;
        }
        else {
            return tmp;
        }
    }

    public Set get_functionST_values() {
        return st_functions.keySet();
    }

    public void remove_function_st(String id) {
        try {
            st_functions.remove(id);
        }
        catch (Exception e) {}
    }

    public String get_type(String id){
        LinkedList<String> tmp = st.get(id);
        try{
            String type = tmp.getFirst();
            return type;
        }
        catch (Exception e) {
            return "notExist";
        }
    }

    public void print_all() {
        System.out.println("~~~~~~~~~~Printing Symbol Table~~~~~~~~~~~~");
        System.out.println("Size for HashTable " + st.size());
        for (String name: st.keySet()){
            String key = name.toString();
            String value = st.get(name).toString();  
            System.out.println(key + " " + value);  
        }  

        System.out.println("~~~~~~~~~~Printing Function Symbol Table~~~~~~~~~~~~");
        System.out.println("Size for HashTable " + st_functions.size());
        for (String name: st_functions.keySet()){
            String key = name.toString();
            String value = st_functions.get(name).toString();  
            System.out.println(key + " " + value);  
        }  

        System.out.println("~~~~~~~~~Printing Stack~~~~~~~~~~~");
        System.out.println(Arrays.toString(undoStack.toArray()));

    }

    public void remove_stack() {

        if (undoStack.size() != 0) {
            Iterator value = undoStack.iterator();
            while (value.hasNext()) {
                String curr = value.next().toString();
                if (curr == "Function Marker") break;
                LinkedList<String> tmp = st.get(curr);
                if (tmp.size() == 1) {
                    // System.out.println(curr);
                    st.remove(curr);
                }
                else if (tmp.size() < 1) {
                    tmp.removeFirst();
                    st.replace(curr, tmp);
                }
            }    
            undoStack.clear();
        }
        else {
            System.out.println("Error in remove stack");
        }

    }
}