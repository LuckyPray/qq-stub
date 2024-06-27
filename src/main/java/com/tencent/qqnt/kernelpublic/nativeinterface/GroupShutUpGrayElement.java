package com.tencent.qqnt.kernelpublic.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import java.io.Serializable;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernelpublic/nativeinterface/GroupShutUpGrayElement.class */
public final class GroupShutUpGrayElement implements Serializable {
    static IPatchRedirector $redirector_;
    public GrayTipGroupMember admin;
    public long curTime;
    public long duration;
    public GrayTipGroupMember member;
    long serialVersionUID;

    public GroupShutUpGrayElement() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.serialVersionUID = 1L;
        this.admin = new GrayTipGroupMember();
        this.member = new GrayTipGroupMember();
    }

    public GrayTipGroupMember getAdmin() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.admin : (GrayTipGroupMember) iPatchRedirector.redirect((short) 5, this);
    }

    public long getCurTime() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.curTime : ((Long) iPatchRedirector.redirect((short) 3, this)).longValue();
    }

    public long getDuration() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.duration : ((Long) iPatchRedirector.redirect((short) 4, this)).longValue();
    }

    public GrayTipGroupMember getMember() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.member : (GrayTipGroupMember) iPatchRedirector.redirect((short) 6, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 7)) {
            return (String) iPatchRedirector.redirect((short) 7, this);
        }
        return "GroupShutUpGrayElement{curTime=" + this.curTime + ",duration=" + this.duration + ",admin=" + this.admin + ",member=" + this.member + ",}";
    }

    public GroupShutUpGrayElement(long j, long j2, GrayTipGroupMember grayTipGroupMember, GrayTipGroupMember grayTipGroupMember2) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, new Object[]{this, Long.valueOf(j), Long.valueOf(j2), grayTipGroupMember, grayTipGroupMember2});
            return;
        }
        this.serialVersionUID = 1L;
        this.admin = new GrayTipGroupMember();
        this.member = new GrayTipGroupMember();
        this.curTime = j;
        this.duration = j2;
        this.admin = grayTipGroupMember;
        this.member = grayTipGroupMember2;
    }
}
