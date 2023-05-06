package TrafficLights;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String []signals=scanner.nextLine().split(" ");
        int n=Integer.parseInt(scanner.nextLine());

        List<TrafficLights>trafficLights=new ArrayList<>();//Списък в който си държа светофарите
        for (String currentSignal:signals){
         //1.Първто трябва да си изкарам цвета
         Color color=Color.valueOf(currentSignal);//С value0f из изкарвам текущия сигнал
        //За всеки един сигнал(currentSignal) ще си създавам светофар,който да свети в съответния цвят
            TrafficLights trafficLight = new TrafficLights(color);
            //3.Добавям си светофара към останалите светофари
            trafficLights.add(trafficLight);
        }

        //Трябв да преминем през всеки един светофар,да му сменим цвета и да го принтираме
        for(int i=1;i<=n ;i++){
            for (TrafficLights trafficLight : trafficLights) {
                //change color
                //print
                trafficLight.setColor();
                System.out.print(trafficLight.getColor()+ " ");
            }
            System.out.println();
        }

        System.out.println();
    }
}
