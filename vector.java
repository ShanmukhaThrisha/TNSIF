import java.util.*;
import java.io.*;
public class vector {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<Integer>();
        v.add(1);
        v.add(2);
        v.add(10);
        v.add(22);
        v.add(58);
        System.out.println("Original Vector: "+v);
        //remove an element
        v.remove(3);
        System.out.println("Updated vector: "+v);
        // updating an element at a particular index
        v.set(1, 100);
        System.out.println("vector after set method: "+ v);
        // iterating using for loop
        System.out.println("elements iterating using for loop");
        for(int i=0;i<v.size();i++){
          System.out.println(v.get(i)+" ");
        }
        //using enhanced for loop
        System.out.println("elements in the vector using enhanced for loop");
        for(Integer ele:v){
            System.out.println(ele+" ");
        }
        //get first element
        System.out.println("element at first is:"+v.getFirst());
        //get last element
        System.out.println("elemet at last index is:"+ v.getLast());
        //vector after removing first and last elements
        v.removeFirst();
        v.removeLast();
        System.out.println("vector after removing first & last element is: "+v);

    }
    
}
