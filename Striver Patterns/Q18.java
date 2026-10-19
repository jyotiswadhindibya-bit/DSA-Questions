import java.util.*;
public class Q18 {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter no.of lines:");
    int i,j,n=sc.nextInt();
    int c=65+n-1;
    for(i=1;i<=n;i++){
        for(j=1;j<=i;j++)
           System.out.print((char)c++ + " ");
          c=65+n-1; c=c-i;
           System.out.println();
    }
    sc.close();
  }
}
