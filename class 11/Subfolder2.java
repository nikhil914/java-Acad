import java.util.*;
import java.io.*;
class Subfolder2{
	public static void main(String[] args)throws Exception {
		File currentDir = new File("."); 
		display(currentDir);
		File file = new File(".");
        listDirectory(file);
        System.out.println("GEtting list-----"+fileList);
        PrintWriter pw = new PrintWriter("a.csv");
        
        pw.print(fileList);
        pw.flush();


	}

	public static void display(File dir) {
		try {
			File[] files = dir.listFiles();
			for (File file : files) {
				if (file.isDirectory()) {
					System.out.println("directory:" + file.getCanonicalPath());
					display(file);
				} else {
					System.out.println("     	file:" + file.getCanonicalPath());
				}
				

			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	static List<String> fileList = new ArrayList<String>();

   

    public static void listDirectory(File file) {
        if(file.isDirectory()) {
            File[] files = file.listFiles();
            for(File currFile : files) {
                listDirectory(currFile);
            }
        }
        else {
            fileList.add(file.getAbsolutePath()+System.lineSeparator());
        }
    }
}