import java.util.*;
public class Q14 {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("enter no.of lines");
       int i,j,n=sc.nextInt();
          for (i=65;i<=n+65;i++){
            for(j=65;j<=i;j++)
            System.out.print((char)j);
            System.out.println();
        } sc.close();
    }
}
