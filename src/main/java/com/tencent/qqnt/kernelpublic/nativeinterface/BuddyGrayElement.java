package com.tencent.qqnt.kernelpublic.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import java.io.Serializable;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernelpublic/nativeinterface/BuddyGrayElement.class */
public final class BuddyGrayElement implements Serializable {
    static IPatchRedirector $redirector_;
    public NewBuddyGrayElement elem;
    long serialVersionUID;
    public int type;

    public BuddyGrayElement() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 1)) {
            this.serialVersionUID = 1L;
        } else {
            iPatchRedirector.redirect((short) 1, this);
        }
    }

    public NewBuddyGrayElement getElem() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.elem : (NewBuddyGrayElement) iPatchRedirector.redirect((short) 4, this);
    }

    public int getType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.type : ((Integer) iPatchRedirector.redirect((short) 3, this)).intValue();
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 5)) {
            return (String) iPatchRedirector.redirect((short) 5, this);
        }
        return "BuddyGrayElement{type=" + this.type + ",elem=" + this.elem + ",}";
    }

    public BuddyGrayElement(int i, NewBuddyGrayElement newBuddyGrayElement) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, this, i, newBuddyGrayElement);
            return;
        }
        this.serialVersionUID = 1L;
        this.type = i;
        this.elem = newBuddyGrayElement;
    }
}
