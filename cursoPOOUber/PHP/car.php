<?php
require_once('account.php');
class Car {
    public $id;
    public $license;
    public $driver;
    public $passenger;

    public function __construct($license, $driver){
        $this->license = $license;
        $this->driver = $driver;
    }

    // public function printDataCar() {
    //     echo "Licencia: $this->license Driver: 
    //     ".$this->driver->name;
    // }

    public function printDataCar() {
        echo "
            <br>
            Licencia: $this->license <br>
            Driver: {$this->driver->name} <br>
            Número de pasajeros: $this->passenger <br>
            
    
        ";
    }    


    public function getPassenger() {
        return $this->passenger;
    }

    public function setPassenger($passenger) {
        if ($passenger == 4){
            $this->passenger = $passenger;
        } else {
            echo " <br> Necesitas 4 espacios libres.
            ";
        }
    }
}
?>