import java.util.Scanner;
class Even{
	public static void main(String[] args) {

		Scanner in=new Scanner(System.in);
		System.out.println("Enter No:");
		int no=in.nextInt();
		for(int i=no;i>=0;i--){
			if (no%2==0) {
				System.out.println(no +" is Even");}
				else{
					System.out.println(no +" is Odd");
				}
			
		}
		
	}
}