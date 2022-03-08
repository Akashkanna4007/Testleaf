package teatleafwork;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class MissingNumbSet {


	public static void main(String[] args) {
		int[] numbers = {4,6,7,2,3,1,9,10,8,8,6};
	    
		//creating new set and storing array elements in set
		Set<Integer> s = new HashSet<Integer>();
		for(int i=0; i<numbers.length;i++){
			s.add(numbers[i]);	
		}
		
		//creating new list and storing set elements in list
		List<Integer> f = new LinkedList<Integer>();
		f.addAll(s);
		
		for(int i = 0; i<f.size()-1;i++) {
		
		int x = f.get(i+1)-f.get(i);
		       if(x!=1) {
		    	   System.out.println("The Missing Number is "+(f.get(i+1)-1));
		    	   }
		}
			 	}

}
