public class Cow extends Animal {

    private String colour;

    Cow(String colour){
        this.colour = colour;
    }


    void sound() {
        System.out.println(colour + " Корова - \"Мууу...\"");
    }

    void eat() {
        System.out.println(colour + " Корова - хрум хрум хрум...");
    }
}
