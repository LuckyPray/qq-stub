package com.tencent.qqnt.kernelpublic.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import java.io.Serializable;
import java.util.ArrayList;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernelpublic/nativeinterface/CreateGroupGrayElement.class */
public final class CreateGroupGrayElement implements Serializable {
    static IPatchRedirector $redirector_;
    public ArrayList<GrayTipMember> memberInfo;
    long serialVersionUID;

    public CreateGroupGrayElement() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
        } else {
            this.serialVersionUID = 1L;
            this.memberInfo = new ArrayList<>();
        }
    }

    public ArrayList<GrayTipMember> getMemberInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.memberInfo : (ArrayList) iPatchRedirector.redirect((short) 3, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 4)) {
            return (String) iPatchRedirector.redirect((short) 4, this);
        }
        return "CreateGroupGrayElement{memberInfo=" + this.memberInfo + ",}";
    }

    public CreateGroupGrayElement(ArrayList<GrayTipMember> arrayList) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, this, arrayList);
            return;
        }
        this.serialVersionUID = 1L;
        this.memberInfo = new ArrayList<>();
        this.memberInfo = arrayList;
    }
}
