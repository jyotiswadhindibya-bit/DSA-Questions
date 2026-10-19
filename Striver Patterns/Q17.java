import java.util.*;
    public class Q17 {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no.of lines");
        int i,j,k,s=1,c=65,n=sc.nextInt();
        for(i=1;i<=n;i++){
            c=65;
          for(k=n-i;k>0;k--)
            System.out.print(" ");
           for(j=1;j<=s;j++)
           if(j<=s/2+1){
           System.out.print((char)c);
           c++;
           }
           else if (j-(s/2+1)==1) {
            c-=2;
            System.out.print((char)c);
           }
           else{
            c--;
           System.out.print((char)c);
           }
           s+=2;
           System.out.println();
        }
        sc.close();
     }
}
