package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/StMediaLike.class */
public final class StMediaLike {
    public String key;
    public boolean liked;
    public int num;

    public StMediaLike() {
        this.key = "";
    }

    public String getKey() {
        return this.key;
    }

    public boolean getLiked() {
        return this.liked;
    }

    public int getNum() {
        return this.num;
    }

    public StMediaLike(String str, int i, boolean z) {
        this.key = "";
        this.key = str;
        this.num = i;
        this.liked = z;
    }
}
