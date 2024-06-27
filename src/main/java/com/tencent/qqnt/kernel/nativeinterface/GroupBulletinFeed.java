package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/GroupBulletinFeed.class */
public final class GroupBulletinFeed {

    /* renamed from: cn */
    public int f17cn;

    /* renamed from: fn */
    public int f18fn;
    public int isAllConfirm;
    public int isRead;
    public int pinned;
    public long publishTime;
    public int readNum;
    public int type;
    public long uin;

    /* renamed from: vn */
    public int f19vn;
    public String feedId = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    public GroupBulletinFeedMsg msg = new GroupBulletinFeedMsg();
    public GroupBulletinFeedSetting settings = new GroupBulletinFeedSetting();

    public int getCn() {
        return this.f17cn;
    }

    public String getFeedId() {
        return this.feedId;
    }

    public int getFn() {
        return this.f18fn;
    }

    public int getIsAllConfirm() {
        return this.isAllConfirm;
    }

    public int getIsRead() {
        return this.isRead;
    }

    public GroupBulletinFeedMsg getMsg() {
        return this.msg;
    }

    public int getPinned() {
        return this.pinned;
    }

    public long getPublishTime() {
        return this.publishTime;
    }

    public int getReadNum() {
        return this.readNum;
    }

    public GroupBulletinFeedSetting getSettings() {
        return this.settings;
    }

    public int getType() {
        return this.type;
    }

    public long getUin() {
        return this.uin;
    }

    public int getVn() {
        return this.f19vn;
    }

    public String toString() {
        return "GroupBulletinFeed{uin=" + this.uin + ",feedId=" + this.feedId + ",publishTime=" + this.publishTime + ",msg=" + this.msg + ",type=" + this.type + ",fn=" + this.f18fn + ",cn=" + this.f17cn + ",vn=" + this.f19vn + ",settings=" + this.settings + ",pinned=" + this.pinned + ",readNum=" + this.readNum + ",isRead=" + this.isRead + ",isAllConfirm=" + this.isAllConfirm + ",}";
    }
}
