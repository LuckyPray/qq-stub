package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;
import java.io.Serializable;
import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProPreventAddictionCheckRsp.class */
public final class GProPreventAddictionCheckRsp implements Serializable {
    static IPatchRedirector $redirector_;
    public String context;
    public String instrTraceId;
    public ArrayList<GProPAInstructionInfo> instructions;
    public String msg;
    public int ret;
    long serialVersionUID;

    public GProPreventAddictionCheckRsp() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.serialVersionUID = 1L;
        this.msg = "";
        this.context = "";
        this.instrTraceId = "";
        this.instructions = new ArrayList<>();
    }

    public String getContext() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.context : (String) iPatchRedirector.redirect((short) 5, this);
    }

    public String getInstrTraceId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.instrTraceId : (String) iPatchRedirector.redirect((short) 6, this);
    }

    public ArrayList<GProPAInstructionInfo> getInstructions() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.instructions : (ArrayList) iPatchRedirector.redirect((short) 7, this);
    }

    public String getMsg() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.msg : (String) iPatchRedirector.redirect((short) 4, this);
    }

    public int getRet() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.ret : ((Integer) iPatchRedirector.redirect((short) 3, this)).intValue();
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 8)) {
            return (String) iPatchRedirector.redirect((short) 8, this);
        }
        return "GProPreventAddictionCheckRsp{ret=" + this.ret + ",msg=" + this.msg + ",context=" + this.context + ",instrTraceId=" + this.instrTraceId + ",instructions=" + this.instructions + ",}";
    }

    public GProPreventAddictionCheckRsp(int i, String str, String str2, String str3, ArrayList<GProPAInstructionInfo> arrayList) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, this, Integer.valueOf(i), str, str2, str3, arrayList);
            return;
        }
        this.serialVersionUID = 1L;
        this.msg = "";
        this.context = "";
        this.instrTraceId = "";
        this.instructions = new ArrayList<>();
        this.ret = i;
        this.msg = str;
        this.context = str2;
        this.instrTraceId = str3;
        this.instructions = arrayList;
    }
}
