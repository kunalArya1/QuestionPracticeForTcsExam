package OopsRevision;

class test {
    public int sum(int num1,int num2){
        return num1+ num2;
    }
    public int sum(int num1,int num2,int num3){
        return num1+num2+num3;
    }
}

class superClass{
    public void print(){
        System.out.println("Print in super class ");
    }
}
class subClass extends superClass {
    @Override
    public void  print(){
        System.out.println("Print in sub class");
    }
}


public class Polymorphism {
    public static void main(String[] args) {
        test t = new test();
        System.out.println(t.sum(7,8));
        System.out.println(t.sum(7,8,9));
        subClass sc = new subClass();
        superClass scs = new superClass();
        sc.print();
        scs.print();
    }
}
