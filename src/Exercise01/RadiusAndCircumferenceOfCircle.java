package Exercise01;
import java.util.*;
public class RadiusAndCircumferenceOfCircle {

    public static double CircumferencePrint(float r){
        return 2* Math.PI * r;  // pi is an irrational number so rounding it off will not give the exact correct answer. That's why we use "Math.PI" , it hold the value of PI.
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float radius = sc.nextFloat();

        System.out.println("Circumference of Circle with radius " + radius + " is: " + CircumferencePrint(radius));
    }
}
