package com.tencent.qqnt.kernel.nativeinterface;

import java.util.HashMap;

/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/AddLocalRecordMsgParams.class */
public final class AddLocalRecordMsgParams {
    public boolean front;
    public boolean needNotify;
    public boolean needRecentContact;
    public boolean needStore;
    public MsgElement msgElement = new MsgElement();
    public HashMap<Integer, MsgAttributeInfo> msgAttributeInfos = new HashMap<>();
    public AddLocalMsgInfo msgInfo = new AddLocalMsgInfo();
    public HashMap<Integer, byte[]> extInfos = new HashMap<>();

    public HashMap<Integer, byte[]> getExtInfos() {
        return this.extInfos;
    }

    public boolean getFront() {
        return this.front;
    }

    public HashMap<Integer, MsgAttributeInfo> getMsgAttributeInfos() {
        return this.msgAttributeInfos;
    }

    public MsgElement getMsgElement() {
        return this.msgElement;
    }

    public AddLocalMsgInfo getMsgInfo() {
        return this.msgInfo;
    }

    public boolean getNeedNotify() {
        return this.needNotify;
    }

    public boolean getNeedRecentContact() {
        return this.needRecentContact;
    }

    public boolean getNeedStore() {
        return this.needStore;
    }

    public String toString() {
        return "AddLocalRecordMsgParams{msgElement=" + this.msgElement + ",msgAttributeInfos=" + this.msgAttributeInfos + ",msgInfo=" + this.msgInfo + ",front=" + this.front + ",needNotify=" + this.needNotify + ",needStore=" + this.needStore + ",needRecentContact=" + this.needRecentContact + ",extInfos=" + this.extInfos + ",}";
    }
}
