package smartTV;

public class SmartTV {

    boolean isOn = false;
    int channel = 1;
    int volume = 25;

    public void turnOn(){
        isOn = true;
    }

    public void turnOff(){
        isOn = false;
    }

    public void increaseChannel(){
        channel++;
    }

    public void decreaseChannel(){
        channel--;
    }

    public int changeChannel(int newChannel){
        channel = newChannel;
        return channel;
    }

    public void increaseVolume(){
        volume++;
    }

    public void decreaseVolume(){
        volume--;
    }



}
