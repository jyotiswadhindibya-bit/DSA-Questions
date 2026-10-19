import java.util.*;
public class Q10 {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter only odd no.of lines");
    int n=sc.nextInt();
    int i,j,s=1;
    for(i=1;i<=n;i++){
        if(i<=(n/2+1))
        for(j=1;j<=i;j++)
        System.out.print("*");
        else{
           for(j=n/2;j>=s;j--)
            System.out.print("*");
            s++;
        }
        System.out.println();
    } sc.close();
   } 
}
