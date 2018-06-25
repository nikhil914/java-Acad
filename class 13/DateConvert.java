import java.util.*;
public class DateConvert{
	public static void main(String[] args) {
		
	
	Scanner sc=new Scanner(System.in);
	String day=sc.next();
	String month=sc.next();
	String year=sc.next();
	String dd="31",mm="12",yy1="1000",yy2="9999";

	System.out.println("Date format :"+day+"/"+month+"/"+year);
	
	int x=(dd.compareTo(day));
	int y=(mm.compareTo(month));
	int z1=(yy2.compareTo(year));
	int z2=(year.compareTo(yy1));

System.out.println(x);
	if ((x==-1)||(y==-1)||(z1==-1)||(z2==-1)) 
		{
		System.out.println("Wrong Input!!!");
	
}

	//HashSet<String> a = new HashSet<String>();

}
}