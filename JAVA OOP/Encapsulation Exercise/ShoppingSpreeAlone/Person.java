package ShoppingSpreeAlone;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Person {
    private String name;
    private double money;
    private List<Product>products;

    public Person(String name, double money) {
        this.name = name;
        this.money = money;
        products=new ArrayList<>();
    }

    private void setName(String name) {
        if(name==null || name.trim().isEmpty()){
            throw new IllegalArgumentException("Name cannot be empty");
        }
        this.name = name;
    }

    private void setMoney(double money) {
        if(money<0){
            throw new IllegalArgumentException("Money cannot be negative");
        }
        this.money = money;
    }

    public String getName() {
        return name;
    }
    //buyProduct (Product): void
    //Create a program in which each command corresponds to a person buying a product.
    // If the person can afford a product add it to his bag. If a person doesn’t have enough money, print an appropriate exception message:
    //"{Person name} can't afford {Product name}"
    public void buyProduct(Product product){
         if(money >= product.getCost()){
             products.add(product);
             money=money - product.getCost();
         }else{
             String exceptionMessage=String.format("%s can't afford %s",name,product.getName());
             throw new IllegalArgumentException(exceptionMessage);
         }
    }

    @Override
    public String toString() {
        StringBuilder builder=new StringBuilder();
        builder.append(name + " - ");
        List<String>productString=products.stream().map(product -> product.getName()).collect(Collectors.toList());
        builder.append(String.join(", ",productString));
        if(productString.isEmpty()){
            System.out.printf("%s - Nothing bought",getName());
        }
        return builder.toString();
    }
}
