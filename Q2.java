// Method Overloading
class MathOperations {
    // Multiply two integers
    public int multiply(int a, int b) {
        return a * b;
    }

    // Multiply three integers
    public int multiply(int a, int b, int c) {
        return a * b * c;
    }
}

// Method Overriding
class Animal {
    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Cat meows");
    }
}

public class Main {
    public static void main(String[] args) {
        // Testing method overloading
        MathOperations mathOps = new MathOperations();
        System.out.println("Product of 2 and 3: " + mathOps.multiply(2, 3));
        System.out.println("Product of 2, 3, and 4: " + mathOps.multiply(2, 3, 4));

        // Testing method overriding and polymorphism
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        myDog.makeSound(); // Dog barks
        myCat.makeSound(); // Cat meows
    }
}