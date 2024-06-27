package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProAVReportReqInfo.class */
public final class GProAVReportReqInfo {
    static IPatchRedirector $redirector_;
    public GProAVCommonReqInfo commonInfo;
    public long tinyId;
    public GProUserDevState userDevState;

    public GProAVReportReqInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
        } else {
            this.commonInfo = new GProAVCommonReqInfo();
            this.userDevState = new GProUserDevState();
        }
    }

    public GProAVCommonReqInfo getCommonInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.commonInfo : (GProAVCommonReqInfo) iPatchRedirector.redirect((short) 3, this);
    }

    public long getTinyId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.tinyId : ((Long) iPatchRedirector.redirect((short) 4, this)).longValue();
    }

    public GProUserDevState getUserDevState() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.userDevState : (GProUserDevState) iPatchRedirector.redirect((short) 5, this);
    }

    public void setCommonInfo(GProAVCommonReqInfo gProAVCommonReqInfo) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) {
            this.commonInfo = gProAVCommonReqInfo;
        } else {
            iPatchRedirector.redirect((short) 6, this, gProAVCommonReqInfo);
        }
    }

    public void setTinyId(long j) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) {
            this.tinyId = j;
        } else {
            iPatchRedirector.redirect((short) 7, this, j);
        }
    }

    public void setUserDevState(GProUserDevState gProUserDevState) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) {
            this.userDevState = gProUserDevState;
        } else {
            iPatchRedirector.redirect((short) 8, this, gProUserDevState);
        }
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 9)) {
            return (String) iPatchRedirector.redirect((short) 9, this);
        }
        return "GProAVReportReqInfo{commonInfo=" + this.commonInfo + ",tinyId=" + this.tinyId + ",userDevState=" + this.userDevState + ",}";
    }

    public GProAVReportReqInfo(GProAVCommonReqInfo gProAVCommonReqInfo, long j, GProUserDevState gProUserDevState) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, new Object[]{this, gProAVCommonReqInfo, Long.valueOf(j), gProUserDevState});
            return;
        }
        this.commonInfo = new GProAVCommonReqInfo();
        this.userDevState = new GProUserDevState();
        this.commonInfo = gProAVCommonReqInfo;
        this.tinyId = j;
        this.userDevState = gProUserDevState;
    }
}
