package com.tencent.qqnt.kernel.nativeinterface;

import java.util.ArrayList;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/RobotCoreInfo.class */
public final class RobotCoreInfo {
    public boolean allowAddGroup;
    public boolean ban;
    public long friendUV;
    public long hotNumber;
    public int offline;
    public long robotUin;
    public int serialNumber;
    public int testStatus;
    public long tinyId;
    public String name = "";
    public String robotAvatar = "";
    public String desc = "";
    public ArrayList<RobotCoreFeature> features = new ArrayList<>();
    public ArrayList<String> tags = new ArrayList<>();
    public String uid = "";
    public String creatorName = "";
    public String creatorUid = "";
    public String bgDay = "";
    public String bgNight = "";
    public RobotBaseBizType bizType = RobotBaseBizType.values()[0];
    public String robotTag = "";
    public ProfileSimpleInfo baseSimpleProfile = new ProfileSimpleInfo();

    public boolean getAllowAddGroup() {
        return this.allowAddGroup;
    }

    public boolean getBan() {
        return this.ban;
    }

    public ProfileSimpleInfo getBaseSimpleProfile() {
        return this.baseSimpleProfile;
    }

    public String getBgDay() {
        return this.bgDay;
    }

    public String getBgNight() {
        return this.bgNight;
    }

    public RobotBaseBizType getBizType() {
        return this.bizType;
    }

    public String getCreatorName() {
        return this.creatorName;
    }

    public String getCreatorUid() {
        return this.creatorUid;
    }

    public String getDesc() {
        return this.desc;
    }

    public ArrayList<RobotCoreFeature> getFeatures() {
        return this.features;
    }

    public long getFriendUV() {
        return this.friendUV;
    }

    public long getHotNumber() {
        return this.hotNumber;
    }

    public String getName() {
        return this.name;
    }

    public int getOffline() {
        return this.offline;
    }

    public String getRobotAvatar() {
        return this.robotAvatar;
    }

    public String getRobotTag() {
        return this.robotTag;
    }

    public long getRobotUin() {
        return this.robotUin;
    }

    public int getSerialNumber() {
        return this.serialNumber;
    }

    public ArrayList<String> getTags() {
        return this.tags;
    }

    public int getTestStatus() {
        return this.testStatus;
    }

    public long getTinyId() {
        return this.tinyId;
    }

    public String getUid() {
        return this.uid;
    }

    public String toString() {
        return "RobotCoreInfo{robotUin=" + this.robotUin + ",name=" + this.name + ",robotAvatar=" + this.robotAvatar + ",desc=" + this.desc + ",offline=" + this.offline + ",features=" + this.features + ",testStatus=" + this.testStatus + ",tinyId=" + this.tinyId + ",ban=" + this.ban + ",allowAddGroup=" + this.allowAddGroup + ",tags=" + this.tags + ",uid=" + this.uid + ",creatorName=" + this.creatorName + ",creatorUid=" + this.creatorUid + ",bgDay=" + this.bgDay + ",bgNight=" + this.bgNight + ",bizType=" + this.bizType + ",serialNumber=" + this.serialNumber + ",hotNumber=" + this.hotNumber + ",friendUV=" + this.friendUV + ",robotTag=" + this.robotTag + ",baseSimpleProfile=" + this.baseSimpleProfile + ",}";
    }
}
