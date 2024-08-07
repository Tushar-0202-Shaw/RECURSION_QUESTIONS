package Recursion;
import java.util.Scanner;
public class Check_Whether_A_Given_String_Is_Palindrome_Or_Not {
    static String Reverse (String s , int idx){
        if(s.length()==idx) return "" ;
        String SmallAns = Reverse(s,idx+1);
        return SmallAns+s.charAt(idx);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string :-");
        String s = sc.nextLine();
        String rev = Reverse(s,0);
        if(rev.equals(s)){
            System.out.println(s+" is palindrome .");
        }
        else{
            System.out.println(s+" is not palindrome .");
        }
    }
}