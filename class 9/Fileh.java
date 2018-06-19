import java.util.*;
import java.io.*;
class Fileh{
	public static void main(String[] args) {
		File f = new File("C:\programming data\java Acad\class 9\Fileh.java");
            if( !f. exists())
            f.createNewFile();
            System.out.println("Length="+f.length()+" bytes");
            System.out.println("Name="+f.getName());
            System .out. println("Parent="+f .getParent() );
            System .out. println("Path=" +f. getPath() );
            System.out.println("Absolute Path="+f.getAbsolutePath());
            System.out.println(f.exists()? "Exists" : "Does not exist");
            System.out.println(f.isFile() ? "is file" : "not a file");
            System.out.println(f.canRead() ? "is readable" : "not readable");
            System.out.println(f.canWrite()? "is writable" : "not writable");
            System.out.println(f.isDirectory()? "is directory" : "not a directory");
	}
}