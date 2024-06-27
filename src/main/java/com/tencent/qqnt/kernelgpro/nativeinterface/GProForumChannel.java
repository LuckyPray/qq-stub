package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;
import java.io.Serializable;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProForumChannel.class */
public final class GProForumChannel implements Serializable {
    static IPatchRedirector $redirector_;
    public long channelId;
    public String channelName;
    public long endColor;
    public String guildFaceUrl;
    public long guildId;
    public String guildName;
    public String hotValueTitle;
    public int index;
    public String joinSign;
    long serialVersionUID;
    public long startColor;
    public int type;

    public GProForumChannel() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.serialVersionUID = 1L;
        this.guildName = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.channelName = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.hotValueTitle = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.guildFaceUrl = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.joinSign = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    }

    public long getChannelId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.channelId : ((Long) iPatchRedirector.redirect((short) 6, this)).longValue();
    }

    public String getChannelName() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.channelName : (String) iPatchRedirector.redirect((short) 7, this);
    }

    public long getEndColor() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 12)) ? this.endColor : ((Long) iPatchRedirector.redirect((short) 12, this)).longValue();
    }

    public String getGuildFaceUrl() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 10)) ? this.guildFaceUrl : (String) iPatchRedirector.redirect((short) 10, this);
    }

    public long getGuildId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.guildId : ((Long) iPatchRedirector.redirect((short) 4, this)).longValue();
    }

    public String getGuildName() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.guildName : (String) iPatchRedirector.redirect((short) 5, this);
    }

    public String getHotValueTitle() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) ? this.hotValueTitle : (String) iPatchRedirector.redirect((short) 8, this);
    }

    public int getIndex() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.index : ((Integer) iPatchRedirector.redirect((short) 3, this)).intValue();
    }

    public String getJoinSign() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 13)) ? this.joinSign : (String) iPatchRedirector.redirect((short) 13, this);
    }

    public long getStartColor() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 11)) ? this.startColor : ((Long) iPatchRedirector.redirect((short) 11, this)).longValue();
    }

    public int getType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 9)) ? this.type : ((Integer) iPatchRedirector.redirect((short) 9, this)).intValue();
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 14)) {
            return (String) iPatchRedirector.redirect((short) 14, this);
        }
        return "GProForumChannel{index=" + this.index + ",guildId=" + this.guildId + ",guildName=" + this.guildName + ",channelId=" + this.channelId + ",channelName=" + this.channelName + ",hotValueTitle=" + this.hotValueTitle + ",type=" + this.type + ",guildFaceUrl=" + this.guildFaceUrl + ",startColor=" + this.startColor + ",endColor=" + this.endColor + ",joinSign=" + this.joinSign + ",}";
    }

    public GProForumChannel(int i, long j, String str, long j2, String str2, String str3, int i2, String str4, long j3, long j4, String str5) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, new Object[]{this, Integer.valueOf(i), Long.valueOf(j), str, Long.valueOf(j2), str2, str3, Integer.valueOf(i2), str4, Long.valueOf(j3), Long.valueOf(j4), str5});
            return;
        }
        this.serialVersionUID = 1L;
        this.guildName = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.channelName = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.hotValueTitle = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.guildFaceUrl = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.joinSign = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.index = i;
        this.guildId = j;
        this.guildName = str;
        this.channelId = j2;
        this.channelName = str2;
        this.hotValueTitle = str3;
        this.type = i2;
        this.guildFaceUrl = str4;
        this.startColor = j3;
        this.endColor = j4;
        this.joinSign = str5;
    }
}
