package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProCmd0xf55CategoryInfoBytesCategoryCommonEntry.class */
public final class GProCmd0xf55CategoryInfoBytesCategoryCommonEntry {
    static IPatchRedirector $redirector_;
    public int key;
    public byte[] value;

    public GProCmd0xf55CategoryInfoBytesCategoryCommonEntry() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 1)) {
            this.value = new byte[0];
        } else {
            iPatchRedirector.redirect((short) 1, this);
        }
    }

    public int getKey() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.key : ((Integer) iPatchRedirector.redirect((short) 2, this)).intValue();
    }

    public byte[] getValue() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.value : (byte[]) iPatchRedirector.redirect((short) 3, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 4)) {
            return (String) iPatchRedirector.redirect((short) 4, this);
        }
        return "GProCmd0xf55CategoryInfoBytesCategoryCommonEntry{key=" + this.key + ",value=" + this.value + ",}";
    }
}
