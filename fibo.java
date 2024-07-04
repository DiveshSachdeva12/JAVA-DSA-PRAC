import java.util.*;
public class fibo{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n= sc.nextInt();
    System.out.println(fibo(n));

    }
    public static int fibo(int n) {
        if(n==1){
            return 0;
        }
        if (n==2) {
            return 1;
        }
        else{
            int a=0;
            int b=1;
            int c=0;
        
        for(int i =0;i<n-2;i++){
            c=a+b;
            a=b;
            b=c;
        }
        return c;
    }
    }
}