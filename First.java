public class First {
    public static void main(String[] args) {
        String name = "Hello World";
        int small_number = 3;
        if (small_number >= 0) {
            System.out.println(name);
            System.out.println(name.length());
            if (name.length() <= 100) {
                System.out.println("Egg");
                String sub = "EGG";
                System.out.println("why don't you have an \""+sub+"\" good sir");
                int random_numb = (int)(Math.random() * 100);
                System.out.print(random_numb);
            }
        }
    }
}

class Animal {
    public void animalSound() {
      System.out.println("The animal makes a sound");
    }
  }
  
  class Pig extends Animal {
    public void animalSound() {
      System.out.println("The pig says: wee wee");
    }
  }
  
  class Dog extends Animal {
    public void animalSound() {
      System.out.println("The dog says: bow wow");
    }
  }
  
  class Main {
    public static void main(String[] args) {
      Animal myAnimal = new Animal();  // Create a Animal object
      Animal myPig = new Pig();  // Create a Pig object
      Animal myDog = new Dog();  // Create a Dog object
      myAnimal.animalSound();
      myPig.animalSound();
      myDog.animalSound();
    }
  }
