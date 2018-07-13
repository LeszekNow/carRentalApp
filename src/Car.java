import java.sql.*;
import java.util.Comparator;

public class Car {
    private String brand;
    private String model;
    private String colour;
    private String vin;
    private String registrationNumber;
    private int power;
    private int rentPrice;
    private int engineCapacity;
    private int fuelConsumption;

    public Car(String brand, String model, String colour, String registrationNumber,
               int power, int engineCapacity, int fuelConsumption, int rentPrice) {
        this.brand = brand;
        this.model = model;
        this.colour = colour;
        this.rentPrice = rentPrice;
        this.registrationNumber = registrationNumber;
        this.power = power;
        this.engineCapacity = engineCapacity;
        this.fuelConsumption = fuelConsumption;
        CarRepository.carsList.add(this);
    }

    public Car(CarDataWrapper carDataWrapper) {
        this.brand = carDataWrapper.brand;
        this.model = carDataWrapper.model;
        this.colour = carDataWrapper.colour;
        this.rentPrice = carDataWrapper.rentPrice;
        this.registrationNumber = carDataWrapper.registrationNumber;
        this.power = carDataWrapper.power;
        this.engineCapacity = carDataWrapper.engineCapacity;
        this.fuelConsumption = carDataWrapper.fuelConsumption;
        CarRepository.carsList.add(this);
    }


    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getColour() {
        return colour;
    }

    public String getVin() {
        return vin;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public int getPower() {
        return power;
    }

    public int getRentPrice() {
        return rentPrice;
    }

    public int getEngineCapacity() {
        return engineCapacity;
    }

    public int getFuelConsumption() {
        return fuelConsumption;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public void setRentPrice(int rentPrice) {
        this.rentPrice = rentPrice;
    }

    public void setFuelConsumption(int fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    @Override
    public String toString() {
        return "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", colour='" + colour + '\'' +
                ", vin='" + vin + '\'' +
                ", registrationNumber='" + registrationNumber + '\'' +
                ", power=" + power +
                ", rentPrice=" + rentPrice +
                ", engineCapacity=" + engineCapacity +
                ", fuelConsumption=" + fuelConsumption +
                '}';
    }

    public static class CarComparator2 implements Comparator<Car> {

        @Override
        public int compare(Car c1, Car c2) {
            return c1.getPower() - c2.getPower();
        }
    }

    public void saveInDataBase(String queryString) {
        Connection connect = null;
        PreparedStatement preparedStatement = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connect = DriverManager
                    .getConnection("jdbc:mysql://localhost/carrental?"
                            + "user=root&password=");
            preparedStatement = connect.prepareStatement(queryString);
            preparedStatement.executeUpdate();
            preparedStatement.clearParameters();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
