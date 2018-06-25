import java.util.*;
public class ArraySort{
	public static void main(String[] args) {		
int arr[]={8,9,7,3,5,6,2};
char car[]={'a','d','b','c'};
double ft[]={5.2,1.3,9.1,2.9,3.8};
float f[]={3,2,4,6,8};
Arrays.sort(arr);
Arrays.sort(car);
Arrays.sort(ft);
Arrays.sort(f);

for(int i=0;i<arr.length;i++){
System.out.print(arr[i]+",");
}
System.out.println("");
for(int i=0;i<car.length;i++){
	System.out.print(car[i]+",");
}
System.out.println("");
for(int m=0;m<ft.length;m++){
	System.out.print(ft[m]+",");
}
System.out.println("");
for(int i=0;i<f.length;i++){
System.out.print(f[i]+",");
}
}}