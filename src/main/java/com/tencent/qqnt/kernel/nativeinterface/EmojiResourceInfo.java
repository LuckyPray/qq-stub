package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/EmojiResourceInfo.class */
public final class EmojiResourceInfo {
    public String errMsg;
    public String path;
    public int result;
    public int type;

    public EmojiResourceInfo() {
        this.errMsg = "";
        this.path = "";
    }

    public String getErrMsg() {
        return this.errMsg;
    }

    public String getPath() {
        return this.path;
    }

    public int getResult() {
        return this.result;
    }

    public int getType() {
        return this.type;
    }

    public String toString() {
        return "EmojiResourceInfo{result=" + this.result + ",errMsg=" + this.errMsg + ",type=" + this.type + ",path=" + this.path + ",}";
    }

    public EmojiResourceInfo(int i, String str, int i2, String str2) {
        this.errMsg = "";
        this.path = "";
        this.result = i;
        this.errMsg = str;
        this.type = i2;
        this.path = str2;
    }
}
