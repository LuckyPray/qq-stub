package com.tencent.qqnt.kernelpublic.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;
import java.io.Serializable;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernelpublic/nativeinterface/NewBuddyGrayElement.class */
public final class NewBuddyGrayElement implements Serializable {
    static IPatchRedirector $redirector_;
    public String friendNick;
    public boolean isInitiator;
    long serialVersionUID;
    public int sourceId;
    public int subSourceId;
    public long time;

    public NewBuddyGrayElement() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
        } else {
            this.serialVersionUID = 1L;
            this.friendNick = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        }
    }

    public String getFriendNick() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.friendNick : (String) iPatchRedirector.redirect((short) 7, this);
    }

    public boolean getIsInitiator() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.isInitiator : ((Boolean) iPatchRedirector.redirect((short) 6, this)).booleanValue();
    }

    public int getSourceId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.sourceId : ((Integer) iPatchRedirector.redirect((short) 4, this)).intValue();
    }

    public int getSubSourceId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.subSourceId : ((Integer) iPatchRedirector.redirect((short) 5, this)).intValue();
    }

    public long getTime() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.time : ((Long) iPatchRedirector.redirect((short) 3, this)).longValue();
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 8)) {
            return (String) iPatchRedirector.redirect((short) 8, this);
        }
        return "NewBuddyGrayElement{time=" + this.time + ",sourceId=" + this.sourceId + ",subSourceId=" + this.subSourceId + ",isInitiator=" + this.isInitiator + ",friendNick=" + this.friendNick + ",}";
    }

    public NewBuddyGrayElement(long j, int i, int i2, boolean z, String str) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, new Object[]{this, Long.valueOf(j), Integer.valueOf(i), Integer.valueOf(i2), Boolean.valueOf(z), str});
            return;
        }
        this.serialVersionUID = 1L;
        this.friendNick = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.time = j;
        this.sourceId = i;
        this.subSourceId = i2;
        this.isInitiator = z;
        this.friendNick = str;
    }
}
