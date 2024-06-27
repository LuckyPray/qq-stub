package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProGuildMsgReadReportReq.class */
public final class GProGuildMsgReadReportReq {
    static IPatchRedirector $redirector_;
    public ArrayList<GProMyChannelInfo> rptMsgMyChannelList;
    public int uint32Type;
    public long uint64MemberId;

    public GProGuildMsgReadReportReq() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 1)) {
            this.rptMsgMyChannelList = new ArrayList<>();
        } else {
            iPatchRedirector.redirect((short) 1, this);
        }
    }

    public ArrayList<GProMyChannelInfo> getRptMsgMyChannelList() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.rptMsgMyChannelList : (ArrayList) iPatchRedirector.redirect((short) 4, this);
    }

    public int getUint32Type() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.uint32Type : ((Integer) iPatchRedirector.redirect((short) 5, this)).intValue();
    }

    public long getUint64MemberId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.uint64MemberId : ((Long) iPatchRedirector.redirect((short) 3, this)).longValue();
    }

    public void setRptMsgMyChannelList(ArrayList<GProMyChannelInfo> arrayList) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) {
            this.rptMsgMyChannelList = arrayList;
        } else {
            iPatchRedirector.redirect((short) 7, this, arrayList);
        }
    }

    public void setUint32Type(int i) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) {
            this.uint32Type = i;
        } else {
            iPatchRedirector.redirect((short) 8, this, i);
        }
    }

    public void setUint64MemberId(long j) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) {
            this.uint64MemberId = j;
        } else {
            iPatchRedirector.redirect((short) 6, this, j);
        }
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 9)) {
            return (String) iPatchRedirector.redirect((short) 9, this);
        }
        return "GProGuildMsgReadReportReq{uint64MemberId=" + this.uint64MemberId + ",rptMsgMyChannelList=" + this.rptMsgMyChannelList + ",uint32Type=" + this.uint32Type + ",}";
    }

    public GProGuildMsgReadReportReq(long j, ArrayList<GProMyChannelInfo> arrayList, int i) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, new Object[]{this, Long.valueOf(j), arrayList, Integer.valueOf(i)});
            return;
        }
        this.rptMsgMyChannelList = new ArrayList<>();
        this.uint64MemberId = j;
        this.rptMsgMyChannelList = arrayList;
        this.uint32Type = i;
    }
}
