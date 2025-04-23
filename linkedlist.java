import java.util.*;
public class linkedlist {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<Integer>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of linkedlist");
        int n= sc.nextInt();
        System.out.println("enter "+n+" elements");
        for(int i=0;i<n;i++)
        {
            ll.add(sc.nextInt());
        }
        System.out.println("Your linked list elements:");
        for(Integer val:ll)

        {
            System.out.println(val+" ");
        }
        //add an element to list
        System.out.println("add an element to list: ");
        ll.add(sc.nextInt());
        System.out.println(ll);
        //changing elements at particular index
        System.out.print("specify the index where element is to be changed:");
        int j= sc.nextInt();
        System.out.println("specify the element:");
        int ele=sc.nextInt();
        ll.set(j, ele);
        System.out.println("updated linkedlist: "+ll);
        //removing the element 
        System.out.println("specify the index where the element has to be removed: ");
        int r=sc.nextInt();
        ll.remove(r);
        System.out.println("list after removing element at "+r+" is"+ll);
        ll.removeFirst();
        ll.removeLast();
        System.out.println(ll);
        //converting linkedlist to array
        Object[] a = ll.toArray();
        System.out.println("After coverting linkedlist to array:");
        for(Object element: a)
        {
            System.out.println(element+" ");
        }


        
    }
    
}
