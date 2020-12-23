public class Main13 {
    public static void main(String[] args) {
        Person1 Nikita = new Person1();
        Nikita.name = "Никита";
        Nikita.surname = "Кабанец";
        Nikita.weight = 85;
        Nikita.height = 195;
        Nikita.sex = 'М';
        Nikita.salary = 0; //  :(

        System.out.println("Информация о " + Nikita.name + " " + Nikita.surname + " : " + "\n" + "Пол - " + Nikita.sex + "\n" + "Вес - " + Nikita.weight + ", рост - " + Nikita.height + "\n" + "Зарабатывает " + Nikita.salary + " рублей в месяц и " + Nikita.salary + " рублей в год. ");
        main2(args);
    }
    public static void main2(String[] args) {
        Computer Comp = new Computer();
        Comp.graphicscard = "MSI GeForce GTX 1050ti";
        Comp.HDDsize = 1000;
        Comp.motherboard = "MSI B250";
        Comp.processor = "Intel Core i3 - 7100";
        Comp.RAMsize = 8;

        System.out.println("У Никиты есть компьютер");
        System.out.println("В нём видеокарта " + Comp.graphicscard + ", " + "материнская плата " + Comp.motherboard + ", " + "процессор " + Comp.processor + ", " + "жёсткий диск объемом в " + Comp.HDDsize + "гб, " + Comp.RAMsize + "гб оперативной памяти.");
        }
}
class Person1 {
    String name;
    String surname;
    int weight;
    int height;
    char sex;
    int salary;
}
    class Computer {
    String graphicscard;
    String processor;
    String motherboard;
    int RAMsize;
    int HDDsize;
}





