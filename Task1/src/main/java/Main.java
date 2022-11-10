import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        printHello();
        System.in.read();
    }

    public static void printHello() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число больше семи и я поприветствую Вас :)");
        while (scanner.nextInt() < 7) ;
        System.out.println("Привет!");
    }
}
