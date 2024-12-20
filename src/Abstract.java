abstract class Parent2{
    public Parent2(){
        System.out.println("Mai base2 ka constructor hoon");
    }
    public void sayHello(){
        System.out.println("Hello");
    }
    abstract public void greet();
    abstract public void greet2();
}

class child1 extends  Parent2{
    @Override
    public void greet(){
        System.out.println("Good morning");
    }
    @Override
    public void greet2(){
        System.out.println("Good afternoon");
    }
}

abstract class Child2 extends Parent2{
    public void th(){
        System.out.println("I am good");
    }
}

public class Abstract {
    public static void main(String[] args){
//      Parent2 p = new Parent2();  -> error no object for abstract class
        child1 c = new child1();
    }
}
