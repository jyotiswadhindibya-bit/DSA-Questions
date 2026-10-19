import java .util.*;
  public class Q12 {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no.of lines");
        int i,j,c,c2,n=sc.nextInt();
                sc.close();
        for(i=1;i<=n;i++){
            c=1; c2=i;
            for(j=1;j<=n*2;j++){
                if(j<=i||j>n*2-i){
                    if (j<=i) {
                        System.out.print(c);
                        c++;
                    } else {
                        System.out.print(c2);
                        c2--;
                    }
                }
                  else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
