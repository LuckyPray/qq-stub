package com.tencent.qqnt.kernel.nativeinterface;

import java.util.ArrayList;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/BackGroundInfo.class */
public final class BackGroundInfo implements IKernelModel {
    public int c2cUnreadCnt;
    public int contactUnreadCnt;
    public int groupUnreadCnt;
    public ArrayList<Long> groupUnreadCodes;
    public int guildPsvboxUnreadCnt;
    public int guildUnreadCnt;
    public int verifyUnreadCnt;

    public BackGroundInfo() {
        this.groupUnreadCodes = new ArrayList<>();
    }

    public int getC2cUnreadCnt() {
        return this.c2cUnreadCnt;
    }

    public int getContactUnreadCnt() {
        return this.contactUnreadCnt;
    }

    public int getGroupUnreadCnt() {
        return this.groupUnreadCnt;
    }

    public ArrayList<Long> getGroupUnreadCodes() {
        return this.groupUnreadCodes;
    }

    public int getGuildPsvboxUnreadCnt() {
        return this.guildPsvboxUnreadCnt;
    }

    public int getGuildUnreadCnt() {
        return this.guildUnreadCnt;
    }

    public int getVerifyUnreadCnt() {
        return this.verifyUnreadCnt;
    }

    public void setC2cUnreadCnt(int i) {
        this.c2cUnreadCnt = i;
    }

    public void setContactUnreadCnt(int i) {
        this.contactUnreadCnt = i;
    }

    public void setGroupUnreadCnt(int i) {
        this.groupUnreadCnt = i;
    }

    public void setGroupUnreadCodes(ArrayList<Long> arrayList) {
        this.groupUnreadCodes = arrayList;
    }

    public void setGuildPsvboxUnreadCnt(int i) {
        this.guildPsvboxUnreadCnt = i;
    }

    public void setGuildUnreadCnt(int i) {
        this.guildUnreadCnt = i;
    }

    public void setVerifyUnreadCnt(int i) {
        this.verifyUnreadCnt = i;
    }

    public String toString() {
        return "BackGroundInfo{c2cUnreadCnt=" + this.c2cUnreadCnt + ",groupUnreadCnt=" + this.groupUnreadCnt + ",guildUnreadCnt=" + this.guildUnreadCnt + ",guildPsvboxUnreadCnt=" + this.guildPsvboxUnreadCnt + ",verifyUnreadCnt=" + this.verifyUnreadCnt + ",contactUnreadCnt=" + this.contactUnreadCnt + ",groupUnreadCodes=" + this.groupUnreadCodes + ",}";
    }

    public BackGroundInfo(int i, int i2, int i3, int i4, int i5, int i6, ArrayList<Long> arrayList) {
        this.groupUnreadCodes = new ArrayList<>();
        this.c2cUnreadCnt = i;
        this.groupUnreadCnt = i2;
        this.guildUnreadCnt = i3;
        this.guildPsvboxUnreadCnt = i4;
        this.verifyUnreadCnt = i5;
        this.contactUnreadCnt = i6;
        this.groupUnreadCodes = arrayList;
    }
}
