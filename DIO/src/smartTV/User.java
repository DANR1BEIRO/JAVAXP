package smartTV;

public class User {
    public static void main(String[] args) throws Exception {

        SmartTV tv = new SmartTV();

        System.out.println("TV status: " + tv.isOn);
        System.out.println("Current channel: " + tv.channel);
        System.out.println("Current volume: " + tv.volume);

        System.out.println("\nTurning the tv on");
        tv.turnOn();
        if (tv.isOn) {
            System.out.println("TV status: ON");
        } else {
            System.out.println("TV status: OFF");
        }
        tv.increaseVolume();
        tv.changeChannel(64);
        System.out.println("Current channel changed to " + tv.channel);
        System.out.println("Volume increased to " +tv.volume);
    


        

    }

}