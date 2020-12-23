
import java.util.LinkedList;
import java.util.Scanner;

public class Main20 {
    public static void main(String[] args) {
        LinkedList<Animal> list = new LinkedList<>();
        list.add(new Cat("Серый"));
        list.add(new Dog("Чёрный"));
        list.add(new Dolphin("Красивый"));
        list.add(new Cow("Пятнистая"));

        for (int i = 0; i < list.size(); i++) {
            list.get(i).sound();
        }

        System.out.println("Кого кормим? : ");
        String a = new Scanner(System.in).nextLine();
        if (a.equals("кота")) {
            list.get(0).eat();
        }
        if (a.equals("пса")) {
            list.get(1).eat();
        }
        if (a.equals("дельфина")) {
            list.get(2).eat();
        }
        if (a.equals("корову")) {
            list.get(3).eat();
        }


    }
}