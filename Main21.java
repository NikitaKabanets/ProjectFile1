import java.util.LinkedList;

public class Main21 {
    public static void main(String[] args) {
        LinkedList<Animal1> list = new LinkedList<>();
        list.add(new Cat1("Феликс" , "Серый" , 5));
        list.add(new Dog1("Борис" , "Чёрный" , 12));
        list.add(new Dolphin1("Бугай" , "Красивый" , 20));
        list.add(new Cow1("Бурёнка" , "Пятнистая" , 30));

        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        System.out.println(list.get(3));

        for (int i = 0; i < list.size(); i++) {
            list.get(i).sound();
        }

    }
}
