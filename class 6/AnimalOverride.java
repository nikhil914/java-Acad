class Animal{
	String breed="Zabra";
	String color="brown";
	
   public void speak() {
      System.out.println("Animals can speak");
   }
}

class Dog extends Animal {
   public void speak() {
      System.out.println("Dogs can speak and bark");
   }
}
class cat extends Animal{
	public void speak(){
		System.out.println("Cats canb Speak");
	}
}

public class AnimalOverride {

   public static void main(String args[]) {
      Animal a = new Animal();   
      Animal b = new Dog(); 
      Animal c = new cat();  

      a.speak();   
      b.speak();   
      c.speak();
   }

}