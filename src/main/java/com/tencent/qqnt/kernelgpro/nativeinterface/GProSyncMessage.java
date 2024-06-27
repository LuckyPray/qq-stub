package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProSyncMessage.class */
public final class GProSyncMessage {
    static IPatchRedirector $redirector_;
    public byte[] data;
    public long timestampMS;

    public GProSyncMessage() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 1)) {
            this.data = new byte[0];
        } else {
            iPatchRedirector.redirect((short) 1, this);
        }
    }

    public byte[] getData() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.data : (byte[]) iPatchRedirector.redirect((short) 2, this);
    }

    public long getTimestampMS() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.timestampMS : ((Long) iPatchRedirector.redirect((short) 3, this)).longValue();
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 4)) {
            return (String) iPatchRedirector.redirect((short) 4, this);
        }
        return "GProSyncMessage{data=" + this.data + ",timestampMS=" + this.timestampMS + ",}";
    }
}
