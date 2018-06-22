import java.util.*;
class HashComp{
public static void main(String arg[]){
        HashSet<String> a = new HashSet<String>();
        a.add("first");
        a.add("second");
        a.add("third");
        a.add("apple");
        a.add("rat");
        System.out.println(a);
        HashSet<String> b = new HashSet<String>();
        b.add("rat");
        b.add("second");
        b.add("first");
        System.out.println(b);
        a.retainAll(b);
        System.out.println("HashSet content:");
        System.out.println(a);
    }
}
