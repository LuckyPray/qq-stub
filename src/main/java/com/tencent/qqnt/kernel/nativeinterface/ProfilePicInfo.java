package com.tencent.qqnt.kernel.nativeinterface;

import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/ProfilePicInfo.class */
public final class ProfilePicInfo {
    public ArrayList<ProfilePic> picList;

    public ProfilePicInfo() {
        this.picList = new ArrayList<>();
    }

    public ArrayList<ProfilePic> getPicList() {
        return this.picList;
    }

    public String toString() {
        return "ProfilePicInfo{picList=" + this.picList + ",}";
    }

    public ProfilePicInfo(ArrayList<ProfilePic> arrayList) {
        this.picList = new ArrayList<>();
        this.picList = arrayList;
    }
}
