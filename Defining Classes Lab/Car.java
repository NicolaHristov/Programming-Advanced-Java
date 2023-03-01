package DefinndingClasses;

public class Car {
    public String brand;
    public int year;
    public String model;
    public int hoursePower;

    public int getHoursePower(){
        return hoursePower;
    }
    private String name;

    public String getName(){
        return "Mr "+name;
    }
    public void setHoursePower(int hoursePower){
        this.hoursePower=hoursePower;
    }
    public void setName(String name){
        this.name=name;
    }
}
