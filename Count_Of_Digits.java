package Recursion;
import java.util.Scanner;
public class Count_Of_Digits {
    static int count = 0;
    static int count(int n){
        if(n!=0){
            count ++;
            count(n/10);
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number :- ");
        int n = sc.nextInt();
        System.out.println("Total digits in the given number :- "+count(n));
    }
}