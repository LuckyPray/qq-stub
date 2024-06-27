package com.tencent.qqnt.kernel.nativeinterface;

/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/GProGuildRobotPlusPanelFeature.class */
public final class GProGuildRobotPlusPanelFeature {
    public GProGuildPlusPanelRobotInfo botInfo;
    public GProGuildRobotPlusPanelFeatureInfo commandInfo;
    public String elementId;
    public String icon;
    public GProGuildRobotPlusPanelFeatureInfo serviceInfo;
    public String serviceName;

    public GProGuildRobotPlusPanelFeature() {
        this.botInfo = new GProGuildPlusPanelRobotInfo();
        this.serviceInfo = new GProGuildRobotPlusPanelFeatureInfo();
        this.commandInfo = new GProGuildRobotPlusPanelFeatureInfo();
        this.icon = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.serviceName = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.elementId = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    }

    public GProGuildPlusPanelRobotInfo getBotInfo() {
        return this.botInfo;
    }

    public GProGuildRobotPlusPanelFeatureInfo getCommandInfo() {
        return this.commandInfo;
    }

    public String getElementId() {
        return this.elementId;
    }

    public String getIcon() {
        return this.icon;
    }

    public GProGuildRobotPlusPanelFeatureInfo getServiceInfo() {
        return this.serviceInfo;
    }

    public String getServiceName() {
        return this.serviceName;
    }

    public String toString() {
        return "GProGuildRobotPlusPanelFeature{botInfo=" + this.botInfo + ",serviceInfo=" + this.serviceInfo + ",commandInfo=" + this.commandInfo + ",icon=" + this.icon + ",serviceName=" + this.serviceName + ",elementId=" + this.elementId + ",}";
    }

    public GProGuildRobotPlusPanelFeature(GProGuildPlusPanelRobotInfo gProGuildPlusPanelRobotInfo, GProGuildRobotPlusPanelFeatureInfo gProGuildRobotPlusPanelFeatureInfo, GProGuildRobotPlusPanelFeatureInfo gProGuildRobotPlusPanelFeatureInfo2, String str, String str2, String str3) {
        this.botInfo = new GProGuildPlusPanelRobotInfo();
        this.serviceInfo = new GProGuildRobotPlusPanelFeatureInfo();
        this.commandInfo = new GProGuildRobotPlusPanelFeatureInfo();
        this.icon = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.serviceName = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.elementId = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.botInfo = gProGuildPlusPanelRobotInfo;
        this.serviceInfo = gProGuildRobotPlusPanelFeatureInfo;
        this.commandInfo = gProGuildRobotPlusPanelFeatureInfo2;
        this.icon = str;
        this.serviceName = str2;
        this.elementId = str3;
    }
}
