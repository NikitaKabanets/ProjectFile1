import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();

        int place1;
        int place2;

        if(x1 == 0|| y1 == 0 || x2 == 0 || y2 == 0) {
            System.out.println("NaN");
        } else if(x1 > 0 && y1 > 0) {
            place1 = 1;
        } else if(x2 > 0 && y2 > 0) {
            place2 = 1;
        } else if(x1 < 0 && y1 < 0) {
            place1 = 3;
        } else if(x2 < 0 && y2 < 0) {
            place2 = 3;
        } else if(x1 < 0 && y1 > 0) {
            place1 = 2;
        } else if(x2 < 0 && y2 > 0) {
            place2 = 2;
        } else if(x1 > 0 && y1 < 0) {
            place1 = 4;
        } else if(x2 > 0 && y2 < 0) {
            place2 = 4;
        }
        if(true){
            System.out.println("YES " );
        } else if(place1 != place2) {
            System.out.println("NO " + place1 + " " + place2);
        }
    }
}
