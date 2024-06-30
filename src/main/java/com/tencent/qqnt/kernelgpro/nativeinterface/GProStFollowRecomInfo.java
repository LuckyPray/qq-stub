package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;
import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProStFollowRecomInfo.class */
public final class GProStFollowRecomInfo {
    static IPatchRedirector $redirector_;
    public String commFriendText;
    public String commGroupText;
    public String followText;
    public ArrayList<GProStFollowUser> followUsers;

    public GProStFollowRecomInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.followText = "";
        this.followUsers = new ArrayList<>();
        this.commFriendText = "";
        this.commGroupText = "";
    }

    public String getCommFriendText() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.commFriendText : (String) iPatchRedirector.redirect((short) 4, this);
    }

    public String getCommGroupText() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.commGroupText : (String) iPatchRedirector.redirect((short) 5, this);
    }

    public String getFollowText() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.followText : (String) iPatchRedirector.redirect((short) 2, this);
    }

    public ArrayList<GProStFollowUser> getFollowUsers() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.followUsers : (ArrayList) iPatchRedirector.redirect((short) 3, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 6)) {
            return (String) iPatchRedirector.redirect((short) 6, this);
        }
        return "GProStFollowRecomInfo{followText=" + this.followText + ",followUsers=" + this.followUsers + ",commFriendText=" + this.commFriendText + ",commGroupText=" + this.commGroupText + ",}";
    }
}
