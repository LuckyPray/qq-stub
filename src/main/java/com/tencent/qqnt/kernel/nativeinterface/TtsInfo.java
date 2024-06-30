package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/TtsInfo.class */
public final class TtsInfo {
    public String ttsId = "";
    public String ttsName = "";
    public String ttsIcon = "";
    public String ttsExample = "";

    public String getTtsExample() {
        return this.ttsExample;
    }

    public String getTtsIcon() {
        return this.ttsIcon;
    }

    public String getTtsId() {
        return this.ttsId;
    }

    public String getTtsName() {
        return this.ttsName;
    }

    public String toString() {
        return "TtsInfo{ttsId=" + this.ttsId + ",ttsName=" + this.ttsName + ",ttsIcon=" + this.ttsIcon + ",ttsExample=" + this.ttsExample + ",}";
    }
}
