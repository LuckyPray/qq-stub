package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProAdminAVReqInfo.class */
public final class GProAdminAVReqInfo {
    static IPatchRedirector $redirector_;
    public GProAVDevOptInfo avDevOptInfo;
    public GProAVCommonReqInfo commonInfo;
    public long tinyId;

    public GProAdminAVReqInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
        } else {
            this.commonInfo = new GProAVCommonReqInfo();
            this.avDevOptInfo = new GProAVDevOptInfo();
        }
    }

    public GProAVDevOptInfo getAvDevOptInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.avDevOptInfo : (GProAVDevOptInfo) iPatchRedirector.redirect((short) 5, this);
    }

    public GProAVCommonReqInfo getCommonInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.commonInfo : (GProAVCommonReqInfo) iPatchRedirector.redirect((short) 3, this);
    }

    public long getTinyId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.tinyId : ((Long) iPatchRedirector.redirect((short) 4, this)).longValue();
    }

    public void setAvDevOptInfo(GProAVDevOptInfo gProAVDevOptInfo) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) {
            this.avDevOptInfo = gProAVDevOptInfo;
        } else {
            iPatchRedirector.redirect((short) 8, this, gProAVDevOptInfo);
        }
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

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 9)) {
            return (String) iPatchRedirector.redirect((short) 9, this);
        }
        return "GProAdminAVReqInfo{commonInfo=" + this.commonInfo + ",tinyId=" + this.tinyId + ",avDevOptInfo=" + this.avDevOptInfo + ",}";
    }

    public GProAdminAVReqInfo(GProAVCommonReqInfo gProAVCommonReqInfo, long j, GProAVDevOptInfo gProAVDevOptInfo) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, new Object[]{this, gProAVCommonReqInfo, Long.valueOf(j), gProAVDevOptInfo});
            return;
        }
        this.commonInfo = new GProAVCommonReqInfo();
        this.avDevOptInfo = new GProAVDevOptInfo();
        this.commonInfo = gProAVCommonReqInfo;
        this.tinyId = j;
        this.avDevOptInfo = gProAVDevOptInfo;
    }
}
