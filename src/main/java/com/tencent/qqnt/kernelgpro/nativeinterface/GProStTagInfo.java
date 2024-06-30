package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;
import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProStTagInfo.class */
public final class GProStTagInfo {
    static IPatchRedirector $redirector_;
    public ArrayList<GProStFeedAbstract> feedListList;
    public int followState;
    public int isRecommend;
    public int isSelected;
    public int isTop;
    public GProStTagMedalInfo medal;
    public String operateIconUrl;
    public GProStTagOperateInfo optInfo;
    public GProStShare shareInfo;
    public int status;
    public int tagBaseStatus;
    public String tagDec;
    public String tagIconUrl;
    public String tagId;
    public String tagName;
    public String tagReport;
    public int tagTotalFeed;
    public int tagTotalUser;
    public int tagType;
    public long tagViewHistory;
    public String tagWording;
    public ArrayList<GProStUser> userListList;
    public long userViewHistory;

    public GProStTagInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.tagId = "";
        this.tagName = "";
        this.tagDec = "";
        this.userListList = new ArrayList<>();
        this.feedListList = new ArrayList<>();
        this.tagWording = "";
        this.shareInfo = new GProStShare();
        this.medal = new GProStTagMedalInfo();
        this.optInfo = new GProStTagOperateInfo();
        this.operateIconUrl = "";
        this.tagReport = "";
        this.tagIconUrl = "";
    }

    public ArrayList<GProStFeedAbstract> getFeedListList() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.feedListList : (ArrayList) iPatchRedirector.redirect((short) 6, this);
    }

    public int getFollowState() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 11)) ? this.followState : ((Integer) iPatchRedirector.redirect((short) 11, this)).intValue();
    }

    public int getIsRecommend() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 20)) ? this.isRecommend : ((Integer) iPatchRedirector.redirect((short) 20, this)).intValue();
    }

    public int getIsSelected() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 14)) ? this.isSelected : ((Integer) iPatchRedirector.redirect((short) 14, this)).intValue();
    }

    public int getIsTop() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 13)) ? this.isTop : ((Integer) iPatchRedirector.redirect((short) 13, this)).intValue();
    }

    public GProStTagMedalInfo getMedal() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 16)) ? this.medal : (GProStTagMedalInfo) iPatchRedirector.redirect((short) 16, this);
    }

    public String getOperateIconUrl() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 22)) ? this.operateIconUrl : (String) iPatchRedirector.redirect((short) 22, this);
    }

    public GProStTagOperateInfo getOptInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 18)) ? this.optInfo : (GProStTagOperateInfo) iPatchRedirector.redirect((short) 18, this);
    }

    public GProStShare getShareInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 12)) ? this.shareInfo : (GProStShare) iPatchRedirector.redirect((short) 12, this);
    }

    public int getStatus() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 17)) ? this.status : ((Integer) iPatchRedirector.redirect((short) 17, this)).intValue();
    }

    public int getTagBaseStatus() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 19)) ? this.tagBaseStatus : ((Integer) iPatchRedirector.redirect((short) 19, this)).intValue();
    }

    public String getTagDec() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.tagDec : (String) iPatchRedirector.redirect((short) 4, this);
    }

    public String getTagIconUrl() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 24)) ? this.tagIconUrl : (String) iPatchRedirector.redirect((short) 24, this);
    }

    public String getTagId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.tagId : (String) iPatchRedirector.redirect((short) 2, this);
    }

    public String getTagName() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.tagName : (String) iPatchRedirector.redirect((short) 3, this);
    }

    public String getTagReport() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 23)) ? this.tagReport : (String) iPatchRedirector.redirect((short) 23, this);
    }

    public int getTagTotalFeed() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) ? this.tagTotalFeed : ((Integer) iPatchRedirector.redirect((short) 8, this)).intValue();
    }

    public int getTagTotalUser() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.tagTotalUser : ((Integer) iPatchRedirector.redirect((short) 7, this)).intValue();
    }

    public int getTagType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 10)) ? this.tagType : ((Integer) iPatchRedirector.redirect((short) 10, this)).intValue();
    }

    public long getTagViewHistory() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 21)) ? this.tagViewHistory : ((Long) iPatchRedirector.redirect((short) 21, this)).longValue();
    }

    public String getTagWording() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 9)) ? this.tagWording : (String) iPatchRedirector.redirect((short) 9, this);
    }

    public ArrayList<GProStUser> getUserListList() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.userListList : (ArrayList) iPatchRedirector.redirect((short) 5, this);
    }

    public long getUserViewHistory() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 15)) ? this.userViewHistory : ((Long) iPatchRedirector.redirect((short) 15, this)).longValue();
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 25)) {
            return (String) iPatchRedirector.redirect((short) 25, this);
        }
        return "GProStTagInfo{tagId=" + this.tagId + ",tagName=" + this.tagName + ",tagDec=" + this.tagDec + ",userListList=" + this.userListList + ",feedListList=" + this.feedListList + ",tagTotalUser=" + this.tagTotalUser + ",tagTotalFeed=" + this.tagTotalFeed + ",tagWording=" + this.tagWording + ",tagType=" + this.tagType + ",followState=" + this.followState + ",shareInfo=" + this.shareInfo + ",isTop=" + this.isTop + ",isSelected=" + this.isSelected + ",userViewHistory=" + this.userViewHistory + ",medal=" + this.medal + ",status=" + this.status + ",optInfo=" + this.optInfo + ",tagBaseStatus=" + this.tagBaseStatus + ",isRecommend=" + this.isRecommend + ",tagViewHistory=" + this.tagViewHistory + ",operateIconUrl=" + this.operateIconUrl + ",tagReport=" + this.tagReport + ",tagIconUrl=" + this.tagIconUrl + ",}";
    }
}
