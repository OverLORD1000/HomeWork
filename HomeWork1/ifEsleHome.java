import java.util.Scanner;

public class ifEsleHome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя");
        String name = scanner.nextLine();
        String name1 = "Иван";
        String name2 = "Анастасия";

        if(Object.equals(name1, name)){
            System.out.println("Привет!");
            System.out.println("Я тебя так долго ждал");
        }
        if(Object.equals(name2, name)) {
            System.out.println("Я тебя так долго ждал");
        }
            else(!Object.equals(name1, name) && !Object.equals(name2, name)){
                System.out.println("Добрый день, а вы кто?");
            }

    }
}
