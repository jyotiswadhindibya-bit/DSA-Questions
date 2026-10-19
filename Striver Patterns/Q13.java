import java.util.*;
public class Q13 {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("enter no.of lines");
       int i,j,c=1,n=sc.nextInt();
        for (i=1;i<=n;i++){
            for(j=1;j<=i;j++){
                System.out.print(c+" ");
                c++;
            }
            
                System.out.println();
        } sc.close();
    }
}
