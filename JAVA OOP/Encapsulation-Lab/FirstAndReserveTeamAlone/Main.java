package FirstAndReserveTeamAlone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Team team=new Team("Black Eagles");
        int n = Integer.parseInt(scanner.nextLine());

//        List<Person> people = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split(" ");
//            people.add(new Person(input[0], input[1], Integer.parseInt(input[2]), Double.parseDouble(input[3])));
            Person personToAdd=new Person(input[0], input[1], Integer.parseInt(input[2]), Double.parseDouble(input[3]));
            team.addPlayer(personToAdd);
        }


        System.out.println("First team have "+team.getFirstTeam().size()+" players");
        System.out.println("Reserve team have "+team.getReserveTeam().size()+" players");
    }
}