/*
this code calculates the binomial of two numbers n and k
this code uses recursive method
time complexity is O(2^n), because there is multiple times when we called recurisve functions
@param the given numbers k and n
@return binomial coefficient
*/
import java.util.Scanner;
public class problem9{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        System.out.println(binom(n,k)); //called recursive function
        sc.close();
    }
    public static int binom(int n, int k){
        if(k==0||k==n){ //situation when k=0 or k=n it will return number n itself
            return 1;
        }else{
            return binom(n-1,k-1)+binom(n-1,k); //used formula
        }
    }
}
