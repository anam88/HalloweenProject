package replitPractice;
import java.util.Scanner;
public class LaptopConfigurator056 {
    public static void main(String[] args) {
        double price = 0;
        String screenResolution, storageType, screenType, cpu;
        int ram = 0 ;
        Scanner scan = new Scanner(System.in);
        //WRITE YOUR CODE HERE
        int memorySize=0;
        System.out.println("Select screen size:");
        String screenSize = scan.nextLine();
        if(screenSize.equals("13.3")){
            price += 200;
        }else if(screenSize.equals("15.0")){
            price += 300;
        }else if(screenSize.equals("17.3")){
            price += 400;
        }else{
            System.out.println("Invalid screen size");
        }
        System.out.println("Select CPU type:");
        cpu = scan.next();
        if(cpu.equals("i3")){
            price += 150;
        }else if(cpu.equals("i5")){
            price += 250;
        }else if(cpu.equals("i7")){
            price += 350;
        }else{
            System.out.println("Invalid CPU type");
        }
        System.out.println("Select RAM size:");
        ram = scan.nextInt();
        price += ram / 4 * 50;

        System.out.println("Select storage type:");
        storageType = scan.next();
        System.out.println("Enter memory size:");
        memorySize = scan.nextInt();
        switch (storageType){
            case "HDD":
                price += memorySize / 500 * 50;
                break;
            case "SSD":
                price += memorySize / 500 * 100;
                break;
        }

        System.out.println("Enter screen resolution:");
        screenResolution = scan.next();
        if(screenResolution.equalsIgnoreCase("FULLHD")){
            price += 100;
        }else if(screenResolution.equalsIgnoreCase("4K")){
            price += 200;
        }
        System.out.println("Laptop price is: $"+price);

    }
}
