package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProBindMembers.class */
public final class GProBindMembers {
    static IPatchRedirector $redirector_;
    public int authControlSwitchType;
    public ArrayList<Long> memberIds;

    public GProBindMembers() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 1)) {
            this.memberIds = new ArrayList<>();
        } else {
            iPatchRedirector.redirect((short) 1, this);
        }
    }

    public int getAuthControlSwitchType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.authControlSwitchType : ((Integer) iPatchRedirector.redirect((short) 3, this)).intValue();
    }

    public ArrayList<Long> getMemberIds() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.memberIds : (ArrayList) iPatchRedirector.redirect((short) 4, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 5)) {
            return (String) iPatchRedirector.redirect((short) 5, this);
        }
        return "GProBindMembers{authControlSwitchType=" + this.authControlSwitchType + ",memberIds=" + this.memberIds + ",}";
    }

    public GProBindMembers(int i, ArrayList<Long> arrayList) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, this, i, arrayList);
            return;
        }
        this.memberIds = new ArrayList<>();
        this.authControlSwitchType = i;
        this.memberIds = arrayList;
    }
}
