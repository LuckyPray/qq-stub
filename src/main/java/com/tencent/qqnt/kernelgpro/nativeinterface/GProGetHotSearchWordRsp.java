package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProGetHotSearchWordRsp.class */
public final class GProGetHotSearchWordRsp {
    static IPatchRedirector $redirector_;
    public byte[] cookies;
    public GProForumBody forums;
    public ArrayList<GProHotSearchWord> words;

    public GProGetHotSearchWordRsp() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.words = new ArrayList<>();
        this.cookies = new byte[0];
        this.forums = new GProForumBody();
    }

    public byte[] getCookies() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.cookies : (byte[]) iPatchRedirector.redirect((short) 4, this);
    }

    public GProForumBody getForums() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.forums : (GProForumBody) iPatchRedirector.redirect((short) 5, this);
    }

    public ArrayList<GProHotSearchWord> getWords() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.words : (ArrayList) iPatchRedirector.redirect((short) 3, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 6)) {
            return (String) iPatchRedirector.redirect((short) 6, this);
        }
        return "GProGetHotSearchWordRsp{words=" + this.words + ",cookies=" + this.cookies + ",forums=" + this.forums + ",}";
    }

    public GProGetHotSearchWordRsp(ArrayList<GProHotSearchWord> arrayList, byte[] bArr, GProForumBody gProForumBody) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, this, arrayList, bArr, gProForumBody);
            return;
        }
        this.words = new ArrayList<>();
        this.cookies = new byte[0];
        this.forums = new GProForumBody();
        this.words = arrayList;
        this.cookies = bArr;
        this.forums = gProForumBody;
    }
}
