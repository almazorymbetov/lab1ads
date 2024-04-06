/*
this code prints reversed array
this code uses recursive method
time complexity is O(n), and when n is increase, then it changes
@param the given array
@return the reversed array
*/
import java.util.Scanner;
public class problem7{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for(int i = 0;i < n;i++){
            array[i] = sc.nextInt();
        } //input elements
        double start = System.nanoTime();
        revers(array,0,n-1); //called recursive function
        double end = System.nanoTime();
        System.out.println("Time spent: " + (end-start)/1000000000);
        for(int i = 0;i < n;i++){
            System.out.println(array[i]); //print revesred array
        }
    }
    public static void revers(int[] array,int index1, int indexl){
        if(index1>=indexl){
            return; //it used when the number of elements equal to 1
        }
        int index0 = array[index1]; //this part is responsible to swap first and last elements of array
        array[index1] = array[indexl];
        array[indexl] = index0;
        revers(array, index1+1,indexl-1); //finally, it also calls recursive function
        /*
        index1 +1 means that first index moves toward to the last, while last to the first, and
        they moving to the "center" of array
         */
    }
}