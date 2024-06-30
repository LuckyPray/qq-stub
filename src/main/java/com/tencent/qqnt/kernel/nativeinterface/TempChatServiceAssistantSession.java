package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/TempChatServiceAssistantSession.class */
public final class TempChatServiceAssistantSession {
    public long appId;
    public int appType;
    public String appTypeName;

    public TempChatServiceAssistantSession() {
        this.appTypeName = "";
    }

    public long getAppId() {
        return this.appId;
    }

    public int getAppType() {
        return this.appType;
    }

    public String getAppTypeName() {
        return this.appTypeName;
    }

    public String toString() {
        return "TempChatServiceAssistantSession{appType=" + this.appType + ",appId=" + this.appId + ",appTypeName=" + this.appTypeName + ",}";
    }

    public TempChatServiceAssistantSession(int i, long j, String str) {
        this.appTypeName = "";
        this.appType = i;
        this.appId = j;
        this.appTypeName = str;
    }
}
