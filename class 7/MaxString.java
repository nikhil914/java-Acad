import java.util.Scanner;
class MaxString{
	
		Scanner sc=new Scanner(System.in);
		String a1=sc.next();
		String a2=sc.next();
		void comp(){
if(Integer.parseInt(a1)>Integer.parseInt(a2)) {
		System.out.println("A is Bigger");
	}
	else {
		System.out.println("B is Bigger");
	}
		}

	public static void main(String[] args) {
			System.out.print("Print value of A and B :");
MaxString x=new MaxString();
		x.comp();
	}

	}

