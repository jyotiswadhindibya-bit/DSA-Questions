import java.util.*;
public class Q11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no.of lines");
        int i,j,c=0,n=sc.nextInt();
        for (i=1;i<=n;i++){
            for(j=1;j<=i;j++){
                c++;
             System.out.print(c%2==0?"0":"1");
            }
            
             System.out.println();
        }
 sc.close();
    }
}
