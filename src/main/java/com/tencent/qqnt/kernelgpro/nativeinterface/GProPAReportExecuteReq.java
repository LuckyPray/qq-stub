package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;
import java.io.Serializable;
import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProPAReportExecuteReq.class */
public final class GProPAReportExecuteReq implements Serializable {
    static IPatchRedirector $redirector_;
    public long execTime;
    public String instrTraceId;
    public ArrayList<String> ruleNameList;
    long serialVersionUID;

    public GProPAReportExecuteReq() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.serialVersionUID = 1L;
        this.ruleNameList = new ArrayList<>();
        this.instrTraceId = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    }

    public long getExecTime() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.execTime : ((Long) iPatchRedirector.redirect((short) 5, this)).longValue();
    }

    public String getInstrTraceId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.instrTraceId : (String) iPatchRedirector.redirect((short) 4, this);
    }

    public ArrayList<String> getRuleNameList() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.ruleNameList : (ArrayList) iPatchRedirector.redirect((short) 3, this);
    }

    public void setExecTime(long j) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) {
            this.execTime = j;
        } else {
            iPatchRedirector.redirect((short) 8, this, j);
        }
    }

    public void setInstrTraceId(String str) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) {
            this.instrTraceId = str;
        } else {
            iPatchRedirector.redirect((short) 7, this, str);
        }
    }

    public void setRuleNameList(ArrayList<String> arrayList) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) {
            this.ruleNameList = arrayList;
        } else {
            iPatchRedirector.redirect((short) 6, this, arrayList);
        }
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 9)) {
            return (String) iPatchRedirector.redirect((short) 9, this);
        }
        return "GProPAReportExecuteReq{ruleNameList=" + this.ruleNameList + ",instrTraceId=" + this.instrTraceId + ",execTime=" + this.execTime + ",}";
    }

    public GProPAReportExecuteReq(ArrayList<String> arrayList, String str, long j) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, new Object[]{this, arrayList, str, Long.valueOf(j)});
            return;
        }
        this.serialVersionUID = 1L;
        this.ruleNameList = new ArrayList<>();
        this.instrTraceId = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.ruleNameList = arrayList;
        this.instrTraceId = str;
        this.execTime = j;
    }
}
