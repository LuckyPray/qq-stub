package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/GroupExt.class */
public final class GroupExt {
    public long bindGuildId;
    public int blacklistExpireTime;
    public int companyId;
    public int essentialMsgPrivilege;
    public int essentialMsgSwitch;
    public long groupAIOBindGuildId;
    public int groupBindGuildSwitch;
    public int groupInfoExtSeq;
    public int hasGroupCustomPortrait;
    public int inviteRobotSwitch;
    public int isLimitGroupRtc;
    public int lightCharNum;
    public long luckyWordId;
    public long msgEventSeq;
    public int starId;
    public int todoSeq;
    public String luckyWord = "";
    public MemberID groupOwnerId = new MemberID();

    public long getBindGuildId() {
        return this.bindGuildId;
    }

    public int getBlacklistExpireTime() {
        return this.blacklistExpireTime;
    }

    public int getCompanyId() {
        return this.companyId;
    }

    public int getEssentialMsgPrivilege() {
        return this.essentialMsgPrivilege;
    }

    public int getEssentialMsgSwitch() {
        return this.essentialMsgSwitch;
    }

    public long getGroupAIOBindGuildId() {
        return this.groupAIOBindGuildId;
    }

    public int getGroupBindGuildSwitch() {
        return this.groupBindGuildSwitch;
    }

    public int getGroupInfoExtSeq() {
        return this.groupInfoExtSeq;
    }

    public MemberID getGroupOwnerId() {
        return this.groupOwnerId;
    }

    public int getHasGroupCustomPortrait() {
        return this.hasGroupCustomPortrait;
    }

    public int getInviteRobotSwitch() {
        return this.inviteRobotSwitch;
    }

    public int getIsLimitGroupRtc() {
        return this.isLimitGroupRtc;
    }

    public int getLightCharNum() {
        return this.lightCharNum;
    }

    public String getLuckyWord() {
        return this.luckyWord;
    }

    public long getLuckyWordId() {
        return this.luckyWordId;
    }

    public long getMsgEventSeq() {
        return this.msgEventSeq;
    }

    public int getStarId() {
        return this.starId;
    }

    public int getTodoSeq() {
        return this.todoSeq;
    }

    public String toString() {
        return "GroupExt{groupInfoExtSeq=" + this.groupInfoExtSeq + ",luckyWordId=" + this.luckyWordId + ",lightCharNum=" + this.lightCharNum + ",luckyWord=" + this.luckyWord + ",starId=" + this.starId + ",essentialMsgSwitch=" + this.essentialMsgSwitch + ",todoSeq=" + this.todoSeq + ",blacklistExpireTime=" + this.blacklistExpireTime + ",isLimitGroupRtc=" + this.isLimitGroupRtc + ",companyId=" + this.companyId + ",hasGroupCustomPortrait=" + this.hasGroupCustomPortrait + ",bindGuildId=" + this.bindGuildId + ",groupOwnerId=" + this.groupOwnerId + ",essentialMsgPrivilege=" + this.essentialMsgPrivilege + ",msgEventSeq=" + this.msgEventSeq + ",inviteRobotSwitch=" + this.inviteRobotSwitch + ",groupBindGuildSwitch=" + this.groupBindGuildSwitch + ",groupAIOBindGuildId=" + this.groupAIOBindGuildId + ",}";
    }
}
