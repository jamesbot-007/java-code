import java.util.*;
public record Java_58_Array_Deqeue_Hashing() {


    public static void myArrayDeqeue(){
                // Insertion and deleteion from front and back both side i.e. Arraydequeue
        // ArrayDequeue will manage size of array by it's implementation you just need tell at which index you want to perform insertion/deletion.

        // Dequeue means Double ended queue.

        ArrayDeque<Integer> ad = new ArrayDeque<Integer>();
        ad.add(1);
        ad.add(23);
        ad.addFirst(12);
        

        // Array Dequeue implements dequque interface 
    }

    public static void myHashing(){
        // it is technique to conver range of key-values into range of indicies

        // suppose hashing function is f(x)=x%10 and key = 72 so ans. 2
        // means array can be inserted at index 2
        
        // This way hashing function makes the insertion and searching faster.

        // but there are some ambbuguty like for key=22 also ans. 2. This ambiguity is called Hash collision. 
        // but at index 2 we alredy strored element 72
        // There are so many ways to handle this problem but one of them is open addressing means put element to next position (if empty otherwise it's next. and so on..)
        // so, that time we can put some enpty spaces in Hashing table(array-like thing)

        // Another way to solve hash collision is "chaining"
        // in that we creare linked list and index stores the head pointer that points to linked list
        // and linked list stores element 72 and 22 both. This we can increase the size of the linked list how much we want.


        // This techinique is used by many java class 
        // - HashSet
        // - HashMap
        // - LinkedHashMap
        // - HashTable


        // if the size of the hash table(array) is too large then there is less chances of this type of ambiguity.



        // Load factor
        // after filling how much element your hash table size will increase
        // Ex: total size=100 but when the hash table filles with 80 elements we increase it's size.


        HashSet<Integer> hs = new HashSet<Integer>(6, 0.5f); // load factor 0.5 means if array is half full then increase it's size

        // b.d. size 16, load factor 0.75

        hs.add(12);
        hs.add(23);
        hs.add(67);

        // hashset gives faster searching as compared to array. when it comes to leniar search.
        for (Integer integer : hs) {
            System.out.println(integer);
        }      

    }

    public static void main(String[] args) {

        // myArrayDeqeue();
        myHashing();

    }
}
