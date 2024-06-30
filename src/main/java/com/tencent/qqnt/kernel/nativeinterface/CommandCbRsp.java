package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/CommandCbRsp.class */
public final class CommandCbRsp {
    public int promptIcon;
    public String promptText = "";
    public int promptType;
    public int status;

    public int getPromptIcon() {
        return this.promptIcon;
    }

    public String getPromptText() {
        return this.promptText;
    }

    public int getPromptType() {
        return this.promptType;
    }

    public int getStatus() {
        return this.status;
    }

    public String toString() {
        return "CommandCbRsp{status=" + this.status + ",promptText=" + this.promptText + ",promptType=" + this.promptType + ",promptIcon=" + this.promptIcon + ",}";
    }
}
