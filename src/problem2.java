import java.util.Scanner;
public class problem2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for(int i = 0;i < n;i++){
            array[i] = sc.nextInt();
        }
        double res = average(n, array);
        System.out.println("Average  is " + res);
        sc.close();
        /*
        there input array length, elements of array, and calling average function
         */
    }
    public static double average(int n, int[] array){
        if(array.length == 0){
            return 0;
        }
        /*
        if there no elements, then the average is 0
         */
        double res = 0;
        for(int i = 0;i < n;i++){
            res+=array[i];
        }
        /*
        just loop, that summing every element, then in return it divided to length of array
         */
        return res / array.length;
    }
}
