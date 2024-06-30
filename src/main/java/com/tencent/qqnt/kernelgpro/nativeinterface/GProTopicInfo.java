package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProTopicInfo.class */
public final class GProTopicInfo {
    static IPatchRedirector $redirector_;
    public String hotText;
    public String schema;
    public String topicContent;
    public long topicId;

    public GProTopicInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.topicContent = "";
        this.schema = "";
        this.hotText = "";
    }

    public String getHotText() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.hotText : (String) iPatchRedirector.redirect((short) 5, this);
    }

    public String getSchema() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.schema : (String) iPatchRedirector.redirect((short) 4, this);
    }

    public String getTopicContent() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.topicContent : (String) iPatchRedirector.redirect((short) 3, this);
    }

    public long getTopicId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.topicId : ((Long) iPatchRedirector.redirect((short) 2, this)).longValue();
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 6)) {
            return (String) iPatchRedirector.redirect((short) 6, this);
        }
        return "GProTopicInfo{topicId=" + this.topicId + ",topicContent=" + this.topicContent + ",schema=" + this.schema + ",hotText=" + this.hotText + ",}";
    }
}
