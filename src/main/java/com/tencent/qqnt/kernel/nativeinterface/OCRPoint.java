package com.tencent.qqnt.kernel.nativeinterface;

/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/OCRPoint.class */
public final class OCRPoint {

    /* renamed from: x */
    public String f27x;

    /* renamed from: y */
    public String f28y;

    public OCRPoint() {
        this.f27x = "";
        this.f28y = "";
    }

    public String getX() {
        return this.f27x;
    }

    public String getY() {
        return this.f28y;
    }

    public String toString() {
        return "OCRPoint{x=" + this.f27x + ",y=" + this.f28y + ",}";
    }

    public OCRPoint(String str, String str2) {
        this.f27x = "";
        this.f28y = "";
        this.f27x = str;
        this.f28y = str2;
    }
}
