package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GproGetOpenShareInfoReq.class */
public final class GproGetOpenShareInfoReq {
    static IPatchRedirector $redirector_;
    public String linkUrl;
    public String queryStr;
    public int queryType;
    public String sessionId;

    public GproGetOpenShareInfoReq() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.queryStr = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.linkUrl = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.sessionId = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    }

    public String getLinkUrl() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.linkUrl : (String) iPatchRedirector.redirect((short) 4, this);
    }

    public String getQueryStr() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.queryStr : (String) iPatchRedirector.redirect((short) 3, this);
    }

    public int getQueryType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.queryType : ((Integer) iPatchRedirector.redirect((short) 6, this)).intValue();
    }

    public String getSessionId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.sessionId : (String) iPatchRedirector.redirect((short) 5, this);
    }

    public void setLinkUrl(String str) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) {
            this.linkUrl = str;
        } else {
            iPatchRedirector.redirect((short) 8, this, str);
        }
    }

    public void setQueryStr(String str) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) {
            this.queryStr = str;
        } else {
            iPatchRedirector.redirect((short) 7, this, str);
        }
    }

    public void setQueryType(int i) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 10)) {
            this.queryType = i;
        } else {
            iPatchRedirector.redirect((short) 10, this, i);
        }
    }

    public void setSessionId(String str) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 9)) {
            this.sessionId = str;
        } else {
            iPatchRedirector.redirect((short) 9, this, str);
        }
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 11)) {
            return (String) iPatchRedirector.redirect((short) 11, this);
        }
        return "GproGetOpenShareInfoReq{queryStr=" + this.queryStr + ",linkUrl=" + this.linkUrl + ",sessionId=" + this.sessionId + ",queryType=" + this.queryType + ",}";
    }

    public GproGetOpenShareInfoReq(String str, String str2, String str3, int i) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, new Object[]{this, str, str2, str3, Integer.valueOf(i)});
            return;
        }
        this.queryStr = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.linkUrl = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.sessionId = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.queryStr = str;
        this.linkUrl = str2;
        this.sessionId = str3;
        this.queryType = i;
    }
}
