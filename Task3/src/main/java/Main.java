import java.io.IOException;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        arrayResult(fillInArray());
        System.in.read();
    }


    public static int[] fillInArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Let's find numbers multiple of 3. \nEnter the size of the array:");
        while (true) {
            if (scanner.hasNextInt()) {
                int size = scanner.nextInt();
                int[] array = new int[size];
                generateArray(array);
                System.out.print("Array before change: ");
                print(array);
                return array;
            } else {
                scanner.nextLine();
            }
        }
    }


    public static void arrayResult(int[] array) {
        System.out.print("Array after change: ");
        Set<Integer> result = new TreeSet<>();
        for (int el : array) {
            if (el % 3 == 0) {
                result.add(el);
            }
        }
        if (result.isEmpty()) {
            System.out.println("Sorry, there are no such numbers. Try again");
        } else {
            int[] convertedArray = result.stream().mapToInt(i -> i).toArray();
            print(convertedArray);
        }
    }

    public static void generateArray(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100) + 1;
        }
    }

    public static void print(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }


}
