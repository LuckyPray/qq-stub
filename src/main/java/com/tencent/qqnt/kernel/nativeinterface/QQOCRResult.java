package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/QQOCRResult.class */
public final class QQOCRResult {
    public OCRPoint botLeft;
    public OCRPoint botRight;
    public String text;
    public OCRPoint topLeft;
    public OCRPoint topRight;

    public QQOCRResult() {
        this.text = "";
        this.botLeft = new OCRPoint();
        this.botRight = new OCRPoint();
        this.topLeft = new OCRPoint();
        this.topRight = new OCRPoint();
    }

    public OCRPoint getBotLeft() {
        return this.botLeft;
    }

    public OCRPoint getBotRight() {
        return this.botRight;
    }

    public String getText() {
        return this.text;
    }

    public OCRPoint getTopLeft() {
        return this.topLeft;
    }

    public OCRPoint getTopRight() {
        return this.topRight;
    }

    public String toString() {
        return "QQOCRResult{text=" + this.text + ",botLeft=" + this.botLeft + ",botRight=" + this.botRight + ",topLeft=" + this.topLeft + ",topRight=" + this.topRight + ",}";
    }

    public QQOCRResult(String str, OCRPoint oCRPoint, OCRPoint oCRPoint2, OCRPoint oCRPoint3, OCRPoint oCRPoint4) {
        this.text = "";
        this.botLeft = new OCRPoint();
        this.botRight = new OCRPoint();
        this.topLeft = new OCRPoint();
        this.topRight = new OCRPoint();
        this.text = str;
        this.botLeft = oCRPoint;
        this.botRight = oCRPoint2;
        this.topLeft = oCRPoint3;
        this.topRight = oCRPoint4;
    }
}
