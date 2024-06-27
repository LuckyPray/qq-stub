package com.tencent.qqnt.kernelpublic.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import java.io.Serializable;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernelpublic/nativeinterface/EssenceElement.class */
public final class EssenceElement implements Serializable {
    static IPatchRedirector $redirector_;
    public int isSetEssence;
    public long msgSeq;
    long serialVersionUID;
    public long tinyId;

    public EssenceElement() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 1)) {
            this.serialVersionUID = 1L;
        } else {
            iPatchRedirector.redirect((short) 1, this);
        }
    }

    public int getIsSetEssence() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.isSetEssence : ((Integer) iPatchRedirector.redirect((short) 5, this)).intValue();
    }

    public long getMsgSeq() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.msgSeq : ((Long) iPatchRedirector.redirect((short) 4, this)).longValue();
    }

    public long getTinyId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.tinyId : ((Long) iPatchRedirector.redirect((short) 3, this)).longValue();
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 6)) {
            return (String) iPatchRedirector.redirect((short) 6, this);
        }
        return "EssenceElement{tinyId=" + this.tinyId + ",msgSeq=" + this.msgSeq + ",isSetEssence=" + this.isSetEssence + ",}";
    }

    public EssenceElement(long j, long j2, int i) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, new Object[]{this, Long.valueOf(j), Long.valueOf(j2), Integer.valueOf(i)});
            return;
        }
        this.serialVersionUID = 1L;
        this.tinyId = j;
        this.msgSeq = j2;
        this.isSetEssence = i;
    }
}
