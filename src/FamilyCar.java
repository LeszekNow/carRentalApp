public class FamilyCar extends Car {
    private int seatsNumber;

    public FamilyCar(String brand, String model, String colour, String registrationNumber,
                     int power, int rentPrice, int engineCapacity, int fuelConsumption, int seatsNumber) {
        super(brand, model, colour, registrationNumber, rentPrice, power, engineCapacity, fuelConsumption);
        this.seatsNumber = seatsNumber;
    }
    public FamilyCar(CarDataWrapper carDataWrapper, int seatsNumber) {
        super(carDataWrapper);
        this.seatsNumber = seatsNumber;
    }

    public int getSeatsNumber() {
        return seatsNumber;
    }

    @Override
    public String toString() {
        return "FamilyCar{" + super.toString() +
                "seatsNumber=" + seatsNumber +
                '}';
    }
}
