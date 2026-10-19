import java.util.*;
public class Q7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no.of lines"); 
        int i,j,k,s=1,n=sc.nextInt();
        
        for(i=n-1;i>=0;i--){
            for (k=i;k>0;k--)
            System.out.print(" ");
            for(j=1;j<=s;j++)
                System.out.print("*");
                s+=2;
                System.out.println();
        } sc.close();
    }
}
