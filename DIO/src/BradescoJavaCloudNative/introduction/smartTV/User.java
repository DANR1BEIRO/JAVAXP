package BradescoJavaCloudNative.introduction.smartTV;

public class User {
    public static void main(String[] args) throws Exception {

        SmartTV tv = new SmartTV(1, 99);
        tv.setOn(true);
        tv.setChannel(5);
        tv.setVolume(15);

        if (tv.getOn()){
            System.out.println("TV status: ON");
            System.out.println("Current channel: " + tv.getChannel());
            System.out.println("Current volume: " + tv.getVolume());
        } else {
            System.out.println("TV status: OFF");
        }

        tv.changeChannel(60);
        System.err.println("\nChannel changed to " + tv.getChannel());

        


    


        

    }

}