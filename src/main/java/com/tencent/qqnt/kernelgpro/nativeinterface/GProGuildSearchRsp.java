package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProGuildSearchRsp.class */
public final class GProGuildSearchRsp {
    static IPatchRedirector $redirector_;
    public ArrayList<String> highlightWords;
    public GProUnionResult unionResult;

    public GProGuildSearchRsp() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
        } else {
            this.unionResult = new GProUnionResult();
            this.highlightWords = new ArrayList<>();
        }
    }

    public ArrayList<String> getHighlightWords() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.highlightWords : (ArrayList) iPatchRedirector.redirect((short) 3, this);
    }

    public GProUnionResult getUnionResult() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.unionResult : (GProUnionResult) iPatchRedirector.redirect((short) 2, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 4)) {
            return (String) iPatchRedirector.redirect((short) 4, this);
        }
        return "GProGuildSearchRsp{unionResult=" + this.unionResult + ",highlightWords=" + this.highlightWords + ",}";
    }
}
