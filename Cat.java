public class Cat extends Animal {
    private String colour;

    Cat(String colour){
        this.colour = colour;
    }

    void sound() {
        System.out.println(colour + " кот - \"Мяу...\"");
    }

    void eat() {
        System.out.println(colour + "кот - хрум хрум хрум...");
    }


}
