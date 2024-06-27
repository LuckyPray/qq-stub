package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;
import java.io.Serializable;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProKVNode.class */
public final class GProKVNode implements Serializable {
    static IPatchRedirector $redirector_;
    public String key;
    long serialVersionUID;
    public byte[] value;

    public GProKVNode() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.serialVersionUID = 1L;
        this.key = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.value = new byte[0];
    }

    public String getKey() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.key : (String) iPatchRedirector.redirect((short) 3, this);
    }

    public byte[] getValue() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.value : (byte[]) iPatchRedirector.redirect((short) 4, this);
    }

    public void setKey(String str) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) {
            this.key = str;
        } else {
            iPatchRedirector.redirect((short) 5, this, str);
        }
    }

    public void setValue(byte[] bArr) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) {
            this.value = bArr;
        } else {
            iPatchRedirector.redirect((short) 6, this, bArr);
        }
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 7)) {
            return (String) iPatchRedirector.redirect((short) 7, this);
        }
        return "GProKVNode{key=" + this.key + ",value=" + this.value + ",}";
    }

    public GProKVNode(String str, byte[] bArr) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, this, str, bArr);
            return;
        }
        this.serialVersionUID = 1L;
        this.key = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.value = new byte[0];
        this.key = str;
        this.value = bArr;
    }
}
