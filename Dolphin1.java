public class Dolphin1 extends Animal1 {
    private String name;
    private String colour;
    private int age;

    Dolphin1(String name, String colour, int age)
    {
        this.name = name;
        this.colour = colour;
        this.age = age;
    }

    public String toString()
    {
        return this.name+" "+this.colour+", "+age+" года";
    }

    void sound() {
        System.out.println(colour + " кот - \"Мяу...\"");
    }


}

