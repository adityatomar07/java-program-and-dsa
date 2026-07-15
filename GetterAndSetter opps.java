package oops;

public class GetterAndSetter {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.setColor("black");
        System.out.println("color : " + p1.getColor());
        p1.setTip(4);
        System.out.println("tip : " + p1.getTip());

        p1.setColor("white");
        System.out.println(p1.getColor());
    }
}

class Pen {
    private String color;
    private int tip;

    String getColor() {
        return this.color;
    } // Get : to return the value

    int getTip() {
        return this.tip;
    }

    void setColor(String newColor) // Set : to modify the vlaue
    {
        this.color = newColor; // this : used to refer to the current value

    }

    void setTip(int tip) {
        this.tip = tip;
    }
}