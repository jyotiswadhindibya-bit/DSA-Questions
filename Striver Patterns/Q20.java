import java.util.*;
public class Q20 {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter odd no.of lines:");
    int i,j,n=sc.nextInt();sc.close();
    int spc=n+1;
     for(i=1;i<=n;i++){
      if(i<=n/2+1){
       spc=spc-2;
        for(j=1;j<=n+1;j++)
            if (j<=i||j>spc+i) 
            System.out.print("*");
            else
            System.out.print(" ");
          System.out.println();
       }
       else{
        spc=spc+2;
        for(j=1;j<=n+1;j++)
            if (j<=n+1-i||j>spc+n+1-i) 
            System.out.print("*");
            else
            System.out.print(" ");
          System.out.println();
       }
    }
  }
}
