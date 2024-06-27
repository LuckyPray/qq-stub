package com.tencent.qqnt.kernel.nativeinterface;

import java.util.ArrayList;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/SpecificEventTypeInfoInMsgBox.class */
public final class SpecificEventTypeInfoInMsgBox {
    public int eventTypeInMsgBox;
    public ArrayList<MsgBoxNecessaryMsgInfo> msgInfos;

    public SpecificEventTypeInfoInMsgBox() {
        this.msgInfos = new ArrayList<>();
    }

    public int getEventTypeInMsgBox() {
        return this.eventTypeInMsgBox;
    }

    public ArrayList<MsgBoxNecessaryMsgInfo> getMsgInfos() {
        return this.msgInfos;
    }

    public String toString() {
        return "SpecificEventTypeInfoInMsgBox{eventTypeInMsgBox=" + this.eventTypeInMsgBox + ",msgInfos=" + this.msgInfos + ",}";
    }

    public SpecificEventTypeInfoInMsgBox(int i, ArrayList<MsgBoxNecessaryMsgInfo> arrayList) {
        this.msgInfos = new ArrayList<>();
        this.eventTypeInMsgBox = i;
        this.msgInfos = arrayList;
    }
}
