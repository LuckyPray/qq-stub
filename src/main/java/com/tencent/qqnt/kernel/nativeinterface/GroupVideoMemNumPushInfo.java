package com.tencent.qqnt.kernel.nativeinterface;

import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/GroupVideoMemNumPushInfo.class */
public final class GroupVideoMemNumPushInfo {
    public int actionType;
    public int gameId;
    public long groupCode;
    public String groupVideoRoomId;
    public ArrayList<Long> memberUins;
    public int onlineCount;

    public GroupVideoMemNumPushInfo() {
        this.memberUins = new ArrayList<>();
        this.groupVideoRoomId = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    }

    public int getActionType() {
        return this.actionType;
    }

    public int getGameId() {
        return this.gameId;
    }

    public long getGroupCode() {
        return this.groupCode;
    }

    public String getGroupVideoRoomId() {
        return this.groupVideoRoomId;
    }

    public ArrayList<Long> getMemberUins() {
        return this.memberUins;
    }

    public int getOnlineCount() {
        return this.onlineCount;
    }

    public String toString() {
        return "GroupVideoMemNumPushInfo{groupCode=" + this.groupCode + ",onlineCount=" + this.onlineCount + ",actionType=" + this.actionType + ",gameId=" + this.gameId + ",memberUins=" + this.memberUins + ",groupVideoRoomId=" + this.groupVideoRoomId + ",}";
    }

    public GroupVideoMemNumPushInfo(long j, int i, int i2, int i3, ArrayList<Long> arrayList, String str) {
        this.memberUins = new ArrayList<>();
        this.groupVideoRoomId = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.groupCode = j;
        this.onlineCount = i;
        this.actionType = i2;
        this.gameId = i3;
        this.memberUins = arrayList;
        this.groupVideoRoomId = str;
    }
}
