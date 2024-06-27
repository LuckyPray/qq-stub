package com.tencent.qqnt.kernel.nativeinterface;

import java.util.ArrayList;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/RobotRecommendCardInfo.class */
public final class RobotRecommendCardInfo {
    public String cardId = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    public String name = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    public String desc = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    public String jumpUrl = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    public ArrayList<RobotCoreInfo> robots = new ArrayList<>();
    public RobotRecommendCardInfoType type = RobotRecommendCardInfoType.values()[0];

    public String getCardId() {
        return this.cardId;
    }

    public String getDesc() {
        return this.desc;
    }

    public String getJumpUrl() {
        return this.jumpUrl;
    }

    public String getName() {
        return this.name;
    }

    public ArrayList<RobotCoreInfo> getRobots() {
        return this.robots;
    }

    public RobotRecommendCardInfoType getType() {
        return this.type;
    }

    public String toString() {
        return "RobotRecommendCardInfo{cardId=" + this.cardId + ",name=" + this.name + ",desc=" + this.desc + ",jumpUrl=" + this.jumpUrl + ",robots=" + this.robots + ",type=" + this.type + ",}";
    }
}
