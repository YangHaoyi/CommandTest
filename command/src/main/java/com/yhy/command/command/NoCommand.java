package com.yhy.command.command;

import com.yhy.command.Command;

/**
 * Author : YangHaoyi on 2017/2/23.
 * Email  :  yanghaoyi@neusoft.com
 * Description :
 */

public class NoCommand implements Command{

    @Override
    public void execute() {
        System.out.println("没有指令");
    }

    @Override
    public void undo() {
        System.out.println("没有指令");
    }
}
