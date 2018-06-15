import java.util.Scanner;
class Even{
	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		System.out.print("Enter No:");
		int no=in.nextInt();
		for(int i=0;i<=no;i++){
			if (i%2==0) {
				System.out.print(i +" ");}
				
			
		}
		
	}
}