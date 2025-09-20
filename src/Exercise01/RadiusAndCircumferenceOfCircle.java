package Exercise01;
import java.util.*;
public class RadiusAndCircumferenceOfCircle {

    public static double CircumferencePrint(float r){
        return 2* Math.PI * r;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        float radius= sc.nextFloat();

        System.out.println("Circumference of Circle with radius "+ radius+ " is: "+ CircumferencePrint(radius));
    }

}
