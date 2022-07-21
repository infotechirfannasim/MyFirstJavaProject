package Constructors;

// Concrete Class
// POJO class (Plain Old Java Object
public class Chair {

    private int legs;
    private int back;
    private String sitting;

    public Chair() {
    }

    public Chair(int legs, int back, String sitting) {
        this.legs = legs;
        this.back = back;
        this.sitting = sitting;
    }

    @Override
    public String toString() {
        return "Chair{" +
                "legs=" + legs +
                ", back=" + back +
                ", sitting='" + sitting + '\'' +
                '}';
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public int getBack() {
        return back;
    }

    public void setBack(int back) {
        this.back = back;
    }

    public String getSitting() {
        return sitting;
    }

    public void setSitting(String sitting) {
        this.sitting = sitting;
    }
}
