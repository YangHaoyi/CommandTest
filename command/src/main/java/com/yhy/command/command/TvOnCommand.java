package com.yhy.command.command;

import com.yhy.command.Command;
import com.yhy.command.household.Tv;

/**
 * Author : YangHaoyi on 2017/2/23.
 * Email  :  yanghaoyi@neusoft.com
 * Description :
 */

public class TvOnCommand implements Command{
    private Tv tv;

    public TvOnCommand(Tv tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.on();
    }

    @Override
    public void undo() {
        tv.off();
    }
}
