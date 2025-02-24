

class main_test {

    public static void main(String[] args) {

        Car myBMW = new BMW();
        plane Boeing = new plane();
        myBMW.stats();
        myBMW.acceleration();
        myBMW.top_speed();
        myBMW.engine_type();

        Boeing.stats();
        Boeing.fuel();
        Boeing.type();
    }

}