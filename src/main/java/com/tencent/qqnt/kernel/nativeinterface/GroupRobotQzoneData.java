package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/GroupRobotQzoneData.class */
public final class GroupRobotQzoneData {
    public boolean isOnlySelf;
    public long uploadTime;
    public String imageUrl = "";
    public String thumbImageUrl = "";
    public String text = "";
    public GroupRobotQzoneDataType dataType = GroupRobotQzoneDataType.values()[0];

    public GroupRobotQzoneDataType getDataType() {
        return this.dataType;
    }

    public String getImageUrl() {
        return this.imageUrl;
    }

    public boolean getIsOnlySelf() {
        return this.isOnlySelf;
    }

    public String getText() {
        return this.text;
    }

    public String getThumbImageUrl() {
        return this.thumbImageUrl;
    }

    public long getUploadTime() {
        return this.uploadTime;
    }

    public String toString() {
        return "GroupRobotQzoneData{imageUrl=" + this.imageUrl + ",thumbImageUrl=" + this.thumbImageUrl + ",uploadTime=" + this.uploadTime + ",isOnlySelf=" + this.isOnlySelf + ",text=" + this.text + ",dataType=" + this.dataType + ",}";
    }
}
