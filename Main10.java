public class Main10 {
    public static void main(String[] args) {
        int a = 2;
        String s = "строка";
        main2(s, a);
    }
    public static void main2(String stroka, int a) {
        for (int i = 1; i <= 2*a; i++) {
            System.out.println(i + " - " + stroka);
        }
    }
}


