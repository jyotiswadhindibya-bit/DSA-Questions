import java.util.*;
public class Q21 {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter no.of lines:");
    int i,j,n=sc.nextInt();sc.close();
      for(i=1;i<=n;i++){
        for(j=1;j<=n;j++)
        if (i==1||i==n) 
            System.out.print("*");
       else 
           if (j==1||j==n) 
            System.out.print("*");
            else 
            System.out.print(" ");
            System.out.println();
        
      }
    }
}