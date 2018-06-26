import java.util.*;
class DateConvert{
public static void main(String[] args){
	HashMap<Integer,String> a =new HashMap<Integer,String>();
	a.put(1,"one");
	a.put(2,"two");
	a.put(3,"three");
	a.put(4,"four");
	a.put(5,"five");
	a.put(6,"six");
	a.put(7,"seven");
	a.put(8,"eight");
	a.put(9,"nine");
	a.put(10,"ten");
	a.put(11,"eleven");
	a.put(12,"tweleve");
	a.put(13,"thirteen");
	a.put(14,"fourteen");
	a.put(15,"fifteen");
	a.put(16,"sixteen");
	a.put(17,"seventeen");
	a.put(18,"eighteen");
	a.put(19,"nineteen");
	a.put(20,"twenty");
	a.put(21,"twenty one");
	a.put(22,"twenty two");
	a.put(23,"twenty three");
	a.put(24,"twenty four");
	a.put(25,"twenty five");
	a.put(26,"twenty six");
	a.put(27,"twenty seven");
	a.put(28,"twenty eight");
	a.put(29,"twenty nine");
	a.put(30,"thirty");
	a.put(31,"thirty one");
	
HashMap<Integer,String> b =new HashMap<Integer,String>();
b.put(1,"january");
b.put(2,"februaru");
b.put(3,"march");
b.put(4,"april");
b.put(5,"may");
b.put(6,"june");
b.put(7,"july");
b.put(8,"august");
b.put(9,"september");
b.put(10,"october");
b.put(11,"november");
b.put(12,"december"); 

HashMap<Integer,String> c =new HashMap<Integer,String>();
c.put(2011,"two thousand eleven");
c.put(2012,"two thousand tweleve");
c.put(2013,"two thousand thirteen");
c.put(2014,"two thousand fourteen");
c.put(2015,"two thousand fifteen");
c.put(2016,"two thousand sixteen");
c.put(2017,"two thousand seventeen");
c.put(2018,"two thousand eighteen");
c.put(2019,"two thousand nineteen");
c.put(2020,"two thousand twenty");
Scanner sc=new Scanner(System.in);
String n=sc.next();

int i=Integer.parseInt(n.substring(0,2));
int j=Integer.parseInt(n.substring(3,5));
int k=Integer.parseInt(n.substring(6,10));


System.out.println(a.get(i)+" "+b.get(j)+" "+c.get(k));


}
}
