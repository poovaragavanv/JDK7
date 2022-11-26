class Dog extends Animal {
    public void bark() {
        System.out.println("Gow gow!");
    }
    public void eat() {
        System.out.println("Dog is eating...");
    }
}
 
class Cat extends Animal {
    public void meow() {
        System.out.println("Meow Meow!");
    }
}
class AnimalTrainer {
    public void teach(Animal anim) {
        anim.move();
        anim.eat();
    }
}

public class MainUpcasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dog = new Dog();
		// Upcasting is casting a subtype to a supertype, upward to the inheritance tree.
		
		Animal anim = (Animal) dog;
		
		// we cast the Dog type to the Animal type. Because Animal is the supertype of Dog, this casting is called upcasting
		
		// anim.eat();
		
		// Note that the actual object type does not change because of casting. 
		//The Dog object is still a Dog object. Only the reference type gets changed. 
		
		//UPCASTING
		
		/*
		 * Upcasting is always safe, as we treat a type to a more general one. 
		 * In the above example, an Animal has all behaviors of a Dog.This is also another example of upcasting:
		 * Mammal mam = new Cat();
		 * Animal anim = new Dog();
		 * 
		 * upcasting is not necessary. 
		 * However, we need upcasting when we want to write general code that deals with only the supertype. 
		 */
		
		Dog dog = new Dog();
		Cat cat = new Cat();
		 
		AnimalTrainer trainer = new AnimalTrainer();
		trainer.teach(dog);
		trainer.teach(cat);

	}

}
