package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/ImportOldDbMsgNotifyInfo.class */
public final class ImportOldDbMsgNotifyInfo {
    public int chatType;
    public String msg;
    public float progress;
    public int result;
    public String uid;

    public ImportOldDbMsgNotifyInfo() {
        this.uid = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.msg = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    }

    public int getChatType() {
        return this.chatType;
    }

    public String getMsg() {
        return this.msg;
    }

    public float getProgress() {
        return this.progress;
    }

    public int getResult() {
        return this.result;
    }

    public String getUid() {
        return this.uid;
    }

    public String toString() {
        return "ImportOldDbMsgNotifyInfo{progress=" + this.progress + ",chatType=" + this.chatType + ",uid=" + this.uid + ",result=" + this.result + ",msg=" + this.msg + ",}";
    }

    public ImportOldDbMsgNotifyInfo(float f, int i, String str, int i2, String str2) {
        this.uid = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.msg = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.progress = f;
        this.chatType = i;
        this.uid = str;
        this.result = i2;
        this.msg = str2;
    }
}
