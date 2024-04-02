import java.util.Scanner;
public class problem6{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        int n = sc.nextInt();
        double res = power(a,n); //called recursive function
        System.out.println(res);
    }
    public static double power(double a,int n){
        if(n==0){
            return 1; //every number raised to power of 0 is equalst to 1
        }else if(n<0){
            return 1/power(a,-n); //if n is negative, then 1 must be divided to number a raised to power of n
        }else{
            return a*power(a,n-1); //multiplicate every previous element to find power
        }
    }
}
