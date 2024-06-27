package com.tencent.qqnt.kernel.nativeinterface;

import java.util.ArrayList;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/CheckUrlInfo.class */
public final class CheckUrlInfo {
    public ArrayList<String> urls;

    public CheckUrlInfo() {
        this.urls = new ArrayList<>();
    }

    public ArrayList<String> getUrls() {
        return this.urls;
    }

    public String toString() {
        return "CheckUrlInfo{urls=" + this.urls + ",}";
    }

    public CheckUrlInfo(ArrayList<String> arrayList) {
        this.urls = new ArrayList<>();
        this.urls = arrayList;
    }
}
