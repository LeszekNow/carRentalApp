import java.util.Collections;

public class CarRental {
    public static void main(String[] args) throws ClassNotFoundException {

        Collections.sort(CarRepository.carsList, new CarComparator1());
        Collections.sort(CarRepository.carsList, new Car.CarComparator2());
        Flow.start();
    }
}
