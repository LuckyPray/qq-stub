package com.tencent.qqnt.kernelpublic.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;
import java.io.Serializable;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernelpublic/nativeinterface/GrayTipGroupMember.class */
public final class GrayTipGroupMember implements Serializable {
    static IPatchRedirector $redirector_;
    public String card;
    public String name;
    public MemberRole role;
    long serialVersionUID;
    public String uid;

    public GrayTipGroupMember() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.serialVersionUID = 1L;
        this.uid = "";
        this.card = "";
        this.name = "";
        this.role = MemberRole.values()[0];
    }

    public String getCard() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.card : (String) iPatchRedirector.redirect((short) 4, this);
    }

    public String getName() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.name : (String) iPatchRedirector.redirect((short) 5, this);
    }

    public MemberRole getRole() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.role : (MemberRole) iPatchRedirector.redirect((short) 6, this);
    }

    public String getUid() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.uid : (String) iPatchRedirector.redirect((short) 3, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 7)) {
            return (String) iPatchRedirector.redirect((short) 7, this);
        }
        return "GrayTipGroupMember{uid=" + this.uid + ",card=" + this.card + ",name=" + this.name + ",role=" + this.role + ",}";
    }

    public GrayTipGroupMember(String str, String str2, String str3, MemberRole memberRole) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, new Object[]{this, str, str2, str3, memberRole});
            return;
        }
        this.serialVersionUID = 1L;
        this.uid = "";
        this.card = "";
        this.name = "";
        this.role = MemberRole.values()[0];
        this.uid = str;
        this.card = str2;
        this.name = str3;
        this.role = memberRole;
    }
}
