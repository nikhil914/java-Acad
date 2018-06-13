class Bubblesort {
    public static void main(String[] args) {
        int i,n,s,temp,j;
        int a[]={1,0,0,1,0,0,1,1};
        
        for(s=0;s<7;s++){
            for(i=0;i<7-s;i++){
                if(a[i]>a[i+1]){
                    temp=a[i];
                    a[i]=a[i+1];
                    a[i+1]=temp;
                }
            }
        }
            System.out.printf("Ascending order is:");
            for(j=0;j<8;j++){
                System.out.print(" "+a[j]);
            }
        }
    }
    
