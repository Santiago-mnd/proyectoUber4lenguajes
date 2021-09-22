package Java;

class Car {
    private Integer id;
    private String license;
    private Account driver;
    protected Integer passegenger;

    public Car(String license, Account driver){
        this.license = license;
        this.driver = driver;
    }

    void printDataCar() {
        if(passegenger != null){
            System.out.println("License: " + license + " Name Driver: " + driver.name + " Passengers: " + passegenger);
        }
        
    }

    // Los getters y setters se utilizan para poder acceder a un atributo privado desde otras clases.
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public Account getDriver() {
        return driver;
    }

    public void setDriver(Account driver) {
        this.driver = driver;
    }

    public Integer getPassenger(){
        return passegenger;
    }

    public void setPassenger(Integer passenger) { 
        // Dentro de este método se puede trabajar como cualquier otra función. Pero es importante que "devuelva" {this.atributo = atributo}, para que pueda ser actualizado.
        if(passenger == 4){
            this.passegenger = passenger;
        }else{
            System.out.println("Necesitas asignar 4 pasajeros");
        }
    }

}