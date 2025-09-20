package Lecture04BasicPatterns;
import java.util.*;
public class pattern05 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            //for spaces
            for(int j= n-1; j>i; j--) {
                System.out.print(" ");
            }
            //for stars
            for(int j=0; j<i+1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
