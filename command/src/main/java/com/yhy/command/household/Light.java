package com.yhy.command.household;

/**
 * Author : YangHaoyi on 2017/2/23.
 * Email  :  yanghaoyi@neusoft.com
 * Description :
 */

public class Light extends Machine{

    @Override
    public void on(){
        System.out.println("开灯");
    }
    @Override
    public void off(){
        System.out.println("关灯");
    }
}
