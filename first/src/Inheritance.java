/*
Inheritance -> Acquiring parent class's property
*/

public class Inheritance {
    public static void main(String[] args) {
        MySon mySon = new MySon("surname1");
        mySon.dance();
        mySon.sing();
        MyGrandSon myGrandSon = new MyGrandSon(mySon.surName, "firstName1");
        myGrandSon.printName();
    }
}

class Me {
    void sing() {
        System.out.println("I can sing");
    }
}

class MySon extends Me {

    String surName;
    MySon(String surName) {
        this.surName = surName;
    }

    void dance() {
        System.out.println("I can dance");
    }
}

class MyGrandSon extends MySon {

    String firstName;

    // super
    MyGrandSon(String surName, String firstName) {
        super(surName);
        this.firstName = firstName;
    }

    void printName() {
        System.out.println(firstName + " " + surName);
    }
}
