package BorderControl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Citizen>citizenList=new ArrayList<>();
        List<Robot>robotList=new ArrayList<>();

        String command=scanner.nextLine();
        while (!command.equals("End")){
            String[]infoCommand=command.split(" ");

           if(infoCommand.length==3){
               String name=infoCommand[0];
               int age=Integer.parseInt(infoCommand[1]);
               String id=infoCommand[2];
               Citizen citizen=new Citizen(name,age,id);
               citizenList.add(citizen);
           }else if(infoCommand.length==2){
               String model=infoCommand[0];
               String id=infoCommand[1];
               Robot robot=new Robot(id,model);
           }

            command=scanner.nextLine();
        }


       String fakeNumberOfIds=scanner.nextLine();

        List<Citizen>printCitizen=new ArrayList<>();

        for (Citizen citizen : citizenList) {
            if(citizen.getId().contains(fakeNumberOfIds)){
                printCitizen.add(citizen);
            }
        }

        List<Robot>printRobot=new ArrayList<>();

        for (Citizen citizen : printCitizen) {
            System.out.println(citizen.getId());
        }

        for (Robot robot : robotList) {
            if(robot.getId().contains(fakeNumberOfIds)){
                printRobot.add(robot);
            }
        }
        for (Robot robot : printRobot) {
            System.out.println(robot.getId());
        }
    }
}
