package com.tencent.qqnt.kernel.nativeinterface;

/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/EmojiHotPicSearchPoint.class */
public final class EmojiHotPicSearchPoint {

    /* renamed from: x */
    public float f3x;

    /* renamed from: y */
    public float f4y;

    public EmojiHotPicSearchPoint() {
    }

    public float getX() {
        return this.f3x;
    }

    public float getY() {
        return this.f4y;
    }

    public String toString() {
        return "EmojiHotPicSearchPoint{x=" + this.f3x + ",y=" + this.f4y + ",}";
    }

    public EmojiHotPicSearchPoint(float f, float f2) {
        this.f3x = f;
        this.f4y = f2;
    }
}
