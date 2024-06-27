package com.tencent.qqnt.kernelpublic.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import java.io.Serializable;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernelpublic/nativeinterface/InviterAndInvited.class */
public final class InviterAndInvited implements Serializable {
    static IPatchRedirector $redirector_;
    public GrayTipMember invited;
    public GrayTipMember inviter;
    long serialVersionUID;

    public InviterAndInvited() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.serialVersionUID = 1L;
        this.inviter = new GrayTipMember();
        this.invited = new GrayTipMember();
    }

    public GrayTipMember getInvited() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.invited : (GrayTipMember) iPatchRedirector.redirect((short) 4, this);
    }

    public GrayTipMember getInviter() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.inviter : (GrayTipMember) iPatchRedirector.redirect((short) 3, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 5)) {
            return (String) iPatchRedirector.redirect((short) 5, this);
        }
        return "InviterAndInvited{inviter=" + this.inviter + ",invited=" + this.invited + ",}";
    }

    public InviterAndInvited(GrayTipMember grayTipMember, GrayTipMember grayTipMember2) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, this, grayTipMember, grayTipMember2);
            return;
        }
        this.serialVersionUID = 1L;
        this.inviter = new GrayTipMember();
        this.invited = new GrayTipMember();
        this.inviter = grayTipMember;
        this.invited = grayTipMember2;
    }
}
