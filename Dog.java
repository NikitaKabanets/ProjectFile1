public class Dog extends Animal {

    private String colour;

    Dog(String colour){
        this.colour = colour;
    }


    void sound() {
        System.out.println(colour + " пёс - \"Гав...\"");
    }

    void eat() {
        System.out.println(colour + "пёс - хрум хрум хрум...");
    }
}
