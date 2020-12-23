public class Main17 {
    public static void main(String[] args) {
        String[] a = {"nik_kab","secret" ,"kabanets.n@mail.ru"};
        System.out.println(a[0] + " : ");
        System.out.println("Электронная почта - " + a[2]);
        String b = a[1].replace(a[1] , "***");
        System.out.println("Пароль - " + b);

    }
}
