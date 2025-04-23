import java.util.*;
public class list {
    public static void main(String args[]){
        //creating a list of strings
        List<String> list = new ArrayList<>();
        list.add("is");
        list.add("a");
        list.add("practice");
        list.add(0,"This");
        System.out.println(list);
        //USing get method to access object at particular index
        String z= list.get(3);
        System.out.println("The element at index 3 is"+" "+z);
        //using enhanced for loop
        for(String str: list)
        {
            System.out.println(str+" ");
        }
        //creating a list of integers
        List<Integer>IL=new ArrayList<>();
        IL.add(1);
        IL.add(15);
        IL.add(25);
        IL.add(9);
        System.out.println("Original list:"+IL);
        //updating list using set method
        IL.set(0,15);
        System.out.println("Updated list:"+IL);
        //using indexOf() method
        int i= IL.indexOf(25);
        System.out.println("index of element 25 is"+" "+i);
        //Using lastindexOf() method
        int j= IL.lastIndexOf(15);
        System.out.println("last index of element 15 is"+" "+j);
        //Using remove() method 
        IL.remove(0);
        System.out.println("List after removing element at index 0: "+IL);
        //Checking if the element is present in the list or not 
        boolean ispresent = IL.contains(5);
        System.out.println("Is element 5 present in list: "+ispresent);
        //using for loop for interation
        for(int p=0;p<IL.size();p++)
        {
            System.out.println(IL.get(p)+" ");

        }


        



    }


    
}
