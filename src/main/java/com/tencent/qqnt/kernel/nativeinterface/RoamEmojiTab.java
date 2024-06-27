package com.tencent.qqnt.kernel.nativeinterface;

import java.util.ArrayList;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/RoamEmojiTab.class */
public final class RoamEmojiTab {
    public ArrayList<Integer> epIds;
    public ArrayList<TabEmojiInfo> magicTabinfoList;
    public ArrayList<TabEmojiInfo> ordinaryTabinfoList;
    public int segmentFlag;
    public ArrayList<TabEmojiInfo> smallTabinfoList;
    public int timesTamp;

    public RoamEmojiTab() {
        this.ordinaryTabinfoList = new ArrayList<>();
        this.magicTabinfoList = new ArrayList<>();
        this.smallTabinfoList = new ArrayList<>();
        this.epIds = new ArrayList<>();
    }

    public ArrayList<Integer> getEpIds() {
        return this.epIds;
    }

    public ArrayList<TabEmojiInfo> getMagicTabinfoList() {
        return this.magicTabinfoList;
    }

    public ArrayList<TabEmojiInfo> getOrdinaryTabinfoList() {
        return this.ordinaryTabinfoList;
    }

    public int getSegmentFlag() {
        return this.segmentFlag;
    }

    public ArrayList<TabEmojiInfo> getSmallTabinfoList() {
        return this.smallTabinfoList;
    }

    public int getTimesTamp() {
        return this.timesTamp;
    }

    public String toString() {
        return "RoamEmojiTab{timesTamp=" + this.timesTamp + ",segmentFlag=" + this.segmentFlag + ",ordinaryTabinfoList=" + this.ordinaryTabinfoList + ",magicTabinfoList=" + this.magicTabinfoList + ",smallTabinfoList=" + this.smallTabinfoList + ",epIds=" + this.epIds + ",}";
    }

    public RoamEmojiTab(int i, int i2, ArrayList<TabEmojiInfo> arrayList, ArrayList<TabEmojiInfo> arrayList2, ArrayList<TabEmojiInfo> arrayList3, ArrayList<Integer> arrayList4) {
        this.ordinaryTabinfoList = new ArrayList<>();
        this.magicTabinfoList = new ArrayList<>();
        this.smallTabinfoList = new ArrayList<>();
        this.epIds = new ArrayList<>();
        this.timesTamp = i;
        this.segmentFlag = i2;
        this.ordinaryTabinfoList = arrayList;
        this.magicTabinfoList = arrayList2;
        this.smallTabinfoList = arrayList3;
        this.epIds = arrayList4;
    }
}
