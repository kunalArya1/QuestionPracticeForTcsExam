package Oops;

class Overloading{
    public int sum(int num1,int num2){
        return num1+num2;
    }
    public int sum(int num1, int num2, int num3){
        return num1+num2+num3;
    }

}

class Tv{
    public void onTV(){
        System.out.println("Tv is switched on...");
    }
    public void offTv(){
        System.out.println("Tv is getting switched off...");
    }
}
class smartTv extends  Tv {
    @Override
    public void onTV(){
        System.out.println("Smart Tv is getting switched on.....");
    }
    @Override
    public void offTv(){
        System.out.println("Smart Tv is getting switched off....");
    }
}
public class Polymorphism {
    public static void main(String[] args) {
//        Overloading cp = new  Overloading();
//        System.out.println(cp.sum(6,7,8));

        Tv t = new smartTv();
        t.onTV();
        t.offTv();
    }
}
