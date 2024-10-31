package OopsRevision;

class  Circle {
    public double radius;

    public double Area (){
        return 2 * Math.PI * radius * radius;
    }
    public double Perimeter(){
        return 2 * Math.PI * radius;
    }

}

class Cylinder extends  Circle {
    public double height;
    public double volume (){
        return Area() * height;
    }
    public double SurfaceArea (){
        return (2 * Math.PI * radius * height );
    }
}
public class Inheritance {
    public static void main(String[] args) {
        Circle c = new Circle();
        Cylinder sc = new Cylinder();
        sc.volume();
        c.Perimeter();
    }
}
