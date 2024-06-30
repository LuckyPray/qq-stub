package com.tencent.qqnt.kernel.nativeinterface;

import com.tencent.qqnt.kernelpublic.nativeinterface.MemberRole;
import java.util.ArrayList;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/GroupDetailInfo.class */
public final class GroupDetailInfo implements IKernelModel {
    public int appealDeadline;
    public int certType;
    public int classExt;
    public int cmdUinFlagEx2;
    public int cmdUinJoinTime;
    public int cmdUinMsgSeq;
    public int cmdUinUinFlag;
    public long groupCode;
    public int groupFlag;
    public int groupFlagExt;
    public int groupFlagExt3;
    public int groupFlagExt4;
    public int groupOption;
    public int groupSecLevel;
    public int groupSecLevelInfo;
    public int groupTypeFlag;
    public int isConfGroup;
    public int isModifyConfGroupFace;
    public int isModifyConfGroupName;
    public boolean isTop;
    public int maxMemberNum;
    public int memberNum;
    public int privilegeFlag;
    public int shutUpAllTimestamp;
    public int shutUpMeTimestamp;
    public String ownerUid = "";
    public String groupName = "";
    public String fingerMemo = "";
    public String groupQuestion = "";
    public String richFingerMemo = "";
    public ArrayList<GroupTagRecord> tagRecord = new ArrayList<>();
    public String groupMemo = "";
    public GroupMsgMask cmdUinMsgMask = GroupMsgMask.values()[0];
    public MemberRole cmdUinPrivilege = MemberRole.values()[0];
    public String remarkName = "";

    public int getAppealDeadline() {
        return this.appealDeadline;
    }

    public int getCertType() {
        return this.certType;
    }

    public int getClassExt() {
        return this.classExt;
    }

    public int getCmdUinFlagEx2() {
        return this.cmdUinFlagEx2;
    }

    public int getCmdUinJoinTime() {
        return this.cmdUinJoinTime;
    }

    public GroupMsgMask getCmdUinMsgMask() {
        return this.cmdUinMsgMask;
    }

    public int getCmdUinMsgSeq() {
        return this.cmdUinMsgSeq;
    }

    public MemberRole getCmdUinPrivilege() {
        return this.cmdUinPrivilege;
    }

    public int getCmdUinUinFlag() {
        return this.cmdUinUinFlag;
    }

    public String getFingerMemo() {
        return this.fingerMemo;
    }

    public long getGroupCode() {
        return this.groupCode;
    }

    public int getGroupFlag() {
        return this.groupFlag;
    }

    public int getGroupFlagExt() {
        return this.groupFlagExt;
    }

    public int getGroupFlagExt3() {
        return this.groupFlagExt3;
    }

    public int getGroupFlagExt4() {
        return this.groupFlagExt4;
    }

    public String getGroupMemo() {
        return this.groupMemo;
    }

    public String getGroupName() {
        return this.groupName;
    }

    public int getGroupOption() {
        return this.groupOption;
    }

    public String getGroupQuestion() {
        return this.groupQuestion;
    }

    public int getGroupSecLevel() {
        return this.groupSecLevel;
    }

    public int getGroupSecLevelInfo() {
        return this.groupSecLevelInfo;
    }

    public int getGroupTypeFlag() {
        return this.groupTypeFlag;
    }

    public int getIsConfGroup() {
        return this.isConfGroup;
    }

    public int getIsModifyConfGroupFace() {
        return this.isModifyConfGroupFace;
    }

    public int getIsModifyConfGroupName() {
        return this.isModifyConfGroupName;
    }

    public boolean getIsTop() {
        return this.isTop;
    }

    public int getMaxMemberNum() {
        return this.maxMemberNum;
    }

    public int getMemberNum() {
        return this.memberNum;
    }

    public String getOwnerUid() {
        return this.ownerUid;
    }

    public int getPrivilegeFlag() {
        return this.privilegeFlag;
    }

    public String getRemarkName() {
        return this.remarkName;
    }

    public String getRichFingerMemo() {
        return this.richFingerMemo;
    }

    public int getShutUpAllTimestamp() {
        return this.shutUpAllTimestamp;
    }

    public int getShutUpMeTimestamp() {
        return this.shutUpMeTimestamp;
    }

    public ArrayList<GroupTagRecord> getTagRecord() {
        return this.tagRecord;
    }

    public void setAppealDeadline(int i) {
        this.appealDeadline = i;
    }

    public void setCertType(int i) {
        this.certType = i;
    }

    public void setClassExt(int i) {
        this.classExt = i;
    }

    public void setCmdUinFlagEx2(int i) {
        this.cmdUinFlagEx2 = i;
    }

    public void setCmdUinJoinTime(int i) {
        this.cmdUinJoinTime = i;
    }

