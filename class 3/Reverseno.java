import java.util.Scanner;


class Reverseno{
	
	public static void main(String[] args) {
		int b,rev=0;
		Scanner	input=new Scanner(System.in);
		System.out.println("Enter no to Reverse");
		int n = input.nextInt();

		
		
		System.out.println("No to be reversed:"+n);
		
			while(n>0){
				b=n%10;
				rev=rev*10+b;
				n=n/10;
			}
			
				System.out.print("Reversed no:"+rev );
			
			
	}
}

