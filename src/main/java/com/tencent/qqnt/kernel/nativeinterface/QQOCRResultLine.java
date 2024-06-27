package com.tencent.qqnt.kernel.nativeinterface;

import java.util.ArrayList;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/QQOCRResultLine.class */
public final class QQOCRResultLine {
    public OCRPoint botLeft;
    public OCRPoint botRight;
    public ArrayList<QQOCRResult> sub;
    public String text;
    public OCRPoint topLeft;
    public OCRPoint topRight;

    public QQOCRResultLine() {
        this.text = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.botLeft = new OCRPoint();
        this.botRight = new OCRPoint();
        this.topLeft = new OCRPoint();
        this.topRight = new OCRPoint();
        this.sub = new ArrayList<>();
    }

    public OCRPoint getBotLeft() {
        return this.botLeft;
    }

    public OCRPoint getBotRight() {
        return this.botRight;
    }

    public ArrayList<QQOCRResult> getSub() {
        return this.sub;
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
        return "QQOCRResultLine{text=" + this.text + ",botLeft=" + this.botLeft + ",botRight=" + this.botRight + ",topLeft=" + this.topLeft + ",topRight=" + this.topRight + ",sub=" + this.sub + ",}";
    }

    public QQOCRResultLine(String str, OCRPoint oCRPoint, OCRPoint oCRPoint2, OCRPoint oCRPoint3, OCRPoint oCRPoint4, ArrayList<QQOCRResult> arrayList) {
        this.text = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.botLeft = new OCRPoint();
        this.botRight = new OCRPoint();
        this.topLeft = new OCRPoint();
        this.topRight = new OCRPoint();
        this.sub = new ArrayList<>();
        this.text = str;
        this.botLeft = oCRPoint;
        this.botRight = oCRPoint2;
        this.topLeft = oCRPoint3;
        this.topRight = oCRPoint4;
        this.sub = arrayList;
    }
}
