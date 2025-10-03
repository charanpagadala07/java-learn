class Bike {
    String name = "Ducati";
    String model = "A15";
    
    void run() {
        String bike = this.name;
        System.out.print(bike);
    }
}

public class Vechile {
    public static void main(String[] args) {
        Bike b = new Bike();
        b.run();
    }
}
