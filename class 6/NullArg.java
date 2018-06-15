public class NullArg
{
    public void fun(Integer i)
    {
        System.out.println("fun(Integer ) ");
    }
    public void fun(float j)
    {
        System.out.println("fun(float ) ");
    }
 
    public static void main(String [] args)
    {
        NullArg mv = new NullArg();
         
        Integer arg = null;
 
        mv.fun(arg);
    }
}
