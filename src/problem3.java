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
        /*
        in this loop, i will increase until when its square is less than n, and if when n divided by i
        and the remainder is 0, then it is composite
         */
        return true;
    }
}
