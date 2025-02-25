

class main_test {

    public static void main(String[] args) {

        Car myBMW = new BMW();
        plane Boeing = new plane();
        myBMW.stats();
        myBMW.acceleration(5.4);
        myBMW.top_speed(280);
        myBMW.engine_type(6);

        Car myFriendsBMW = new BMW();
        myBMW.stats();
        myBMW.acceleration(5.4);
        myBMW.top_speed(280);
        myBMW.engine_type(3.2);
        
        Boeing.stats();
        Boeing.fuel();
        Boeing.type();
    }

}