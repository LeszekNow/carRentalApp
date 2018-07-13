import java.sql.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Flow {
    public static void start() throws ClassNotFoundException{

        boolean exit = false;
        do {
            switch (Menu.mainScreen()) {
                case 1:
                    typeCarFlow();
                    break;
                case 2:
                    CarRepository.showCars();
                    break;
                case 3:
                    exit = true;
                    break;
            }
        } while (!exit);
        System.exit(0);
    }

    private static void typeCarFlow() {
        int choice = Menu.carTypeScreen();
        CarDataWrapper cdw;
        Scanner scanner = new Scanner(System.in);
        switch (choice) {
            case 1:
                cdw = readMainParameters();
                scanner = new Scanner(System.in);
                System.out.print(" Seat number: ");
                int seatsNumber = scanner.nextInt();
                FamilyCar fC = new FamilyCar(cdw, seatsNumber);
                String sqlInsertfC = "INSERT INTO tfamilycar (brand, model, colour, power)" +
                        "VALUES (" +"'"+fC.getBrand()+"'" + "," + "'"+fC.getModel()+"'" + "," + "'"+fC.getColour()+"'" + "," +fC.getPower()+ ");";
                fC.saveInDataBase(sqlInsertfC);
                break;
            case 2:
                cdw = readMainParameters();
                scanner = new Scanner(System.in);
                System.out.print(" Seat number: ");
                int seats = scanner.nextInt();
                System.out.print(" Standing places number: ");
                int standingPlaces = scanner.nextInt();
                System.out.print(" Length: ");
                double length = scanner.nextDouble();
                System.out.print(" Standing places number: ");
                double height = scanner.nextDouble();
                Bus b = new Bus(cdw, seats, standingPlaces, length, height);
                String sqlInsertBus = "INSERT INTO tbus (brand, model, colour, seats)" +
                        "VALUES (" + b.getBrand() + "," + b.getModel() + "," + b.getColour() + "," + b.getSeats() + ");";
                b.saveInDataBase(sqlInsertBus);
            case 3:
                cdw = readMainParameters();
                scanner = new Scanner(System.in);
                System.out.println("Reductor: - True or False");
                boolean reductor = scanner.nextBoolean();
                System.out.println("AWD: - True or False");
                boolean awd = scanner.nextBoolean();
                System.out.println("SpareWheel: - True or False");
                boolean spareWheel = scanner.nextBoolean();
                OffRoad off = new OffRoad(cdw, reductor, awd, spareWheel);
                String sqlInsertOffRoad = "INSERT INTO toffroad (brand, model, colour)" +
                        "VALUES ("+"'"+off.getBrand()+"', '"+off.getModel()+"', '"+off.getColour()+"'"+");";
                off.saveInDataBase(sqlInsertOffRoad);



        }
    }

    private static CarDataWrapper readMainParameters() {
        Scanner scanner = new Scanner(System.in);
        CarDataWrapper carDataWrapper = new CarDataWrapper();

        System.out.print(" Brand: ");
        carDataWrapper.brand = scanner.nextLine();
        System.out.print(" Model: ");
        carDataWrapper.model = scanner.nextLine();
        System.out.print(" Colour: ");
        carDataWrapper.colour = scanner.nextLine();
        carDataWrapper.rentPrice = ourScanner("Rent price");
        carDataWrapper.power = ourScanner("Power");
        System.out.print(" Engine capacity: ");
        carDataWrapper.engineCapacity = scanner.nextInt();
        System.out.print(" Fuel consumption: ");
        carDataWrapper.fuelConsumption = scanner.nextInt();
        scanner.nextLine();
        System.out.print(" Registration number: ");
        carDataWrapper.registrationNumber = scanner.nextLine();

        return carDataWrapper;
    }

    public static int ourScanner(String parameterName) {
        int result = 0;
        while (true) {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.print(parameterName + ": ");
                result = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.print("Zjebało się!");
                continue;
            }
            break;
        }
        return result;
    }
    }

