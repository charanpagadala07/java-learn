class Vechile{
    public void run(){
        System.out.println("Engine is running");
    }
}

class Bike extends Vechile{
    public void condition(){
        System.out.println("Vechile is in good condition");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Bike b = new Bike();
        b.run();
        b.condition();
    }
}
