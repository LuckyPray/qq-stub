package com.tencent.qqnt.kernelpublic.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;
import java.io.Serializable;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernelpublic/nativeinterface/JsonGrayElement.class */
public final class JsonGrayElement implements Serializable {
    static IPatchRedirector $redirector_;
    public long busiId;
    public boolean isServer;
    public String jsonStr;
    public String recentAbstract;
    long serialVersionUID;
    public XmlToJsonParam xmlToJsonParam;

    public JsonGrayElement() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.serialVersionUID = 1L;
        this.jsonStr = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.recentAbstract = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    }

    public long getBusiId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.busiId : ((Long) iPatchRedirector.redirect((short) 3, this)).longValue();
    }

    public boolean getIsServer() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.isServer : ((Boolean) iPatchRedirector.redirect((short) 6, this)).booleanValue();
    }

    public String getJsonStr() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.jsonStr : (String) iPatchRedirector.redirect((short) 4, this);
    }

    public String getRecentAbstract() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.recentAbstract : (String) iPatchRedirector.redirect((short) 5, this);
    }

    public XmlToJsonParam getXmlToJsonParam() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.xmlToJsonParam : (XmlToJsonParam) iPatchRedirector.redirect((short) 7, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 8)) {
            return (String) iPatchRedirector.redirect((short) 8, this);
        }
        return "JsonGrayElement{busiId=" + this.busiId + ",jsonStr=" + this.jsonStr + ",recentAbstract=" + this.recentAbstract + ",isServer=" + this.isServer + ",xmlToJsonParam=" + this.xmlToJsonParam + ",}";
    }

    public JsonGrayElement(long j, String str, String str2, boolean z, XmlToJsonParam xmlToJsonParam) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, new Object[]{this, Long.valueOf(j), str, str2, Boolean.valueOf(z), xmlToJsonParam});
            return;
        }
        this.serialVersionUID = 1L;
        this.jsonStr = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.recentAbstract = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.busiId = j;
        this.jsonStr = str;
        this.recentAbstract = str2;
        this.isServer = z;
        this.xmlToJsonParam = xmlToJsonParam;
    }
}
