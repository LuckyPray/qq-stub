package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/GetAIGCEmojiListReq.class */
public final class GetAIGCEmojiListReq {
    public String packId = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    public byte[] pageSession = new byte[0];
    public int pageSize;
    public int sortMode;
    public long timestamp;

    public String getPackId() {
        return this.packId;
    }

    public byte[] getPageSession() {
        return this.pageSession;
    }

    public int getPageSize() {
        return this.pageSize;
    }

    public int getSortMode() {
        return this.sortMode;
    }

    public long getTimestamp() {
        return this.timestamp;
    }

    public String toString() {
        return "GetAIGCEmojiListReq{packId=" + this.packId + ",pageSize=" + this.pageSize + ",pageSession=" + this.pageSession + ",timestamp=" + this.timestamp + ",sortMode=" + this.sortMode + ",}";
    }
}
