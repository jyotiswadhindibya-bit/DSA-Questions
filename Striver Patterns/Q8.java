import java.util.*;
public class Q8 {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        System.out.println("Enter no.of lines"); 
        int i,j,k,s,n=sc.nextInt();
        s=n*2-1;
        for(i=0;i<n;i++){
            for(k=0;k<i;k++)
            System.out.print(" ");
            for(j=1;j<=s;j++)
            System.out.print("*");
            s-=2;
            System.out.println("");
        } sc.close();
    }
}
