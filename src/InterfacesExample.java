interface MyCamera{
    void takeSnap();
    void recordVideo();
    private void greet(){
        System.out.println("Good Morning");
    }
    default void record4KVideo(){
        greet();
        System.out.println("Recording in 4k...");
    }
}
interface MyWifi{
    String[] getNetworks();
    void connectNetwork(String network);
}

class MyCellPhone{
    void callNumber(int phoneNumber){
        System.out.println("Calling "+ phoneNumber);
    }
    void pickCall(){
        System.out.println("Connecting... ");
    }
}

class MySmartPhone extends MyCellPhone implements MyWifi, MyCamera{
    public void takeSnap(){
        System.out.println("Taking snap");
    }
    public void recordVideo(){
        System.out.println("Taking snap");
    }
    public void record4KVideo(){
        System.out.println("Taking snap");
    }

    @Override
    public String[] getNetworks() {
        System.out.println("Getting List of Networks");
        String[] networkList = {"Harry", "Prashanth", "Anjali5G"};
        return networkList;
    }
    public void connectNetwork(String network){
        System.out.println("Connecting to " + network);
    }

}
public interface InterfacesExample {
    public static void main(String[] args){
        MySmartPhone x = new MySmartPhone();
        x.record4KVideo();
        String[] ar = x.getNetworks();
        for(String y:ar){
            System.out.println(y);
        }
    }
}
