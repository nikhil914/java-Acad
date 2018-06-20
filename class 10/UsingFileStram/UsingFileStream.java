import java.util.*;
import java.io.*;
class UsingFileStream{
	public static void main(String[] args) throws IOException  {
	File n=new File("Input.txt");
	File o=new File("Output.txt");
	FileInputStream in =new FileInputStream(n);
	FileOutputStream out =new FileOutputStream(o);

	byte[] b = new byte[1024];
	int i;
	while((i=in.read(b))>0){
		out.write(b,0,i);

	}
	FileInputStream om =new FileInputStream(o);
	int m;
	while ((m=om.read()) != -1)
      {System.out.print((char) m);}
	


	in.close();
	out.close();
	 System.out.println("File copied successfully!!");


}
}