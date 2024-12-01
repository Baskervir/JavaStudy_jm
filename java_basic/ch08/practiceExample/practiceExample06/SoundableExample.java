package ch08.practiceExample.practiceExample06;

public class SoundableExample {
    public static
    void pringSound(Soundable soundable) {
        System.out.println(soundable.sound());
    }

    public static void main(String[] args) {
        pringSound(new Cat());
        pringSound(new Dog());
    }
}
