package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/SearchNetSugInfo.class */
public final class SearchNetSugInfo {
    public String sugWord = "";
    public String hitKeyWord = "";
    public String stringExtension = "";

    public String getHitKeyWord() {
        return this.hitKeyWord;
    }

    public String getStringExtension() {
        return this.stringExtension;
    }

    public String getSugWord() {
        return this.sugWord;
    }

    public String toString() {
        return "SearchNetSugInfo{sugWord=" + this.sugWord + ",hitKeyWord=" + this.hitKeyWord + ",stringExtension=" + this.stringExtension + ",}";
    }
}
