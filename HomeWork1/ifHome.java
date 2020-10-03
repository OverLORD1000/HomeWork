package operators;

import java.util.Objects;
import java.util.Scanner;

public class ifHome {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ваше имя");
        String name = scanner.nextLine();

        if(Objects.equals("Вася", name)) {
            System.out.println("Привет!");
            System.out.println("Я тебя так долго ждал");
        }
        if(Objects.equals("Анастасия", name)) {
            System.out.println("Я тебя так долго ждал");
        }
        if(!Objects.equals("Вася", name) && !Objects.equals("Анастасия", name)) {
            System.out.println("Добрый день, а вы кто?");

        }



    }
}
