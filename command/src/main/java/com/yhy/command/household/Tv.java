package com.yhy.command.household;

/**
 * Author : YangHaoyi on 2017/2/23.
 * Email  :  yanghaoyi@neusoft.com
 * Description :
 */

public class Tv extends Machine{
    @Override
    public void on() {
        System.out.println("开电视");
    }

    @Override
    public void off() {
        System.out.println("关电视");
    }
}
