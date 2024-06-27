package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import java.io.Serializable;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProTag.class */
public final class GProTag implements Serializable {
    static IPatchRedirector $redirector_;
    public byte[] icon;
    public byte[] name;
    long serialVersionUID;

    public GProTag() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.serialVersionUID = 1L;
        this.name = new byte[0];
        this.icon = new byte[0];
    }

    public byte[] getIcon() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.icon : (byte[]) iPatchRedirector.redirect((short) 4, this);
    }

    public byte[] getName() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.name : (byte[]) iPatchRedirector.redirect((short) 3, this);
    }

    public void setIcon(byte[] bArr) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) {
            this.icon = bArr;
        } else {
            iPatchRedirector.redirect((short) 6, this, bArr);
        }
    }

    public void setName(byte[] bArr) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) {
            this.name = bArr;
        } else {
            iPatchRedirector.redirect((short) 5, this, bArr);
        }
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 7)) {
            return (String) iPatchRedirector.redirect((short) 7, this);
        }
        return "GProTag{name=" + this.name + ",icon=" + this.icon + ",}";
    }

    public GProTag(byte[] bArr, byte[] bArr2) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, this, bArr, bArr2);
            return;
        }
        this.serialVersionUID = 1L;
        this.name = new byte[0];
        this.icon = new byte[0];
        this.name = bArr;
        this.icon = bArr2;
    }
}
