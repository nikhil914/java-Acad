import java.util.*;
import java.io.*;
class CombineFile{
public static void main(String[] args) throws Exception {
  FileReader aa =new FileReader("C:/programming data/java Acad/class 9/Extra Assignment/abc.txt");
  FileReader num =new FileReader("C:/programming data/java Acad/class 9/Extra Assignment/abc.txt");
 
    int i;
    while ((i=aa.read()) !='b')
      System.out.print((char) i);
	}
}