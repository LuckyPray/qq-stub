package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/BuddyVerify.class */
public final class BuddyVerify {
    public String msg;
    public int type;
    public String url;

    public BuddyVerify() {
        this.msg = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.url = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    }

    public String getMsg() {
        return this.msg;
    }

    public int getType() {
        return this.type;
    }

    public String getUrl() {
        return this.url;
    }

    public String toString() {
        return "BuddyVerify{type=" + this.type + ",msg=" + this.msg + ",url=" + this.url + ",}";
    }

    public BuddyVerify(int i, String str, String str2) {
        this.msg = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.url = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.type = i;
        this.msg = str;
        this.url = str2;
    }
}
