import java.util.Scanner;
public class Rectangle{
	int length,breadth;
	public int CalculateArea(int length,int breadth){
		return length*breadth;
	}
public static void main(String[] args) {
	

	Scanner in=new Scanner(System.in);
	System.out.print("Enter length and breadth");
	int len=in.nextInt();
	int bd=in.nextInt();
Rectangle r1=new Rectangle();
int a=r1.CalculateArea(len,bd);
System.out.println(a);
}
}