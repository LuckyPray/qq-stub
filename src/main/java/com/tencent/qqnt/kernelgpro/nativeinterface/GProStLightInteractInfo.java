package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProStLightInteractInfo.class */
public final class GProStLightInteractInfo {
    static IPatchRedirector $redirector_;
    public byte[] busiData;
    public int count;
    public GProStRelationInfo relation;
    public GProStUser user;

    public GProStLightInteractInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.user = new GProStUser();
        this.relation = new GProStRelationInfo();
        this.busiData = new byte[0];
    }

    public byte[] getBusiData() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.busiData : (byte[]) iPatchRedirector.redirect((short) 5, this);
    }

    public int getCount() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.count : ((Integer) iPatchRedirector.redirect((short) 4, this)).intValue();
    }

    public GProStRelationInfo getRelation() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.relation : (GProStRelationInfo) iPatchRedirector.redirect((short) 3, this);
    }

    public GProStUser getUser() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.user : (GProStUser) iPatchRedirector.redirect((short) 2, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 6)) {
            return (String) iPatchRedirector.redirect((short) 6, this);
        }
        return "GProStLightInteractInfo{user=" + this.user + ",relation=" + this.relation + ",count=" + this.count + ",busiData=" + this.busiData + ",}";
    }
}
