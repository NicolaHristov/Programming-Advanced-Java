package PizzaCalories;

public class Topping {
    //-	toppingType: String
    //-	weight: double
    //+ 	Topping (String, double)
    //-	setToppingType (String): void
    //-	setWeight (double): void
    //+	calculateCalories (): double
    private String toppingType;
    private double weight;

    public Topping(String toppingType, double weight) {
        this.toppingType = toppingType;
        this.weight = weight;
    }

    private void setToppingType(String toppingType) {
        this.toppingType = toppingType;
    }

    private void setWeight(double weight) {
        this.weight = weight;
    }
    private double calculateCalories(){
        return 0;
    }
}
