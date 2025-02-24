package abstractClasses;

abstract class Animal {
		private static void DNA(){
				System.out.println("DNA");
		}//privatele sunt inaccesibile pt copii ce mostenesc clasa

		protected void inima(){
			System.out.println("toate animalele au inima");
		} //protected=> accesibile doar pentru subclasele ce mostenesc clasa asta
		String name;
		Animal(String name){ this.name = name; }
		static void display() { System.out.println("e vorba de un animal"); } // metoda asta este accesibila fara instantiere
		final void sleep() { System.out.println("Animal is sleeping...zzz..."); } //metoda asta e finala+> nu poate fi suprascrisa
		abstract void move();
		abstract void eat();
		void MakeSound() { System.out.println("Animal makes a sound."); }
		// concrete method
		void label() {
			System.out.println("Animal's data:");
		}

}

