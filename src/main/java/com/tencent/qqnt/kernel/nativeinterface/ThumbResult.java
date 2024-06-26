package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/ThumbResult.class */
public final class ThumbResult {
    public int cropHeight;
    public int cropWidth;
    public int cropXOffset;
    public int cropYOffset;
    public int scaleHeight;
    public int scaleWidth;

    public ThumbResult() {
    }

    public int getCropHeight() {
        return this.cropHeight;
    }

    public int getCropWidth() {
        return this.cropWidth;
    }

    public int getCropXOffset() {
        return this.cropXOffset;
    }

    public int getCropYOffset() {
        return this.cropYOffset;
    }

    public int getScaleHeight() {
        return this.scaleHeight;
    }

    public int getScaleWidth() {
        return this.scaleWidth;
    }

    public String toString() {
        return "ThumbResult{cropXOffset=" + this.cropXOffset + ",cropYOffset=" + this.cropYOffset + ",cropWidth=" + this.cropWidth + ",cropHeight=" + this.cropHeight + ",scaleWidth=" + this.scaleWidth + ",scaleHeight=" + this.scaleHeight + ",}";
    }

    public ThumbResult(int i, int i2, int i3, int i4, int i5, int i6) {
        this.cropXOffset = i;
        this.cropYOffset = i2;
        this.cropWidth = i3;
        this.cropHeight = i4;
        this.scaleWidth = i5;
        this.scaleHeight = i6;
    }
}
