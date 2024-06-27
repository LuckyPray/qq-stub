package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/RichMediaImgSize.class */
public final class RichMediaImgSize {
    public int height;
    public int width;

    public RichMediaImgSize() {
    }

    public int getHeight() {
        return this.height;
    }

    public int getWidth() {
        return this.width;
    }

    public String toString() {
        return "RichMediaImgSize{width=" + this.width + ",height=" + this.height + ",}";
    }

    public RichMediaImgSize(int i, int i2) {
        this.width = i;
        this.height = i2;
    }
}
