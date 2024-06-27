package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/RemarkSignExtInfo.class */
public final class RemarkSignExtInfo {
    public Integer chatType;
    public Long groupCode;
    public RemarkSceneId sceneId;
    public byte[] sig;

    public RemarkSignExtInfo() {
        this.sceneId = RemarkSceneId.values()[0];
        this.sig = new byte[0];
    }

    public Integer getChatType() {
        return this.chatType;
    }

    public Long getGroupCode() {
        return this.groupCode;
    }

    public RemarkSceneId getSceneId() {
        return this.sceneId;
    }

    public byte[] getSig() {
        return this.sig;
    }

    public String toString() {
        return "RemarkSignExtInfo{sceneId=" + this.sceneId + ",chatType=" + this.chatType + ",groupCode=" + this.groupCode + ",sig=" + this.sig + ",}";
    }

    public RemarkSignExtInfo(RemarkSceneId remarkSceneId, Integer num, Long l, byte[] bArr) {
        this.sceneId = RemarkSceneId.values()[0];
        this.sig = new byte[0];
        this.sceneId = remarkSceneId;
        this.chatType = num;
        this.groupCode = l;
        this.sig = bArr;
    }
}
