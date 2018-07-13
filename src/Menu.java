import java.util.Scanner;

public class Menu {

    public static int mainScreen(){
            Scanner scanner = new Scanner(System.in);
            System.out.println("1.Add car\n2.List cars\n3.Exit");
            return scanner.nextInt();
    }
    public static int carTypeScreen(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("1.Family Car\n2.Bus\n3.Off-Road\n4.Truck\n5.Back");
        return scanner.nextInt();
    }
}
