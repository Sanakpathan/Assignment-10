public class Main {
    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.makeSound();
        dog.eat();
        dog.play();

        Bird bird = new Bird();
        bird.makeSound();
        bird.fly();
        bird.play();

        Duck duck = new Duck();
        duck.makeSound();
        duck.fly();
        duck.swim();
        duck.play();
    }
}
