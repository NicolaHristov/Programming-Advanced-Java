package PizzaCalories;

public class Dought {
    //-	flourType: String
    //-	bakingTechnique: String
    //-	weight: double
    //+ 	Dought (String, String, double)
    //-	setWeight(double): void
    //-	setFlourType(String): void
    //-	setBakingTechnique(String): void
    //+	calculateCalories (): double
    private String flourType;
    private String bakingTechnique;
    private double weight;

    public Dought(String flourType, String bakingTechnique, double weight) {
        this.flourType = flourType;
        this.bakingTechnique = bakingTechnique;
        this.weight = weight;
    }

    private void setFlourType(String flourType) {
        this.flourType = flourType;
    }

    private void setBakingTechnique(String bakingTechnique) {
        this.bakingTechnique = bakingTechnique;
    }

    private void setWeight(double weight) {
        this.weight = weight;
    }
    public double calculateCalories(){
        return 0;
    }
}
