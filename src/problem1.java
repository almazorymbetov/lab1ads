import java.util.Scanner;
public class problem1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for(int i = 0; i < n; i++)
        {
            array[i] = sc.nextInt();
        }
        int res = min(n, array);
        System.out.println("Minimum is " + res);
        sc.close();
        /*
        basic input of length of array (n) and elements, calling function min
         */
    }
    public static int min(int n, int[] array){
        int res = array[0];
        for(int i = 1;i < n;i++)
        {
            if(array[i]<res)
            {
                res = array[i];
            }
        }
        /*
        initial minimum is the first elemnt of array. then it compares with each next element
         */
        return res;
    }
}