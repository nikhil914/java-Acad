abstract class Animals {
	String breed,color,name;
	abstract void eat();
	void speak() {
		System.out.println("Speak method called");
	}
}
class dog extends Animals{
	dog(String breed,String color,String name){
	this.breed=breed;
	this.color=color;
	this.name=name;
	}
	void eat(){
		System.out.println("Eat method called");
		System.out.println("Name is: "+name+",  Breed is: "+breed+", color is: "+color);
			}

}
public class AnimalsAbs {

	public static void main(String[] args) {
     Animals a=new dog("Zabra","white","Lucky");
	dog d=new dog("Alpha","Brown","Alax");
    a.eat();
	a.speak();
	}
}