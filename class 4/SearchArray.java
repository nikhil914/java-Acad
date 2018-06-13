import java.util.Scanner;
class SearchArray{
public static void main(String[] args) {
	int a[]={1,2,3,4,5,7,9};
	int l=7,flag=0;
	System.out.println("Enter a no:");
	Scanner in=new Scanner(System.in);
	int n=in.nextInt();
	for (int i=0;i<l ;i++ ) {
		if (n==a[i]) {
			System.out.println(n+" is found in Array");
			flag=1;
			break;
		}
	}
	if (flag==0) {
		System.out.println(n+" is not found");
	}

}

}