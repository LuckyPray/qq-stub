package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/InputBox.class */
public final class InputBox {
    public int supportCamera;
    public int supportFile;
    public int supportMenu;
    public int supportPanel;
    public int supportPhoto;

    public int getSupportCamera() {
        return this.supportCamera;
    }

    public int getSupportFile() {
        return this.supportFile;
    }

    public int getSupportMenu() {
        return this.supportMenu;
    }

    public int getSupportPanel() {
        return this.supportPanel;
    }

    public int getSupportPhoto() {
        return this.supportPhoto;
    }

    public String toString() {
        return "InputBox{supportPhoto=" + this.supportPhoto + ",supportCamera=" + this.supportCamera + ",supportFile=" + this.supportFile + ",supportMenu=" + this.supportMenu + ",supportPanel=" + this.supportPanel + ",}";
    }
}
