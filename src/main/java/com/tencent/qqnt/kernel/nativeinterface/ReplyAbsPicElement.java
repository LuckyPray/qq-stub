package com.tencent.qqnt.kernel.nativeinterface;

/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/ReplyAbsPicElement.class */
public final class ReplyAbsPicElement {
    public int picHeight;
    public String picText;
    public int picWidth;

    public ReplyAbsPicElement() {
    }

    public int getPicHeight() {
        return this.picHeight;
    }

    public String getPicText() {
        return this.picText;
    }

    public int getPicWidth() {
        return this.picWidth;
    }

    public String toString() {
        return "ReplyAbsPicElement{picWidth=" + this.picWidth + ",picHeight=" + this.picHeight + ",picText=" + this.picText + ",}";
    }

    public ReplyAbsPicElement(int i, int i2, String str) {
        this.picWidth = i;
        this.picHeight = i2;
        this.picText = str;
    }
}
