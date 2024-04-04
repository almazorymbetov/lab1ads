/*
this code determines when the array has digits or not
this code uses recursive method
time complexity is O(n), and when n is increase, then the time for executing will increase
@param the given string
@return yes or no
*/
import java.util.Scanner;
public class problem8{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(digit(s) ? "YES" : "NO");
        //by this you can check by using booleans when string contain numbers or not
        sc.close();
    }
    public static boolean digit(String s){
        if(Character.isDigit(s.charAt(0))){ //checking first character is it digit
            return digit(s.substring(1)); //check remain characters
        }else{
            return false;
        }
    }
}
