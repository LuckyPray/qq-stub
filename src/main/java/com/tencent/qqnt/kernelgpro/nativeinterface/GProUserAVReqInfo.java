package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProUserAVReqInfo.class */
public final class GProUserAVReqInfo {
    static IPatchRedirector $redirector_;
    public GProAVCommonReqInfo commonInfo;
    public GProAVDevOptInfo devOpt;
    public long tinyId;

    public GProUserAVReqInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
        } else {
            this.commonInfo = new GProAVCommonReqInfo();
            this.devOpt = new GProAVDevOptInfo();
        }
    }

    public GProAVCommonReqInfo getCommonInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.commonInfo : (GProAVCommonReqInfo) iPatchRedirector.redirect((short) 3, this);
    }

    public GProAVDevOptInfo getDevOpt() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.devOpt : (GProAVDevOptInfo) iPatchRedirector.redirect((short) 5, this);
    }

    public long getTinyId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.tinyId : ((Long) iPatchRedirector.redirect((short) 4, this)).longValue();
    }

    public void setCommonInfo(GProAVCommonReqInfo gProAVCommonReqInfo) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) {
            this.commonInfo = gProAVCommonReqInfo;
        } else {
            iPatchRedirector.redirect((short) 6, this, gProAVCommonReqInfo);
        }
    }

    public void setDevOpt(GProAVDevOptInfo gProAVDevOptInfo) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) {
            this.devOpt = gProAVDevOptInfo;
        } else {
            iPatchRedirector.redirect((short) 8, this, gProAVDevOptInfo);
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

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 9)) {
            return (String) iPatchRedirector.redirect((short) 9, this);
        }
        return "GProUserAVReqInfo{commonInfo=" + this.commonInfo + ",tinyId=" + this.tinyId + ",devOpt=" + this.devOpt + ",}";
    }

    public GProUserAVReqInfo(GProAVCommonReqInfo gProAVCommonReqInfo, long j, GProAVDevOptInfo gProAVDevOptInfo) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, new Object[]{this, gProAVCommonReqInfo, Long.valueOf(j), gProAVDevOptInfo});
            return;
        }
        this.commonInfo = new GProAVCommonReqInfo();
        this.devOpt = new GProAVDevOptInfo();
        this.commonInfo = gProAVCommonReqInfo;
        this.tinyId = j;
        this.devOpt = gProAVDevOptInfo;
    }
}
