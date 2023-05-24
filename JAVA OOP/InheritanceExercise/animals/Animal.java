package animals;

public class Animal {
    private String name;
    private int age;
    private String gender;

    public Animal(String name, int age, String gender) {
        setName(name);
        setAge(age);
        setGender(gender);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name== null || name.trim().isEmpty()){
            System.out.println("Invalid input!");
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age < 0){
            System.out.println("Invalid input!");
        }
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        if(gender==null || gender.trim().isEmpty()){
            System.out.println("Invalid input!");
        }
        this.gender = gender;
    }

    @Override
    public String toString() {
        return String.format("%s%n%s %d %s%n%s",getClass().getSimpleName(),name,age,gender,produceSound());
    }

    public String produceSound(){
        return "";
    }

}
