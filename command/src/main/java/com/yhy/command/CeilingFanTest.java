package com.yhy.command;

import com.yhy.command.command.CeilingFanHighCommand;
import com.yhy.command.command.CeilingFanLowCommand;
import com.yhy.command.command.CeilingFanMidiumCommand;
import com.yhy.command.command.CeilingFanOffCommand;
import com.yhy.command.household.CeilingFan;

/**
 * Author : YangHaoyi on 2017/2/23.
 * Email  :  yanghaoyi@neusoft.com
 * Description :
 */

public class CeilingFanTest {
    public static void main(String[] arges ){
        RemoteControl remoteControl = new RemoteControl();
        CeilingFan ceilingFan = new CeilingFan("home");
        CeilingFanHighCommand ceilingFanHighCommand = new CeilingFanHighCommand(ceilingFan);
        CeilingFanMidiumCommand ceilingFanMidiumCommand = new CeilingFanMidiumCommand(ceilingFan);
        CeilingFanLowCommand ceilingFanLowCommand = new CeilingFanLowCommand(ceilingFan);
        CeilingFanOffCommand ceilingFanOffCommand = new CeilingFanOffCommand(ceilingFan);
        remoteControl.setOnCommands(0,ceilingFanHighCommand,ceilingFanOffCommand);
        remoteControl.setOnCommands(1,ceilingFanMidiumCommand,ceilingFanOffCommand);
        remoteControl.setOnCommands(2,ceilingFanLowCommand,ceilingFanOffCommand);
        remoteControl.setOnCommands(3,ceilingFanOffCommand,ceilingFanOffCommand);

        remoteControl.onButtonWasPushed(0);
        remoteControl.onButtonWasPushed(1);
        remoteControl.undoButtonWasPushed();
    }
}
