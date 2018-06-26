import java.util.*;  
import java.io.*; 

 class Student{  
int rollno;  
String name;  
int age;  
Student(String name,int age){  
this.name=name;  
this.age=age;   
}  
}

 


class AgeComparator implements Comparator<Student>{  
public int compare(Student s1,Student s2){  
if(s1.age==s2.age)  
return 0;  
else if(s1.age>s2.age)  
return 1;  
else  
return -1;  
}  
}  


class NameComparator implements Comparator<Student>{  
public int compare(Student s1,Student s2){  
return s1.name.compareTo(s2.name);  
}  
}  

 class SortName1{ 
public static void main(String args[]){  
  
ArrayList<Student> al=new ArrayList<Student>();  
al.add(new Student("Ayush",22));  
al.add(new Student("Shashi",21));  
al.add(new Student("NIkhil",18));  
  
System.out.println("Sort by Name!!!!!!!!!");  
  
Collections.sort(al,new NameComparator());  
for(Student st: al){  
System.out.println(st.name+" "+st.age);  
}  
  
System.out.println("Sort by age  !!!!!!!!!");  
  
Collections.sort(al,new AgeComparator());  
for(Student st: al){  
System.out.println(st.name+" "+st.age);  
}  
  
}  
}  