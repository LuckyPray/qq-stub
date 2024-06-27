package com.tencent.qqnt.kernel.nativeinterface;

/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/GroupPortraitInfo.class */
public final class GroupPortraitInfo {
    public int leftX;
    public int leftY;
    public int picId;
    public int rightX;
    public int rightY;

    public int getLeftX() {
        return this.leftX;
    }

    public int getLeftY() {
        return this.leftY;
    }

    public int getPicId() {
        return this.picId;
    }

    public int getRightX() {
        return this.rightX;
    }

    public int getRightY() {
        return this.rightY;
    }

    public String toString() {
        return "GroupPortraitInfo{picId=" + this.picId + ",leftX=" + this.leftX + ",leftY=" + this.leftY + ",rightX=" + this.rightX + ",rightY=" + this.rightY + ",}";
    }
}
