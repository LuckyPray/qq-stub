package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;
import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProStPrePullCacheFeed.class */
public final class GProStPrePullCacheFeed {
    static IPatchRedirector $redirector_;
    public ArrayList<GProBytesEntry> busiTranparentList;
    public long createTime;
    public String idd;
    public GProStUser poster;

    public GProStPrePullCacheFeed() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.idd = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.poster = new GProStUser();
        this.busiTranparentList = new ArrayList<>();
    }

    public ArrayList<GProBytesEntry> getBusiTranparentList() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.busiTranparentList : (ArrayList) iPatchRedirector.redirect((short) 5, this);
    }

    public long getCreateTime() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.createTime : ((Long) iPatchRedirector.redirect((short) 4, this)).longValue();
    }

    public String getIdd() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.idd : (String) iPatchRedirector.redirect((short) 2, this);
    }

    public GProStUser getPoster() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.poster : (GProStUser) iPatchRedirector.redirect((short) 3, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 6)) {
            return (String) iPatchRedirector.redirect((short) 6, this);
        }
        return "GProStPrePullCacheFeed{idd=" + this.idd + ",poster=" + this.poster + ",createTime=" + this.createTime + ",busiTranparentList=" + this.busiTranparentList + ",}";
    }
}
