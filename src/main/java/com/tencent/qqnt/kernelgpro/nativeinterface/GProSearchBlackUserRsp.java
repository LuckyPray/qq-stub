package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;
import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProSearchBlackUserRsp.class */
public final class GProSearchBlackUserRsp {
    static IPatchRedirector $redirector_;
    public byte[] buf;
    public long guildId;
    public String keyword;
    public ArrayList<GProBlackUserInfo> memberList;
    public long nextPos;
    public String traceId;

    public GProSearchBlackUserRsp() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.memberList = new ArrayList<>();
        this.traceId = "";
        this.buf = new byte[0];
        this.keyword = "";
    }

    public byte[] getBuf() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.buf : (byte[]) iPatchRedirector.redirect((short) 7, this);
    }

    public long getGuildId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.guildId : ((Long) iPatchRedirector.redirect((short) 3, this)).longValue();
    }

    public String getKeyword() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) ? this.keyword : (String) iPatchRedirector.redirect((short) 8, this);
    }

    public ArrayList<GProBlackUserInfo> getMemberList() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.memberList : (ArrayList) iPatchRedirector.redirect((short) 4, this);
    }

    public long getNextPos() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.nextPos : ((Long) iPatchRedirector.redirect((short) 5, this)).longValue();
    }

    public String getTraceId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.traceId : (String) iPatchRedirector.redirect((short) 6, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 9)) {
            return (String) iPatchRedirector.redirect((short) 9, this);
        }
        return "GProSearchBlackUserRsp{guildId=" + this.guildId + ",memberList=" + this.memberList + ",nextPos=" + this.nextPos + ",traceId=" + this.traceId + ",buf=" + this.buf + ",keyword=" + this.keyword + ",}";
    }

    public GProSearchBlackUserRsp(long j, ArrayList<GProBlackUserInfo> arrayList, long j2, String str, byte[] bArr, String str2) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, this, Long.valueOf(j), arrayList, Long.valueOf(j2), str, bArr, str2);
            return;
        }
        this.memberList = new ArrayList<>();
        this.traceId = "";
        this.buf = new byte[0];
        this.keyword = "";
        this.guildId = j;
        this.memberList = arrayList;
        this.nextPos = j2;
        this.traceId = str;
        this.buf = bArr;
        this.keyword = str2;
    }
}
