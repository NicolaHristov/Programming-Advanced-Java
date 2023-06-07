package VehicleAlone;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String []inputCar=scanner.nextLine().split("\\s+");
        double carFuelQuantity=Double.parseDouble(inputCar[1]);
        double carConsumpitionPerKm=Double.parseDouble(inputCar[2]);

        Vehicle car=new Car(carFuelQuantity,carConsumpitionPerKm);

        String[]inputTruck=scanner.nextLine().split("\\s+");
        double truckFuelQuantity=Double.parseDouble(inputTruck[1]);
        double truckConsumptionPerKm=Double.parseDouble(inputTruck[2]);

        Vehicle truck=new Truck(truckFuelQuantity,truckConsumptionPerKm);
        Map<String,Vehicle>vehicleMap=new LinkedHashMap<>();

        vehicleMap.put("Car",car);
        vehicleMap.put("Truck",truck);

        int n =Integer.parseInt(scanner.nextLine());
        for(int i=0;i<n ;i++){
            String []input=scanner.nextLine().split("\\s+");
            String command=input[0];
            String searchedType=input[1];

            switch (command){
                case "Drive":
                    double distance=Double.parseDouble(input[2]);
//                    if(searchedType.equals("Car")){
//                        System.out.println(car.drive(distance));
//                    }else if(searchedType.equals("Truck")){
//                        System.out.println(truck.drive(distance));
//                    }
                    Vehicle searchVehicle=vehicleMap.get(searchedType);
                    System.out.println(searchVehicle.drive(distance));
                    break;
                case "Refuel":
                    double liters=Double.parseDouble(input[2]);
                    Vehicle searchVehicleRefuel=vehicleMap.get(searchedType);
                    searchVehicleRefuel.refuel(liters);
//                    if(searchedType.equals("Car")){
//                        car.refuel(liters);
//                    }else if(searchedType.equals("Truck")){
//                       truck.refuel(liters);
//                    }
                    break;
            }
        }

        vehicleMap.values().stream().forEach(System.out::println);

//        System.out.printf("Car: %.2f%n",car.getFuelQuantity());
//        System.out.printf("Truck: %.2f",truck.getFuelQuantity());





    }
}
