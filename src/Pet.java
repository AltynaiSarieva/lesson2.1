import java.util.Random;

public class Pet {
    String age;
    String color;
    Shelter shelter;

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Shelter getShelter() {
        return shelter;
    }

    public void setShelter(Shelter shelter) {
        this.shelter = shelter;
    }

    private int generatDefaultAge() {
        return new Random().nextInt();

    }
    public String getInfo(){
        return "Age:" + this.age + "Color:" + this.color + "Shelter(adress, name):" + this.shelter.getAdress() + this.shelter.getName();
    }
    }

