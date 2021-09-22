<?php
require_once('./car.php');

class UberPool extends Car {
    public $brand;
    public $model;

    public function __construct($license, $driver, $brand, $model){
        parent::__construct($license, $driver); #Esto equivale a la keyword super en java
        $this->brand = $brand;
        $this->model = $model;
    }
}

?>