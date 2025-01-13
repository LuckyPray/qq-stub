package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;
import java.io.Serializable;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProSaveMsgReq.class */
public final class GProSaveMsgReq implements Serializable {
    static IPatchRedirector $redirector_;
    public long adId;
    public String content;
    public long guildId;
    public String headImage;
    public String jumpText;
    public String jumpUrl;
    long serialVersionUID;
    public String title;

    public GProSaveMsgReq() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.serialVersionUID = 1L;
        this.headImage = "";
        this.title = "";
        this.content = "";
        this.jumpText = "";
        this.jumpUrl = "";
    }

    public long getAdId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.adId : ((Long) iPatchRedirector.redirect((short) 3, this)).longValue();
    }

    public String getContent() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.content : (String) iPatchRedirector.redirect((short) 6, this);
    }

    public long getGuildId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 9)) ? this.guildId : ((Long) iPatchRedirector.redirect((short) 9, this)).longValue();
    }

    public String getHeadImage() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.headImage : (String) iPatchRedirector.redirect((short) 4, this);
    }

    public String getJumpText() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.jumpText : (String) iPatchRedirector.redirect((short) 7, this);
    }

    public String getJumpUrl() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) ? this.jumpUrl : (String) iPatchRedirector.redirect((short) 8, this);
    }

    public String getTitle() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.title : (String) iPatchRedirector.redirect((short) 5, this);
    }

    public void setAdId(long j) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 10)) {
            this.adId = j;
        } else {
            iPatchRedirector.redirect((short) 10, this, j);
        }
    }

    public void setContent(String str) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 13)) {
            this.content = str;
        } else {
            iPatchRedirector.redirect((short) 13, this, str);
        }
    }

    public void setGuildId(long j) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 16)) {
            this.guildId = j;
        } else {
            iPatchRedirector.redirect((short) 16, this, j);
        }
    }

    public void setHeadImage(String str) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 11)) {
            this.headImage = str;
        } else {
            iPatchRedirector.redirect((short) 11, this, str);
        }
    }

    public void setJumpText(String str) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 14)) {
            this.jumpText = str;
        } else {
            iPatchRedirector.redirect((short) 14, this, str);
        }
    }

    public void setJumpUrl(String str) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 15)) {
            this.jumpUrl = str;
        } else {
            iPatchRedirector.redirect((short) 15, this, str);
        }
    }

    public void setTitle(String str) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 12)) {
            this.title = str;
        } else {
            iPatchRedirector.redirect((short) 12, this, str);
        }
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 17)) {
            return (String) iPatchRedirector.redirect((short) 17, this);
        }
        return "GProSaveMsgReq{adId=" + this.adId + ",headImage=" + this.headImage + ",title=" + this.title + ",content=" + this.content + ",jumpText=" + this.jumpText + ",jumpUrl=" + this.jumpUrl + ",guildId=" + this.guildId + ",}";
    }

    public GProSaveMsgReq(long j, String str, String str2, String str3, String str4, String str5, long j2) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, this, Long.valueOf(j), str, str2, str3, str4, str5, Long.valueOf(j2));
            return;
        }
        this.serialVersionUID = 1L;
        this.headImage = "";
        this.title = "";
        this.content = "";
        this.jumpText = "";
        this.jumpUrl = "";
        this.adId = j;
        this.headImage = str;
        this.title = str2;
        this.content = str3;
        this.jumpText = str4;
        this.jumpUrl = str5;
        this.guildId = j2;
    }
}
