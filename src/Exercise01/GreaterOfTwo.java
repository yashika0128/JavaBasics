package Exercise01;
import java.util.*;
public class GreaterOfTwo {

    public static int GreaterOfTwoNum(int a, int b){
        return Math.max(a,b);
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int a= sc.nextInt();
        int b= sc.nextInt();

        System.out.println("The greatest number between "+ a + " and "+ b+ " is: "+ GreaterOfTwoNum(a,b));

    }
}
