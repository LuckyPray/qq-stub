package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;
import java.io.Serializable;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProLobbyAppInfo.class */
public final class GProLobbyAppInfo implements Serializable {
    static IPatchRedirector $redirector_;
    public int antiAddiction;
    public int antiAddictionMode;
    public String appId;
    public String appName;
    public long appUin;
    public int fullScreenMode;
    public String h5Url;
    public String iconUrl;
    public int maxMember;
    public int minMember;
    public int perLoadingMaterialType;
    public String perLoadingMaterialUrl;
    public long permissionRequired;
    public int screenMode;
    long serialVersionUID;
    public String topImageUrl;

    public GProLobbyAppInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.serialVersionUID = 1L;
        this.appId = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.appName = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.iconUrl = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.topImageUrl = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.h5Url = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.perLoadingMaterialUrl = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    }

    public int getAntiAddiction() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 13)) ? this.antiAddiction : ((Integer) iPatchRedirector.redirect((short) 13, this)).intValue();
    }

    public int getAntiAddictionMode() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 17)) ? this.antiAddictionMode : ((Integer) iPatchRedirector.redirect((short) 17, this)).intValue();
    }

    public String getAppId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.appId : (String) iPatchRedirector.redirect((short) 3, this);
    }

    public String getAppName() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.appName : (String) iPatchRedirector.redirect((short) 4, this);
    }

    public long getAppUin() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 10)) ? this.appUin : ((Long) iPatchRedirector.redirect((short) 10, this)).longValue();
    }

    public int getFullScreenMode() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 16)) ? this.fullScreenMode : ((Integer) iPatchRedirector.redirect((short) 16, this)).intValue();
    }

    public String getH5Url() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.h5Url : (String) iPatchRedirector.redirect((short) 7, this);
    }

    public String getIconUrl() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.iconUrl : (String) iPatchRedirector.redirect((short) 5, this);
    }

    public int getMaxMember() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 12)) ? this.maxMember : ((Integer) iPatchRedirector.redirect((short) 12, this)).intValue();
    }

    public int getMinMember() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 11)) ? this.minMember : ((Integer) iPatchRedirector.redirect((short) 11, this)).intValue();
    }

    public int getPerLoadingMaterialType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 15)) ? this.perLoadingMaterialType : ((Integer) iPatchRedirector.redirect((short) 15, this)).intValue();
    }

    public String getPerLoadingMaterialUrl() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 14)) ? this.perLoadingMaterialUrl : (String) iPatchRedirector.redirect((short) 14, this);
    }

    public long getPermissionRequired() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 9)) ? this.permissionRequired : ((Long) iPatchRedirector.redirect((short) 9, this)).longValue();
    }

    public int getScreenMode() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) ? this.screenMode : ((Integer) iPatchRedirector.redirect((short) 8, this)).intValue();
    }

    public String getTopImageUrl() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.topImageUrl : (String) iPatchRedirector.redirect((short) 6, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 18)) {
            return (String) iPatchRedirector.redirect((short) 18, this);
        }
        return "GProLobbyAppInfo{appId=" + this.appId + ",appName=" + this.appName + ",iconUrl=" + this.iconUrl + ",topImageUrl=" + this.topImageUrl + ",h5Url=" + this.h5Url + ",screenMode=" + this.screenMode + ",permissionRequired=" + this.permissionRequired + ",appUin=" + this.appUin + ",minMember=" + this.minMember + ",maxMember=" + this.maxMember + ",antiAddiction=" + this.antiAddiction + ",perLoadingMaterialUrl=" + this.perLoadingMaterialUrl + ",perLoadingMaterialType=" + this.perLoadingMaterialType + ",fullScreenMode=" + this.fullScreenMode + ",antiAddictionMode=" + this.antiAddictionMode + ",}";
    }

    public GProLobbyAppInfo(String str, String str2, String str3, String str4, String str5, int i, long j, long j2, int i2, int i3, int i4, String str6, int i5, int i6, int i7) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, new Object[]{this, str, str2, str3, str4, str5, Integer.valueOf(i), Long.valueOf(j), Long.valueOf(j2), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), str6, Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i7)});
            return;
        }
        this.serialVersionUID = 1L;
        this.appId = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.appName = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.iconUrl = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.topImageUrl = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.h5Url = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.perLoadingMaterialUrl = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.appId = str;
        this.appName = str2;
        this.iconUrl = str3;
        this.topImageUrl = str4;
        this.h5Url = str5;
        this.screenMode = i;
        this.permissionRequired = j;
        this.appUin = j2;
        this.minMember = i2;
        this.maxMember = i3;
        this.antiAddiction = i4;
        this.perLoadingMaterialUrl = str6;
        this.perLoadingMaterialType = i5;
        this.fullScreenMode = i6;
        this.antiAddictionMode = i7;
    }
}
