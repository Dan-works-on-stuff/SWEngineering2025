

class BMW extends Car{
    BMW(){super("BMW");}
    @Override
    void acceleration(double accel){
        System.out.println("-BMW has a 0-100km/h time of " + accel +"seconds");
    }
    @Override
    void top_speed(int top_speed){
        System.out.println("-BMW has a top speed of "+ top_speed +"km/h");
    }
    @Override
    void engine_type(int cilinders){
        super.engine_type(cilinders);
        if (cilinders == 4)
            System.out.println("BMW has an straight-4 engine");
        else if (cilinders == 6) {
            System.out.println("BMW has an straight-6 engine");
        }
        else
            System.out.println("BMW doesnt supply an engine like that in 2025");
    }

    @Override
    void engine_type(double liters){
        super.engine_type(liters);
        if (liters <= 2.5)
            System.out.println("BMW has an straight-4 engine");
        else if (liters > 2.5 && liters <= 6.5) {
            System.out.println("BMW has an straight-6 engine");
        }
        else
            System.out.println("BMW doesnt supply an engine like that in 2025");
    }
}