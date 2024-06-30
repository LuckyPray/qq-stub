package com.tencent.qqnt.kernel.nativeinterface;

/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/InitSessionDesktopPathConfig.class */
public final class InitSessionDesktopPathConfig {
    public String accountPath;

    public InitSessionDesktopPathConfig() {
        this.accountPath = "";
    }

    public String getAccountPath() {
        return this.accountPath;
    }

    public String toString() {
        return "InitSessionDesktopPathConfig{accountPath=" + this.accountPath + ",}";
    }

    public InitSessionDesktopPathConfig(String str) {
        this.accountPath = "";
        this.accountPath = str;
    }
}
