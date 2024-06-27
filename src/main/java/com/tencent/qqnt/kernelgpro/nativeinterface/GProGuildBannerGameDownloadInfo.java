package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;
import java.io.Serializable;
import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProGuildBannerGameDownloadInfo.class */
public final class GProGuildBannerGameDownloadInfo implements Serializable {
    static IPatchRedirector $redirector_;
    public String content;
    public String gameId;
    public String jumpText;
    public ArrayList<GProGameDownloadLink> links;
    public ArrayList<String> picUrl;
    long serialVersionUID;
    public String tagText;
    public String title;

    public GProGuildBannerGameDownloadInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.serialVersionUID = 1L;
        this.gameId = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.title = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.content = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.picUrl = new ArrayList<>();
        this.links = new ArrayList<>();
        this.jumpText = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.tagText = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    }

    public String getContent() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.content : (String) iPatchRedirector.redirect((short) 4, this);
    }

    public String getGameId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.gameId : (String) iPatchRedirector.redirect((short) 2, this);
    }

    public String getJumpText() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.jumpText : (String) iPatchRedirector.redirect((short) 7, this);
    }

    public ArrayList<GProGameDownloadLink> getLinks() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.links : (ArrayList) iPatchRedirector.redirect((short) 6, this);
    }

    public ArrayList<String> getPicUrl() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.picUrl : (ArrayList) iPatchRedirector.redirect((short) 5, this);
    }

    public String getTagText() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) ? this.tagText : (String) iPatchRedirector.redirect((short) 8, this);
    }

    public String getTitle() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.title : (String) iPatchRedirector.redirect((short) 3, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 9)) {
            return (String) iPatchRedirector.redirect((short) 9, this);
        }
        return "GProGuildBannerGameDownloadInfo{gameId=" + this.gameId + ",title=" + this.title + ",content=" + this.content + ",picUrl=" + this.picUrl + ",links=" + this.links + ",jumpText=" + this.jumpText + ",tagText=" + this.tagText + ",}";
    }
}
