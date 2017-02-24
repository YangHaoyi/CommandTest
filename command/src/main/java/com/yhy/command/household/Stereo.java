package com.yhy.command.household;

/**
 * Author : YangHaoyi on 2017/2/23.
 * Email  :  yanghaoyi@neusoft.com
 * Description :
 */

public class Stereo extends Machine{
    @Override
    public void on() {
        System.out.println("打开音响");
    }

    @Override
    public void off() {
        System.out.println("关闭音响");
    }
    public void setCD(){
        System.out.println("装CD");
    }
    public void setVolume(int volume){
        System.out.println("设置音量："+volume);
    }
}
