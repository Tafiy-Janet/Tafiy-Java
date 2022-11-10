import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        chooseVyacheslav();
        System.in.read();
    }

    public static void chooseVyacheslav() {
        System.out.println("Введите Ваше имя:");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine().trim();
        if (name.equalsIgnoreCase("вячеслав")) {
            System.out.println("Привет, Вячеслав!");
        } else {
            System.out.println("Такого имени, к сожалению, нет.");
        }
    }
}
