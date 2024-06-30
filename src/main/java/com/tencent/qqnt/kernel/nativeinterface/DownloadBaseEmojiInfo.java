package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/DownloadBaseEmojiInfo.class */
public final class DownloadBaseEmojiInfo {
    public String baseResDownloadUrl = "";
    public String advancedResDownloadUrl = "";

    public String getAdvancedResDownloadUrl() {
        return this.advancedResDownloadUrl;
    }

    public String getBaseResDownloadUrl() {
        return this.baseResDownloadUrl;
    }

    public String toString() {
        return "DownloadBaseEmojiInfo{baseResDownloadUrl=" + this.baseResDownloadUrl + ",advancedResDownloadUrl=" + this.advancedResDownloadUrl + ",}";
    }
}
