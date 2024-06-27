package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProScheduleUser.class */
public final class GProScheduleUser {
    static IPatchRedirector $redirector_;
    public String avatar;
    public String nick;
    public int role;
    public long tinyId;

    public GProScheduleUser() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
        } else {
            this.nick = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
            this.avatar = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        }
    }

    public String getAvatar() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.avatar : (String) iPatchRedirector.redirect((short) 5, this);
    }

    public String getNick() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.nick : (String) iPatchRedirector.redirect((short) 3, this);
    }

    public int getRole() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.role : ((Integer) iPatchRedirector.redirect((short) 6, this)).intValue();
    }

    public long getTinyId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.tinyId : ((Long) iPatchRedirector.redirect((short) 4, this)).longValue();
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 7)) {
            return (String) iPatchRedirector.redirect((short) 7, this);
        }
        return "GProScheduleUser{nick=" + this.nick + ",tinyId=" + this.tinyId + ",avatar=" + this.avatar + ",role=" + this.role + ",}";
    }

    public GProScheduleUser(String str, long j, String str2, int i) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, new Object[]{this, str, Long.valueOf(j), str2, Integer.valueOf(i)});
            return;
        }
        this.nick = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.avatar = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.nick = str;
        this.tinyId = j;
        this.avatar = str2;
        this.role = i;
    }
}
