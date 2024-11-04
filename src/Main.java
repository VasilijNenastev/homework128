import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        System.out.println("Массивы часть 1, задача №1");

        int[] numbers = new int[3];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;

        double[] fractional = {1.57, 7.654, 9.986};

        int[] cars = new int[5];
        cars[0] = 1;
        cars[1] = 2;
        cars[2] = 3;
        cars[3] = 4;
        cars[4] = 5;

        System.out.println("Массивы часть 1, задача №2");
        System.out.print(Arrays.toString(numbers));
        System.out.println();
        System.out.print(Arrays.toString(fractional));
        System.out.println();
        System.out.print(Arrays.toString(cars));
        System.out.println();

        System.out.println("Массивы часть 1, задача №3");
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = fractional.length - 1; i >= 0; i--) {
            System.out.print(fractional[i]);
            if (i > 0) {
                System.out.print(", ");

            }
        }
        System.out.println();


        for (int i = cars.length - 1; i >= 0; i--) {
            System.out.print(cars[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        System.out.println("Массивы часть 1, задача №4");

        for (int i = 0; i <= numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                numbers[i]++;
                System.out.print(numbers[i]);
                if (i < 2)
                 System.out.print(", "); }
            }

        }
    }