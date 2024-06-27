package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProAnchorUserInfo.class */
public final class GProAnchorUserInfo {
    static IPatchRedirector $redirector_;
    public String businessUid;
    public Long explicitId;
    public String head;

    /* renamed from: id */
    public Long f55id;
    public Integer initialClientType;
    public String name;
    public Long tinyId;

    public GProAnchorUserInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 1)) {
            return;
        }
        iPatchRedirector.redirect((short) 1, this);
    }

    public String getBusinessUid() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.businessUid : (String) iPatchRedirector.redirect((short) 7, this);
    }

    public Long getExplicitId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.explicitId : (Long) iPatchRedirector.redirect((short) 3, this);
    }

    public String getHead() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.head : (String) iPatchRedirector.redirect((short) 5, this);
    }

    public Long getId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.f55id : (Long) iPatchRedirector.redirect((short) 2, this);
    }

    public Integer getInitialClientType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.initialClientType : (Integer) iPatchRedirector.redirect((short) 6, this);
    }

    public String getName() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.name : (String) iPatchRedirector.redirect((short) 4, this);
    }

    public Long getTinyId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) ? this.tinyId : (Long) iPatchRedirector.redirect((short) 8, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 9)) {
            return (String) iPatchRedirector.redirect((short) 9, this);
        }
        return "GProAnchorUserInfo{id=" + this.f55id + ",explicitId=" + this.explicitId + ",name=" + this.name + ",head=" + this.head + ",initialClientType=" + this.initialClientType + ",businessUid=" + this.businessUid + ",tinyId=" + this.tinyId + ",}";
    }
}
