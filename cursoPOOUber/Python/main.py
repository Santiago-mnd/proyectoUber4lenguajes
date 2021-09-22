from car import Car
from account import Account
from uberX import UberX
from uberPool import UberPool


if __name__ == "__main__":
    # car = Car("MND1020", Account("Santiago García", "SND10"))
    # car.license = "MND1020"
    # car.driver = "Santiago Garcia"
    # print(vars(car))
    # print(vars(car.driver))

    # car2 = Car("LALA10", Account("Martha", "MTA20"))
    # car2.license = "lala10"
    # car2.driver = "Martha"
    # print(vars(car2))
    # print(vars(car2.driver))

    uberX = UberX("MND1020", Account("Santiago García", "SND10"), "Chevrolet", "Spark")
    print(vars(uberX))
    print(vars(uberX.driver))

