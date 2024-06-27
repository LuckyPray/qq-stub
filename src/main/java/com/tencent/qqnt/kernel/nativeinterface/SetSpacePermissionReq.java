package com.tencent.qqnt.kernel.nativeinterface;

import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/SetSpacePermissionReq.class */
public final class SetSpacePermissionReq {
    public Integer domain;
    public ArrayList<UserPermission> friendPermissionList;

    public SetSpacePermissionReq() {
        this.friendPermissionList = new ArrayList<>();
    }

    public Integer getDomain() {
        return this.domain;
    }

    public ArrayList<UserPermission> getFriendPermissionList() {
        return this.friendPermissionList;
    }

    public String toString() {
        return "SetSpacePermissionReq{friendPermissionList=" + this.friendPermissionList + ",domain=" + this.domain + ",}";
    }

    public SetSpacePermissionReq(ArrayList<UserPermission> arrayList, Integer num) {
        this.friendPermissionList = new ArrayList<>();
        this.friendPermissionList = arrayList;
        this.domain = num;
    }
}
