// The purpose of this class is to model a television
// Price Erwin 6/19/24
import java.util.Scanner;

public class Television{
    private final String MANUFACTURER;
   //name of manufacturer
   private final int SCREEN_SIZE;
   //size of screen
   private boolean powerOn;
   //representing if the power is on or off
   private int channel;
   //channel number
   private int volume;
   //volume number

 public Television(String MANUFACTURER, int SCREEN_SIZE){
    this.MANUFACTURER=MANUFACTURER;
    this.SCREEN_SIZE=SCREEN_SIZE;
    powerOn=false;
    volume=20;
    channel=2;
 }

 //return the current volume number
 public int getVolume(){
    return volume;
 }

 //return the current channel number
 public int getChannel(){
    return channel;
 }

 //return the name of the manufacturer
 public String getManufacturer(){
    return MANUFACTURER;
 }

 //return the size of the screen
 public int getScreenSize(){
    return SCREEN_SIZE;
 }

 //set a new channel number
 public void setChannel(int num){
    channel=num;
 }

 //toggle the power on and off
 public void power(){
    if(powerOn){
       powerOn=false;
    }
    else{
       powerOn=true;
    }
 }

 //increase the volume by 1
 public void increaseVolume(){
    volume++;
 }

 //decrease the volume by 1
 public void decreaseVolume(){
    volume--;
 }
}