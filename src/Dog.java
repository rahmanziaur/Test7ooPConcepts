public class Dog extends Animal {

    public Dog() {
        super();

    }

    public void bark() {
        System.out.println("Bark");
    }

    @Override
    void sound() {
        System.out.println("Dog barks");
    }

    public static void main(String[] args) {
        Dog d = new Dog();
        d.bark(); //Class Dog method
        d.eat(); //Class Animal
    }
}
