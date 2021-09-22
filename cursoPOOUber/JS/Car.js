class Car {
    constructor (license, driver) {
        this.id;
        this.license = license;
        this.driver = driver;
        this.passenger;
    }

    printDataCar() {
        console.table(this.driver) //imprimirá una tabla con todos los datos
        console.log(this.driver.name)
        console.log(this.driver.document)
    }
}

// function Car(license, driver) {
//     this.id;
//     this.license = license;
//     this.driver = driver;
//     this.passenger;
// }

// Car.prototype.printDataCar = function () {
//     console.table(this.driver);
//     console.log(this.driver.name);
//     console.log(this.driver.document);
// }
