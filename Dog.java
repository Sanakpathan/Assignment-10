public class Dog extends Animal implements Playable {

    @Override
    public void makeSound() {
        System.out.println("Dog barks!");
    }

    @Override
    public void play() {
        System.out.println("Dog is playing!");
    }
}
