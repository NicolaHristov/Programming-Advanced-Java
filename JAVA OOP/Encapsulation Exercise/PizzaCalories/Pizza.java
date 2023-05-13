package PizzaCalories;

import java.util.List;

public class Pizza {
    //-	name: String
    //-	dought:  Dough
    //-	toppings: List<Topping>
    //+ 	Piza (String, int numberOfToppings)
    //-	setToppings(int) : void
    //-	setName(String) : void
    //+	setDough(Dough) : void
    //+	getName(): String
    //+	addTopping (Topping) : void
    //+	getOverallCalories () : double
    private String name;

    public String getName() {
        return name;
    }

    private Dought dought;
    private List<Topping> toppings;
    private void addTopping(Topping topping){

    }
    private double getOverallCalories (){
        return 0;
    }

    public Pizza(String name, List<Topping> toppings) {
        this.name = name;
        this.toppings = toppings;
    }

    private void setName(String name) {
        this.name = name;
    }

    public void setDought(Dought dought) {
        this.dought = dought;
    }

    private void setToppings(List<Topping> toppings) {
        this.toppings = toppings;
    }
}
