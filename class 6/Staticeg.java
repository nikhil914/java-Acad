class Staticeg{
	static int i;
    int j;
    static {
        i = 10;
        System.out.println("static block is called ");
    }
   Staticeg(){
        System.out.println("Constructor called");
    }

 
public static void main(String[] args) {
	
     Staticeg s1 = new Staticeg();
       Staticeg s2 = new Staticeg();
    }
}