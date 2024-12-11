/*Create two user defined exceptions viz. TooHot and TooCold. Write a Java program and throw TooHot if the temperature exceeds 40 degrees and throw TooCold if the temperature is less than 20 degrees.*/
import java.util.Scanner;

class TooHot extends Exception {
    TooHot(String message) {
        super(message);
    }
}

class TooCold extends Exception {
    TooCold(String message) {
        super(message);
    }
}

public class TemperatureException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the temperature: ");
        int temperature = sc.nextInt();

        try {
            if (temperature > 40) {
                throw new TooHot("Temperature is too high!");
            } else if (temperature < 20) {
                throw new TooCold("Temperature is too low!");
            } else {
                System.out.println("Temperature is comfortable.");
            }
        } catch (TooHot e) {
            System.out.println(e.getMessage());
        } catch (TooCold e) {
            System.out.println(e.getMessage());
        }
    }
}
