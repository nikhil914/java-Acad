import java.util.Scanner;
class Armstrong{
public static void main(String[] args) {
	int a,c=0,total=0,num;
	int arr[]={};

	Scanner in=new Scanner(System.in);
	System.out.println("Enter a no for Armstrong check: ");
	int n=in.nextInt();
	num=n;

	while(n!=0){
		a=n%10;
		total=total+a*a*a;
		n=n/10;
		
	}
	if (total==num) {
		System.out.println(num +" is an Armstrong no");
			}
	else{
		System.out.println(num+" is not an Armstrong no");
	}
	}

}

