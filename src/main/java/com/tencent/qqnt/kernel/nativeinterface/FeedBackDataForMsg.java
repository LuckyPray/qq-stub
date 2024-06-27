package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/FeedBackDataForMsg.class */
public final class FeedBackDataForMsg {
    public int button;
    public boolean checked;
    public String data;

    public FeedBackDataForMsg() {
        this.data = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    }

    public int getButton() {
        return this.button;
    }

    public boolean getChecked() {
        return this.checked;
    }

    public String getData() {
        return this.data;
    }

    public String toString() {
        return "FeedBackDataForMsg{button=" + this.button + ",checked=" + this.checked + ",data=" + this.data + ",}";
    }

    public FeedBackDataForMsg(int i, boolean z, String str) {
        this.data = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.button = i;
        this.checked = z;
        this.data = str;
    }
}
