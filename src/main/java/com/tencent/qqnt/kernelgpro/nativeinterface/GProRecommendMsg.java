package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;
import java.io.Serializable;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProRecommendMsg.class */
public final class GProRecommendMsg implements Serializable {
    static IPatchRedirector $redirector_;
    public String avatar;
    public long msgSeq;
    public String nickName;
    public byte[] richText;
    long serialVersionUID;
    public long tinyid;

    public GProRecommendMsg() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.serialVersionUID = 1L;
        this.nickName = "";
        this.avatar = "";
        this.richText = new byte[0];
    }

    public String getAvatar() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.avatar : (String) iPatchRedirector.redirect((short) 5, this);
    }

    public long getMsgSeq() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.msgSeq : ((Long) iPatchRedirector.redirect((short) 6, this)).longValue();
    }

    public String getNickName() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.nickName : (String) iPatchRedirector.redirect((short) 4, this);
    }

    public byte[] getRichText() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.richText : (byte[]) iPatchRedirector.redirect((short) 7, this);
    }

    public long getTinyid() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.tinyid : ((Long) iPatchRedirector.redirect((short) 3, this)).longValue();
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 8)) {
            return (String) iPatchRedirector.redirect((short) 8, this);
        }
        return "GProRecommendMsg{tinyid=" + this.tinyid + ",nickName=" + this.nickName + ",avatar=" + this.avatar + ",msgSeq=" + this.msgSeq + ",richText=" + this.richText + ",}";
    }

    public GProRecommendMsg(long j, String str, String str2, long j2, byte[] bArr) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, this, Long.valueOf(j), str, str2, Long.valueOf(j2), bArr);
            return;
        }
        this.serialVersionUID = 1L;
        this.nickName = "";
        this.avatar = "";
        this.richText = new byte[0];
        this.tinyid = j;
        this.nickName = str;
        this.avatar = str2;
        this.msgSeq = j2;
        this.richText = bArr;
    }
}
