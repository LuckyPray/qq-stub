package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;
import java.io.Serializable;
import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProChannel.class */
public final class GProChannel implements Serializable {
    static IPatchRedirector $redirector_;
    public GProApplicationChannelInfo applicationInfo;
    public ArrayList<GProAuthControlStatus> authControlStatusList;
    public int bannedSpeak;
    public int calcMsgNotifyType;
    public GProCmd0xf55CategoryInfo categoryInfo;
    public long channelChangeSeq;
    public long channelId;
    public String channelName;
    public int channelType;
    public long createTime;
    public long creatorTinyid;
    public GProForumChannelInfo forumChannelInfo;
    public long gotoChannelId;
    public long guildId;
    public boolean hasCustomMsgNotifyType;
    public int hiddenPostChannel;
    public String iconUrl;
    public int isCategoryAdmin;
    public int isChannelAdmin;
    public GProMsgSeq lastCntMsgSeq;
    public GProMsgSeq lastMsgSeq;
    public GProLiveChannelInfo liveChannelInfo;
    public int livePermission;
    public long maxEventSeq;
    public GProChannelMedalInfo medalInfo;
    public String msgMeta;
    public int msgNotifyType;
    public int myMsgNotifyType;
    public GProQqMsgListSetting myQqMsgListSetting;
    public GProMsgSeq myReadCntSeq;
    public GProMsgSeq myReadMsgSeq;
    public int mySpeakPermissionType;
    public String operationTitle;
    public int operationType;
    public int privateType;
    public String readMsgMeta;
    public int result;
    long serialVersionUID;
    public ArrayList<GProSlowModeInfo> slowModeInfoList;
    public int slowModeKey;
    public int speakPermission;
    public ArrayList<Integer> specialTypeList;
    public int switchJumpChannelId;
    public GProTextChannelInfo textChannelInfo;
    public GProTopMsg topMsg;
    public ArrayList<GProTopMsg> topMsgList;
    public int visibleType;
    public GProVoiceChannelInfo voiceChannelInfo;

