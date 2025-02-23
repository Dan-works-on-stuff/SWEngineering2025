package abstractClasses;

abstract class Animal {
		string name;
		Animal.(string name){ this.name = name; }
		abstract void move();
		abstract void eat();

		// concrete method
		void label() {
			System.out.println("Animal's data:");
		}

}