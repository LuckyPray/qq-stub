package com.tencent.qqnt.kernelpublic.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;
import java.io.Serializable;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernelpublic/nativeinterface/Contact.class */
public final class Contact implements Serializable {
    static IPatchRedirector $redirector_;
    public int chatType;
    public String guildId;
    public String peerUid;
    long serialVersionUID;

    public Contact() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.serialVersionUID = 1L;
        this.peerUid = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.guildId = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    }

    public int getChatType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.chatType : ((Integer) iPatchRedirector.redirect((short) 3, this)).intValue();
    }

    public String getGuildId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.guildId : (String) iPatchRedirector.redirect((short) 5, this);
    }

    public String getPeerUid() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.peerUid : (String) iPatchRedirector.redirect((short) 4, this);
    }

    public void setChatType(int i) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) {
            this.chatType = i;
        } else {
            iPatchRedirector.redirect((short) 6, this, i);
        }
    }

    public void setGuildId(String str) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) {
            this.guildId = str;
        } else {
            iPatchRedirector.redirect((short) 8, this, str);
        }
    }

    public void setPeerUid(String str) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) {
            this.peerUid = str;
        } else {
            iPatchRedirector.redirect((short) 7, this, str);
        }
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 9)) {
            return (String) iPatchRedirector.redirect((short) 9, this);
        }
        return "Contact{chatType=" + this.chatType + ",peerUid=" + this.peerUid + ",guildId=" + this.guildId + ",}";
    }

    public Contact(int i, String str, String str2) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, new Object[]{this, Integer.valueOf(i), str, str2});
            return;
        }
        this.serialVersionUID = 1L;
        this.peerUid = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.guildId = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.chatType = i;
        this.peerUid = str;
        this.guildId = str2;
    }
}
