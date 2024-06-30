package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;
import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProGetFeedsByIndexRsp.class */
public final class GProGetFeedsByIndexRsp {
    static IPatchRedirector $redirector_;
    public byte[] cookie;
    public ArrayList<GProIndexFeedItem> indexItems;
    public boolean isEnd;
    public String totalStr;

    public GProGetFeedsByIndexRsp() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.indexItems = new ArrayList<>();
        this.totalStr = "";
        this.cookie = new byte[0];
    }

    public byte[] getCookie() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.cookie : (byte[]) iPatchRedirector.redirect((short) 4, this);
    }

    public ArrayList<GProIndexFeedItem> getIndexItems() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.indexItems : (ArrayList) iPatchRedirector.redirect((short) 2, this);
    }

    public boolean getIsEnd() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.isEnd : ((Boolean) iPatchRedirector.redirect((short) 5, this)).booleanValue();
    }

    public String getTotalStr() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.totalStr : (String) iPatchRedirector.redirect((short) 3, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 6)) {
            return (String) iPatchRedirector.redirect((short) 6, this);
        }
        return "GProGetFeedsByIndexRsp{indexItems=" + this.indexItems + ",totalStr=" + this.totalStr + ",cookie=" + this.cookie + ",isEnd=" + this.isEnd + ",}";
    }
}
