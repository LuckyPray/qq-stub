package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;
import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProRecommendShareLive.class */
public final class GProRecommendShareLive {
    static IPatchRedirector $redirector_;
    public String anchorIcon;
    public long anchorId;
    public ArrayList<String> audienceIcons;
    public long channelId;
    public long roomId;
    public String roomName;
    public String streamUrl;

    public GProRecommendShareLive() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.anchorIcon = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.audienceIcons = new ArrayList<>();
        this.roomName = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.streamUrl = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    }

    public String getAnchorIcon() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.anchorIcon : (String) iPatchRedirector.redirect((short) 3, this);
    }

    public long getAnchorId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.anchorId : ((Long) iPatchRedirector.redirect((short) 5, this)).longValue();
    }

    public ArrayList<String> getAudienceIcons() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.audienceIcons : (ArrayList) iPatchRedirector.redirect((short) 4, this);
    }

    public long getChannelId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.channelId : ((Long) iPatchRedirector.redirect((short) 6, this)).longValue();
    }

    public long getRoomId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) ? this.roomId : ((Long) iPatchRedirector.redirect((short) 8, this)).longValue();
    }

    public String getRoomName() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.roomName : (String) iPatchRedirector.redirect((short) 7, this);
    }

    public String getStreamUrl() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 9)) ? this.streamUrl : (String) iPatchRedirector.redirect((short) 9, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 10)) {
            return (String) iPatchRedirector.redirect((short) 10, this);
        }
        return "GProRecommendShareLive{anchorIcon=" + this.anchorIcon + ",audienceIcons=" + this.audienceIcons + ",anchorId=" + this.anchorId + ",channelId=" + this.channelId + ",roomName=" + this.roomName + ",roomId=" + this.roomId + ",streamUrl=" + this.streamUrl + ",}";
    }

    public GProRecommendShareLive(String str, ArrayList<String> arrayList, long j, long j2, String str2, long j3, String str3) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, new Object[]{this, str, arrayList, Long.valueOf(j), Long.valueOf(j2), str2, Long.valueOf(j3), str3});
            return;
        }
        this.anchorIcon = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.audienceIcons = new ArrayList<>();
        this.roomName = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.streamUrl = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.anchorIcon = str;
        this.audienceIcons = arrayList;
        this.anchorId = j;
        this.channelId = j2;
        this.roomName = str2;
        this.roomId = j3;
        this.streamUrl = str3;
    }
}
