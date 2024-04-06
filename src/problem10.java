/*
this code calculates the gcd of two numbers
this code uses recursive method
time complexity is O(a,b), and when a or b is increase, then it changes and increases
@param the numbers a and b
@return the gcd of a and b
*/
import java.util.Scanner;
public class problem10{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        double start = System.nanoTime();
        System.out.println(gcd(a,b)); //call function gcd
        double end = System.nanoTime();
        System.out.println("Time spent: " + (end-start)/1000000000);
        sc.close();
    }
    public static int gcd(int a,int b){
        if(b==0){ //when b doesnt exist, then gcd will be a itself  
            return a;
        }else{
            return gcd(b,a%b);//euclidian algorithm from discrete math
        }
    }
}
