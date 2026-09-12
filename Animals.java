package Projects;

abstract class Animal {
    public abstract String getNamegetBreed();
}

class Dog extends Animal {
    private String name;
    private String breed;

    public Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }
    @Override
    public String getNamegetBreed() {
        return "Dog Name: " + name + ", Breed: " + breed;
    }
}

class Cat extends Animal {
    private String name;
    private String breed;

    public Cat(String name, String breed) {           
        this.name = name;                           //initializing  variables   with the provided    parameter
        this.breed = breed;
    }

    @Override
    public String getNamegetBreed() {
        return "Cat Name: " + name + ", Breed: " + breed;
    }
}


public class Animals {
    public static void main(String[] args) {
    Animal dog = new Dog("Max", "Golden Retriever");  
    Animal cat = new Cat("Wishi", "Siamese");   
    
    System.out.println(dog.getNamegetBreed());
    System.out.println(cat.getNamegetBreed());
    
    }
}