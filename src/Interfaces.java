interface Bicycle{
    int a = 5;
    void applyBrake(int dec);
    void speedUp(int inc);
}

interface HornBicycle{
    int x = 45;
    void blowHornK3g();
    void blowHornHigh();
}

class Cycle implements Bicycle,HornBicycle{
    int speed = 7;

    void blowHorn(){
        System.out.println("Pee Pee Poo Poo");
    }
    @Override
    public void applyBrake(int decrement){
        speed -= decrement;
        System.out.println("Applying Brake");
    }

    @Override
    public void speedUp(int increment){
        speed += increment;
        System.out.println("Applying SpeedUP");
    }

    @Override
    public void blowHornK3g(){
        System.out.println("Kabhi khushi kabhi gum pee pee pee pee");
    }

    @Override
    public void blowHornHigh(){
        System.out.println("Main hoon naa po po po po");
    }
}
public class Interfaces {
    public static void main(String[] args){
        Cycle c = new Cycle();
        c.applyBrake(1);
        c.speedUp(2);
        System.out.println(c.x);
        System.out.println(c.a);

        // You cannot modify the properties in Interfaces as they are final
        // cycleHarry.a = 454;
        //System.out.println(cycleHarry.a);

        c.blowHornK3g();
        c.blowHornHigh();
        c.blowHorn();
    }
}
