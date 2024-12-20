class base{
public int x;
    public void base (){
     System.out.println("Base constructor");
 }
int getValue() {
    return x;
}
    void setValue(int x) {
       this.x = x;
    }
}
class derived extends  base{
    public int y;
    public void derived (){
        System.out.println("Base constructor");
    }
    int getValue() {
        return y;
    }
    void setValue(int y) {
        this.y = y;
    }
}
public class Inheritance {
    public static void main(String[] args){
        base b = new base();
        b.setValue(4);
        System.out.println(b.getValue());
        derived d = new derived();
        d.setValue(10);
        System.out.println(d.getValue());
    }
}
