package com.yhy.command.command;

import com.yhy.command.Command;
import com.yhy.command.household.CeilingFan;

/**
 * Author : YangHaoyi on 2017/2/23.
 * Email  :  yanghaoyi@neusoft.com
 * Description :
 */

public class CeilingCommand implements Command{

    protected CeilingFan ceilingFan;
    protected int prevSpeed;

    public CeilingCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        prevSpeed = ceilingFan.getSpeed();
    }

    @Override
    public void undo() {
        switch (prevSpeed){
            case CeilingFan.HIGH:
                ceilingFan.setHigh();
                break;
            case CeilingFan.MEDIUM:
                ceilingFan.setMedium();
                break;
            case CeilingFan.LOW:
                ceilingFan.setLow();
                break;
            case CeilingFan.OFF:
            default:
                ceilingFan.setOff();
                break;
        }
    }
}
