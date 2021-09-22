package Java;
import java.util.Map;
import java.util.ArrayList;
class UberVan extends Car{
    Map<String, Map<String, Integer>> typeCarAccepted;
    ArrayList<String> seatsMaterial;
    private Integer passenger;

//     public UberVan(String license, Account driver, Map<String, Map<String, Integer>> typeCarAccepted,
//     ArrayList<String> seatsMaterial) {
//         super(license, driver);
//         this.typeCarAccepted = typeCarAccepted;
//         this.seatsMaterial = seatsMaterial;
//     }    
        public UberVan(String license, Account driver) {
            super(license, driver);

        }


        // Override significa que estás sobre escribiendo el método que viene de la clase padre, éste será el mismo método, pero tendrá un comportamiento distinto.
        @Override
        public void setPassenger(Integer passenger) {
            if(passenger == 6){
                this.passenger = passenger;
            }else{
                System.out.println("Necesitas asignar 6 pasajeros");
            }
        }
}
