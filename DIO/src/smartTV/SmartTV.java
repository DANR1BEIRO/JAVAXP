package smartTV;

public class SmartTV {
    
     private boolean on;
     private int channel_max;
     private int channel_min;
     private int channel;
     private int volume;

    public SmartTV(int channel_min, int channel_max) {
        this.on = false;
        this.channel = 2;
        this.channel_min = channel_min;
        this.channel_max = channel_max;
        this.volume = 25;
    }

    public void increaseVolume(){
        volume++;
    }

    public void decreaseVolume(){
        volume--;
    }

    public boolean getOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public int getChannel_max() {
        return channel_max;
    }

    public void setChannel_max(int channel_max) {
        this.channel_max = channel_max;
    }

    public int getChannel_min() {
        return channel_min;
    }

    public void setChannel_min(int channel_min) {
        this.channel_min = channel_min;
    }

    public int getChannel() {
        return channel;
    }

    public void setChannel(int channel) {
        this.channel = channel;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
   
    public int changeChannel(int newChannel) {
        if (newChannel >= channel_min && newChannel <= channel_max){
            this.channel = newChannel;
        }
        return this.channel;
    }
}
