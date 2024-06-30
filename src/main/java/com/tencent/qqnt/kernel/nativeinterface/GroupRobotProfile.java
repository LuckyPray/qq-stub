package com.tencent.qqnt.kernel.nativeinterface;

import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/GroupRobotProfile.class */
public final class GroupRobotProfile {
    public boolean canResetHistory;
    public boolean isFriend;
    public boolean isGroupReceive;
    public boolean isReceive;
    public int robotMembership;
    public int subscribeMsgTplCnt;
    public int userMembership;
    public RobotBaseInfo robotData = new RobotBaseInfo();
    public ArrayList<RobotUsingLabel> usingLabels = new ArrayList<>();
    public ArrayList<RobotPanelInfo> panels = new ArrayList<>();
    public ArrayList<RobotFeatureInfo> commands = new ArrayList<>();
    public ArrayList<ImageInfo> previewImages = new ArrayList<>();
    public String jumpUrl = "";
    public String panelTitle = "";
    public String previewImagesTitle = "";
    public GroupTraceInfo traceInfo = new GroupTraceInfo();
    public String c2cDayBackground = "";
    public String c2cNightBackground = "";
    public byte[] promptMsg = new byte[0];
    public GroupRobotQzoneInfo qzoneInfo = new GroupRobotQzoneInfo();
    public RobotTTSList ttsList = new RobotTTSList();
    public InputBox inputBox = new InputBox();

    public String getC2cDayBackground() {
        return this.c2cDayBackground;
    }

    public String getC2cNightBackground() {
        return this.c2cNightBackground;
    }

    public boolean getCanResetHistory() {
        return this.canResetHistory;
    }

    public ArrayList<RobotFeatureInfo> getCommands() {
        return this.commands;
    }

    public InputBox getInputBox() {
        return this.inputBox;
    }

    public boolean getIsFriend() {
        return this.isFriend;
    }

    public boolean getIsGroupReceive() {
        return this.isGroupReceive;
    }

    public boolean getIsReceive() {
        return this.isReceive;
    }

    public String getJumpUrl() {
        return this.jumpUrl;
    }

    public String getPanelTitle() {
        return this.panelTitle;
    }

    public ArrayList<RobotPanelInfo> getPanels() {
        return this.panels;
    }

    public ArrayList<ImageInfo> getPreviewImages() {
        return this.previewImages;
    }

    public String getPreviewImagesTitle() {
        return this.previewImagesTitle;
    }

    public byte[] getPromptMsg() {
        return this.promptMsg;
    }

    public GroupRobotQzoneInfo getQzoneInfo() {
        return this.qzoneInfo;
    }

    public RobotBaseInfo getRobotData() {
        return this.robotData;
    }

    public int getRobotMembership() {
        return this.robotMembership;
    }

    public int getSubscribeMsgTplCnt() {
        return this.subscribeMsgTplCnt;
    }

    public GroupTraceInfo getTraceInfo() {
        return this.traceInfo;
    }

    public RobotTTSList getTtsList() {
        return this.ttsList;
    }

    public int getUserMembership() {
        return this.userMembership;
    }

    public ArrayList<RobotUsingLabel> getUsingLabels() {
        return this.usingLabels;
    }

    public String toString() {
        return "GroupRobotProfile{robotData=" + this.robotData + ",userMembership=" + this.userMembership + ",robotMembership=" + this.robotMembership + ",isFriend=" + this.isFriend + ",usingLabels=" + this.usingLabels + ",panels=" + this.panels + ",commands=" + this.commands + ",previewImages=" + this.previewImages + ",isReceive=" + this.isReceive + ",canResetHistory=" + this.canResetHistory + ",isGroupReceive=" + this.isGroupReceive + ",jumpUrl=" + this.jumpUrl + ",subscribeMsgTplCnt=" + this.subscribeMsgTplCnt + ",panelTitle=" + this.panelTitle + ",previewImagesTitle=" + this.previewImagesTitle + ",traceInfo=" + this.traceInfo + ",c2cDayBackground=" + this.c2cDayBackground + ",c2cNightBackground=" + this.c2cNightBackground + ",promptMsg=" + this.promptMsg + ",qzoneInfo=" + this.qzoneInfo + ",ttsList=" + this.ttsList + ",inputBox=" + this.inputBox + ",}";
    }
}
