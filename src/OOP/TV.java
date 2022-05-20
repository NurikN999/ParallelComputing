package OOP;

public class TV {
    private int channel;
    private int volumeLevel;
    private boolean isOn;

    public TV() {
    }

    public TV(int channel, int volumeLevel, boolean isOn) {
        this.channel = channel;
        this.volumeLevel = volumeLevel;
        this.isOn = isOn;
    }

    public void turnOn(){
        this.isOn = true;
    }

    public void turnOff(){
        this.isOn = false;
    }

    public void setChannel(int newChannel){
        this.channel = newChannel;
    }

    public void setVolume(int newVolumeLevel){
        this.volumeLevel = newVolumeLevel;
    }

    public void channelUp(){
        this.channel++;
    }

    public void channelDown(){
        this.channel--;
    }

    public void volumeUp(){
        this.volumeLevel++;
    }

    public void volumeDown(){
        this.volumeLevel--;
    }

    public int getChannel() {
        return channel;
    }

    public int getVolumeLevel() {
        return volumeLevel;
    }

    public void setVolumeLevel(int volumeLevel) {
        this.volumeLevel = volumeLevel;
    }

    public boolean isOn() {
        return isOn;
    }
}
