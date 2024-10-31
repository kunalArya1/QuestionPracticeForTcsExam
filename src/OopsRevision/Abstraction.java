package OopsRevision;

abstract class superClassss {
    abstract public void name();
}
class  sub extends  superClassss {
    @Override
    public void name(){
        System.out.println("PrintName");
    }
}

interface  mobile {
    public void mobileName();
    public void modelName();
}
class mi implements  mobile{
   @Override
    public void mobileName(){
        System.out.println("MI");
    }
    @Override
    public void modelName(){
        System.out.println("Six");
    }
}

public class Abstraction {
    public static void main(String[] args) {
        sub sc = new sub();
        sc.name();


        mi phone = new mi();
        phone.mobileName();
        phone.modelName();
    }
}
