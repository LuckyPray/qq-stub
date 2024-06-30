package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;
import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProRiskMemberListRsp.class */
public final class GProRiskMemberListRsp {
    static IPatchRedirector $redirector_;
    public byte[] buf;
    public String cookie;
    public ArrayList<GProRiskMemberGroupInfo> groupList;
    public boolean isEnd;
    public String subTitle;
    public String title;
    public long totalNum;
    public String traceId;

    public GProRiskMemberListRsp() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.groupList = new ArrayList<>();
        this.cookie = "";
        this.traceId = "";
        this.buf = new byte[0];
        this.title = "";
        this.subTitle = "";
    }

    public byte[] getBuf() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.buf : (byte[]) iPatchRedirector.redirect((short) 6, this);
    }

    public String getCookie() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.cookie : (String) iPatchRedirector.redirect((short) 4, this);
    }

    public ArrayList<GProRiskMemberGroupInfo> getGroupList() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.groupList : (ArrayList) iPatchRedirector.redirect((short) 3, this);
    }

    public boolean getIsEnd() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.isEnd : ((Boolean) iPatchRedirector.redirect((short) 7, this)).booleanValue();
    }

    public String getSubTitle() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 9)) ? this.subTitle : (String) iPatchRedirector.redirect((short) 9, this);
    }

    public String getTitle() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) ? this.title : (String) iPatchRedirector.redirect((short) 8, this);
    }

    public long getTotalNum() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 10)) ? this.totalNum : ((Long) iPatchRedirector.redirect((short) 10, this)).longValue();
    }

    public String getTraceId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.traceId : (String) iPatchRedirector.redirect((short) 5, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 11)) {
            return (String) iPatchRedirector.redirect((short) 11, this);
        }
        return "GProRiskMemberListRsp{groupList=" + this.groupList + ",cookie=" + this.cookie + ",traceId=" + this.traceId + ",buf=" + this.buf + ",isEnd=" + this.isEnd + ",title=" + this.title + ",subTitle=" + this.subTitle + ",totalNum=" + this.totalNum + ",}";
    }

    public GProRiskMemberListRsp(ArrayList<GProRiskMemberGroupInfo> arrayList, String str, String str2, byte[] bArr, boolean z, String str3, String str4, long j) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, new Object[]{this, arrayList, str, str2, bArr, Boolean.valueOf(z), str3, str4, Long.valueOf(j)});
            return;
        }
        this.groupList = new ArrayList<>();
        this.cookie = "";
        this.traceId = "";
        this.buf = new byte[0];
        this.title = "";
        this.subTitle = "";
        this.groupList = arrayList;
        this.cookie = str;
        this.traceId = str2;
        this.buf = bArr;
        this.isEnd = z;
        this.title = str3;
        this.subTitle = str4;
        this.totalNum = j;
    }
}
