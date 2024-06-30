package com.tencent.qqnt.kernel.nativeinterface;

/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/PicReqParams.class */
public final class PicReqParams {
    public int chatType;
    public boolean isGif;
    public String peerUid;
    public int picSize;

    public PicReqParams() {
        this.peerUid = "";
    }

    public int getChatType() {
        return this.chatType;
    }

    public boolean getIsGif() {
        return this.isGif;
    }

    public String getPeerUid() {
        return this.peerUid;
    }

    public int getPicSize() {
        return this.picSize;
    }

    public String toString() {
        return "PicReqParams{chatType=" + this.chatType + ",peerUid=" + this.peerUid + ",picSize=" + this.picSize + ",isGif=" + this.isGif + ",}";
    }

    public PicReqParams(int i, String str, int i2, boolean z) {
        this.peerUid = "";
        this.chatType = i;
        this.peerUid = str;
        this.picSize = i2;
        this.isGif = z;
    }
}
