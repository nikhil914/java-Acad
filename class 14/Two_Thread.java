class x{  
  
 synchronized static  void Pt(int n,int x){
   
   for(int i=x;i<=n;i++){  
     System.out.println(i);  
     try{  
       Thread.sleep(4);  
     }catch(Exception e){}  
   }  
 }  
}  
  
public class Two_Thread {  
public static void main(String[] args) {  
      
    Thread t1=new Thread(){  
        public void run(){  
            x.Pt(500,0);  
        }  
    };  
      
    Thread t2=new Thread(){  
        public void run(){  
            x.Pt(1000,500);  
        }  
    };  
      
     
    t1.start();  
    t2.start();  
    
      
}  
}