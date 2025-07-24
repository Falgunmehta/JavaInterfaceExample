interface Animal {
    void sound();
}

class Dog implements Animal {
    public void sound() {
        System.out.println("Woof!");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        myDog.sound();
    }
}
