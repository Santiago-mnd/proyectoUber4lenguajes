<?php

require_once('./car.php');
require_once('./account.php');
require_once('./uberX.php');
require_once('./uberPool.php');
require_once('./uberVan.php');

$uberX = new UberX("MND1020", new Account("Santiago García\n", "SND10"), "Chevrolet", "Spark");
$uberX->setPassenger(4);
$uberX->printDataCar();


// $uberPool = new UberPool("MATH", new Account("Marthe", "MTH"), "Dodge", "Attitude");
// $uberPool->printDataCar();

$uberVan = new UberVan("OJL395", new Account("Raúl Ramírez", "AND456"));
$uberVan->setPassenger(6);
$uberVan->printDataCar();

?>