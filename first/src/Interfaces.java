public class Interfaces {
    public static void main(String[] args) {
        Me me = new Me();
        me.code();
        me.sleep();
        me.eat();

        AnotherPerson anotherPerson = new AnotherPerson();
        anotherPerson.code();
    }
}

/*
 * Interface -> A pre-initialized class with methods and no constructor
 *              The methods are to be defined in the class implementing the interface.
*/

interface Person {
    void eat();
    void sleep();
}

interface Programmer {
    void code();
}

// multiple inheritance by interfaces
class Me implements Person, Programmer {

    @Override
    public void eat() {
        System.out.println("Me eats");
    }

    @Override
    public void sleep() {
        System.out.println("Me sleeps");
    }

    @Override
    public void code() {
        System.out.println("Me codes");
    }

}

class AnotherPerson implements Person, Programmer {

    @Override
    public void code() {
       System.out.println("Another person does code");
    }

    @Override
    public void eat() {
        System.out.println("Another person does eat");
    }

    @Override
    public void sleep() {
        System.out.println("Another person does sleep");
    }

}