    public GProChannel() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.serialVersionUID = 1L;
        this.channelName = "";
        this.lastMsgSeq = new GProMsgSeq();
        this.lastCntMsgSeq = new GProMsgSeq();
        this.myReadMsgSeq = new GProMsgSeq();
        this.myReadCntSeq = new GProMsgSeq();
        this.voiceChannelInfo = new GProVoiceChannelInfo();
        this.msgMeta = "";
        this.readMsgMeta = "";
        this.liveChannelInfo = new GProLiveChannelInfo();
        this.specialTypeList = new ArrayList<>();
        this.applicationInfo = new GProApplicationChannelInfo();
        this.topMsg = new GProTopMsg();
        this.slowModeInfoList = new ArrayList<>();
        this.textChannelInfo = new GProTextChannelInfo();
        this.forumChannelInfo = new GProForumChannelInfo();
        this.topMsgList = new ArrayList<>();
        this.myQqMsgListSetting = new GProQqMsgListSetting();
        this.authControlStatusList = new ArrayList<>();
        this.medalInfo = new GProChannelMedalInfo();
        this.iconUrl = "";
        this.operationTitle = "";
        this.categoryInfo = new GProCmd0xf55CategoryInfo();
    }

    public GProApplicationChannelInfo getApplicationInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 25)) ? this.applicationInfo : (GProApplicationChannelInfo) iPatchRedirector.redirect((short) 25, this);
    }

    public ArrayList<GProAuthControlStatus> getAuthControlStatusList() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 37)) ? this.authControlStatusList : (ArrayList) iPatchRedirector.redirect((short) 37, this);
    }

    public int getBannedSpeak() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 21)) ? this.bannedSpeak : ((Integer) iPatchRedirector.redirect((short) 21, this)).intValue();
    }

    public int getCalcMsgNotifyType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 24)) ? this.calcMsgNotifyType : ((Integer) iPatchRedirector.redirect((short) 24, this)).intValue();
    }

    public GProCmd0xf55CategoryInfo getCategoryInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 49)) ? this.categoryInfo : (GProCmd0xf55CategoryInfo) iPatchRedirector.redirect((short) 49, this);
    }

    public long getChannelChangeSeq() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 47)) ? this.channelChangeSeq : ((Long) iPatchRedirector.redirect((short) 47, this)).longValue();
    }

    public long getChannelId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.channelId : ((Long) iPatchRedirector.redirect((short) 3, this)).longValue();
    }

    public String getChannelName() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.channelName : (String) iPatchRedirector.redirect((short) 4, this);
    }

    public int getChannelType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) ? this.channelType : ((Integer) iPatchRedirector.redirect((short) 8, this)).intValue();
    }

    public long getCreateTime() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.createTime : ((Long) iPatchRedirector.redirect((short) 5, this)).longValue();
    }

    public long getCreatorTinyid() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 16)) ? this.creatorTinyid : ((Long) iPatchRedirector.redirect((short) 16, this)).longValue();
    }

    public GProForumChannelInfo getForumChannelInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 30)) ? this.forumChannelInfo : (GProForumChannelInfo) iPatchRedirector.redirect((short) 30, this);
    }

    public long getGotoChannelId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 38)) ? this.gotoChannelId : ((Long) iPatchRedirector.redirect((short) 38, this)).longValue();
    }

    public long getGuildId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.guildId : ((Long) iPatchRedirector.redirect((short) 6, this)).longValue();
    }

    public boolean getHasCustomMsgNotifyType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 48)) ? this.hasCustomMsgNotifyType : ((Boolean) iPatchRedirector.redirect((short) 48, this)).booleanValue();
    }

    public int getHiddenPostChannel() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 46)) ? this.hiddenPostChannel : ((Integer) iPatchRedirector.redirect((short) 46, this)).intValue();
    }

    public String getIconUrl() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 44)) ? this.iconUrl : (String) iPatchRedirector.redirect((short) 44, this);
    }

    public int getIsCategoryAdmin() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 41)) ? this.isCategoryAdmin : ((Integer) iPatchRedirector.redirect((short) 41, this)).intValue();
    }

    public int getIsChannelAdmin() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 33)) ? this.isChannelAdmin : ((Integer) iPatchRedirector.redirect((short) 33, this)).intValue();
    }

    public GProMsgSeq getLastCntMsgSeq() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 13)) ? this.lastCntMsgSeq : (GProMsgSeq) iPatchRedirector.redirect((short) 13, this);
    }

    public GProMsgSeq getLastMsgSeq() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 12)) ? this.lastMsgSeq : (GProMsgSeq) iPatchRedirector.redirect((short) 12, this);
    }

    public GProLiveChannelInfo getLiveChannelInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 20)) ? this.liveChannelInfo : (GProLiveChannelInfo) iPatchRedirector.redirect((short) 20, this);
    }

    public int getLivePermission() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 36)) ? this.livePermission : ((Integer) iPatchRedirector.redirect((short) 36, this)).intValue();
    }

    public long getMaxEventSeq() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 40)) ? this.maxEventSeq : ((Long) iPatchRedirector.redirect((short) 40, this)).longValue();
    }

    public GProChannelMedalInfo getMedalInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 42)) ? this.medalInfo : (GProChannelMedalInfo) iPatchRedirector.redirect((short) 42, this);
    }

    public String getMsgMeta() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 18)) ? this.msgMeta : (String) iPatchRedirector.redirect((short) 18, this);
    }

    public int getMsgNotifyType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.msgNotifyType : ((Integer) iPatchRedirector.redirect((short) 7, this)).intValue();
    }

    public int getMyMsgNotifyType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 11)) ? this.myMsgNotifyType : ((Integer) iPatchRedirector.redirect((short) 11, this)).intValue();
    }

    public GProQqMsgListSetting getMyQqMsgListSetting() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 35)) ? this.myQqMsgListSetting : (GProQqMsgListSetting) iPatchRedirector.redirect((short) 35, this);
    }

    public GProMsgSeq getMyReadCntSeq() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 15)) ? this.myReadCntSeq : (GProMsgSeq) iPatchRedirector.redirect((short) 15, this);
    }

    public GProMsgSeq getMyReadMsgSeq() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 14)) ? this.myReadMsgSeq : (GProMsgSeq) iPatchRedirector.redirect((short) 14, this);
    }

    public int getMySpeakPermissionType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 32)) ? this.mySpeakPermissionType : ((Integer) iPatchRedirector.redirect((short) 32, this)).intValue();
    }

    public String getOperationTitle() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 45)) ? this.operationTitle : (String) iPatchRedirector.redirect((short) 45, this);
    }

    public int getOperationType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 43)) ? this.operationType : ((Integer) iPatchRedirector.redirect((short) 43, this)).intValue();
    }

    public int getPrivateType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 22)) ? this.privateType : ((Integer) iPatchRedirector.redirect((short) 22, this)).intValue();
    }

    public String getReadMsgMeta() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 19)) ? this.readMsgMeta : (String) iPatchRedirector.redirect((short) 19, this);
    }

    public int getResult() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 10)) ? this.result : ((Integer) iPatchRedirector.redirect((short) 10, this)).intValue();
    }

    public ArrayList<GProSlowModeInfo> getSlowModeInfoList() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 28)) ? this.slowModeInfoList : (ArrayList) iPatchRedirector.redirect((short) 28, this);
    }

    public int getSlowModeKey() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 27)) ? this.slowModeKey : ((Integer) iPatchRedirector.redirect((short) 27, this)).intValue();
    }

    public int getSpeakPermission() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 9)) ? this.speakPermission : ((Integer) iPatchRedirector.redirect((short) 9, this)).intValue();
    }

    public ArrayList<Integer> getSpecialTypeList() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 23)) ? this.specialTypeList : (ArrayList) iPatchRedirector.redirect((short) 23, this);
    }

    public int getSwitchJumpChannelId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 39)) ? this.switchJumpChannelId : ((Integer) iPatchRedirector.redirect((short) 39, this)).intValue();
    }

    public GProTextChannelInfo getTextChannelInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 29)) ? this.textChannelInfo : (GProTextChannelInfo) iPatchRedirector.redirect((short) 29, this);
    }

    public GProTopMsg getTopMsg() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 26)) ? this.topMsg : (GProTopMsg) iPatchRedirector.redirect((short) 26, this);
    }

    public ArrayList<GProTopMsg> getTopMsgList() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 34)) ? this.topMsgList : (ArrayList) iPatchRedirector.redirect((short) 34, this);
    }

    public int getVisibleType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 31)) ? this.visibleType : ((Integer) iPatchRedirector.redirect((short) 31, this)).intValue();
    }

    public GProVoiceChannelInfo getVoiceChannelInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 17)) ? this.voiceChannelInfo : (GProVoiceChannelInfo) iPatchRedirector.redirect((short) 17, this);
    }

    public void setApplicationInfo(GProApplicationChannelInfo gProApplicationChannelInfo) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 72)) {
            this.applicationInfo = gProApplicationChannelInfo;
        } else {
            iPatchRedirector.redirect((short) 72, this, gProApplicationChannelInfo);
        }
    }

    public void setAuthControlStatusList(ArrayList<GProAuthControlStatus> arrayList) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 84)) {
            this.authControlStatusList = arrayList;
        } else {
            iPatchRedirector.redirect((short) 84, this, arrayList);
        }
    }

    public void setBannedSpeak(int i) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 68)) {
            this.bannedSpeak = i;
        } else {
            iPatchRedirector.redirect((short) 68, this, i);
        }
    }

    public void setCalcMsgNotifyType(int i) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 71)) {
            this.calcMsgNotifyType = i;
        } else {
            iPatchRedirector.redirect((short) 71, this, i);
        }
    }

    public void setCategoryInfo(GProCmd0xf55CategoryInfo gProCmd0xf55CategoryInfo) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 96)) {
            this.categoryInfo = gProCmd0xf55CategoryInfo;
        } else {
            iPatchRedirector.redirect((short) 96, this, gProCmd0xf55CategoryInfo);
        }
    }

    public void setChannelChangeSeq(long j) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 94)) {
            this.channelChangeSeq = j;
        } else {
            iPatchRedirector.redirect((short) 94, this, j);
        }
    }

    public void setChannelId(long j) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 50)) {
            this.channelId = j;
        } else {
            iPatchRedirector.redirect((short) 50, this, j);
        }
    }

    public void setChannelName(String str) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 51)) {
            this.channelName = str;
        } else {
            iPatchRedirector.redirect((short) 51, this, str);
        }
    }

    public void setChannelType(int i) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 55)) {
            this.channelType = i;
        } else {
            iPatchRedirector.redirect((short) 55, this, i);
        }
    }

    public void setCreateTime(long j) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 52)) {
            this.createTime = j;
        } else {
            iPatchRedirector.redirect((short) 52, this, j);
        }
    }

    public void setCreatorTinyid(long j) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 63)) {
            this.creatorTinyid = j;
        } else {
            iPatchRedirector.redirect((short) 63, this, j);
        }
    }

    public void setForumChannelInfo(GProForumChannelInfo gProForumChannelInfo) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 77)) {
            this.forumChannelInfo = gProForumChannelInfo;
        } else {
            iPatchRedirector.redirect((short) 77, this, gProForumChannelInfo);
        }
    }

    public void setGotoChannelId(long j) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 85)) {
            this.gotoChannelId = j;
        } else {
            iPatchRedirector.redirect((short) 85, this, j);
        }
    }

    public void setGuildId(long j) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 53)) {
            this.guildId = j;
        } else {
            iPatchRedirector.redirect((short) 53, this, j);
        }
    }

    public void setHasCustomMsgNotifyType(boolean z) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 95)) {
            this.hasCustomMsgNotifyType = z;
        } else {
            iPatchRedirector.redirect((short) 95, this, z);
        }
    }

    public void setHiddenPostChannel(int i) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 93)) {
            this.hiddenPostChannel = i;
        } else {
            iPatchRedirector.redirect((short) 93, this, i);
        }
    }

    public void setIconUrl(String str) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 91)) {
            this.iconUrl = str;
        } else {
            iPatchRedirector.redirect((short) 91, this, str);
        }
    }

    public void setIsCategoryAdmin(int i) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 88)) {
            this.isCategoryAdmin = i;
        } else {
            iPatchRedirector.redirect((short) 88, this, i);
        }
    }

    public void setIsChannelAdmin(int i) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 80)) {
            this.isChannelAdmin = i;
        } else {
            iPatchRedirector.redirect((short) 80, this, i);
        }
    }

    public void setLastCntMsgSeq(GProMsgSeq gProMsgSeq) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 60)) {
            this.lastCntMsgSeq = gProMsgSeq;
        } else {
            iPatchRedirector.redirect((short) 60, this, gProMsgSeq);
        }
    }

    public void setLastMsgSeq(GProMsgSeq gProMsgSeq) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 59)) {
            this.lastMsgSeq = gProMsgSeq;
        } else {
            iPatchRedirector.redirect((short) 59, this, gProMsgSeq);
        }
    }

    public void setLiveChannelInfo(GProLiveChannelInfo gProLiveChannelInfo) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 67)) {
            this.liveChannelInfo = gProLiveChannelInfo;
        } else {
            iPatchRedirector.redirect((short) 67, this, gProLiveChannelInfo);
        }
    }

    public void setLivePermission(int i) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 83)) {
            this.livePermission = i;
        } else {
            iPatchRedirector.redirect((short) 83, this, i);
        }
    }

    public void setMaxEventSeq(long j) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 87)) {
            this.maxEventSeq = j;
        } else {
            iPatchRedirector.redirect((short) 87, this, j);
        }
    }

    public void setMedalInfo(GProChannelMedalInfo gProChannelMedalInfo) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 89)) {
            this.medalInfo = gProChannelMedalInfo;
        } else {
            iPatchRedirector.redirect((short) 89, this, gProChannelMedalInfo);
        }
    }

    public void setMsgMeta(String str) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 65)) {
            this.msgMeta = str;
        } else {
            iPatchRedirector.redirect((short) 65, this, str);
        }
    }

    public void setMsgNotifyType(int i) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 54)) {
            this.msgNotifyType = i;
        } else {
            iPatchRedirector.redirect((short) 54, this, i);
        }
    }

    public void setMyMsgNotifyType(int i) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 58)) {
            this.myMsgNotifyType = i;
        } else {
            iPatchRedirector.redirect((short) 58, this, i);
        }
    }

    public void setMyQqMsgListSetting(GProQqMsgListSetting gProQqMsgListSetting) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 82)) {
            this.myQqMsgListSetting = gProQqMsgListSetting;
        } else {
            iPatchRedirector.redirect((short) 82, this, gProQqMsgListSetting);
        }
    }

    public void setMyReadCntSeq(GProMsgSeq gProMsgSeq) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 62)) {
            this.myReadCntSeq = gProMsgSeq;
        } else {
            iPatchRedirector.redirect((short) 62, this, gProMsgSeq);
        }
    }

    public void setMyReadMsgSeq(GProMsgSeq gProMsgSeq) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 61)) {
            this.myReadMsgSeq = gProMsgSeq;
        } else {
            iPatchRedirector.redirect((short) 61, this, gProMsgSeq);
        }
    }

    public void setMySpeakPermissionType(int i) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 79)) {
            this.mySpeakPermissionType = i;
        } else {
            iPatchRedirector.redirect((short) 79, this, i);
        }
    }

    public void setOperationTitle(String str) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 92)) {
            this.operationTitle = str;
        } else {
            iPatchRedirector.redirect((short) 92, this, str);
        }
    }

    public void setOperationType(int i) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 90)) {
            this.operationType = i;
        } else {
            iPatchRedirector.redirect((short) 90, this, i);
        }
    }

    public void setPrivateType(int i) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 69)) {
            this.privateType = i;
        } else {
            iPatchRedirector.redirect((short) 69, this, i);
        }
    }

    public void setReadMsgMeta(String str) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 66)) {
            this.readMsgMeta = str;
        } else {
            iPatchRedirector.redirect((short) 66, this, str);
        }
    }

    public void setResult(int i) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 57)) {
            this.result = i;
        } else {
            iPatchRedirector.redirect((short) 57, this, i);
        }
    }

    public void setSlowModeInfoList(ArrayList<GProSlowModeInfo> arrayList) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 75)) {
            this.slowModeInfoList = arrayList;
        } else {
            iPatchRedirector.redirect((short) 75, this, arrayList);
        }
    }

    public void setSlowModeKey(int i) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 74)) {
            this.slowModeKey = i;
        } else {
            iPatchRedirector.redirect((short) 74, this, i);
        }
    }

    public void setSpeakPermission(int i) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 56)) {
            this.speakPermission = i;
        } else {
            iPatchRedirector.redirect((short) 56, this, i);
        }
    }

    public void setSpecialTypeList(ArrayList<Integer> arrayList) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 70)) {
            this.specialTypeList = arrayList;
        } else {
            iPatchRedirector.redirect((short) 70, this, arrayList);
        }
    }

    public void setSwitchJumpChannelId(int i) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 86)) {
            this.switchJumpChannelId = i;
        } else {
            iPatchRedirector.redirect((short) 86, this, i);
        }
    }

    public void setTextChannelInfo(GProTextChannelInfo gProTextChannelInfo) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 76)) {
            this.textChannelInfo = gProTextChannelInfo;
        } else {
            iPatchRedirector.redirect((short) 76, this, gProTextChannelInfo);
        }
    }

    public void setTopMsg(GProTopMsg gProTopMsg) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 73)) {
            this.topMsg = gProTopMsg;
        } else {
            iPatchRedirector.redirect((short) 73, this, gProTopMsg);
        }
    }

    public void setTopMsgList(ArrayList<GProTopMsg> arrayList) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 81)) {
            this.topMsgList = arrayList;
        } else {
            iPatchRedirector.redirect((short) 81, this, arrayList);
        }
    }

    public void setVisibleType(int i) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 78)) {
            this.visibleType = i;
        } else {
            iPatchRedirector.redirect((short) 78, this, i);
        }
    }

    public void setVoiceChannelInfo(GProVoiceChannelInfo gProVoiceChannelInfo) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 64)) {
            this.voiceChannelInfo = gProVoiceChannelInfo;
        } else {
            iPatchRedirector.redirect((short) 64, this, gProVoiceChannelInfo);
        }
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 97)) {
            return (String) iPatchRedirector.redirect((short) 97, this);
        }
        return "GProChannel{channelId=" + this.channelId + ",channelName=" + this.channelName + ",createTime=" + this.createTime + ",guildId=" + this.guildId + ",msgNotifyType=" + this.msgNotifyType + ",channelType=" + this.channelType + ",speakPermission=" + this.speakPermission + ",result=" + this.result + ",myMsgNotifyType=" + this.myMsgNotifyType + ",lastMsgSeq=" + this.lastMsgSeq + ",lastCntMsgSeq=" + this.lastCntMsgSeq + ",myReadMsgSeq=" + this.myReadMsgSeq + ",myReadCntSeq=" + this.myReadCntSeq + ",creatorTinyid=" + this.creatorTinyid + ",voiceChannelInfo=" + this.voiceChannelInfo + ",msgMeta=" + this.msgMeta + ",readMsgMeta=" + this.readMsgMeta + ",liveChannelInfo=" + this.liveChannelInfo + ",bannedSpeak=" + this.bannedSpeak + ",privateType=" + this.privateType + ",specialTypeList=" + this.specialTypeList + ",calcMsgNotifyType=" + this.calcMsgNotifyType + ",applicationInfo=" + this.applicationInfo + ",topMsg=" + this.topMsg + ",slowModeKey=" + this.slowModeKey + ",slowModeInfoList=" + this.slowModeInfoList + ",textChannelInfo=" + this.textChannelInfo + ",forumChannelInfo=" + this.forumChannelInfo + ",visibleType=" + this.visibleType + ",mySpeakPermissionType=" + this.mySpeakPermissionType + ",isChannelAdmin=" + this.isChannelAdmin + ",topMsgList=" + this.topMsgList + ",myQqMsgListSetting=" + this.myQqMsgListSetting + ",livePermission=" + this.livePermission + ",authControlStatusList=" + this.authControlStatusList + ",gotoChannelId=" + this.gotoChannelId + ",switchJumpChannelId=" + this.switchJumpChannelId + ",maxEventSeq=" + this.maxEventSeq + ",isCategoryAdmin=" + this.isCategoryAdmin + ",medalInfo=" + this.medalInfo + ",operationType=" + this.operationType + ",iconUrl=" + this.iconUrl + ",operationTitle=" + this.operationTitle + ",hiddenPostChannel=" + this.hiddenPostChannel + ",channelChangeSeq=" + this.channelChangeSeq + ",hasCustomMsgNotifyType=" + this.hasCustomMsgNotifyType + ",categoryInfo=" + this.categoryInfo + ",}";
    }

    public GProChannel(long j, String str, long j2, long j3, int i, int i2, int i3, int i4, int i5, GProMsgSeq gProMsgSeq, GProMsgSeq gProMsgSeq2, GProMsgSeq gProMsgSeq3, GProMsgSeq gProMsgSeq4, long j4, GProVoiceChannelInfo gProVoiceChannelInfo, String str2, String str3, GProLiveChannelInfo gProLiveChannelInfo, int i6, int i7, ArrayList<Integer> arrayList, int i8, GProApplicationChannelInfo gProApplicationChannelInfo, GProTopMsg gProTopMsg, int i9, ArrayList<GProSlowModeInfo> arrayList2, GProTextChannelInfo gProTextChannelInfo, GProForumChannelInfo gProForumChannelInfo, int i10, int i11, int i12, ArrayList<GProTopMsg> arrayList3, GProQqMsgListSetting gProQqMsgListSetting, int i13, ArrayList<GProAuthControlStatus> arrayList4, long j5, int i14, long j6, int i15, GProChannelMedalInfo gProChannelMedalInfo, int i16, String str4, String str5, int i17, long j7, boolean z, GProCmd0xf55CategoryInfo gProCmd0xf55CategoryInfo) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, new Object[]{this, Long.valueOf(j), str, Long.valueOf(j2), Long.valueOf(j3), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), gProMsgSeq, gProMsgSeq2, gProMsgSeq3, gProMsgSeq4, Long.valueOf(j4), gProVoiceChannelInfo, str2, str3, gProLiveChannelInfo, Integer.valueOf(i6), Integer.valueOf(i7), arrayList, Integer.valueOf(i8), gProApplicationChannelInfo, gProTopMsg, Integer.valueOf(i9), arrayList2, gProTextChannelInfo, gProForumChannelInfo, Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), arrayList3, gProQqMsgListSetting, Integer.valueOf(i13), arrayList4, Long.valueOf(j5), Integer.valueOf(i14), Long.valueOf(j6), Integer.valueOf(i15), gProChannelMedalInfo, Integer.valueOf(i16), str4, str5, Integer.valueOf(i17), Long.valueOf(j7), Boolean.valueOf(z), gProCmd0xf55CategoryInfo});
            return;
        }
        this.serialVersionUID = 1L;
        this.channelName = "";
        this.lastMsgSeq = new GProMsgSeq();
        this.lastCntMsgSeq = new GProMsgSeq();
        this.myReadMsgSeq = new GProMsgSeq();
        this.myReadCntSeq = new GProMsgSeq();
        this.voiceChannelInfo = new GProVoiceChannelInfo();
        this.msgMeta = "";
        this.readMsgMeta = "";
        this.liveChannelInfo = new GProLiveChannelInfo();
        this.specialTypeList = new ArrayList<>();
        this.applicationInfo = new GProApplicationChannelInfo();
        this.topMsg = new GProTopMsg();
        this.slowModeInfoList = new ArrayList<>();
        this.textChannelInfo = new GProTextChannelInfo();
        this.forumChannelInfo = new GProForumChannelInfo();
        this.topMsgList = new ArrayList<>();
        this.myQqMsgListSetting = new GProQqMsgListSetting();
        this.authControlStatusList = new ArrayList<>();
        this.medalInfo = new GProChannelMedalInfo();
        this.iconUrl = "";
        this.operationTitle = "";
        this.categoryInfo = new GProCmd0xf55CategoryInfo();
        this.channelId = j;
        this.channelName = str;
        this.createTime = j2;
        this.guildId = j3;
        this.msgNotifyType = i;
        this.channelType = i2;
        this.speakPermission = i3;
        this.result = i4;
        this.myMsgNotifyType = i5;
        this.lastMsgSeq = gProMsgSeq;
        this.lastCntMsgSeq = gProMsgSeq2;
        this.myReadMsgSeq = gProMsgSeq3;
        this.myReadCntSeq = gProMsgSeq4;
        this.creatorTinyid = j4;
        this.voiceChannelInfo = gProVoiceChannelInfo;
        this.msgMeta = str2;
        this.readMsgMeta = str3;
        this.liveChannelInfo = gProLiveChannelInfo;
        this.bannedSpeak = i6;
        this.privateType = i7;
        this.specialTypeList = arrayList;
        this.calcMsgNotifyType = i8;
        this.applicationInfo = gProApplicationChannelInfo;
        this.topMsg = gProTopMsg;
        this.slowModeKey = i9;
        this.slowModeInfoList = arrayList2;
        this.textChannelInfo = gProTextChannelInfo;
        this.forumChannelInfo = gProForumChannelInfo;
        this.visibleType = i10;
        this.mySpeakPermissionType = i11;
        this.isChannelAdmin = i12;
        this.topMsgList = arrayList3;
        this.myQqMsgListSetting = gProQqMsgListSetting;
        this.livePermission = i13;
        this.authControlStatusList = arrayList4;
        this.gotoChannelId = j5;
        this.switchJumpChannelId = i14;
        this.maxEventSeq = j6;
        this.isCategoryAdmin = i15;
        this.medalInfo = gProChannelMedalInfo;
        this.operationType = i16;
        this.iconUrl = str4;
        this.operationTitle = str5;
        this.hiddenPostChannel = i17;
        this.channelChangeSeq = j7;
        this.hasCustomMsgNotifyType = z;
        this.categoryInfo = gProCmd0xf55CategoryInfo;
    }
}
