package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProNavigationV2Info.class */
public final class GProNavigationV2Info {
    static IPatchRedirector $redirector_;
    public String appId;
    public long beginVersion;
    public String bubbleDesc;
    public long endVersion;
    public GProNavigationItemExt extInfo;
    public long iconId;
    public String iconUrl;
    public String jumpUrl;
    public String jumpUrlAuditDesc;
    public int jumpUrlAuditStatus;
    public int jumpUrlType;
    public int platForm;
    public boolean showBubble;
    public String title;
    public String titleAuditDesc;
    public int titleAuditStatus;
    public String uuid;

    public GProNavigationV2Info() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.iconUrl = "";
        this.title = "";
        this.jumpUrl = "";
        this.bubbleDesc = "";
        this.jumpUrlAuditDesc = "";
        this.titleAuditDesc = "";
        this.uuid = "";
        this.extInfo = new GProNavigationItemExt();
        this.appId = "";
    }

    public String getAppId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 19)) ? this.appId : (String) iPatchRedirector.redirect((short) 19, this);
    }

    public long getBeginVersion() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 10)) ? this.beginVersion : ((Long) iPatchRedirector.redirect((short) 10, this)).longValue();
    }

    public String getBubbleDesc() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 9)) ? this.bubbleDesc : (String) iPatchRedirector.redirect((short) 9, this);
    }

    public long getEndVersion() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 11)) ? this.endVersion : ((Long) iPatchRedirector.redirect((short) 11, this)).longValue();
    }

    public GProNavigationItemExt getExtInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 18)) ? this.extInfo : (GProNavigationItemExt) iPatchRedirector.redirect((short) 18, this);
    }

    public long getIconId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.iconId : ((Long) iPatchRedirector.redirect((short) 3, this)).longValue();
    }

    public String getIconUrl() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.iconUrl : (String) iPatchRedirector.redirect((short) 4, this);
    }

    public String getJumpUrl() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.jumpUrl : (String) iPatchRedirector.redirect((short) 6, this);
    }

    public String getJumpUrlAuditDesc() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 14)) ? this.jumpUrlAuditDesc : (String) iPatchRedirector.redirect((short) 14, this);
    }

    public int getJumpUrlAuditStatus() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 13)) ? this.jumpUrlAuditStatus : ((Integer) iPatchRedirector.redirect((short) 13, this)).intValue();
    }

    public int getJumpUrlType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.jumpUrlType : ((Integer) iPatchRedirector.redirect((short) 7, this)).intValue();
    }

    public int getPlatForm() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 12)) ? this.platForm : ((Integer) iPatchRedirector.redirect((short) 12, this)).intValue();
    }

    public boolean getShowBubble() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) ? this.showBubble : ((Boolean) iPatchRedirector.redirect((short) 8, this)).booleanValue();
    }

    public String getTitle() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.title : (String) iPatchRedirector.redirect((short) 5, this);
    }

    public String getTitleAuditDesc() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 16)) ? this.titleAuditDesc : (String) iPatchRedirector.redirect((short) 16, this);
    }

    public int getTitleAuditStatus() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 15)) ? this.titleAuditStatus : ((Integer) iPatchRedirector.redirect((short) 15, this)).intValue();
    }

    public String getUuid() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 17)) ? this.uuid : (String) iPatchRedirector.redirect((short) 17, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 20)) {
            return (String) iPatchRedirector.redirect((short) 20, this);
        }
        return "GProNavigationV2Info{iconId=" + this.iconId + ",iconUrl=" + this.iconUrl + ",title=" + this.title + ",jumpUrl=" + this.jumpUrl + ",jumpUrlType=" + this.jumpUrlType + ",showBubble=" + this.showBubble + ",bubbleDesc=" + this.bubbleDesc + ",beginVersion=" + this.beginVersion + ",endVersion=" + this.endVersion + ",platForm=" + this.platForm + ",jumpUrlAuditStatus=" + this.jumpUrlAuditStatus + ",jumpUrlAuditDesc=" + this.jumpUrlAuditDesc + ",titleAuditStatus=" + this.titleAuditStatus + ",titleAuditDesc=" + this.titleAuditDesc + ",uuid=" + this.uuid + ",extInfo=" + this.extInfo + ",appId=" + this.appId + ",}";
    }

    public GProNavigationV2Info(long j, String str, String str2, String str3, int i, boolean z, String str4, long j2, long j3, int i2, int i3, String str5, int i4, String str6, String str7, GProNavigationItemExt gProNavigationItemExt, String str8) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, this, Long.valueOf(j), str, str2, str3, Integer.valueOf(i), Boolean.valueOf(z), str4, Long.valueOf(j2), Long.valueOf(j3), Integer.valueOf(i2), Integer.valueOf(i3), str5, Integer.valueOf(i4), str6, str7, gProNavigationItemExt, str8);
            return;
        }
        this.iconUrl = "";
        this.title = "";
        this.jumpUrl = "";
        this.bubbleDesc = "";
        this.jumpUrlAuditDesc = "";
        this.titleAuditDesc = "";
        this.uuid = "";
        this.extInfo = new GProNavigationItemExt();
        this.appId = "";
        this.iconId = j;
        this.iconUrl = str;
        this.title = str2;
        this.jumpUrl = str3;
        this.jumpUrlType = i;
        this.showBubble = z;
        this.bubbleDesc = str4;
        this.beginVersion = j2;
        this.endVersion = j3;
        this.platForm = i2;
        this.jumpUrlAuditStatus = i3;
        this.jumpUrlAuditDesc = str5;
        this.titleAuditStatus = i4;
        this.titleAuditDesc = str6;
        this.uuid = str7;
        this.extInfo = gProNavigationItemExt;
        this.appId = str8;
    }
}
