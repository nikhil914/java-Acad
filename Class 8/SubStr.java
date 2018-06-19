import java.util.Scanner;
public class SubStr{
	Scanner sc=new Scanner(System.in);

	String s=sc.next();
	String Mo;
	void SubStr(){
	
	for (int a=0;a<s.length() ;a++ ) 
		for (int b=0;b<=s.length() -a;b++ ) {
			Mo=s.substring(a, a+b);
						
		
		System.out.println(Mo);

		
	}
	
}
	public static void main(String[] args) {
		System.out.print("Enter String : ");
		SubStr x=new SubStr();
		x.SubStr();

	}
}

