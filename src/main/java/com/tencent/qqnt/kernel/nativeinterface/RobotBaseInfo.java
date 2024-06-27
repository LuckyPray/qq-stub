package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/RobotBaseInfo.class */
public final class RobotBaseInfo {
    public boolean allowedAddC2C;
    public boolean allowedAddGroup;
    public long apiMark;
    public long appid;
    public int enabledGroups;
    public int joinTime;
    public long miniAppIds;
    public int offline;
    public int order;
    public int robotBizType;
    public int robotType;
    public long robotUin;
    public int status;
    public String name = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    public String desc = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    public String robotAvatar = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    public String welcomeMsg = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    public String callName = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    public String verify = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    public String fallback = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    public String extraInfo = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    public String robotUid = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    public String ownerEntity = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    public RobtoCreateInfo createInfo = new RobtoCreateInfo();
    public RobotStatus robotStatus = RobotStatus.values()[0];

    public boolean getAllowedAddC2C() {
        return this.allowedAddC2C;
    }

    public boolean getAllowedAddGroup() {
        return this.allowedAddGroup;
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

    public RobtoCreateInfo getCreateInfo() {
        return this.createInfo;
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

    public String getFallback() {
        return this.fallback;
    }

    public int getJoinTime() {
        return this.joinTime;
    }

    public long getMiniAppIds() {
        return this.miniAppIds;
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

    public String getOwnerEntity() {
        return this.ownerEntity;
    }

    public String getRobotAvatar() {
        return this.robotAvatar;
    }

    public int getRobotBizType() {
        return this.robotBizType;
    }

    public RobotStatus getRobotStatus() {
        return this.robotStatus;
    }

    public int getRobotType() {
        return this.robotType;
    }

    public String getRobotUid() {
        return this.robotUid;
    }

    public long getRobotUin() {
        return this.robotUin;
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

    public String toString() {
        return "RobotBaseInfo{robotUin=" + this.robotUin + ",name=" + this.name + ",status=" + this.status + ",desc=" + this.desc + ",robotAvatar=" + this.robotAvatar + ",enabledGroups=" + this.enabledGroups + ",welcomeMsg=" + this.welcomeMsg + ",callName=" + this.callName + ",allowedAddGroup=" + this.allowedAddGroup + ",offline=" + this.offline + ",verify=" + this.verify + ",fallback=" + this.fallback + ",joinTime=" + this.joinTime + ",order=" + this.order + ",appid=" + this.appid + ",apiMark=" + this.apiMark + ",miniAppIds=" + this.miniAppIds + ",robotType=" + this.robotType + ",extraInfo=" + this.extraInfo + ",allowedAddC2C=" + this.allowedAddC2C + ",robotUid=" + this.robotUid + ",ownerEntity=" + this.ownerEntity + ",robotBizType=" + this.robotBizType + ",createInfo=" + this.createInfo + ",robotStatus=" + this.robotStatus + ",}";
    }
}
