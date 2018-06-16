
public interface Animal {
    void speak();
   void eat();

    public static void main(String[] args) {
     Dog x=new Dog();
     Cat y=new Cat();
     x.speak();
      x.eat();
      y.speak();
      y.eat();
	}

}
 class Dog implements Animal{
	public void speak() {
		System.out.println("Speak method in dog class");
	}
	public void eat() {
		System.out.println("Eat method in dog class");
	}
 }
 class Cat implements Animal{
		public void speak() {
			System.out.println("Speak method in Cat class");
		}
		public void eat() {
			System.out.println("eat method in Cat class");
		}
	 }
