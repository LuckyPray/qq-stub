package com.tencent.qqnt.kernel.nativeinterface;

import java.util.HashMap;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/CommonFileInfo.class */
public final class CommonFileInfo {
    public Integer bizType;
    public int chatType;
    public long elemId;
    public String favId;
    public long fileModelId;
    public String fileName;
    public long fileSize;
    public String md5;
    public String md510m;
    public long msgId;
    public long msgTime;
    public String parent;
    public String peerUid;
    public HashMap<Integer, String> picThumbPath;
    public String sha;
    public String sha3;
    public String subId;
    public String uuid;

    public CommonFileInfo() {
        this.uuid = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.subId = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.fileName = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.peerUid = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.md5 = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.md510m = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.sha = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.sha3 = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    }

    public Integer getBizType() {
        return this.bizType;
    }

    public int getChatType() {
        return this.chatType;
    }

    public long getElemId() {
        return this.elemId;
    }

    public String getFavId() {
        return this.favId;
    }

    public long getFileModelId() {
        return this.fileModelId;
    }

    public String getFileName() {
        return this.fileName;
    }

    public long getFileSize() {
        return this.fileSize;
    }

    public String getMd5() {
        return this.md5;
    }

    public String getMd510m() {
        return this.md510m;
    }

    public long getMsgId() {
        return this.msgId;
    }

    public long getMsgTime() {
        return this.msgTime;
    }

    public String getParent() {
        return this.parent;
    }

    public String getPeerUid() {
        return this.peerUid;
    }

    public HashMap<Integer, String> getPicThumbPath() {
        return this.picThumbPath;
    }

    public String getSha() {
        return this.sha;
    }

    public String getSha3() {
        return this.sha3;
    }

    public String getSubId() {
        return this.subId;
    }

    public String getUuid() {
        return this.uuid;
    }

    public String toString() {
        return "CommonFileInfo{fileModelId=" + this.fileModelId + ",msgId=" + this.msgId + ",elemId=" + this.elemId + ",uuid=" + this.uuid + ",subId=" + this.subId + ",fileName=" + this.fileName + ",fileSize=" + this.fileSize + ",msgTime=" + this.msgTime + ",peerUid=" + this.peerUid + ",chatType=" + this.chatType + ",md5=" + this.md5 + ",md510m=" + this.md510m + ",sha=" + this.sha + ",sha3=" + this.sha3 + ",parent=" + this.parent + ",favId=" + this.favId + ",bizType=" + this.bizType + ",picThumbPath=" + this.picThumbPath + ",}";
    }

    public CommonFileInfo(long j, long j2, long j3, String str, String str2, String str3, long j4, long j5, String str4, int i, String str5, String str6, String str7, String str8, String str9, String str10, Integer num, HashMap<Integer, String> hashMap) {
        this.uuid = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.subId = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.fileName = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.peerUid = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.md5 = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.md510m = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.sha = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.sha3 = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.fileModelId = j;
        this.msgId = j2;
        this.elemId = j3;
        this.uuid = str;
        this.subId = str2;
        this.fileName = str3;
        this.fileSize = j4;
        this.msgTime = j5;
        this.peerUid = str4;
        this.chatType = i;
        this.md5 = str5;
        this.md510m = str6;
        this.sha = str7;
        this.sha3 = str8;
        this.parent = str9;
        this.favId = str10;
        this.bizType = num;
        this.picThumbPath = hashMap;
    }
}
