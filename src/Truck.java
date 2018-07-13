public class Truck extends Car {
    private int maxCarWeight;
    private double height;
    private int axleNumber;
    private boolean truckTrailer;

    public Truck(String brand, String model, String colour, String registrationNumber, int power,
                 int engineCapacity, int fuelConsumption, int rentPrice, int maxCarWeight, double height, int axleNumber, boolean truckTrailer) {
        super(brand, model, colour, registrationNumber, power, rentPrice, engineCapacity, fuelConsumption);
        this.maxCarWeight = maxCarWeight;
        this.height = height;
        this.axleNumber = axleNumber;
        this.truckTrailer = truckTrailer;
    }

    public int getMaxCarWeight() {
        return maxCarWeight;
    }

    public double getHeight() {
        return height;
    }

    public int getAxleNumber() {
        return axleNumber;
    }

    public boolean isTruckTrailer() {
        return truckTrailer;
    }

    public void setAxleNumber(int axleNumber) {
        this.axleNumber = axleNumber;
    }

    @Override
    public String toString() {
        return "Truck{" + super.toString() +
                " maxCarWeight=" + maxCarWeight +
                ", height=" + height +
                ", axleNumber=" + axleNumber +
                ", truckTrailer=" + truckTrailer +
                '}';
    }
}

