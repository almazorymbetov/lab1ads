/*
this code finds factorial of given number
in contrast to previous ones, there is recursive method
time complexity is O(n), and when n is increase, then it changes the time complexity
it also have recursive calls where n decreases till 1
@param the Number that need be calculated as factorial
@return the factorial of given number
 */
import java.util.Scanner;
public class problem4{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double start = System.nanoTime();
        int res = factorial(n);
        double end = System.nanoTime();
        System.out.println("Time spent: " + (end-start)/1000000000);
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
