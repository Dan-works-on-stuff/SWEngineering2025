package abstractClasses;

class Bird extends Animal {

		Bird(){super("Bird");}// aici apelez constructorul din animal cu argumentul "Dog"
		// super(...) must be the first statement in the subclass constructor.
		@Override
		void move() {
				 System.out.println("Moves by flying.");
		}
		
		@Override
		void eat() {
					System.out.println("Eats birdfood.");
		}	 

		@Override
		void MakeSound(){
			super.MakeSound(); //refolosesc metoda din parinte dar
			System.out.println("Cipcirip!"); //mai si adaug la ea
		}
}
