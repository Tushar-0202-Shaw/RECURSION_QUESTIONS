package Recursion;
import java.util.Scanner;
public class Euclid_GCD {
    static int GCD(int x,int y){
        if(y==0){
            return x;
        }
        return GCD(y,x%y);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number :- ");
        int x = sc.nextInt();
        System.out.print("Enter 2nd number :- ");
        int y = sc.nextInt();
        System.out.printf("GCD of %d & %d is :- ",x,y);
        System.out.println(GCD(x,y));
    }
}