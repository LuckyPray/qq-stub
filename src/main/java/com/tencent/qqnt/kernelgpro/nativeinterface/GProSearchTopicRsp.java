package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProSearchTopicRsp.class */
public final class GProSearchTopicRsp {
    static IPatchRedirector $redirector_;
    public byte[] cookie;
    public boolean isFinished;
    public ArrayList<GProTopicInfo> topicList;

    public GProSearchTopicRsp() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
        } else {
            this.topicList = new ArrayList<>();
            this.cookie = new byte[0];
        }
    }

    public byte[] getCookie() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.cookie : (byte[]) iPatchRedirector.redirect((short) 3, this);
    }

    public boolean getIsFinished() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.isFinished : ((Boolean) iPatchRedirector.redirect((short) 4, this)).booleanValue();
    }

    public ArrayList<GProTopicInfo> getTopicList() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.topicList : (ArrayList) iPatchRedirector.redirect((short) 2, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 5)) {
            return (String) iPatchRedirector.redirect((short) 5, this);
        }
        return "GProSearchTopicRsp{topicList=" + this.topicList + ",cookie=" + this.cookie + ",isFinished=" + this.isFinished + ",}";
    }
}
