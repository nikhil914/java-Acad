import java.util.Scanner;
class Palindrome{
	public static void main(String[] args) {
		int b,i,n,rev=0;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter upper limit");
		int limit=in.nextInt();
		System.out.println("Enter lower limit");
		int a=in.nextInt();


		System.out.println("Palindrome no between "+a+" and "+limit);
		for (i=a;i<=limit;i++ ) {
			n=i;
			while(n>0){
				b=n%10;
				rev=rev*10+b;
				n=n/10;
			}
			if(rev==i){
				System.out.print(rev +" ,");
			}
			rev=0;
		}
	}
}