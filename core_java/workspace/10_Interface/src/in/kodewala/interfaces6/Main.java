package in.kodewala.interfaces6;

interface Engine {
    default void start() {
    	  System.out.println("Engine.start()");
    }
}

interface MusicSystem {
    default void start() {
    	System.out.println("MusicSystem.start()");
    }
    
}


class Car implements Engine, MusicSystem {

    @Override
    public void start() {
        Engine.super.start();
    }

   
}

public class Main {
    public static void main(String[] args) {

        Car car = new Car();

        car.start();
       
    }
}
