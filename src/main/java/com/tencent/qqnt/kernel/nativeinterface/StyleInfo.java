package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/StyleInfo.class */
public final class StyleInfo {
    public Gender figureGender = Gender.values()[0];

    public Gender getFigureGender() {
        return this.figureGender;
    }

    public String toString() {
        return "StyleInfo{figureGender=" + this.figureGender + ",}";
    }
}
