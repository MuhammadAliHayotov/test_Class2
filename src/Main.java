
import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        double radius;
        double area;

        //step 1 read in radius
        Scanner input = new Scanner(System.in);
        radius = input.nextDouble();
        //step 2 compute area
        area = Math.PI * radius * radius;
        System.out.println("The area of the circle: " + radius);
    }
}