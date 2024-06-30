package com.tencent.qqnt.kernel.nativeinterface;

import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/PrivilegeIcon.class */
public final class PrivilegeIcon {
    public ArrayList<PrivilegeInfo> closeIconList;
    public String jumpUrl;
    public ArrayList<PrivilegeInfo> openIconList;

    public PrivilegeIcon() {
        this.jumpUrl = "";
        this.openIconList = new ArrayList<>();
        this.closeIconList = new ArrayList<>();
    }

    public ArrayList<PrivilegeInfo> getCloseIconList() {
        return this.closeIconList;
    }

    public String getJumpUrl() {
        return this.jumpUrl;
    }

    public ArrayList<PrivilegeInfo> getOpenIconList() {
        return this.openIconList;
    }

    public String toString() {
        return "PrivilegeIcon{jumpUrl=" + this.jumpUrl + ",openIconList=" + this.openIconList + ",closeIconList=" + this.closeIconList + ",}";
    }

    public PrivilegeIcon(String str, ArrayList<PrivilegeInfo> arrayList, ArrayList<PrivilegeInfo> arrayList2) {
        this.jumpUrl = "";
        this.openIconList = new ArrayList<>();
        this.closeIconList = new ArrayList<>();
        this.jumpUrl = str;
        this.openIconList = arrayList;
        this.closeIconList = arrayList2;
    }
}
