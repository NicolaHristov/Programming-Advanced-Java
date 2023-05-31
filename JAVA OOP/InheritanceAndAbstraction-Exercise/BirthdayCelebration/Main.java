package BirthdayCelebration;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command=scanner.nextLine();
        List<Citizen>citizenList=new ArrayList<>();
        List<Pet>petList=new ArrayList<>();
        while (!command.equals("End")){
            String[]inputCommand=command.split(" ");//Citizen Peter 22 9010101122 10/10/1990

            if(inputCommand.length==5){
                String name=inputCommand[1];
                int age=Integer.parseInt(inputCommand[2]);
                String id=inputCommand[3];
                String birthdate=inputCommand[4];
                Citizen citizen=new Citizen(name,age,id,birthdate);
                citizenList.add(citizen);
            }else if(inputCommand.length==3){
                //Robot {model} {id}"
                //Pet {name} {birthdate
                String firts=inputCommand[0];
                switch (firts){
                    case "Robot":
                        String model=inputCommand[1];
                        String id=inputCommand[2];
                        Robot robot=new Robot(id,model);
                        break;
                    case "Pet":
                        String name=inputCommand[1];
                        String birthdate=inputCommand[2];
                        Pet pet=new Pet(name,birthdate);
                        petList.add(pet);
                        break;
                }
            }

            command= scanner.nextLine();
        }
        String yearToSearsh=scanner.nextLine();

        for (Citizen citizen : citizenList) {
            if(citizen.getBirthDate().contains(yearToSearsh)){
                System.out.println(citizen.getBirthDate());
            }
        }

        for (Pet pet : petList) {
            if(pet.getBirthDate().contains(yearToSearsh)){
                System.out.println(pet.getBirthDate());
            }
        }




    }
}
