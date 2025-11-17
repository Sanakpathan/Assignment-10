public class Bird extends Animal implements Flyable, Playable {

    @Override
    public void makeSound() {
        System.out.println("Bird chirps!");
    }

    @Override
    public void fly() {
        System.out.println("Bird is flying!");
    }

    @Override
    public void play() {
        System.out.println("Bird is playing!");
    }
}
