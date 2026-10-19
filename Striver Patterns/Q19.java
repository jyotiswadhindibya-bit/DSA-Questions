import java.util.*;
public class Q19 {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter no.of lines:");
    int i,j,n=sc.nextInt();sc.close();
    for(i=0;i<n;i++){
        for(j=1;j<=n*2;j++)
          if(i!=0)
            if(j==1||j==n*2)
            System.out.print("*");
            else if(j>n-i&&j<=n+i)
            System.out.print(" ");
            else
            System.out.print("*");
          else
            System.out.print("*");
            System.out.println();
        }
        int spc=n*2;            //space controller for downpart
    for(i=1;i<=n;i++){
        spc=spc-2;
        for(j=1;j<=n*2;j++)
          if(i==n)
            System.out.print("*");
          else
            if(j<=i||j>spc+i||j==n*2)
            System.out.print("*");
             else
             System.out.print(" ");
    System.out.println();
    }
    
    } 
  }

