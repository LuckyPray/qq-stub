package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/AvatarView.class */
public final class AvatarView {
    public String md5;
    public String url;

    public AvatarView() {
        this.url = "";
        this.md5 = "";
    }

    public String getMd5() {
        return this.md5;
    }

    public String getUrl() {
        return this.url;
    }

    public String toString() {
        return "AvatarView{url=" + this.url + ",md5=" + this.md5 + ",}";
    }

    public AvatarView(String str, String str2) {
        this.url = "";
        this.md5 = "";
        this.url = str;
        this.md5 = str2;
    }
}
