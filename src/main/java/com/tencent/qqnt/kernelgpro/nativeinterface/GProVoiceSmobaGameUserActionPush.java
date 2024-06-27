package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProVoiceSmobaGameUserActionPush.class */
public final class GProVoiceSmobaGameUserActionPush {
    static IPatchRedirector $redirector_;
    public long currentMemberNum;
    public long newLeaderId;
    public long roomId;
    public long seq;
    public ArrayList<GProVoiceSmobaGameUserAction> userAction;

    public GProVoiceSmobaGameUserActionPush() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 1)) {
            this.userAction = new ArrayList<>();
        } else {
            iPatchRedirector.redirect((short) 1, this);
        }
    }

    public long getCurrentMemberNum() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.currentMemberNum : ((Long) iPatchRedirector.redirect((short) 6, this)).longValue();
    }

    public long getNewLeaderId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.newLeaderId : ((Long) iPatchRedirector.redirect((short) 5, this)).longValue();
    }

    public long getRoomId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.roomId : ((Long) iPatchRedirector.redirect((short) 3, this)).longValue();
    }

    public long getSeq() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.seq : ((Long) iPatchRedirector.redirect((short) 7, this)).longValue();
    }

    public ArrayList<GProVoiceSmobaGameUserAction> getUserAction() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.userAction : (ArrayList) iPatchRedirector.redirect((short) 4, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 8)) {
            return (String) iPatchRedirector.redirect((short) 8, this);
        }
        return "GProVoiceSmobaGameUserActionPush{roomId=" + this.roomId + ",userAction=" + this.userAction + ",newLeaderId=" + this.newLeaderId + ",currentMemberNum=" + this.currentMemberNum + ",seq=" + this.seq + ",}";
    }

    public GProVoiceSmobaGameUserActionPush(long j, ArrayList<GProVoiceSmobaGameUserAction> arrayList, long j2, long j3, long j4) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, new Object[]{this, Long.valueOf(j), arrayList, Long.valueOf(j2), Long.valueOf(j3), Long.valueOf(j4)});
            return;
        }
        this.userAction = new ArrayList<>();
        this.roomId = j;
        this.userAction = arrayList;
        this.newLeaderId = j2;
        this.currentMemberNum = j3;
        this.seq = j4;
    }
}
