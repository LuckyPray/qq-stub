package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;
import java.io.Serializable;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProContentRecommendDocument.class */
public final class GProContentRecommendDocument implements Serializable {
    static IPatchRedirector $redirector_;
    public long channelId;
    public String docCover;
    public String docTitle;
    public String guildAvatar;
    public long guildId;
    public String guildName;
    long serialVersionUID;

    public GProContentRecommendDocument() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.serialVersionUID = 1L;
        this.guildName = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.guildAvatar = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.docCover = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.docTitle = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    }

    public long getChannelId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.channelId : ((Long) iPatchRedirector.redirect((short) 3, this)).longValue();
    }

    public String getDocCover() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.docCover : (String) iPatchRedirector.redirect((short) 6, this);
    }

    public String getDocTitle() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.docTitle : (String) iPatchRedirector.redirect((short) 7, this);
    }

    public String getGuildAvatar() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.guildAvatar : (String) iPatchRedirector.redirect((short) 5, this);
    }

    public long getGuildId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.guildId : ((Long) iPatchRedirector.redirect((short) 2, this)).longValue();
    }

    public String getGuildName() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.guildName : (String) iPatchRedirector.redirect((short) 4, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 8)) {
            return (String) iPatchRedirector.redirect((short) 8, this);
        }
        return "GProContentRecommendDocument{guildId=" + this.guildId + ",channelId=" + this.channelId + ",guildName=" + this.guildName + ",guildAvatar=" + this.guildAvatar + ",docCover=" + this.docCover + ",docTitle=" + this.docTitle + ",}";
    }
}
