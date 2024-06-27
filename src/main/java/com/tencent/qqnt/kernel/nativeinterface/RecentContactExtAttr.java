package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/RecentContactExtAttr.class */
public final class RecentContactExtAttr {
    public TempChatGameSession gameSession;
    public MsgStatus msgStatus;
    public TempChatServiceAssistantSession serviceAssistantSession;

    public RecentContactExtAttr() {
    }

    public TempChatGameSession getGameSession() {
        return this.gameSession;
    }

    public MsgStatus getMsgStatus() {
        return this.msgStatus;
    }

    public TempChatServiceAssistantSession getServiceAssistantSession() {
        return this.serviceAssistantSession;
    }

    public String toString() {
        return "RecentContactExtAttr{gameSession=" + this.gameSession + ",serviceAssistantSession=" + this.serviceAssistantSession + ",msgStatus=" + this.msgStatus + ",}";
    }

    public RecentContactExtAttr(TempChatGameSession tempChatGameSession, TempChatServiceAssistantSession tempChatServiceAssistantSession, MsgStatus msgStatus) {
        this.gameSession = tempChatGameSession;
        this.serviceAssistantSession = tempChatServiceAssistantSession;
        this.msgStatus = msgStatus;
    }
}
