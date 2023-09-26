package OOP_Concept;

//Encapsulation: Using private fields and public methods to control access to data
class Person{
    private String name;
    private int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    
    public void setAge(int age){
        if(age>0){
            this.age = age;
        }
        else{
            System.out.println("Age should be more than 0");
        }
    }

    public void getName(String name){
        System.out.println("your name is: " + name);
    }

    public void dispaly(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }

}


//Inheritance: creating a subclass that inherits from a supperclass (person)
class Student extends Person{
    private int studentId;

    public Student(String name, int age, int studentId){
        super(name, age); //call the constructor of the person(superclass)
        this.studentId = studentId;
    }

    public void displayDetails(){
        super.dispaly(); //call the supper class method
        System.out.println("Student Id: "+studentId);
    }
}

//Polymorphism: using a superclass reference to refer to a subclass object
abstract class Animal{
    public abstract void makeSound();
}

//Polymorphism - override
class Dog extends Animal{
// This means that Dog is a subclass of Animal and inherits the makeSound() method from the Animal class.
    @Override
    public void makeSound() {
        System.out.println("Dog barks!");
    }

    // Overloaded method with an additional parameter
    public void makeSound(int count) {
        for (int i = 0; i < count; i++) {
            System.out.println("Dog barks!");
        }
    }
}

// Polymorphism - overload
class Cat extends Animal{
    @Override
    public void makeSound() {
        System.out.println("Cat meows!");
    }

    // Overloaded method with a different parameter type
    public void makeSound(String sound) {
        System.out.println("Cat makes a " + sound);
    }
}
// Override: 
// Both Dog and Cat classes override the makeSound() method inherited from the Animal class. 
// This means they provide their own implementations of the makeSound() method.

// Overload
// method overloading occurs when multiple methods in the same class have the same name but different parameter lists.

public class Main{
    public static void main(String[] args){
        //Encapsulation
        Person person = new Person("Tharushi", 24);
        // Testing encapsulation with age
        person.setAge(-5);
        person.getName("Tharushi");

        //Inheritance
        Student student = new Student("Sanduni", 27, 1234);
        student.displayDetails();

        //Polymorphism
        Animal dog = new Dog();
        Animal cat = new Cat();

        dog.makeSound();
        ((Dog) dog).makeSound(3);

        cat.makeSound();
        ((Cat) cat).makeSound("purr");
    }
}