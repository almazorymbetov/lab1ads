/*
this method determines when the given number is prime or composite
it uses loop, iterates till when i squared will be less than
time complexity is O(sqrt(n)) where n is number of elements of array of numbers
also same as previous problems when n is increase, then the code will run slower
@param the number which need to be determined as prime or composite
@return true/false, or prime or composite
 */

import java.util.Scanner;
public class problem3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(prime(n)){
            System.out.println("Prime");
        }else{
            System.out.println("Composite");
        }
        sc.close();
        /*
        input and calling function prime (true or false)
         */
    }
    public static boolean prime(int n){
        double start = System.nanoTime();
        if(n==1 || n<0){
            return false;
        }
        /*
        numbers equal to 1 or negative are not prime
         */
        for(int i = 2;i*i <= n;i++){
            if(n%i==0){
                return false;
            }
        }
        double end = System.nanoTime();
        System.out.println("Time spent: " + (end-start)/1000000000);
        /*
        in this loop, i will increase until when its square is less than n, and if when n divided by i
        and the remainder is 0, then it is composite
         */
        return true;
    }
}
