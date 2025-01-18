import java.util.*;

public class  Java_57_Array_List  {

    public static void myList(){
        ArrayList<Integer> l1 = new ArrayList<>();
        
        // <Integer> it shows generics 
        // we want to pass an argument(datatype as argument) to the class that time we use generics
        // otherwise we need to create different classes for different datatypes
        
        // what is need of initialcapacity ?
        // This way we enhance perfromence by avoiding unnecessary resizing.
        
        // Refer documentation one by one for each method we used
        l1.add(6);
        l1.add(61);
        l1.add(4);
        l1.add(23);
        l1.add(93);
        l1.add(903);
        l1.add(0,23);           // add 23 at index 0
        for (int i = 0; i < l1.size() ; i++) {
            // System.out.println(l1[i]);       // error 
            System.out.println(l1.get(i));
        }
        
        System.out.println("\n================================");

        ArrayList<Integer> l2 = new ArrayList<>(5);     // initial capacity = 5
        l2.add(1); 
        l2.add(10); 
        l2.add(100); 
        l1.addAll(l2);          // add all elemenets of l1 to l2
        // l1.addAll(0,l2);     // add at index 0

        for (Integer integer : l1) {
            System.out.println(integer);
        }

        l2.clear();         // make array empty

        try {
            System.out.println(l2.get(0));  // indexOutOfBoundsException
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        l2.add(23);
        l2.add(2);
        l2.add(73);
        l2.add(23);
        l2.add(7);
        System.out.println(l2.get(0));


        System.out.println(l2.contains(23));        // true
        System.out.println(l2.indexOf(23));         // 0        // return first index 
        System.out.println(l2.lastIndexOf(23));     // 3        // return first index 

        l2.set(1,50);       // replace element value at specified index

        for(Integer i : l2){
            System.out.print(i);
            System.out.print(", ");
        }
    }
    
    public static void myLinkedList(){
        // linked list has faster insertion/deletion/updation
        // array has faster access

        // list has two things. data value and next pointer to node.
        // Arraylist's most of method also works for linkedlist(internal working is differeent)

        // from the Collection diagram you can see LinkedList implements deque interface but array list doesn't. Array list not implements Queue.

        LinkedList<Integer> l1 = new LinkedList<>();
        l1.add(6);
        l1.add(61);
        l1.add(4);
        l1.addLast(23);
        l1.addLast(93);
        l1.add(903);
        l1.add(0,23);           
        for (int i = 0; i < l1.size() ; i++) {
            System.out.println(l1.get(i));
        }
        
        System.out.println("\n================================");

        LinkedList<Integer> l2 = new LinkedList<>();     
        l2.add(1); 
        l2.add(10); 
        l2.add(100); 
        l1.addAll(l2);          

        for (Integer integer : l1) {
            System.out.println(integer);
        }

        l2.clear();         // make array empty

        try {
            System.out.println(l2.get(0));  // indexOutOfBoundsException
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        l2.add(23);
        l2.add(2);
        l2.add(73);
        l2.add(23);
        l2.add(7);
        System.out.println(l2.get(0));


        System.out.println(l2.contains(23));        // true
        System.out.println(l2.indexOf(23));         // 0        // return first index 
        System.out.println(l2.lastIndexOf(23));     // 3        // return first index 

        l2.set(1,50);       // replace element value at specified index

        for(Integer i : l2){
            System.out.print(i);
            System.out.print(", ");
        }

    }

    public static void main(String[] args) {
        
        // myList();
        myLinkedList();
    }
}