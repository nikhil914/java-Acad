import java.util.*;
import java.io.*;
class Combine1{
    public static void main(String[] args)throws Exception {
File abc = new File("abc.txt");
File num = new File("xyz.txt");

        
         FileReader fr = new FileReader(abc);
         LineNumberReader ln = new LineNumberReader(fr);
         FileReader nr = new FileReader(num);
         LineNumberReader mn = new LineNumberReader(nr);
            while (ln.getLineNumber() == 0){
              String s = ln.readLine();
              System.out.println(s);
          }
          while (mn.getLineNumber() == 0){
              String s = mn.readLine();
              System.out.println(s);
          }
          ln.setLineNumber(1);
          while (ln.getLineNumber() == 1){
              String s = ln.readLine();
              System.out.println(s);
          }
          while (mn.getLineNumber() == 1){
              String s = mn.readLine();
              System.out.println(s);
          }
           ln.setLineNumber(2);
          while (ln.getLineNumber() == 2){
              String s = ln.readLine();
              System.out.println(s);
          }
          while (mn.getLineNumber() == 2){
              String s = mn.readLine();
              System.out.println(s);
          }
      }
  }
