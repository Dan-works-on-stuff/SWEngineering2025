package abstractClasses;

class Fish extends Animal {
	Fish(){super("Fish");}
	@Override
	void move() {
		 System.out.println("Moves by swimming.");
    }


	@Override
	void eat() {
		 System.out.println("Eats seafood.");
	 }

}