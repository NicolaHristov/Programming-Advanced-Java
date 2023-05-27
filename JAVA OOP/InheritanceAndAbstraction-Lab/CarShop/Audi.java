package CarShop;

public class Audi extends CarImpl implements Rentable{

    private Integer minRentDay;
    private Double pricePerDay;
    public Audi(String model, String color, Integer horsePower, String countryProduced,Integer minRentPerDay,Double pricePerDay) {
        super(model, color, horsePower, countryProduced);
        this.minRentDay=minRentPerDay;
        this.pricePerDay=pricePerDay;
    }

    public Integer getMinRentDay() {
        return minRentDay;
    }

    @Override
    public Integer getMinRentPerDay() {
        return minRentDay;
    }

    @Override
    public Double getPricePerDay() {
        return pricePerDay;
    }

    @Override
    public String toString() {
        return String.format("This is %s produced in %s and have %d tires%n" +
                "Minimum rental period of %d days. Price per day %f",getModel(),getCountryProduced(),Car.TIRES,getMinRentPerDay(),getPricePerDay());
    }
}
