package com.yhy.command;

import com.yhy.command.command.CeilingFanHighCommand;
import com.yhy.command.command.CeilingFanLowCommand;
import com.yhy.command.command.CeilingFanMidiumCommand;
import com.yhy.command.command.CeilingFanOffCommand;
import com.yhy.command.command.LightOffCommand;
import com.yhy.command.command.LightOnCommand;
import com.yhy.command.command.StereoOffCommand;
import com.yhy.command.command.StereoOnWithCDCommand;
import com.yhy.command.command.TvOffCommand;
import com.yhy.command.command.TvOnCommand;
import com.yhy.command.household.CeilingFan;
import com.yhy.command.household.Light;
import com.yhy.command.household.Stereo;
import com.yhy.command.household.Tv;

public class Main {
    public static void main(String[] arges){
        RemoteControl remoteControl = new RemoteControl();
        Light light = new Light();
        LightOnCommand lightOnCommand = new LightOnCommand(light);
        LightOffCommand lightOffCommand = new LightOffCommand(light);
        Tv tv = new Tv();
        TvOnCommand tvOnCommand = new TvOnCommand(tv);
        TvOffCommand tvOffCommand = new TvOffCommand(tv);
        Stereo stereo = new Stereo();
        StereoOnWithCDCommand stereoOnWithCDCommand = new StereoOnWithCDCommand(stereo);
        StereoOffCommand stereoOffCommand = new StereoOffCommand(stereo);
//        remoteControl.setOnCommands(0,lightOnCommand,lightOffCommand);
//        remoteControl.setOnCommands(1,tvOnCommand,tvOffCommand);
//        remoteControl.setOnCommands(2,stereoOnWithCDCommand,stereoOffCommand);

//        remoteControl.onButtonWasPushed(0);
//        remoteControl.offButtonWasPushed(0);
//        remoteControl.onButtonWasPushed(1);
//        remoteControl.offButtonWasPushed(1);
//        remoteControl.onButtonWasPushed(2);
//        remoteControl.offButtonWasPushed(2);
//        remoteControl.onButtonWasPushed(3);
//        remoteControl.offButtonWasPushed(3);
//        remoteControl.onButtonWasPushed(4);
//        remoteControl.offButtonWasPushed(4);
//        remoteControl.onButtonWasPushed(5);
//        remoteControl.offButtonWasPushed(5);

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
