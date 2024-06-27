package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/GroupFolderInfo.class */
public final class GroupFolderInfo {
    public int createTime;
    public long createUin;
    public String creatorName;
    public String folderId;
    public String folderName;
    public String modifyName;
    public int modifyTime;
    public long modifyUin;
    public String parentFolderId;
    public int totalFileCount;
    public long usedSpace;

    public GroupFolderInfo() {
        this.folderId = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.parentFolderId = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.folderName = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.creatorName = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.modifyName = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    }

    public int getCreateTime() {
        return this.createTime;
    }

    public long getCreateUin() {
        return this.createUin;
    }

    public String getCreatorName() {
        return this.creatorName;
    }

    public String getFolderId() {
        return this.folderId;
    }

    public String getFolderName() {
        return this.folderName;
    }

    public String getModifyName() {
        return this.modifyName;
    }

    public int getModifyTime() {
        return this.modifyTime;
    }

    public long getModifyUin() {
        return this.modifyUin;
    }

    public String getParentFolderId() {
        return this.parentFolderId;
    }

    public int getTotalFileCount() {
        return this.totalFileCount;
    }

    public long getUsedSpace() {
        return this.usedSpace;
    }

    public String toString() {
        return "GroupFolderInfo{folderId=" + this.folderId + ",parentFolderId=" + this.parentFolderId + ",folderName=" + this.folderName + ",createTime=" + this.createTime + ",modifyTime=" + this.modifyTime + ",createUin=" + this.createUin + ",creatorName=" + this.creatorName + ",totalFileCount=" + this.totalFileCount + ",modifyUin=" + this.modifyUin + ",modifyName=" + this.modifyName + ",usedSpace=" + this.usedSpace + ",}";
    }

    public GroupFolderInfo(String str, String str2, String str3, int i, int i2, long j, String str4, int i3, long j2, String str5, long j3) {
        this.folderId = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.parentFolderId = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.folderName = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.creatorName = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.modifyName = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.folderId = str;
        this.parentFolderId = str2;
        this.folderName = str3;
        this.createTime = i;
        this.modifyTime = i2;
        this.createUin = j;
        this.creatorName = str4;
        this.totalFileCount = i3;
        this.modifyUin = j2;
        this.modifyName = str5;
        this.usedSpace = j3;
    }
}
