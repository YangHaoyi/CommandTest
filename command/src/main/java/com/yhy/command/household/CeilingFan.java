package com.yhy.command.household;

/**
 * Author : YangHaoyi on 2017/2/23.
 * Email  :  yanghaoyi@neusoft.com
 * Description :
 */

public class CeilingFan {
    public static final int HIGH = 3;
    public static final int MEDIUM = 2;
    public static final int LOW = 1;
    public static final int OFF = 0;
    String location;
    int speed;
    public CeilingFan(String location){
        this.location = location;
        speed = OFF;
    }
    public void setHigh(){
        speed = HIGH;
        System.out.println("设置高风速");
    }
    public void setMedium(){
        speed = MEDIUM;
        System.out.println("设置中风速");
    }
    public void setLow(){
        speed = LOW;
        System.out.println("设置低风速");
    }
    public void setOff(){
        speed = OFF;
        System.out.println("设置关闭");
    }
    public int getSpeed(){
        return speed;
    }

}
