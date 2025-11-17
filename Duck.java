public class Duck extends Animal implements Flyable, Swimmable, Playable {

    @Override
    public void makeSound() {
        System.out.println("Duck quacks!");
    }

    @Override
    public void fly() {
        System.out.println("Duck is flying!");
    }

    @Override
    public void swim() {
        System.out.println("Duck is swimming!");
    }

    @Override
    public void play() {
        System.out.println("Duck is playing!");
    }
}
