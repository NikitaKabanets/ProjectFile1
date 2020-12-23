public class Main12 {
    public static void main(String[] args) {
        Person Andrey = new Person();
            Andrey.name ="Андрей";
            Andrey.surname ="Иванов";
            Andrey.weight =80;
            Andrey.height =190;
            Andrey.sex ='М';
            Andrey.salary =150000;
            Andrey.majority =true;
        System.out.println("Информация о " + Andrey.name + " " + Andrey.surname + " : " + "\n" + "18 лет достиг - " + Andrey.majority + "\n" + "Пол - " + Andrey.sex + "\n" + "Зарабатывает " + Andrey.salary + " рублей в месяц, " + Andrey.salary * 12 + " рублей в год." + "\n" + "Вес - " + Andrey.weight + " кг. " + "Рост - " + Andrey.height + " см.");
    }
}
    class Person {
        String name;
        String surname;
        int weight;
        int height;
        char sex;
        int salary;
        boolean majority;
    }

