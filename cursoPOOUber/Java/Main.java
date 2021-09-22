package Java;

class Main {
    public static void main(String[] args) {
        Uberx uberX = new Uberx("MND1020", new Driver( 1 ,"Santiago García", "SNT123"), "Chevrolet", "Spark");
        uberX.setPassenger(4);
        // uberX.passengers = 4;
        uberX.printDataCar(); 

        UberVan uberVan = new UberVan("MTH10", new Driver(2, "Martha", "MTH1"));
        uberVan.setPassenger(6);
        uberVan.printDataCar();
        

    }

    //     Car car2 = new Car("SDA123", new Account("Emy Ly", "EMY203"));
    //     car2.6s = 3;
    //     car2.printDataCar();
}