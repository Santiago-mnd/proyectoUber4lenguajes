<?php
require_once('./car.php');
class UberVan extends Car {
    public $typeCarAccepted;
    public $seatsMaterial;

    public function __construct($license, $driver) {
        parent::__construct($license, $driver);
    }

    public function setPassenger($passenger) {
        if ($passenger == 6){
            $this->passenger = $passenger;
        } else {
            echo "Necesitas 6 espacios libres.
            ";
        }
    }
    
    // public function __construct($license, $driver, $typeCarAccepted, $seatsMaterial) {
    //     parent::__construct($license, $driver);
    //     $this->typeCarAccepted = $typeCarAccepted;
    //     $this->seatsMaterial = $seatsMaterial;
    // }
}

?>