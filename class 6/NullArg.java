public class NullArg
{
   

    static void print(int x){
               System.out.println("Print int :"+x);
    }

    static void print(float x){
               System.out.println("Print flot :"+x);
    }




    public static void main(String args[]){

        int m=1;
        float n=8F;

       
        NullArg.print(m);
        NullArg.print(n);

    }



}

