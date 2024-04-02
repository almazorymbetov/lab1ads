import java.util.Scanner;
public class problem5{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res = fibo(n);
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
