package com.tencent.qqnt.kernel.nativeinterface;

/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/PicDownParams.class */
public final class PicDownParams {
    public Integer downSize;
    public int downType;

    public PicDownParams() {
    }

    public Integer getDownSize() {
        return this.downSize;
    }

    public int getDownType() {
        return this.downType;
    }

    public String toString() {
        return "PicDownParams{downType=" + this.downType + ",downSize=" + this.downSize + ",}";
    }

    public PicDownParams(int i, Integer num) {
        this.downType = i;
        this.downSize = num;
    }
}
