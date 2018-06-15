import java.util.Scanner;
class Secondlargest{
public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	System.out.print("Enter no of elements in Array: ");
	int n=in.nextInt();
	int a[]=new int[n];
	System.out.print("Enter  elements of Array: ");
	for (int j=0;j<n ;j++ ) {
		a[j]=in.nextInt();
		
	}
	System.out.println("The given array is:" );
	for(int j:a){
		System.out.print(j+" ,");
	}
	int largest = a[0];
		int sLargest = a[0];
		
		
		for (int i = 0; i < a.length; i++) {
 
			if (a[i] > largest) {
				sLargest = largest;
				largest = a[i];
   
			} else if (a[i] > sLargest) {
				sLargest = a[i];
 
			}
		}
 
		System.out.println("		Second largest number is:" + sLargest);
}
}