package Java;

class Uberx extends Car{
    String brand;
    String model;

    public Uberx(String license, Driver driver, String brand, String model) {
        super(license, driver);
        this.brand = brand;
        this.model = model;
    }    

    @Override
    void printDataCar() {
        super.printDataCar();
        System.out.println("Model: " + model + "\nBrand: " + brand);
    }
}
