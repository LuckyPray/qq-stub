package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/GameMsgBoxConfig.class */
public final class GameMsgBoxConfig {
    public long appId;
    public String appName;
    public int authPromptType;
    public int notificationType;

    public GameMsgBoxConfig() {
        this.appName = "";
    }

    public long getAppId() {
        return this.appId;
    }

    public String getAppName() {
        return this.appName;
    }

    public int getAuthPromptType() {
        return this.authPromptType;
    }

    public int getNotificationType() {
        return this.notificationType;
    }

    public String toString() {
        return "GameMsgBoxConfig{appId=" + this.appId + ",appName=" + this.appName + ",notificationType=" + this.notificationType + ",authPromptType=" + this.authPromptType + ",}";
    }

    public GameMsgBoxConfig(long j, String str, int i, int i2) {
        this.appName = "";
        this.appId = j;
        this.appName = str;
        this.notificationType = i;
        this.authPromptType = i2;
    }
}
