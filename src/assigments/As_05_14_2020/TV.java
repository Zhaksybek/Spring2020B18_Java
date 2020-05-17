package assigments.As_05_14_2020;

public class TV {

    int channel =1;
    int volumeLevel =1;
    boolean on =false;
    String brand = "undefined";

    public TV(){
        System.out.println("Creating TV object using no Args- constructor");
    }

    public TV(String brand){
        System.out.println("Creating TV object using 1 arg - constructor");
    }

    public int getChannel() {
        return channel;
    }

    public void setChannel(int channel) {
        this.channel = channel;
    }

    public int getVolumeLevel() {
        return volumeLevel;
    }

    public void setVolumeLevel(int volumeLevel) {
        this.volumeLevel = volumeLevel;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int channelUp(){
        return channel++;
    }

    public int channelDown(){
        return this.channel--;
    }

    public int volumeUp(){
        return this.volumeLevel++;
    }

    public int volumeDown(){
        return this.volumeLevel--;
    }

    public boolean turnOn(){
        return true;
    }
    public boolean turnOff(){
        return false;
    }
    public void isOn(){
        if(turnOn()){
            System.out.println("TV is already ON");
        }else if(turnOff()){
            System.out.println("TV is already OFF");
        }
    }





    /*
    public void isOn(){
       if (on==true){
           System.out.println("TV is already ON");
       }
    }

     */
/*
    public void turnOn(){
        if (on==true){
            System.out.println("TV is already ON");
        }
    }

    public void turnOff(){
        if (on==false){
            System.out.println("TV is already OFF");
        }
    }

    public void channel(){
        if (channel<0 || channel>120 ){
            System.out.println("ERROR: TV is either OFF or invalid Channel");
        }
    }

 */










}
