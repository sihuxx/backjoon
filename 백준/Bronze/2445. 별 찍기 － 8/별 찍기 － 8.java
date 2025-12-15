import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

       for (int i = 1; i <= num -1; i++) {
            for (int j= 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= num - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= num - i; j++) {
                System.out.print(" ");
            }
            for (int j= 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        
        for (int i = num; i > 0; i--) {
            for (int j= i; j > 0; j--) {
                System.out.print("*");
            }
            for (int j = 1; j <= num - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= num - i; j++) {
                System.out.print(" ");
            }
            for (int j= i; j > 0; j--) {
                System.out.print("*");
            }
            System.out.println("");
        }
        
    }
}