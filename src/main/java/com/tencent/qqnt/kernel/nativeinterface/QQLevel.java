package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/QQLevel.class */
public final class QQLevel {
    public int crownNum;
    public int moonNum;
    public int starNum;
    public int sunNum;

    public QQLevel() {
    }

    public int getCrownNum() {
        return this.crownNum;
    }

    public int getMoonNum() {
        return this.moonNum;
    }

    public int getStarNum() {
        return this.starNum;
    }

    public int getSunNum() {
        return this.sunNum;
    }

    public String toString() {
        return "QQLevel{crownNum=" + this.crownNum + ",sunNum=" + this.sunNum + ",moonNum=" + this.moonNum + ",starNum=" + this.starNum + ",}";
    }

    public QQLevel(int i, int i2, int i3, int i4) {
        this.crownNum = i;
        this.sunNum = i2;
        this.moonNum = i3;
        this.starNum = i4;
    }
}
