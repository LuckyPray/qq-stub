package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProStTagOperateInfo.class */
public final class GProStTagOperateInfo {
    static IPatchRedirector $redirector_;
    public long activityEndTime;
    public long activityStartTime;
    public String backgroundURL;
    public String bannerSkipLink;
    public String bannerURL;
    public long beWhiteEndTime;
    public long beWhiteStartTime;
    public String coverURL;
    public String createUser;
    public String desc;
    public int isWhite;
    public String publishSchema;
    public String recommendReason;

    public GProStTagOperateInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.createUser = "";
        this.coverURL = "";
        this.desc = "";
        this.backgroundURL = "";
        this.bannerURL = "";
        this.bannerSkipLink = "";
        this.recommendReason = "";
        this.publishSchema = "";
    }

    public long getActivityEndTime() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 9)) ? this.activityEndTime : ((Long) iPatchRedirector.redirect((short) 9, this)).longValue();
    }

    public long getActivityStartTime() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) ? this.activityStartTime : ((Long) iPatchRedirector.redirect((short) 8, this)).longValue();
    }

    public String getBackgroundURL() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.backgroundURL : (String) iPatchRedirector.redirect((short) 5, this);
    }

    public String getBannerSkipLink() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.bannerSkipLink : (String) iPatchRedirector.redirect((short) 7, this);
    }

    public String getBannerURL() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.bannerURL : (String) iPatchRedirector.redirect((short) 6, this);
    }

    public long getBeWhiteEndTime() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 13)) ? this.beWhiteEndTime : ((Long) iPatchRedirector.redirect((short) 13, this)).longValue();
    }

    public long getBeWhiteStartTime() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 12)) ? this.beWhiteStartTime : ((Long) iPatchRedirector.redirect((short) 12, this)).longValue();
    }

    public String getCoverURL() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.coverURL : (String) iPatchRedirector.redirect((short) 3, this);
    }

    public String getCreateUser() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.createUser : (String) iPatchRedirector.redirect((short) 2, this);
    }

    public String getDesc() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.desc : (String) iPatchRedirector.redirect((short) 4, this);
    }

    public int getIsWhite() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 11)) ? this.isWhite : ((Integer) iPatchRedirector.redirect((short) 11, this)).intValue();
    }

    public String getPublishSchema() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 14)) ? this.publishSchema : (String) iPatchRedirector.redirect((short) 14, this);
    }

    public String getRecommendReason() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 10)) ? this.recommendReason : (String) iPatchRedirector.redirect((short) 10, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 15)) {
            return (String) iPatchRedirector.redirect((short) 15, this);
        }
        return "GProStTagOperateInfo{createUser=" + this.createUser + ",coverURL=" + this.coverURL + ",desc=" + this.desc + ",backgroundURL=" + this.backgroundURL + ",bannerURL=" + this.bannerURL + ",bannerSkipLink=" + this.bannerSkipLink + ",activityStartTime=" + this.activityStartTime + ",activityEndTime=" + this.activityEndTime + ",recommendReason=" + this.recommendReason + ",isWhite=" + this.isWhite + ",beWhiteStartTime=" + this.beWhiteStartTime + ",beWhiteEndTime=" + this.beWhiteEndTime + ",publishSchema=" + this.publishSchema + ",}";
    }
}
