package com.tencent.qqnt.kernel.nativeinterface;

import java.util.ArrayList;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/GroupBulletinListResult.class */
public final class GroupBulletinListResult {
    public int gln;
    public long groupCode;
    public long jointime;
    public int nextIndex;
    public int readOnly;
    public int role;
    public long serverTime;
    public int srvCode;
    public long svrt;
    public int tst;
    public ArrayList<GroupBulletinFeed> inst = new ArrayList<>();
    public ArrayList<GroupBulletinFeed> feeds = new ArrayList<>();
    public GroupBulletinGroupInfo groupInfo = new GroupBulletinGroupInfo();
    public ArrayList<GroupBulletinPublisherInfo> publisherInfos = new ArrayList<>();

    public ArrayList<GroupBulletinFeed> getFeeds() {
        return this.feeds;
    }

    public int getGln() {
        return this.gln;
    }

    public long getGroupCode() {
        return this.groupCode;
    }

    public GroupBulletinGroupInfo getGroupInfo() {
        return this.groupInfo;
    }

    public ArrayList<GroupBulletinFeed> getInst() {
        return this.inst;
    }

    public long getJointime() {
        return this.jointime;
    }

    public int getNextIndex() {
        return this.nextIndex;
    }

    public ArrayList<GroupBulletinPublisherInfo> getPublisherInfos() {
        return this.publisherInfos;
    }

    public int getReadOnly() {
        return this.readOnly;
    }

    public int getRole() {
        return this.role;
    }

    public long getServerTime() {
        return this.serverTime;
    }

    public int getSrvCode() {
        return this.srvCode;
    }

    public long getSvrt() {
        return this.svrt;
    }

    public int getTst() {
        return this.tst;
    }

    public String toString() {
        return "GroupBulletinListResult{groupCode=" + this.groupCode + ",srvCode=" + this.srvCode + ",readOnly=" + this.readOnly + ",role=" + this.role + ",inst=" + this.inst + ",feeds=" + this.feeds + ",groupInfo=" + this.groupInfo + ",gln=" + this.gln + ",tst=" + this.tst + ",publisherInfos=" + this.publisherInfos + ",serverTime=" + this.serverTime + ",svrt=" + this.svrt + ",nextIndex=" + this.nextIndex + ",jointime=" + this.jointime + ",}";
    }
}
