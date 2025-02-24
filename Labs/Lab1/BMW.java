

class BMW extends Car{
    BMW(){super("BMW");}
    @Override
    void acceleration(){
        System.out.println("-BMW has a 0-100km/h time of 5.4 seconds");
    }
    @Override
    void top_speed(){
        System.out.println("-BMW has a top spped of 280km/h");
    }
    @Override
    void engine_type(){
        super.engine_type();
        System.out.println("BMW has an straight-6 engine");
    }
}