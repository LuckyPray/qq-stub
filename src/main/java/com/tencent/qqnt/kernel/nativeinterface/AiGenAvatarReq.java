package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/AiGenAvatarReq.class */
public final class AiGenAvatarReq {
    public int avatarNum;
    public String avatarPrompt = "";

    public int getAvatarNum() {
        return this.avatarNum;
    }

    public String getAvatarPrompt() {
        return this.avatarPrompt;
    }

    public String toString() {
        return "AiGenAvatarReq{avatarPrompt=" + this.avatarPrompt + ",avatarNum=" + this.avatarNum + ",}";
    }
}
