package com.yhy.command.command;

import com.yhy.command.household.CeilingFan;

/**
 * Author : YangHaoyi on 2017/2/23.
 * Email  :  yanghaoyi@neusoft.com
 * Description :
 */

public class CeilingFanOffCommand extends CeilingCommand{
    public CeilingFanOffCommand(CeilingFan ceilingFan) {
        super(ceilingFan);
    }

    @Override
    public void execute() {
        super.execute();
        ceilingFan.setOff();
    }
}
