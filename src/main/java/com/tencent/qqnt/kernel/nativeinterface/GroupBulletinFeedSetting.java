package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/GroupBulletinFeedSetting.class */
public final class GroupBulletinFeedSetting {
    public int confirmRequired;
    public int isShowEditCard;
    public int remindTs;
    public int tipWindowType;

    public int getConfirmRequired() {
        return this.confirmRequired;
    }

    public int getIsShowEditCard() {
        return this.isShowEditCard;
    }

    public int getRemindTs() {
        return this.remindTs;
    }

    public int getTipWindowType() {
        return this.tipWindowType;
    }

    public String toString() {
        return "GroupBulletinFeedSetting{isShowEditCard=" + this.isShowEditCard + ",remindTs=" + this.remindTs + ",tipWindowType=" + this.tipWindowType + ",confirmRequired=" + this.confirmRequired + ",}";
    }
}
