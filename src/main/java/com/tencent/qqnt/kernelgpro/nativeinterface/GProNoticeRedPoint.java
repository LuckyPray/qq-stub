package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProNoticeRedPoint.class */
public final class GProNoticeRedPoint {
    static IPatchRedirector $redirector_;
    public int count;
    public int expireTs;
    public int muteSwitch;
    public int subType;
    public int type;

    public GProNoticeRedPoint() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 1)) {
            return;
        }
        iPatchRedirector.redirect((short) 1, this);
    }

    public int getCount() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.count : ((Integer) iPatchRedirector.redirect((short) 3, this)).intValue();
    }

    public int getExpireTs() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.expireTs : ((Integer) iPatchRedirector.redirect((short) 4, this)).intValue();
    }

    public int getMuteSwitch() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.muteSwitch : ((Integer) iPatchRedirector.redirect((short) 5, this)).intValue();
    }

    public int getSubType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.subType : ((Integer) iPatchRedirector.redirect((short) 6, this)).intValue();
    }

    public int getType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.type : ((Integer) iPatchRedirector.redirect((short) 2, this)).intValue();
    }

    public void setCount(int i) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) {
            this.count = i;
        } else {
            iPatchRedirector.redirect((short) 8, this, i);
        }
    }

    public void setExpireTs(int i) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 9)) {
            this.expireTs = i;
        } else {
            iPatchRedirector.redirect((short) 9, this, i);
        }
    }

    public void setMuteSwitch(int i) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 10)) {
            this.muteSwitch = i;
        } else {
            iPatchRedirector.redirect((short) 10, this, i);
        }
    }

    public void setSubType(int i) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 11)) {
            this.subType = i;
        } else {
            iPatchRedirector.redirect((short) 11, this, i);
        }
    }

    public void setType(int i) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) {
            this.type = i;
        } else {
            iPatchRedirector.redirect((short) 7, this, i);
        }
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 12)) {
            return (String) iPatchRedirector.redirect((short) 12, this);
        }
        return "GProNoticeRedPoint{type=" + this.type + ",count=" + this.count + ",expireTs=" + this.expireTs + ",muteSwitch=" + this.muteSwitch + ",subType=" + this.subType + ",}";
    }
}
