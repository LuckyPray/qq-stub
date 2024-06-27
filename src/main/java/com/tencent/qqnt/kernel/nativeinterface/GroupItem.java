package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/GroupItem.class */
public final class GroupItem {
    public GroupFileInfo fileInfo;
    public GroupFolderInfo folderInfo;
    public long peerId;
    public GroupItemType type;

    public GroupItem() {
        this.type = GroupItemType.values()[0];
    }

    public GroupFileInfo getFileInfo() {
        return this.fileInfo;
    }

    public GroupFolderInfo getFolderInfo() {
        return this.folderInfo;
    }

    public long getPeerId() {
        return this.peerId;
    }

    public GroupItemType getType() {
        return this.type;
    }

    public String toString() {
        return "GroupItem{peerId=" + this.peerId + ",type=" + this.type + ",folderInfo=" + this.folderInfo + ",fileInfo=" + this.fileInfo + ",}";
    }

    public GroupItem(long j, GroupItemType groupItemType, GroupFolderInfo groupFolderInfo, GroupFileInfo groupFileInfo) {
        this.type = GroupItemType.values()[0];
        this.peerId = j;
        this.type = groupItemType;
        this.folderInfo = groupFolderInfo;
        this.fileInfo = groupFileInfo;
    }
}
