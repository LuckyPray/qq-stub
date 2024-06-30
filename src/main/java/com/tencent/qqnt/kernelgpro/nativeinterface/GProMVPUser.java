package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;
import java.io.Serializable;
import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProMVPUser.class */
public final class GProMVPUser implements Serializable {
    static IPatchRedirector $redirector_;
    public String avatar;
    public String nick;
    public ArrayList<GProMVPRoleGroup> roleGroups;
    long serialVersionUID;
    public long tinyid;
    public long uin;

    public GProMVPUser() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.serialVersionUID = 1L;
        this.nick = "";
        this.avatar = "";
        this.roleGroups = new ArrayList<>();
    }

    public String getAvatar() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.avatar : (String) iPatchRedirector.redirect((short) 5, this);
    }

    public String getNick() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.nick : (String) iPatchRedirector.redirect((short) 4, this);
    }

    public ArrayList<GProMVPRoleGroup> getRoleGroups() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.roleGroups : (ArrayList) iPatchRedirector.redirect((short) 6, this);
    }

    public long getTinyid() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.tinyid : ((Long) iPatchRedirector.redirect((short) 3, this)).longValue();
    }

    public long getUin() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.uin : ((Long) iPatchRedirector.redirect((short) 7, this)).longValue();
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 8)) {
            return (String) iPatchRedirector.redirect((short) 8, this);
        }
        return "GProMVPUser{tinyid=" + this.tinyid + ",nick=" + this.nick + ",avatar=" + this.avatar + ",roleGroups=" + this.roleGroups + ",uin=" + this.uin + ",}";
    }

    public GProMVPUser(long j, String str, String str2, ArrayList<GProMVPRoleGroup> arrayList) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, new Object[]{this, Long.valueOf(j), str, str2, arrayList});
            return;
        }
        this.serialVersionUID = 1L;
        this.nick = "";
        this.avatar = "";
        this.roleGroups = new ArrayList<>();
        this.tinyid = j;
        this.nick = str;
        this.avatar = str2;
        this.roleGroups = arrayList;
    }
}
