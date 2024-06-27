package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProFeedbackReq.class */
public final class GProFeedbackReq {
    static IPatchRedirector $redirector_;
    public GProItemCbData callback;
    public String contentType;
    public String feedId;
    public String feedbackType;
    public String scene;

    public GProFeedbackReq() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.scene = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.feedbackType = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.feedId = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.contentType = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.callback = new GProItemCbData();
    }

    public GProItemCbData getCallback() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.callback : (GProItemCbData) iPatchRedirector.redirect((short) 7, this);
    }

    public String getContentType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.contentType : (String) iPatchRedirector.redirect((short) 6, this);
    }

    public String getFeedId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.feedId : (String) iPatchRedirector.redirect((short) 5, this);
    }

    public String getFeedbackType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.feedbackType : (String) iPatchRedirector.redirect((short) 4, this);
    }

    public String getScene() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.scene : (String) iPatchRedirector.redirect((short) 3, this);
    }

    public void setCallback(GProItemCbData gProItemCbData) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 12)) {
            this.callback = gProItemCbData;
        } else {
            iPatchRedirector.redirect((short) 12, this, gProItemCbData);
        }
    }

    public void setContentType(String str) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 11)) {
            this.contentType = str;
        } else {
            iPatchRedirector.redirect((short) 11, this, str);
        }
    }

    public void setFeedId(String str) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 10)) {
            this.feedId = str;
        } else {
            iPatchRedirector.redirect((short) 10, this, str);
        }
    }

    public void setFeedbackType(String str) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 9)) {
            this.feedbackType = str;
        } else {
            iPatchRedirector.redirect((short) 9, this, str);
        }
    }

    public void setScene(String str) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) {
            this.scene = str;
        } else {
            iPatchRedirector.redirect((short) 8, this, str);
        }
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 13)) {
            return (String) iPatchRedirector.redirect((short) 13, this);
        }
        return "GProFeedbackReq{scene=" + this.scene + ",feedbackType=" + this.feedbackType + ",feedId=" + this.feedId + ",contentType=" + this.contentType + ",callback=" + this.callback + ",}";
    }

    public GProFeedbackReq(String str, String str2, String str3, String str4, GProItemCbData gProItemCbData) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, new Object[]{this, str, str2, str3, str4, gProItemCbData});
            return;
        }
        this.scene = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.feedbackType = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.feedId = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.contentType = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.callback = new GProItemCbData();
        this.scene = str;
        this.feedbackType = str2;
        this.feedId = str3;
        this.contentType = str4;
        this.callback = gProItemCbData;
    }
}
