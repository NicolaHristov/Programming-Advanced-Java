package FunctionalProgramming;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class CountUpperCaseWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Predicate<String>upperCasePredicat=word -> Character.isUpperCase(word.charAt(0));
        Consumer<String>printerWord=word -> System.out.println(word);

//        List<String> upperCaseWords= Arrays.stream(scanner.nextLine().split("\\s+")).filter(upperCasePredicat).collect(Collectors.toList());
        //В листа ми остават само думите с главни бувки заради Предиката
        List<String>upperCaseWords=Arrays.stream(scanner.nextLine().split("\\s+")).filter(e->upperCasePredicat.test(e)).collect(Collectors.toList());

        System.out.println(upperCaseWords.size());
        upperCaseWords.forEach(printerWord);



    }
}
