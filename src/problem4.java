import java.util.Scanner;
public class problem4{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res = factorial(n);
        System.out.println(res);
    }
    /*
    this is recursive function to find factorial of n
     */
    public static int factorial(int n){
        /*
        factorial of 0 or 1 is equal to 1
         */
        if(n==0 || n==1){
            return 1;
        }else{
            /*
            called function again, till when n will be equal to 1, because we need to find
            a multiplication of each previous element
             */
            return n*factorial(n-1);
        }
    }
}
