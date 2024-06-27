package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProBlackUserInfo.class */
public final class GProBlackUserInfo {
    static IPatchRedirector $redirector_;
    public String avatarUrl;
    public String nickName;
    public long tinyId;

    public GProBlackUserInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
        } else {
            this.nickName = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
            this.avatarUrl = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        }
    }

    public String getAvatarUrl() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.avatarUrl : (String) iPatchRedirector.redirect((short) 5, this);
    }

    public String getNickName() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.nickName : (String) iPatchRedirector.redirect((short) 4, this);
    }

    public long getTinyId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.tinyId : ((Long) iPatchRedirector.redirect((short) 3, this)).longValue();
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 6)) {
            return (String) iPatchRedirector.redirect((short) 6, this);
        }
        return "GProBlackUserInfo{tinyId=" + this.tinyId + ",nickName=" + this.nickName + ",avatarUrl=" + this.avatarUrl + ",}";
    }

    public GProBlackUserInfo(long j, String str, String str2) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, new Object[]{this, Long.valueOf(j), str, str2});
            return;
        }
        this.nickName = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.avatarUrl = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.tinyId = j;
        this.nickName = str;
        this.avatarUrl = str2;
    }
}
