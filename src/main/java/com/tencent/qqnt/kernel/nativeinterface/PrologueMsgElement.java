package com.tencent.qqnt.kernel.nativeinterface;

/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/PrologueMsgElement.class */
public final class PrologueMsgElement {
    public String text;

    public PrologueMsgElement() {
        this.text = "";
    }

    public String getText() {
        return this.text;
    }

    public String toString() {
        return "PrologueMsgElement{text=" + this.text + ",}";
    }

    public PrologueMsgElement(String str) {
        this.text = "";
        this.text = str;
    }
}
