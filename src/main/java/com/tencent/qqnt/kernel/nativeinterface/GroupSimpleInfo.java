package com.tencent.qqnt.kernel.nativeinterface;

import com.tencent.qqnt.kernelpublic.nativeinterface.MemberRole;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/GroupSimpleInfo.class */
public final class GroupSimpleInfo implements IKernelModel {
    public int authGroupType;
    public long createTime;
    public int discussToGroupMaxMsgSeq;
    public int discussToGroupTime;
    public long discussToGroupUin;
    public long groupCode;
    public int groupCreditLevel;
    public int groupFlagExt;
    public int groupFlagExt3;
    public long groupShutupExpireTime;
    public boolean hasMemo;
    public boolean hasModifyConfGroupFace;
    public boolean hasModifyConfGroupName;
    public boolean isConf;
    public boolean isTop;
    public int maxMember;
    public int memberCount;
    public long personShutupExpireTime;
    public int privilegeFlag;
    public long toppedTimestamp;
    public String groupName = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    public GroupStatus groupStatus = GroupStatus.values()[0];
    public MemberRole memberRole = MemberRole.values()[0];
    public String remarkName = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    public MemberID groupOwnerId = new MemberID();

    public int getAuthGroupType() {
        return this.authGroupType;
    }

    public long getCreateTime() {
        return this.createTime;
    }

    public int getDiscussToGroupMaxMsgSeq() {
        return this.discussToGroupMaxMsgSeq;
    }

    public int getDiscussToGroupTime() {
        return this.discussToGroupTime;
    }

    public long getDiscussToGroupUin() {
        return this.discussToGroupUin;
    }

    public long getGroupCode() {
        return this.groupCode;
    }

    public int getGroupCreditLevel() {
        return this.groupCreditLevel;
    }

    public int getGroupFlagExt() {
        return this.groupFlagExt;
    }

    public int getGroupFlagExt3() {
        return this.groupFlagExt3;
    }

    public String getGroupName() {
        return this.groupName;
    }

    public MemberID getGroupOwnerId() {
        return this.groupOwnerId;
    }

    public long getGroupShutupExpireTime() {
        return this.groupShutupExpireTime;
    }

    public GroupStatus getGroupStatus() {
        return this.groupStatus;
    }

    public boolean getHasMemo() {
        return this.hasMemo;
    }

    public boolean getHasModifyConfGroupFace() {
        return this.hasModifyConfGroupFace;
    }

    public boolean getHasModifyConfGroupName() {
        return this.hasModifyConfGroupName;
    }

    public boolean getIsConf() {
        return this.isConf;
    }

    public boolean getIsTop() {
        return this.isTop;
    }

    public int getMaxMember() {
        return this.maxMember;
    }

    public int getMemberCount() {
        return this.memberCount;
    }

    public MemberRole getMemberRole() {
        return this.memberRole;
    }

    public long getPersonShutupExpireTime() {
        return this.personShutupExpireTime;
    }

    public int getPrivilegeFlag() {
        return this.privilegeFlag;
    }

    public String getRemarkName() {
        return this.remarkName;
    }

    public long getToppedTimestamp() {
        return this.toppedTimestamp;
    }

    public void setAuthGroupType(int i) {
        this.authGroupType = i;
    }

    public void setCreateTime(long j) {
        this.createTime = j;
    }

    public void setDiscussToGroupMaxMsgSeq(int i) {
        this.discussToGroupMaxMsgSeq = i;
    }

    public void setDiscussToGroupTime(int i) {
        this.discussToGroupTime = i;
    }

    public void setDiscussToGroupUin(long j) {
        this.discussToGroupUin = j;
    }

    public void setGroupCode(long j) {
        this.groupCode = j;
    }

    public void setGroupCreditLevel(int i) {
        this.groupCreditLevel = i;
    }

    public void setGroupFlagExt(int i) {
        this.groupFlagExt = i;
    }

    public void setGroupFlagExt3(int i) {
        this.groupFlagExt3 = i;
    }

    public void setGroupName(String str) {
        this.groupName = str;
    }

    public void setGroupOwnerId(MemberID memberID) {
        this.groupOwnerId = memberID;
    }

    public void setGroupShutupExpireTime(long j) {
        this.groupShutupExpireTime = j;
    }

    public void setGroupStatus(GroupStatus groupStatus) {
        this.groupStatus = groupStatus;
    }

    public void setHasMemo(boolean z) {
        this.hasMemo = z;
    }

    public void setHasModifyConfGroupFace(boolean z) {
        this.hasModifyConfGroupFace = z;
    }

    public void setHasModifyConfGroupName(boolean z) {
        this.hasModifyConfGroupName = z;
    }

    public void setIsConf(boolean z) {
        this.isConf = z;
    }

    public void setIsTop(boolean z) {
        this.isTop = z;
    }

    public void setMaxMember(int i) {
        this.maxMember = i;
    }

    public void setMemberCount(int i) {
        this.memberCount = i;
    }

    public void setMemberRole(MemberRole memberRole) {
        this.memberRole = memberRole;
    }

    public void setPersonShutupExpireTime(long j) {
        this.personShutupExpireTime = j;
    }

    public void setPrivilegeFlag(int i) {
        this.privilegeFlag = i;
    }

    public void setRemarkName(String str) {
        this.remarkName = str;
    }

    public void setToppedTimestamp(long j) {
        this.toppedTimestamp = j;
    }

    public String toString() {
        return "GroupSimpleInfo{groupCode=" + this.groupCode + ",createTime=" + this.createTime + ",maxMember=" + this.maxMember + ",memberCount=" + this.memberCount + ",groupName=" + this.groupName + ",groupStatus=" + this.groupStatus + ",memberRole=" + this.memberRole + ",isTop=" + this.isTop + ",toppedTimestamp=" + this.toppedTimestamp + ",privilegeFlag=" + this.privilegeFlag + ",isConf=" + this.isConf + ",hasModifyConfGroupFace=" + this.hasModifyConfGroupFace + ",hasModifyConfGroupName=" + this.hasModifyConfGroupName + ",remarkName=" + this.remarkName + ",hasMemo=" + this.hasMemo + ",groupShutupExpireTime=" + this.groupShutupExpireTime + ",personShutupExpireTime=" + this.personShutupExpireTime + ",discussToGroupUin=" + this.discussToGroupUin + ",discussToGroupMaxMsgSeq=" + this.discussToGroupMaxMsgSeq + ",discussToGroupTime=" + this.discussToGroupTime + ",groupFlagExt=" + this.groupFlagExt + ",authGroupType=" + this.authGroupType + ",groupCreditLevel=" + this.groupCreditLevel + ",groupFlagExt3=" + this.groupFlagExt3 + ",groupOwnerId=" + this.groupOwnerId + ",}";
    }
}
