// You can create your custom collection such as Collection Framework.
// where you can have interface, abstract class, and your created custom class

import java.util.AbstractSet; //  Abstract class of Set. set means non-repeatable elements
import java.util.Iterator; // It is object that allows to iterate over colletion(like ArrayList, Hashset, etc) one element at a time.
/* 
ArrayList<String> list = new ArrayList<>();
list.add("Java");
list.add("Python");
list.add("C++");
Iterator<String> iterator = list.iterator();

// Iterating through the ArrayList
while (iterator.hasNext()) {
    String element = iterator.next();
    System.out.println(element);
}

 */

import java.util.LinkedHashMap;
// Linked hash map is slightly different from hash map
// in HashMap values are stored in key/value pairs but it doesn't maintain order
// Byt in LikedHashMap it maintains order.


class CustomSet<E> extends AbstractSet<E>{
    // AbstractSet<E> is genertic set
    
    public final LinkedHashMap<E, Boolean> map = new LinkedHashMap<>();

  
    // define method(s) of Abstract class
    @Override
    public int size() {
        return map.size();
    }
    
    @Override
    public Iterator<E> iterator() {
        return map.keySet().iterator();
    }
  
    // Override methods of LinkedHashMap class 
    @Override
    public boolean add(E element){
        // if not have key
        if (!map.containsKey(element)){
            map.put(element, Boolean.TRUE); // map.put(key, value)
            return true;
        }
        return false;
    }
    @Override
    public boolean contains(Object o) {
        return map.containsKey(o);
    }

    @Override
    public boolean remove(Object o) {
        return map.remove(o) != null;
    }

    @Override
    public void clear() {
        map.clear();
    }

}


class  M_customCollection  {
    public static void main(String[] args) {
        
         CustomSet<String> customSet = new CustomSet<String>();  // we only need to deifine first datatype i.e. key. 
        // The second datatype value we hardcoded with Boolean wrapper class

        customSet.add("Java"); 
        customSet.add("Python"); 
        customSet.add("C++"); 
        customSet.add("Java"); // duplicate

        System.out.println(customSet);
        System.out.println(customSet.contains("C++"));

        customSet.remove("Python");

        System.out.println(customSet);


        Iterator<String> itearator = customSet.iterator();
        while(itearator.hasNext()){
            String element = itearator.next(); // it has type string
            System.out.println(element);
        }
        
        // remove public
    }
}