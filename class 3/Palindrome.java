class Palindrome{
	public static void main(String[] args) {
		int b,i,n,rev=0;
		int limit=9999;
		int a=1000;
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