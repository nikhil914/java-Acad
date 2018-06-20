import java.util.*;
import java.io.*;
class Fileh{
	public static void main(String[] args) throws Exception {
  FileReader fr =new FileReader("C:\\programming data\\java Acad\\class 9\\abc.txt");
 
    int i;
    while ((i=fr.read()) != -1)
      System.out.print((char) i);
	}
}
