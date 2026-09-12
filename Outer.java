

public class Outer   {
    
    static class Stud {
        private String name;
        private int age;

        public Stud(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public void print() {
            System.out.println("Name : " + name);
            System.out.println("Age: " + age);
        }
    }
    

    public static void main(String[] args) {
    Outer.Stud s1 = new Outer.Stud("Vlad", 23);
    Outer.Stud s2 = new Outer.Stud("Razvan", 22);
      s1.print();
      s2.print();

    }
} 

