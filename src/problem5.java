/*
this code finds the fibonacci number
this code uses recursive method
time complexity is O(2 power n), and when n is increase, then it changes and increases exponentially
because it has multiple uses of recursive method
@param the Number that need be calculated as fibonacci number
@return fibonacci number
*/
import java.util.Scanner;
public class problem5{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double start = System.nanoTime();
        int res = fibo(n);
        double end = System.nanoTime();
        System.out.println("Time spent: " + (end-start)/1000000000);
        System.out.println(res);
        /*
        calling function fibo to calculating fibonacci number
         */
    }
    /*
    this is recursive function
     */
    public static int fibo(int n){
        if(n==0){
            return 0;
            //if n=0, then the fibo number equal to 0
        }else if(n==1){
            return 1; //the same case for 1, but it will be equal to 1
        }else{
            //called recursive functions to find fibo n-1 and fibo n-2
            return fibo(n-1) + fibo(n-2);
        }
    }
}
