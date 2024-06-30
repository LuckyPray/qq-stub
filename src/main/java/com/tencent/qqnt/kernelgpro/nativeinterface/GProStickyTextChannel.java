package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;
import com.tencent.qqnt.kernelpublic.nativeinterface.MsgAbstract;
import java.io.Serializable;
import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProStickyTextChannel.class */
public final class GProStickyTextChannel implements Serializable {
    static IPatchRedirector $redirector_;
    public String activeMemberCount;
    public ArrayList<GProUser> activeMemberList;
    public ArrayList<MsgAbstract> msgAbstracts;
    public ArrayList<GProMsgSummary> msgList;
    long serialVersionUID;

    public GProStickyTextChannel() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.serialVersionUID = 1L;
        this.activeMemberCount = "";
        this.msgList = new ArrayList<>();
        this.msgAbstracts = new ArrayList<>();
        this.activeMemberList = new ArrayList<>();
    }

    public String getActiveMemberCount() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.activeMemberCount : (String) iPatchRedirector.redirect((short) 2, this);
    }

    public ArrayList<GProUser> getActiveMemberList() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.activeMemberList : (ArrayList) iPatchRedirector.redirect((short) 5, this);
    }

    public ArrayList<MsgAbstract> getMsgAbstracts() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.msgAbstracts : (ArrayList) iPatchRedirector.redirect((short) 4, this);
    }

    public ArrayList<GProMsgSummary> getMsgList() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.msgList : (ArrayList) iPatchRedirector.redirect((short) 3, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 6)) {
            return (String) iPatchRedirector.redirect((short) 6, this);
        }
        return "GProStickyTextChannel{activeMemberCount=" + this.activeMemberCount + ",msgList=" + this.msgList + ",msgAbstracts=" + this.msgAbstracts + ",activeMemberList=" + this.activeMemberList + ",}";
    }
}
