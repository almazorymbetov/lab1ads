import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter problem number");
        int problemNumber = scanner.nextInt();
        switch(problemNumber){
            case 1:
                System.out.println("Minimum  in array");
                problem1.main(args);
                break;
            case 2:
                System.out.println("Average in array");
                problem2.main(args);
                break;
            case 3:
                System.out.println("Prime or composite");
                problem3.main(args);
                break;
            case 4:
                System.out.println("Factorila");
                problem4.main(args);
                break;
            case 5:
                System.out.println("Fibonacci");
                problem5.main(args);
                break;
            case 6:
                System.out.println("Power");
                problem6.main(args);
                break;
            case 7:
                System.out.println("Revers array");
                problem7.main(args);
                break;
            case 8:
                System.out.println("Is consists digits");
                problem8.main(args);
                break;
            case 9:
                System.out.println("Combinatorics");
                problem9.main(args);
                break;
            case 10:
                System.out.println("GCD");
                problem10.main(args);
                break;
            default:
                System.out.println("Invalid");
        }
        scanner.close();
    }
}
