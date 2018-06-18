import java.util.Scanner;
public class SubStr{
	Scanner sc=new Scanner(System.in);
	String s=sc.next();
	void SubStr(){
	for (int i=0;i<=s.length()-1 ;i++ ) {
System.out.println(s.charAt(i));
	}
	for (int a=0;a<s.length() ;a++ ) 
		for (int b=0;b<s.length() ;b++ ) {
			System.out.print(s.charAt(b));			
		
		System.out.println(s.charAt(a));

		
	}
	System.out.println(s);
	
}
	public static void main(String[] args) {
		SubStr x=new SubStr();
		x.SubStr();

	}
}

