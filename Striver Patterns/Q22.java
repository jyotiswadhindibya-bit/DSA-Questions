import java.util.*;
public class Q22 {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter no.of lines:");
    int i,j,top,bottom,left,right,n=sc.nextInt();sc.close();
      for(i=0;i<n*2-1;i++){
       for(j=0;j<n*2-1;j++){
           top=i;
           bottom=n*2-2-i;
           left=j;
           right=n*2-2-j;
           System.out.print(n-Math.min(Math.min(top, bottom),Math.min(left,right)));
       }
       System.out.println();
      }
    }
}