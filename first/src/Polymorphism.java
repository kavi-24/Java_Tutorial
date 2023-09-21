public class Polymorphism {
    public static void main(String[] args) {
        AnotherPerson2 anotherPerson2 = new AnotherPerson2();
        anotherPerson2.eat();
        anotherPerson2.eat("Pizza");
    }
}

class Person2 {
    void eat() {
        System.out.println("Person2 eats");
    }
}
class AnotherPerson2 extends Person2 {

    @Override
    void eat() {
        System.out.println("Another person eats");
    }

    // method overloading / other type of polym.
    void eat(String food) {
        System.out.println("Another person eats " + food);
    }
}
