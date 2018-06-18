import java.util.Scanner;
class Occur{
	public static void main(String[] args) {
		
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter first String:");
	String a1=sc.nextLine();
		System.out.print("Enter Second String:");
	String a2=sc.nextLine();
	if (a1.equals(a2)==true) {
		System.out.println("A1 contains A2");
	}
	else{
		System.out.println("A1 Does not Contain A2");
	}

}
}