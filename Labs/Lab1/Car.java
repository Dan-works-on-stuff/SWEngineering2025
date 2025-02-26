
abstract class Car implements vehicle {
    private static void roti(){
        System.out.println("masina are roti");
    }//privatele sunt inaccesibile pt copii ce mostenesc clasa
//    protected void motor(){
//        System.out.println("toate masinile au o forma de motor");
//    } //protected=> accesibile doar pentru subclasele ce mostenesc clasa asta
    String manufacturer;
    Car(String manufacturer){ this.manufacturer = manufacturer; }
    @Override
    public void stats() { System.out.println("This car has: "); } // metoda asta este accesibila fara instantiere
    final void siguranta() { System.out.println("-masina este testata si aprobata in concordanta cu standardele de siguranta UE;"); } //metoda asta e finala+> nu poate fi suprascrisa
    abstract void acceleration(double accel);
    abstract void top_speed(int top_speed);
    void engine_type(int cilinders) { System.out.println("This car has an engine"); }
    void engine_type(double liters) { System.out.println("This car has a "+ liters + "l engine"); }
    // concrete method

    @Override
    public void type(){
        System.out.println("this is a land vehicle");
    }
    @Override
    public void fuel(){
        System.out.println("this uses commercial diesel, gas, LPG or electricity");
    }


}

