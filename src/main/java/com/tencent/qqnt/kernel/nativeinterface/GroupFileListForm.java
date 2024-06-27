package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/GroupFileListForm.class */
public final class GroupFileListForm {
    public int fileCount;
    public String folderId;
    public int showOnlinedocFolder;
    public int sortOrder;
    public GroupFileSortType sortType;
    public int startIndex;

    public GroupFileListForm() {
        this.sortType = GroupFileSortType.values()[0];
    }

    public int getFileCount() {
        return this.fileCount;
    }

    public String getFolderId() {
        return this.folderId;
    }

    public int getShowOnlinedocFolder() {
        return this.showOnlinedocFolder;
    }

    public int getSortOrder() {
        return this.sortOrder;
    }

    public GroupFileSortType getSortType() {
        return this.sortType;
    }

    public int getStartIndex() {
        return this.startIndex;
    }

    public String toString() {
        return "GroupFileListForm{folderId=" + this.folderId + ",sortType=" + this.sortType + ",fileCount=" + this.fileCount + ",startIndex=" + this.startIndex + ",sortOrder=" + this.sortOrder + ",showOnlinedocFolder=" + this.showOnlinedocFolder + ",}";
    }

    public GroupFileListForm(String str, GroupFileSortType groupFileSortType, int i, int i2, int i3, int i4) {
        this.sortType = GroupFileSortType.values()[0];
        this.folderId = str;
        this.sortType = groupFileSortType;
        this.fileCount = i;
        this.startIndex = i2;
        this.sortOrder = i3;
        this.showOnlinedocFolder = i4;
    }
}
