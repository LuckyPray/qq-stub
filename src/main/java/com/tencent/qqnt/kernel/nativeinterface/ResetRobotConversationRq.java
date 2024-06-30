package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/ResetRobotConversationRq.class */
public final class ResetRobotConversationRq {
    public int chatType;
    public boolean isRestHistory;
    public String uid = "";

    public int getChatType() {
        return this.chatType;
    }

    public boolean getIsRestHistory() {
        return this.isRestHistory;
    }

    public String getUid() {
        return this.uid;
    }

    public String toString() {
        return "ResetRobotConversationRq{uid=" + this.uid + ",isRestHistory=" + this.isRestHistory + ",chatType=" + this.chatType + ",}";
    }
}
