package com.tencent.qqnt.kernel.nativeinterface;

/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/StPicSpecUrlEntry.class */
public final class StPicSpecUrlEntry {
    public int spec;
    public StPicUrl url;

    public StPicSpecUrlEntry() {
        this.url = new StPicUrl();
    }

    public int getSpec() {
        return this.spec;
    }

    public StPicUrl getUrl() {
        return this.url;
    }

    public void setSpec(int i) {
        this.spec = i;
    }

    public void setUrl(StPicUrl stPicUrl) {
        this.url = stPicUrl;
    }

    public StPicSpecUrlEntry(int i, StPicUrl stPicUrl) {
        this.url = new StPicUrl();
        this.spec = i;
        this.url = stPicUrl;
    }
}
