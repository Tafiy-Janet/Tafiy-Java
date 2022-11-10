import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        printHello();
        System.in.read();
    }

    public static void printHello() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число больше семи и я поприветствую Вас :) \nВведите 'break', чтобы выйти из программы.");
        while (true) {
            if (sc.hasNextInt() && sc.nextInt() > 7) {
                System.out.println("Привет!");
                break;
            } else if (sc.hasNextLine() && sc.nextLine().equals("break")) {
                break;
            } else {
                sc.nextLine();
            }
        }
    }
}