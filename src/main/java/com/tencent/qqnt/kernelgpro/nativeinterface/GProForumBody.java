package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;
import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProForumBody.class */
public final class GProForumBody {
    static IPatchRedirector $redirector_;
    public int everyHours;
    public ArrayList<GProForumChannel> forumChannel;
    public String requestId;
    public long updateTime;

    public GProForumBody() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
        } else {
            this.forumChannel = new ArrayList<>();
            this.requestId = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        }
    }

    public int getEveryHours() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.everyHours : ((Integer) iPatchRedirector.redirect((short) 5, this)).intValue();
    }

    public ArrayList<GProForumChannel> getForumChannel() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.forumChannel : (ArrayList) iPatchRedirector.redirect((short) 3, this);
    }

    public String getRequestId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.requestId : (String) iPatchRedirector.redirect((short) 6, this);
    }

    public long getUpdateTime() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.updateTime : ((Long) iPatchRedirector.redirect((short) 4, this)).longValue();
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 7)) {
            return (String) iPatchRedirector.redirect((short) 7, this);
        }
        return "GProForumBody{forumChannel=" + this.forumChannel + ",updateTime=" + this.updateTime + ",everyHours=" + this.everyHours + ",requestId=" + this.requestId + ",}";
    }

    public GProForumBody(ArrayList<GProForumChannel> arrayList, long j, int i, String str) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, new Object[]{this, arrayList, Long.valueOf(j), Integer.valueOf(i), str});
            return;
        }
        this.forumChannel = new ArrayList<>();
        this.requestId = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.forumChannel = arrayList;
        this.updateTime = j;
        this.everyHours = i;
        this.requestId = str;
    }
}