    public void setCmdUinMsgMask(GroupMsgMask groupMsgMask) {
        this.cmdUinMsgMask = groupMsgMask;
    }

    public void setCmdUinMsgSeq(int i) {
        this.cmdUinMsgSeq = i;
    }

    public void setCmdUinPrivilege(MemberRole memberRole) {
        this.cmdUinPrivilege = memberRole;
    }

    public void setCmdUinUinFlag(int i) {
        this.cmdUinUinFlag = i;
    }

    public void setFingerMemo(String str) {
        this.fingerMemo = str;
    }

    public void setGroupCode(long j) {
        this.groupCode = j;
    }

    public void setGroupFlag(int i) {
        this.groupFlag = i;
    }

    public void setGroupFlagExt(int i) {
        this.groupFlagExt = i;
    }

    public void setGroupFlagExt3(int i) {
        this.groupFlagExt3 = i;
    }

    public void setGroupFlagExt4(int i) {
        this.groupFlagExt4 = i;
    }

    public void setGroupMemo(String str) {
        this.groupMemo = str;
    }

    public void setGroupName(String str) {
        this.groupName = str;
    }

    public void setGroupOption(int i) {
        this.groupOption = i;
    }

    public void setGroupQuestion(String str) {
        this.groupQuestion = str;
    }

    public void setGroupSecLevel(int i) {
        this.groupSecLevel = i;
    }

    public void setGroupSecLevelInfo(int i) {
        this.groupSecLevelInfo = i;
    }

    public void setGroupTypeFlag(int i) {
        this.groupTypeFlag = i;
    }

    public void setIsConfGroup(int i) {
        this.isConfGroup = i;
    }

    public void setIsModifyConfGroupFace(int i) {
        this.isModifyConfGroupFace = i;
    }

    public void setIsModifyConfGroupName(int i) {
        this.isModifyConfGroupName = i;
    }

    public void setIsTop(boolean z) {
        this.isTop = z;
    }

    public void setMaxMemberNum(int i) {
        this.maxMemberNum = i;
    }

    public void setMemberNum(int i) {
        this.memberNum = i;
    }

    public void setOwnerUid(String str) {
        this.ownerUid = str;
    }

    public void setPrivilegeFlag(int i) {
        this.privilegeFlag = i;
    }

    public void setRemarkName(String str) {
        this.remarkName = str;
    }

    public void setRichFingerMemo(String str) {
        this.richFingerMemo = str;
    }

    public void setShutUpAllTimestamp(int i) {
        this.shutUpAllTimestamp = i;
    }

    public void setShutUpMeTimestamp(int i) {
        this.shutUpMeTimestamp = i;
    }

    public void setTagRecord(ArrayList<GroupTagRecord> arrayList) {
        this.tagRecord = arrayList;
    }

    public String toString() {
        return "GroupDetailInfo{groupCode=" + this.groupCode + ",ownerUid=" + this.ownerUid + ",groupFlag=" + this.groupFlag + ",groupFlagExt=" + this.groupFlagExt + ",maxMemberNum=" + this.maxMemberNum + ",memberNum=" + this.memberNum + ",groupOption=" + this.groupOption + ",classExt=" + this.classExt + ",groupName=" + this.groupName + ",fingerMemo=" + this.fingerMemo + ",groupQuestion=" + this.groupQuestion + ",certType=" + this.certType + ",richFingerMemo=" + this.richFingerMemo + ",tagRecord=" + this.tagRecord + ",shutUpAllTimestamp=" + this.shutUpAllTimestamp + ",shutUpMeTimestamp=" + this.shutUpMeTimestamp + ",groupTypeFlag=" + this.groupTypeFlag + ",privilegeFlag=" + this.privilegeFlag + ",groupSecLevel=" + this.groupSecLevel + ",groupFlagExt3=" + this.groupFlagExt3 + ",isConfGroup=" + this.isConfGroup + ",isModifyConfGroupFace=" + this.isModifyConfGroupFace + ",isModifyConfGroupName=" + this.isModifyConfGroupName + ",groupFlagExt4=" + this.groupFlagExt4 + ",groupMemo=" + this.groupMemo + ",cmdUinMsgSeq=" + this.cmdUinMsgSeq + ",cmdUinJoinTime=" + this.cmdUinJoinTime + ",cmdUinUinFlag=" + this.cmdUinUinFlag + ",cmdUinMsgMask=" + this.cmdUinMsgMask + ",groupSecLevelInfo=" + this.groupSecLevelInfo + ",cmdUinPrivilege=" + this.cmdUinPrivilege + ",cmdUinFlagEx2=" + this.cmdUinFlagEx2 + ",appealDeadline=" + this.appealDeadline + ",remarkName=" + this.remarkName + ",isTop=" + this.isTop + ",}";
    }
}
