package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProLiveAnchorPlayInfo.class */
public final class GProLiveAnchorPlayInfo {
    static IPatchRedirector $redirector_;
    public String errMsg;
    public Integer result;
    public ArrayList<GProLiveAnchorPlayStream> streams;

    public GProLiveAnchorPlayInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 1)) {
            this.streams = new ArrayList<>();
        } else {
            iPatchRedirector.redirect((short) 1, this);
        }
    }

    public String getErrMsg() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.errMsg : (String) iPatchRedirector.redirect((short) 3, this);
    }

    public Integer getResult() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.result : (Integer) iPatchRedirector.redirect((short) 2, this);
    }

    public ArrayList<GProLiveAnchorPlayStream> getStreams() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.streams : (ArrayList) iPatchRedirector.redirect((short) 4, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 5)) {
            return (String) iPatchRedirector.redirect((short) 5, this);
        }
        return "GProLiveAnchorPlayInfo{result=" + this.result + ",errMsg=" + this.errMsg + ",streams=" + this.streams + ",}";
    }
}
