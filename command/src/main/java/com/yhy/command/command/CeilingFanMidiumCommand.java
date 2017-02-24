package com.yhy.command.command;

import com.yhy.command.household.CeilingFan;

/**
 * Author : YangHaoyi on 2017/2/23.
 * Email  :  yanghaoyi@neusoft.com
 * Description :
 */

public class CeilingFanMidiumCommand extends CeilingCommand {
    public CeilingFanMidiumCommand(CeilingFan ceilingFan) {
        super(ceilingFan);
    }

    @Override
    public void execute() {
        super.execute();
        ceilingFan.setMedium();
    }
}
