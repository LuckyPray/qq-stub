package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;
import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProAddGuildWithOptionReq.class */
public final class GProAddGuildWithOptionReq {
    static IPatchRedirector $redirector_;
    public ArrayList<GProJoinGuildAnswerItem> answers;
    public String comment;
    public long guildId;
    public String sig;
    public GProSourceId sourceId;

    public GProAddGuildWithOptionReq() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.sourceId = new GProSourceId();
        this.sig = "";
        this.comment = "";
        this.answers = new ArrayList<>();
    }

    public ArrayList<GProJoinGuildAnswerItem> getAnswers() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.answers : (ArrayList) iPatchRedirector.redirect((short) 7, this);
    }

    public String getComment() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.comment : (String) iPatchRedirector.redirect((short) 6, this);
    }

    public long getGuildId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.guildId : ((Long) iPatchRedirector.redirect((short) 3, this)).longValue();
    }

    public String getSig() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.sig : (String) iPatchRedirector.redirect((short) 5, this);
    }

    public GProSourceId getSourceId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.sourceId : (GProSourceId) iPatchRedirector.redirect((short) 4, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 8)) {
            return (String) iPatchRedirector.redirect((short) 8, this);
        }
        return "GProAddGuildWithOptionReq{guildId=" + this.guildId + ",sourceId=" + this.sourceId + ",sig=" + this.sig + ",comment=" + this.comment + ",answers=" + this.answers + ",}";
    }

    public GProAddGuildWithOptionReq(long j, GProSourceId gProSourceId, String str, String str2, ArrayList<GProJoinGuildAnswerItem> arrayList) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, new Object[]{this, Long.valueOf(j), gProSourceId, str, str2, arrayList});
            return;
        }
        this.sourceId = new GProSourceId();
        this.sig = "";
        this.comment = "";
        this.answers = new ArrayList<>();
        this.guildId = j;
        this.sourceId = gProSourceId;
        this.sig = str;
        this.comment = str2;
        this.answers = arrayList;
    }
}
