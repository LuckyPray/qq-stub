package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;
import java.io.Serializable;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProMVPTopicContent.class */
public final class GProMVPTopicContent implements Serializable {
    static IPatchRedirector $redirector_;
    public String schema;
    long serialVersionUID;
    public int showStatus;
    public long topicId;
    public String topicName;

    public GProMVPTopicContent() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.serialVersionUID = 1L;
        this.topicName = "";
        this.schema = "";
    }

    public String getSchema() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.schema : (String) iPatchRedirector.redirect((short) 5, this);
    }

    public int getShowStatus() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.showStatus : ((Integer) iPatchRedirector.redirect((short) 4, this)).intValue();
    }

    public long getTopicId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.topicId : ((Long) iPatchRedirector.redirect((short) 2, this)).longValue();
    }

    public String getTopicName() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.topicName : (String) iPatchRedirector.redirect((short) 3, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 6)) {
            return (String) iPatchRedirector.redirect((short) 6, this);
        }
        return "GProMVPTopicContent{topicId=" + this.topicId + ",topicName=" + this.topicName + ",showStatus=" + this.showStatus + ",schema=" + this.schema + ",}";
    }
}
