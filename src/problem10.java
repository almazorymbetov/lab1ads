import java.util.Scanner;
public class problem10{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(gcd(a,b)); //call function gcd
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
