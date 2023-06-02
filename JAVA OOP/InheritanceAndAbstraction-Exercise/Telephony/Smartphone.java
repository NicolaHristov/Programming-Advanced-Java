package Telephony;

import java.util.ArrayList;
import java.util.List;

public class Smartphone implements Callable,Browsable{
    private List<String> numbers;
    private List<String>urls;

    public Smartphone(List<String> numbers, List<String> urls) {
        this.numbers = numbers;
        this.urls = urls;
    }

    @Override
    public String call() {
        //ONLY DIGGITS
        StringBuilder builder=new StringBuilder();
        for (String number : numbers) {
           if(hasDOnlYigits(number)){
               builder.append(String.format("Calling... %s",number)).append(System.lineSeparator());
           }else{
               builder.append("Invalid number!").append(System.lineSeparator());
           }
        }
        return builder.toString().trim();
    }
    private boolean hasDigits(String url){
        for (char singleChar : url.toCharArray()) {
            if(Character.isDigit(singleChar)){
                return true;
            }
        }
        return false;
    }
    private boolean hasDOnlYigits(String number){
        for (char singleChar : number.toCharArray()) {
            if(!Character.isDigit(singleChar)){
                return false;
            }
        }
        return true;
    }

    @Override
    public String browse() {
        //NO DIGGITS
        StringBuilder builder=new StringBuilder();

        for (String url : urls) {
            if(hasDigits(url)){
                builder.append("Invalid URL!").append(System.lineSeparator());
//                System.out.println("Invalid URL!");
            }else{
                builder.append(String.format("Browsing: %s!%n",url));
//                System.out.printf("Browsing: %s%n",url);
            }
        }
        return builder.toString().trim();
    }
}
