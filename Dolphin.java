public class Dolphin extends Animal {

    private String colour;

    Dolphin(String colour){
        this.colour = colour;
    }


    void sound() {
        System.out.println(colour + " дельфин - \"издаёт звук дельфина...\"");
    }

    void eat() {
        System.out.println(colour + "дельфин - хрум хрум хрум...");
    }
}
