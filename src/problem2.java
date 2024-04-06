/*
this method calculates the average number by summing them and dividing to the length of array
it uses loop, iterates once in the average method
time complexity is O(n) where n is number of elements of array of numbers
also same as previous when n is inscrease, then the time for calculating will increase
@param represents the numbers of array
@return the average of array
 */

import java.util.Scanner;
public class problem2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for(int i = 0;i < n;i++){
            array[i] = sc.nextInt();
        }
        double start = System.nanoTime();
        double res = average(n, array);
        double end = System.nanoTime();
        System.out.println("Time spent: " + (end-start)/1000000000);
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
