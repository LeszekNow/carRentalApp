public class OffRoad extends Car {
    private boolean reductor, awd, spareWheel;

    public OffRoad(String brand, String model, String colour, String registrationNumber, int power,
                   int engineCapacity, int fuelConsumption, int rentPrice, boolean reductor, boolean awd, boolean spareWheel) {
        super(brand, model, colour, registrationNumber, power, rentPrice, engineCapacity, fuelConsumption);
        this.reductor = reductor;
        this.awd = awd;
        this.spareWheel = spareWheel;
    }

    public OffRoad(CarDataWrapper carDataWrapper, boolean reductor, boolean awd, boolean spareWheel){
        super(carDataWrapper);
        this.reductor = reductor;
        this.awd = awd;
        this.spareWheel = spareWheel;

    }

    public boolean isReductor() {
        return reductor;
    }

    public boolean isAwd() {
        return awd;
    }

    public boolean isSpareWheel() {
        return spareWheel;
    }

    @Override
    public String toString() {
        return "OffRoad{" + super.toString() +
                " reductor=" + reductor +
                ", awd=" + awd +
                ", spareWheel=" + spareWheel +
                '}';
    }
}

