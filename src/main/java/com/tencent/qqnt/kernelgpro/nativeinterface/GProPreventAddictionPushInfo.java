package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;
import java.io.Serializable;
import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProPreventAddictionPushInfo.class */
public final class GProPreventAddictionPushInfo implements Serializable {
    static IPatchRedirector $redirector_;
    public long closeMask;
    public long duration;
    public String instrTraceId;
    public ArrayList<GProPAInstructionInfo> instructions;
    public String msg;
    public int ret;
    long serialVersionUID;
    public long uin;

    public GProPreventAddictionPushInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.serialVersionUID = 1L;
        this.msg = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.instructions = new ArrayList<>();
        this.instrTraceId = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    }

    public long getCloseMask() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 9)) ? this.closeMask : ((Long) iPatchRedirector.redirect((short) 9, this)).longValue();
    }

    public long getDuration() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.duration : ((Long) iPatchRedirector.redirect((short) 7, this)).longValue();
    }

    public String getInstrTraceId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) ? this.instrTraceId : (String) iPatchRedirector.redirect((short) 8, this);
    }

    public ArrayList<GProPAInstructionInfo> getInstructions() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.instructions : (ArrayList) iPatchRedirector.redirect((short) 6, this);
    }

    public String getMsg() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.msg : (String) iPatchRedirector.redirect((short) 5, this);
    }

    public int getRet() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.ret : ((Integer) iPatchRedirector.redirect((short) 4, this)).intValue();
    }

    public long getUin() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.uin : ((Long) iPatchRedirector.redirect((short) 3, this)).longValue();
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 10)) {
            return (String) iPatchRedirector.redirect((short) 10, this);
        }
        return "GProPreventAddictionPushInfo{uin=" + this.uin + ",ret=" + this.ret + ",msg=" + this.msg + ",instructions=" + this.instructions + ",duration=" + this.duration + ",instrTraceId=" + this.instrTraceId + ",closeMask=" + this.closeMask + ",}";
    }

    public GProPreventAddictionPushInfo(long j, int i, String str, ArrayList<GProPAInstructionInfo> arrayList, long j2, String str2, long j3) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, new Object[]{this, Long.valueOf(j), Integer.valueOf(i), str, arrayList, Long.valueOf(j2), str2, Long.valueOf(j3)});
            return;
        }
        this.serialVersionUID = 1L;
        this.msg = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.instructions = new ArrayList<>();
        this.instrTraceId = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.uin = j;
        this.ret = i;
        this.msg = str;
        this.instructions = arrayList;
        this.duration = j2;
        this.instrTraceId = str2;
        this.closeMask = j3;
    }
}
