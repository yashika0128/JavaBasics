package Lecture06Functions01;

import java.util.Scanner;

public class printName {
    public static void printMyName(String name){
        System.out.println(name);
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        String me= sc.next();
        printMyName(me);
    }

}
