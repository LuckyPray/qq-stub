package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProGlobalBanner.class */
public final class GProGlobalBanner {
    static IPatchRedirector $redirector_;
    public GProGuildBannerGameDownloadInfo bannerGameDownloadeInfo;
    public String bannerId;
    public GProGuildBannerBizId bizId;
    public byte[] content;
    public String guildId;
    public long operateTime;
    public long operatorTinyId;

    public GProGlobalBanner() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.guildId = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.bannerId = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.bizId = new GProGuildBannerBizId();
        this.content = new byte[0];
        this.bannerGameDownloadeInfo = new GProGuildBannerGameDownloadInfo();
    }

    public GProGuildBannerGameDownloadInfo getBannerGameDownloadeInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) ? this.bannerGameDownloadeInfo : (GProGuildBannerGameDownloadInfo) iPatchRedirector.redirect((short) 8, this);
    }

    public String getBannerId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.bannerId : (String) iPatchRedirector.redirect((short) 5, this);
    }

    public GProGuildBannerBizId getBizId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.bizId : (GProGuildBannerBizId) iPatchRedirector.redirect((short) 6, this);
    }

    public byte[] getContent() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.content : (byte[]) iPatchRedirector.redirect((short) 7, this);
    }

    public String getGuildId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.guildId : (String) iPatchRedirector.redirect((short) 2, this);
    }

    public long getOperateTime() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.operateTime : ((Long) iPatchRedirector.redirect((short) 3, this)).longValue();
    }

    public long getOperatorTinyId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.operatorTinyId : ((Long) iPatchRedirector.redirect((short) 4, this)).longValue();
    }

    public void setBannerGameDownloadeInfo(GProGuildBannerGameDownloadInfo gProGuildBannerGameDownloadInfo) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 15)) {
            this.bannerGameDownloadeInfo = gProGuildBannerGameDownloadInfo;
        } else {
            iPatchRedirector.redirect((short) 15, this, gProGuildBannerGameDownloadInfo);
        }
    }

    public void setBannerId(String str) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 12)) {
            this.bannerId = str;
        } else {
            iPatchRedirector.redirect((short) 12, this, str);
        }
    }

    public void setBizId(GProGuildBannerBizId gProGuildBannerBizId) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 13)) {
            this.bizId = gProGuildBannerBizId;
        } else {
            iPatchRedirector.redirect((short) 13, this, gProGuildBannerBizId);
        }
    }

    public void setContent(byte[] bArr) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 14)) {
            this.content = bArr;
        } else {
            iPatchRedirector.redirect((short) 14, this, bArr);
        }
    }

    public void setGuildId(String str) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 9)) {
            this.guildId = str;
        } else {
            iPatchRedirector.redirect((short) 9, this, str);
        }
    }

    public void setOperateTime(long j) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 10)) {
            this.operateTime = j;
        } else {
            iPatchRedirector.redirect((short) 10, this, j);
        }
    }

    public void setOperatorTinyId(long j) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 11)) {
            this.operatorTinyId = j;
        } else {
            iPatchRedirector.redirect((short) 11, this, j);
        }
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 16)) {
            return (String) iPatchRedirector.redirect((short) 16, this);
        }
        return "GProGlobalBanner{guildId=" + this.guildId + ",operateTime=" + this.operateTime + ",operatorTinyId=" + this.operatorTinyId + ",bannerId=" + this.bannerId + ",bizId=" + this.bizId + ",content=" + this.content + ",bannerGameDownloadeInfo=" + this.bannerGameDownloadeInfo + ",}";
    }
}
