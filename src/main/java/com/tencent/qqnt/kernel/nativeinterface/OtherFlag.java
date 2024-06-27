package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/OtherFlag.class */
public final class OtherFlag {
    public int colorRindId;
    public boolean isAioShortcutBarOpen;
    public boolean isSharingLocation;
    public boolean isZPlanCoupleOpen;
    public boolean onlyChat;
    public boolean qzoneNotWatch;
    public boolean qzoneNotWatched;
    public int studyFlag;
    public int teenagerFlag;
    public int zplanCoupleSceneId;

    public OtherFlag() {
    }

    public int getColorRindId() {
        return this.colorRindId;
    }

    public boolean getIsAioShortcutBarOpen() {
        return this.isAioShortcutBarOpen;
    }

    public boolean getIsSharingLocation() {
        return this.isSharingLocation;
    }

    public boolean getIsZPlanCoupleOpen() {
        return this.isZPlanCoupleOpen;
    }

    public boolean getOnlyChat() {
        return this.onlyChat;
    }

    public boolean getQzoneNotWatch() {
        return this.qzoneNotWatch;
    }

    public boolean getQzoneNotWatched() {
        return this.qzoneNotWatched;
    }

    public int getStudyFlag() {
        return this.studyFlag;
    }

    public int getTeenagerFlag() {
        return this.teenagerFlag;
    }

    public int getZplanCoupleSceneId() {
        return this.zplanCoupleSceneId;
    }

    public String toString() {
        return "OtherFlag{onlyChat=" + this.onlyChat + ",qzoneNotWatch=" + this.qzoneNotWatch + ",qzoneNotWatched=" + this.qzoneNotWatched + ",isZPlanCoupleOpen=" + this.isZPlanCoupleOpen + ",zplanCoupleSceneId=" + this.zplanCoupleSceneId + ",teenagerFlag=" + this.teenagerFlag + ",studyFlag=" + this.studyFlag + ",isAioShortcutBarOpen=" + this.isAioShortcutBarOpen + ",colorRindId=" + this.colorRindId + ",isSharingLocation=" + this.isSharingLocation + ",}";
    }

    public OtherFlag(boolean z, boolean z2, boolean z3, boolean z4, int i, int i2, int i3, boolean z5, int i4, boolean z6) {
        this.onlyChat = z;
        this.qzoneNotWatch = z2;
        this.qzoneNotWatched = z3;
        this.isZPlanCoupleOpen = z4;
        this.zplanCoupleSceneId = i;
        this.teenagerFlag = i2;
        this.studyFlag = i3;
        this.isAioShortcutBarOpen = z5;
        this.colorRindId = i4;
        this.isSharingLocation = z6;
    }
}
