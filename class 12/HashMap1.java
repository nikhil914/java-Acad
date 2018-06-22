import java.util.*;
public class HashMap1{
	public static void main(String[] args) {
		HashMap<String, Integer> ab = new HashMap<>();
		
		ab.put("Nikhil",1);
		ab.put("Rahul",2);
		ab.put("akash",3);
		ab.put("Nilam",4);
		System.out.println("Size of Map is :-"+ab.size());
		print(ab);

		
    }

	
	 public static void print(Map<String, Integer> ab) 
    {
     
        {
            System.out.println(ab);
        }
    }
}