package com.tencent.qqnt.kernelpublic.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;
import java.io.Serializable;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernelpublic/nativeinterface/ChannStateItemInfo.class */
public final class ChannStateItemInfo implements Serializable {
    static IPatchRedirector $redirector_;
    public int channelState;
    public String channelStateStr;
    public int priority;
    long serialVersionUID;
    public long updateTs;

    public ChannStateItemInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
        } else {
            this.serialVersionUID = 1L;
            this.channelStateStr = "";
        }
    }

    public int getChannelState() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.channelState : ((Integer) iPatchRedirector.redirect((short) 3, this)).intValue();
    }

    public String getChannelStateStr() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.channelStateStr : (String) iPatchRedirector.redirect((short) 6, this);
    }

    public int getPriority() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.priority : ((Integer) iPatchRedirector.redirect((short) 4, this)).intValue();
    }

    public long getUpdateTs() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.updateTs : ((Long) iPatchRedirector.redirect((short) 5, this)).longValue();
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 7)) {
            return (String) iPatchRedirector.redirect((short) 7, this);
        }
        return "ChannStateItemInfo{channelState=" + this.channelState + ",priority=" + this.priority + ",updateTs=" + this.updateTs + ",channelStateStr=" + this.channelStateStr + ",}";
    }

    public ChannStateItemInfo(int i, int i2, long j, String str) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, new Object[]{this, Integer.valueOf(i), Integer.valueOf(i2), Long.valueOf(j), str});
            return;
        }
        this.serialVersionUID = 1L;
        this.channelStateStr = "";
        this.channelState = i;
        this.priority = i2;
        this.updateTs = j;
        this.channelStateStr = str;
    }
}
