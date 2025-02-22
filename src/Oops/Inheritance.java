package Oops;

class  Circle {

    public double radius;

    public double area(){
        return Math.PI * radius * radius;
    }
    public double perimeter() {
        return 2 * Math.PI * radius;
    }

}
class Cylinder extends Circle {
    public double height;

    public double volume(){
        return area()* height;
    }
    public double SurfaceArea(){
       return (2*Math.PI * radius * height) + ( 2 * area());
    }
}


public class Inheritance {
    public static void main(String[] args) {
        Cylinder c = new Cylinder();
        c.radius = 7;
        c.height=10;
        System.out.println(c.SurfaceArea());
        System.out.println(c.volume());

    }
}

