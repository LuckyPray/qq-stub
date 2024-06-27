package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;
import java.io.Serializable;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProApplicationChannelInfo.class */
public final class GProApplicationChannelInfo implements Serializable {
    static IPatchRedirector $redirector_;
    public String appChannelIcon;
    public int appChannelJumpType;
    public String appChannelJumpUrl;
    public int appQyyFlag;
    public long applicationId;
    public int externalUrlRequestStatus;
    long serialVersionUID;
    public String strAppChannelId;
    public String strJumpSecret;

    public GProApplicationChannelInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.serialVersionUID = 1L;
        this.strAppChannelId = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.strJumpSecret = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.appChannelIcon = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.appChannelJumpUrl = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    }

    public String getAppChannelIcon() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.appChannelIcon : (String) iPatchRedirector.redirect((short) 5, this);
    }

    public int getAppChannelJumpType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.appChannelJumpType : ((Integer) iPatchRedirector.redirect((short) 6, this)).intValue();
    }

    public String getAppChannelJumpUrl() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.appChannelJumpUrl : (String) iPatchRedirector.redirect((short) 7, this);
    }

    public int getAppQyyFlag() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) ? this.appQyyFlag : ((Integer) iPatchRedirector.redirect((short) 8, this)).intValue();
    }

    public long getApplicationId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.applicationId : ((Long) iPatchRedirector.redirect((short) 2, this)).longValue();
    }

    public int getExternalUrlRequestStatus() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 9)) ? this.externalUrlRequestStatus : ((Integer) iPatchRedirector.redirect((short) 9, this)).intValue();
    }

    public String getStrAppChannelId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.strAppChannelId : (String) iPatchRedirector.redirect((short) 3, this);
    }

    public String getStrJumpSecret() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.strJumpSecret : (String) iPatchRedirector.redirect((short) 4, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 10)) {
            return (String) iPatchRedirector.redirect((short) 10, this);
        }
        return "GProApplicationChannelInfo{applicationId=" + this.applicationId + ",strAppChannelId=" + this.strAppChannelId + ",strJumpSecret=" + this.strJumpSecret + ",appChannelIcon=" + this.appChannelIcon + ",appChannelJumpType=" + this.appChannelJumpType + ",appChannelJumpUrl=" + this.appChannelJumpUrl + ",appQyyFlag=" + this.appQyyFlag + ",externalUrlRequestStatus=" + this.externalUrlRequestStatus + ",}";
    }
}
