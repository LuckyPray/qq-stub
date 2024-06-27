package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/ImportRecentUser.class */
public final class ImportRecentUser {
    public int type;
    public String uin;

    public ImportRecentUser() {
        this.uin = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    }

    public int getType() {
        return this.type;
    }

    public String getUin() {
        return this.uin;
    }

    public String toString() {
        return "ImportRecentUser{uin=" + this.uin + ",type=" + this.type + ",}";
    }

    public ImportRecentUser(String str, int i) {
        this.uin = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.uin = str;
        this.type = i;
    }
}
