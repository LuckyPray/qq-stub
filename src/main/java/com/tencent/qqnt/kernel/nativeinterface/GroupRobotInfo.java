package com.tencent.qqnt.kernel.nativeinterface;

import java.util.ArrayList;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/GroupRobotInfo.class */
public final class GroupRobotInfo {
    public long apiMark;
    public long appid;
    public String callName;
    public String desc;
    public int enabledGroups;
    public String extraInfo;
    public ArrayList<String> fallbackList;
    public int joinTime;
    public ArrayList<Long> miniappIds;
    public String name;
    public int offline;
    public int order;
    public int robotType;
    public long robotUin;
    public int showAddFriend;
    public int showInvite;
    public int status;
    public String verify;
    public String welcomeMsg;

    public GroupRobotInfo() {
        this.name = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.desc = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.welcomeMsg = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.callName = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.verify = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.fallbackList = new ArrayList<>();
        this.miniappIds = new ArrayList<>();
        this.extraInfo = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    }

    public long getApiMark() {
        return this.apiMark;
    }

    public long getAppid() {
        return this.appid;
    }

    public String getCallName() {
        return this.callName;
    }

    public String getDesc() {
        return this.desc;
    }

    public int getEnabledGroups() {
        return this.enabledGroups;
    }

    public String getExtraInfo() {
        return this.extraInfo;
    }

    public ArrayList<String> getFallbackList() {
        return this.fallbackList;
    }

    public int getJoinTime() {
        return this.joinTime;
    }

    public ArrayList<Long> getMiniappIds() {
        return this.miniappIds;
    }

    public String getName() {
        return this.name;
    }

    public int getOffline() {
        return this.offline;
    }

    public int getOrder() {
        return this.order;
    }

    public int getRobotType() {
        return this.robotType;
    }

    public long getRobotUin() {
        return this.robotUin;
    }

    public int getShowAddFriend() {
        return this.showAddFriend;
    }

    public int getShowInvite() {
        return this.showInvite;
    }

    public int getStatus() {
        return this.status;
    }

    public String getVerify() {
        return this.verify;
    }

    public String getWelcomeMsg() {
        return this.welcomeMsg;
    }

    public void setApiMark(long j) {
        this.apiMark = j;
    }

    public void setAppid(long j) {
        this.appid = j;
    }

    public void setCallName(String str) {
        this.callName = str;
    }

    public void setDesc(String str) {
        this.desc = str;
    }

    public void setEnabledGroups(int i) {
        this.enabledGroups = i;
    }

    public void setExtraInfo(String str) {
        this.extraInfo = str;
    }

    public void setFallbackList(ArrayList<String> arrayList) {
        this.fallbackList = arrayList;
    }

    public void setJoinTime(int i) {
        this.joinTime = i;
    }

    public void setMiniappIds(ArrayList<Long> arrayList) {
        this.miniappIds = arrayList;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setOffline(int i) {
        this.offline = i;
    }

    public void setOrder(int i) {
        this.order = i;
    }

    public void setRobotType(int i) {
        this.robotType = i;
    }

    public void setRobotUin(long j) {
        this.robotUin = j;
    }

    public void setShowAddFriend(int i) {
        this.showAddFriend = i;
    }

    public void setShowInvite(int i) {
        this.showInvite = i;
    }

    public void setStatus(int i) {
        this.status = i;
    }

    public void setVerify(String str) {
        this.verify = str;
    }

    public void setWelcomeMsg(String str) {
        this.welcomeMsg = str;
    }

    public String toString() {
        return "GroupRobotInfo{robotUin=" + this.robotUin + ",name=" + this.name + ",status=" + this.status + ",desc=" + this.desc + ",enabledGroups=" + this.enabledGroups + ",welcomeMsg=" + this.welcomeMsg + ",callName=" + this.callName + ",showInvite=" + this.showInvite + ",offline=" + this.offline + ",verify=" + this.verify + ",fallbackList=" + this.fallbackList + ",joinTime=" + this.joinTime + ",order=" + this.order + ",appid=" + this.appid + ",apiMark=" + this.apiMark + ",miniappIds=" + this.miniappIds + ",robotType=" + this.robotType + ",extraInfo=" + this.extraInfo + ",showAddFriend=" + this.showAddFriend + ",}";
    }

    public GroupRobotInfo(long j, String str, int i, String str2, int i2, String str3, String str4, int i3, int i4, String str5, ArrayList<String> arrayList, int i5, int i6, long j2, long j3, ArrayList<Long> arrayList2, int i7, String str6, int i8) {
        this.name = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.desc = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.welcomeMsg = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.callName = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.verify = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.fallbackList = new ArrayList<>();
        this.miniappIds = new ArrayList<>();
        this.extraInfo = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.robotUin = j;
        this.name = str;
        this.status = i;
        this.desc = str2;
        this.enabledGroups = i2;
        this.welcomeMsg = str3;
        this.callName = str4;
        this.showInvite = i3;
        this.offline = i4;
        this.verify = str5;
        this.fallbackList = arrayList;
        this.joinTime = i5;
        this.order = i6;
        this.appid = j2;
        this.apiMark = j3;
        this.miniappIds = arrayList2;
        this.robotType = i7;
        this.extraInfo = str6;
        this.showAddFriend = i8;
    }
}
