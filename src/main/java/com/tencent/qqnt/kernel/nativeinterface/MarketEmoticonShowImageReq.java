package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/MarketEmoticonShowImageReq.class */
public final class MarketEmoticonShowImageReq {
    public int epId;
    public String name;
    public int type;
    public boolean valid;
    public long wordingId;

    public MarketEmoticonShowImageReq() {
        this.name = "";
    }

    public int getEpId() {
        return this.epId;
    }

    public String getName() {
        return this.name;
    }

    public int getType() {
        return this.type;
    }

    public boolean getValid() {
        return this.valid;
    }

    public long getWordingId() {
        return this.wordingId;
    }

    public String toString() {
        return "MarketEmoticonShowImageReq{epId=" + this.epId + ",wordingId=" + this.wordingId + ",type=" + this.type + ",name=" + this.name + ",valid=" + this.valid + ",}";
    }

    public MarketEmoticonShowImageReq(int i, long j, int i2, String str, boolean z) {
        this.name = "";
        this.epId = i;
        this.wordingId = j;
        this.type = i2;
        this.name = str;
        this.valid = z;
    }
}
