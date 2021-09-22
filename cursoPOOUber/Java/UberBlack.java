package Java;
import java.util.Map;
import java.util.ArrayList;


class UberBlack extends Car{
    Map<String, ArrayList<Integer>> typeCarAccepted;
    ArrayList<String> seatsMaterial;

    public UberBlack(String license, Account driver, Map<String, ArrayList<Integer>> typeCarAccepted,
    ArrayList<String> seatsMaterial) {
        super(license, driver);
        this.typeCarAccepted = typeCarAccepted;
        this.seatsMaterial = seatsMaterial;
    }    
}
