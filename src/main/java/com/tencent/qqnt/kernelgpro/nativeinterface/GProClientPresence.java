package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;
import java.io.Serializable;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProClientPresence.class */
public final class GProClientPresence implements Serializable {
    static IPatchRedirector $redirector_;
    public String bigIcon;
    public int clientId;
    public String clientName;
    public String details;
    public long endTimeStamp;
    public long expireTimeStamp;
    public long partyMax;
    public long partySize;
    public String role;
    long serialVersionUID;
    public String smallIcon;
    public long startTimeStamp;
    public String state;

    public GProClientPresence() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.serialVersionUID = 1L;
        this.clientName = "";
        this.bigIcon = "";
        this.state = "";
        this.details = "";
        this.role = "";
        this.smallIcon = "";
    }

    public String getBigIcon() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.bigIcon : (String) iPatchRedirector.redirect((short) 5, this);
    }

    public int getClientId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.clientId : ((Integer) iPatchRedirector.redirect((short) 3, this)).intValue();
    }

    public String getClientName() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.clientName : (String) iPatchRedirector.redirect((short) 4, this);
    }

    public String getDetails() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.details : (String) iPatchRedirector.redirect((short) 7, this);
    }

    public long getEndTimeStamp() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 12)) ? this.endTimeStamp : ((Long) iPatchRedirector.redirect((short) 12, this)).longValue();
    }

    public long getExpireTimeStamp() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 13)) ? this.expireTimeStamp : ((Long) iPatchRedirector.redirect((short) 13, this)).longValue();
    }

    public long getPartyMax() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 9)) ? this.partyMax : ((Long) iPatchRedirector.redirect((short) 9, this)).longValue();
    }

    public long getPartySize() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) ? this.partySize : ((Long) iPatchRedirector.redirect((short) 8, this)).longValue();
    }

    public String getRole() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 10)) ? this.role : (String) iPatchRedirector.redirect((short) 10, this);
    }

    public String getSmallIcon() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 14)) ? this.smallIcon : (String) iPatchRedirector.redirect((short) 14, this);
    }

    public long getStartTimeStamp() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 11)) ? this.startTimeStamp : ((Long) iPatchRedirector.redirect((short) 11, this)).longValue();
    }

    public String getState() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.state : (String) iPatchRedirector.redirect((short) 6, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 15)) {
            return (String) iPatchRedirector.redirect((short) 15, this);
        }
        return "GProClientPresence{clientId=" + this.clientId + ",clientName=" + this.clientName + ",bigIcon=" + this.bigIcon + ",state=" + this.state + ",details=" + this.details + ",partySize=" + this.partySize + ",partyMax=" + this.partyMax + ",role=" + this.role + ",startTimeStamp=" + this.startTimeStamp + ",endTimeStamp=" + this.endTimeStamp + ",expireTimeStamp=" + this.expireTimeStamp + ",smallIcon=" + this.smallIcon + ",}";
    }

    public GProClientPresence(int i, String str, String str2, String str3, String str4, long j, long j2, String str5, long j3, long j4, long j5, String str6) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, new Object[]{this, Integer.valueOf(i), str, str2, str3, str4, Long.valueOf(j), Long.valueOf(j2), str5, Long.valueOf(j3), Long.valueOf(j4), Long.valueOf(j5), str6});
            return;
        }
        this.serialVersionUID = 1L;
        this.clientName = "";
        this.bigIcon = "";
        this.state = "";
        this.details = "";
        this.role = "";
        this.smallIcon = "";
        this.clientId = i;
        this.clientName = str;
        this.bigIcon = str2;
        this.state = str3;
        this.details = str4;
        this.partySize = j;
        this.partyMax = j2;
        this.role = str5;
        this.startTimeStamp = j3;
        this.endTimeStamp = j4;
        this.expireTimeStamp = j5;
        this.smallIcon = str6;
    }
}
