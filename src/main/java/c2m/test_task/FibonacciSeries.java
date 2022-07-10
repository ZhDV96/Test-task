package c2m.test_task;
import java.util.Scanner;


public class FibonacciSeries {

    int sequenceLength;
    int previousNumber = 0;
    int nextNumber = 1;

    public void getFibonacciSeries() {

        System.out.println("Укажите длину последовательности Фибоначчи:");
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Введите положительное число!");
            while (!sc.hasNextInt()) {
                System.out.println("Введите значение заново: введенное число слишком велико или не явялется целым числом!");
                sc.next();
            }
            sequenceLength = sc.nextInt();
        } while (sequenceLength <= 0);
        System.out.print("Последовательность Фибоначчи составит " + sequenceLength + " чисел:");

        for (int i = 1; i <= sequenceLength; ++i) {
            System.out.print(previousNumber + " ");
            int sum = previousNumber + nextNumber;
            previousNumber = nextNumber;
            nextNumber = sum;
        }

    }
}