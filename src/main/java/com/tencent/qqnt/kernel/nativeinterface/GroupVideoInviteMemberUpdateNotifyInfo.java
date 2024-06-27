package com.tencent.qqnt.kernel.nativeinterface;

import java.util.ArrayList;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/GroupVideoInviteMemberUpdateNotifyInfo.class */
public final class GroupVideoInviteMemberUpdateNotifyInfo {
    public int eventType;
    public long groupId;
    public ArrayList<AVGroupAudioMemberModel> join;
    public ArrayList<AVGroupAudioMemberModel> quit;
    public long roomId;
    public long seq;
    public long totalInvitedMembers;

    public GroupVideoInviteMemberUpdateNotifyInfo() {
        this.join = new ArrayList<>();
        this.quit = new ArrayList<>();
    }

    public int getEventType() {
        return this.eventType;
    }

    public long getGroupId() {
        return this.groupId;
    }

    public ArrayList<AVGroupAudioMemberModel> getJoin() {
        return this.join;
    }

    public ArrayList<AVGroupAudioMemberModel> getQuit() {
        return this.quit;
    }

    public long getRoomId() {
        return this.roomId;
    }

    public long getSeq() {
        return this.seq;
    }

    public long getTotalInvitedMembers() {
        return this.totalInvitedMembers;
    }

    public String toString() {
        return "GroupVideoInviteMemberUpdateNotifyInfo{join=" + this.join + ",quit=" + this.quit + ",groupId=" + this.groupId + ",roomId=" + this.roomId + ",totalInvitedMembers=" + this.totalInvitedMembers + ",seq=" + this.seq + ",eventType=" + this.eventType + ",}";
    }

    public GroupVideoInviteMemberUpdateNotifyInfo(ArrayList<AVGroupAudioMemberModel> arrayList, ArrayList<AVGroupAudioMemberModel> arrayList2, long j, long j2, long j3, long j4, int i) {
        this.join = new ArrayList<>();
        this.quit = new ArrayList<>();
        this.join = arrayList;
        this.quit = arrayList2;
        this.groupId = j;
        this.roomId = j2;
        this.totalInvitedMembers = j3;
        this.seq = j4;
        this.eventType = i;
    }
}
