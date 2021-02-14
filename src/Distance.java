import java.util.*;

public class Distance
{
    public static void main(String[] args) {
        // Scanner creation
        Scanner input = new Scanner(System.in);

        // Prompt
        System.out.println("Enter speed in mph: ");
        double speed = input.nextDouble();
        System.out.println("Enter duration in hours: ");
        double duration = input.nextDouble();

        System.out.print("You traveled " + speed * duration + " miles.");
    }
}
