package com.yhy.command;

/**
 * Author : YangHaoyi on 2017/2/23.
 * Email  :  yanghaoyi@neusoft.com
 * Description :
 */

public interface Command {
    void execute();
    void undo();
}
