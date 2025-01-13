package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProRetentionGuildListRsp.class */
public final class GProRetentionGuildListRsp {
    static IPatchRedirector $redirector_;
    public byte[] cookies;
    public boolean isEnd;
    public int nextTs;
    public ArrayList<GProRetentionChannelInfo> recommendChannels;

    public GProRetentionGuildListRsp() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
        } else {
            this.recommendChannels = new ArrayList<>();
            this.cookies = new byte[0];
        }
    }

    public byte[] getCookies() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.cookies : (byte[]) iPatchRedirector.redirect((short) 5, this);
    }

    public boolean getIsEnd() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.isEnd : ((Boolean) iPatchRedirector.redirect((short) 6, this)).booleanValue();
    }

    public int getNextTs() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.nextTs : ((Integer) iPatchRedirector.redirect((short) 4, this)).intValue();
    }

    public ArrayList<GProRetentionChannelInfo> getRecommendChannels() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.recommendChannels : (ArrayList) iPatchRedirector.redirect((short) 3, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 7)) {
            return (String) iPatchRedirector.redirect((short) 7, this);
        }
        return "GProRetentionGuildListRsp{recommendChannels=" + this.recommendChannels + ",nextTs=" + this.nextTs + ",cookies=" + this.cookies + ",isEnd=" + this.isEnd + ",}";
    }

    public GProRetentionGuildListRsp(ArrayList<GProRetentionChannelInfo> arrayList, int i, byte[] bArr, boolean z) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, this, arrayList, Integer.valueOf(i), bArr, Boolean.valueOf(z));
            return;
        }
        this.recommendChannels = new ArrayList<>();
        this.cookies = new byte[0];
        this.recommendChannels = arrayList;
        this.nextTs = i;
        this.cookies = bArr;
        this.isEnd = z;
    }
}
