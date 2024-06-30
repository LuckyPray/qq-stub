package com.tencent.qqnt.kernel.nativeinterface;

/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/MarketEmoticonPath.class */
public final class MarketEmoticonPath {
    public boolean isExist;
    public String path;

    public MarketEmoticonPath() {
        this.path = "";
    }

    public boolean getIsExist() {
        return this.isExist;
    }

    public String getPath() {
        return this.path;
    }

    public String toString() {
        return "MarketEmoticonPath{isExist=" + this.isExist + ",path=" + this.path + ",}";
    }

    public MarketEmoticonPath(boolean z, String str) {
        this.path = "";
        this.isExist = z;
        this.path = str;
    }
}
