

class main_test {

    public static void main(String[] args) {

        Car mycar = new BMW();
        plane Boeing = new plane();
        mycar.stats();
        mycar.acceleration(5.4);
        mycar.top_speed(280);
        mycar.engine_type(6);

        System.out.println();
        Car myFriendsBMW = new BMW();
        myFriendsBMW.stats();
        myFriendsBMW.acceleration(7.3);
        myFriendsBMW.top_speed(280);
        myFriendsBMW.engine_type(3.2);
        
        Boeing.stats();
        Boeing.fuel();
        Boeing.type();
    }

}