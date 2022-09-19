import java.util.*;

public class CollectInterface {
    public static void main(String args[]){

        Collection<String> list = new LinkedList<String>();

        list.add("Need");
        list.add("for");
        list.add("Speed");
        list.add("The");
        list.add("Run");
        
        System.out.println("The list is: " + list);

       list.remove("The");
       list.remove("Run");
   
        System.out.println("The list is now: " + list);
    }
}

