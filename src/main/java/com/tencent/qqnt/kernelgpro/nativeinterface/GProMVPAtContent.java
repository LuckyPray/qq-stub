package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;
import java.io.Serializable;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProMVPAtContent.class */
public final class GProMVPAtContent implements Serializable {
    static IPatchRedirector $redirector_;
    public String atAllText;
    public GProMVPRoleGroup roleGroup;
    long serialVersionUID;
    public String text;
    public int type;
    public GProMVPUser user;

    public GProMVPAtContent() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.serialVersionUID = 1L;
        this.user = new GProMVPUser();
        this.atAllText = "";
        this.roleGroup = new GProMVPRoleGroup();
        this.text = "";
    }

    public String getAtAllText() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.atAllText : (String) iPatchRedirector.redirect((short) 5, this);
    }

    public GProMVPRoleGroup getRoleGroup() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.roleGroup : (GProMVPRoleGroup) iPatchRedirector.redirect((short) 6, this);
    }

    public String getText() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.text : (String) iPatchRedirector.redirect((short) 7, this);
    }

    public int getType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.type : ((Integer) iPatchRedirector.redirect((short) 3, this)).intValue();
    }

    public GProMVPUser getUser() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.user : (GProMVPUser) iPatchRedirector.redirect((short) 4, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 8)) {
            return (String) iPatchRedirector.redirect((short) 8, this);
        }
        return "GProMVPAtContent{type=" + this.type + ",user=" + this.user + ",atAllText=" + this.atAllText + ",roleGroup=" + this.roleGroup + ",text=" + this.text + ",}";
    }

    public GProMVPAtContent(int i, GProMVPUser gProMVPUser, String str, GProMVPRoleGroup gProMVPRoleGroup, String str2) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, this, Integer.valueOf(i), gProMVPUser, str, gProMVPRoleGroup, str2);
            return;
        }
        this.serialVersionUID = 1L;
        this.user = new GProMVPUser();
        this.atAllText = "";
        this.roleGroup = new GProMVPRoleGroup();
        this.text = "";
        this.type = i;
        this.user = gProMVPUser;
        this.atAllText = str;
        this.roleGroup = gProMVPRoleGroup;
        this.text = str2;
    }
}
