package Oops;

class Area{
    private double length;
    private double breadth;

    public double getLength (){
        return length;
    }
    public double getBreadth(){
        return breadth;
    }
    public void setLength( double length){
        this.length = length;
    }
    public void setBreadth(double breadth){
        this.breadth = breadth;
    }

    public double area(){
        return this.length * this.breadth;
    }

}
public class Encaplusation {
    public static void main(String[] args) {
        Area a = new Area();
        a.setLength(10);
        a.setBreadth(20);
        System.out.println(a.getBreadth());
        System.out.println(a.getLength());
        System.out.println(a.area());
    }
}
