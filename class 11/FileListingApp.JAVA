import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.util.*;

public class FileListingApp{

	public static void Files(String path,ArrayList al) {
		System.out.println(path);
		File f=new File(path);
		File f1[]=f.listFiles();

		for(File file:f1) {

			if(file.isDirectory()==true)
			{

			Files(file.getAbsolutePath(),al);
			}else {
				al.add(file);

			}
		}
	}
	public static void main(String args[]) throws IOException{
	Scanner s=new Scanner(System.in);
	System.out.println("Enter a path: ");
	String loc=s.nextLine();
	String path1="";
	String path2="";
	ArrayList<File> al=new ArrayList<File>();
	   FileReader in = null;
	try {
		   in=new FileReader(loc);
		   int ch;

		   while((ch=in.read())!=10) {
			 path1=path1+(char)ch;
			    }
		   	  System.out.println(path1);

		   	  while((ch=in.read())!=-1) {
		   		  path2=path2+(char)ch;
		   	  }
		   	  System.out.println(path2);
		   	path1=path1.substring(0,path1.length()-1);
			 Files(path1,al);
		   	File file2=new File(path2);

		   	 FileWriter out=new FileWriter(file2,true);


		   	for(int i=0;i<al.size();i++) {
		   		out.write("Name: "+al.get(i).getName());
		   		out.write(',');
		   		out.write("Path: "+al.get(i).getAbsolutePath());
		   		out.write(10);
		   		out.flush();
		   	}
	}catch(Exception e) {
		System.out.println("Wrong Input");
	}finally {
		if(in!=null)
			in.close();
	}


	}
}