package com.yhy.command;

import com.yhy.command.command.NoCommand;

/**
 * Author : YangHaoyi on 2017/2/23.
 * Email  :  yanghaoyi@neusoft.com
 * Description :
 */

public class RemoteControl {

    //普通指令
    Command[] onCommands;
    Command[] offCommands;
    //撤销指令
    Command undoCommand;

    public RemoteControl(){
        onCommands = new Command[6];
        offCommands = new Command[6];
        Command noCommand = new NoCommand();
        for(int i = 0;i<6;i++){
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
        undoCommand = noCommand;
    }
    public void setOnCommands(int slot,Command onCommand,Command offCommand){
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }
    public void onButtonWasPushed(int slot){
        onCommands[slot].execute();
        undoCommand = onCommands[slot];
    }
    public void offButtonWasPushed(int slot){
        offCommands[slot].execute();
        undoCommand = offCommands[slot];
    }
    public void undoButtonWasPushed(){
        undoCommand.undo();
    }
}
