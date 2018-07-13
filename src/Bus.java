import java.sql.*;

public class Bus extends Car {
    private int seats, standingPlaces;
    private double length, height;

    public Bus(String brand, String model, String colour, String registrationNumber, int power,
               int engineCapacity, int fuelConsumption, int rentPrice, int seats, int standingPlaces, double length, double height) {
        super(brand, model, colour, registrationNumber, power, engineCapacity, fuelConsumption, rentPrice);
        this.seats = seats;
        this.standingPlaces = standingPlaces;
        this.length = length;
        this.height = height;

    }
    public Bus(CarDataWrapper carDataWrapper,int seats, int standingPlaces, double length, double height ){
        super(carDataWrapper);
        createBusParameters(seats, standingPlaces, length, height);
    }

    private void createBusParameters(int seats, int standingPlaces, double length, double height){
        this.seats = seats;
        this.standingPlaces = standingPlaces;
        this.length = length;
        this.height = height;
    }

    public int getSeats() {
        return seats;
    }

    public int getStandingPlaces() {
        return standingPlaces;
    }

    public double getLength() {
        return length;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return "Bus{" + super.toString() +
                " seatsNumber=" + seats +
                ", standingPlaces=" + standingPlaces +
                ", length=" + length +
                ", height=" + height +
                '}';
    }
}
