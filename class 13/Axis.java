import java.util.*;
 
class Student implements Comparable<Student> {
 
    public String name;
    public int age;
     
     public Student(String name, int age ){
         this.name=name;
         this.age=age;
     }
      
     public String getName(){
            return name;
          }
          public int getAge(){
            return age;
          }
     

 

     
 

     
public static void main(String arg[]){
 
    List<Student> abc = new ArrayList<Student>();
abc.add(new Student("Nikhil",45));
abc.add(new Student("Shashi",22));
abc.add(new Student("Harsh",19));
abc.add(new Student("Harish",45));
 
 
for(Student Student : abc){
     System.out.println(" "+Student.getName() + " " + Student.getAge());
}
 
 
System.out.println("\nSorting starts now \n");
 
Collections.sort( abc);
for(Student Student : abc){
     System.out.println(" "+Student.getName() + " " + Student.getAge());
}
}
      
}