import java.util.*;
import java.io.*;
class FileCopy{
public static void main(String[] args) throws IOException{
	File file=new File("C:\\programming data\\java Acad\\class 10\\xyz.txt");
  FileWriter pw=new FileWriter("file4.txt");
	//PrintWriter pw = new PrintWriter("file3.txt");
	FileReader   in=new FileReader(file);
	int c;
	String a="";
	 
	   
	   while((c=in.read())!=-1) {
		   System.out.print((char)c);
	   a=a+(char)c;
	   }
	   char b[]=a.toCharArray();
	   for (int m=0;m<b.length ;m++ ) {
	   	pw.write(b[m]);
	   }

	   pw.close();
    
    
}
}