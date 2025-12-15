import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        for (int n=num; n > 1; n--) {
            for (int i = num; i > n; i--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (n*2)-1; j++) {
                System.out.print("*");
            }
                System.out.println("");
        }

        for (int n=1; n <= num; n++) {
            for (int i = num; i > n; i--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (n*2)-1; j++) {
                System.out.print("*");
            }
                System.out.println("");
        }
    }
}