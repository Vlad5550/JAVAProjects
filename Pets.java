

class Pet {
    private String name;
    private int age;
    private String species;

    public Pet(String name, int age, String species) {
        this.name = name;
        this.age = age;
        this.species = species;
    }

    public String getInfo() {
        return "Name: " + name + ", Age: " + age + ", Species: " + species;
    }

    public int calcHumanAge() {
        if (species.equals("Duck")) {
            return age * 7;
        }else if (species.equals("Bird")) {
            return age * 8;
        } else { 
            return age;
        }
    }

}

    class Duck extends Pet {
        String favtoy ;

        public Duck(String name, int age, String favtoy) {
            super(name, age, "Duck");    
            this.favtoy = favtoy;
        }

        public String getInfo() {
            return super.getInfo() + ", Favorite Toy: " + favtoy;
        }
    }

    class Bird extends Pet {
        double wingSpan;
        
        public Bird(String name, int age, double wingSpan){
            super(name, age, "Bird");
            this.wingSpan = wingSpan;
        }

        public String getInfo() {
            return super.getInfo() + ", Wing Span: " + wingSpan + " meters";
        }
    }



public class Pets {
    public static void main(String[] args) {
        Pet duck = new Duck("Buddy", 3, "Bone");
        Pet bird = new Bird("Vulture", 5, 1.5);

        System.out.println(duck.getInfo());
        System.out.println("Buddy's age in human years: " + duck.calcHumanAge());

        System.out.println(bird.getInfo());
        System.out.println("Vulture's age in human years: " + bird.calcHumanAge());
    }    
}
