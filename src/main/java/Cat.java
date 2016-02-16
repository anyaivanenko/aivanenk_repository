/**
 * Created by aivanenk on 16.02.2016.
 */
public class Cat {
    private double maxSpeed;
    private String sortName;

    Cat(double speed, String name) {
        maxSpeed = speed;
        sortName = name;
    }

    void setMaxSpeed(double speed) {
        maxSpeed = speed;
    }

    double getMaxSpeed() {
        return maxSpeed;
    }

    void setSortName(String sortName1){
        sortName=sortName1;
    }

    String getSortName()
    {
        return sortName;
    }

    public void printCat() {
        System.out.println("Коти породи " + sortName + " розвивають швидкість до " + maxSpeed + " м/год");
    }

}
