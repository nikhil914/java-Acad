import java.util.Scanner;
public class RevString {
  Scanner sc=new Scanner(System.in);
  String s=sc.next();
  String s1="";
  String Rev() {
  for(int i=s.length()-1;i>=0;i--) {
	  s1=s1+s.charAt(i);
  }
  return s1;
  }
	public static void main(String[] args) {
  RevString r=new RevString();
  String s2=r.Rev();
  System.out.println(s2);
	}

}