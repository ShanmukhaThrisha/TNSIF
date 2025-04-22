import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Hashset{
    public static void main(String[] args) {
		
		Set<Integer> hs=new HashSet();
		hs.add(15);
		hs.add(25);
		hs.add(52);
		hs.add(100);
		hs.add(13);
		
	for(int i:hs) {
		System.out.println("The data in the hashset is"+" "+i);
	}		
	}
}

