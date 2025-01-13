package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProMsgSearchReq.class */
public final class GProMsgSearchReq {
    static IPatchRedirector $redirector_;
    public GProMsgSearchCond cond;
    public String cookie;
    public Integer count;
    public long guildId;
    public String query;
    public long tinyId;
    public Integer type;

    public GProMsgSearchReq() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 1)) {
            this.cookie = "";
        } else {
            iPatchRedirector.redirect((short) 1, this);
        }
    }

    public GProMsgSearchCond getCond() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.cond : (GProMsgSearchCond) iPatchRedirector.redirect((short) 7, this);
    }

    public String getCookie() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) ? this.cookie : (String) iPatchRedirector.redirect((short) 8, this);
    }

    public Integer getCount() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 9)) ? this.count : (Integer) iPatchRedirector.redirect((short) 9, this);
    }

    public long getGuildId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.guildId : ((Long) iPatchRedirector.redirect((short) 4, this)).longValue();
    }

    public String getQuery() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.query : (String) iPatchRedirector.redirect((short) 5, this);
    }

    public long getTinyId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.tinyId : ((Long) iPatchRedirector.redirect((short) 3, this)).longValue();
    }

    public Integer getType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.type : (Integer) iPatchRedirector.redirect((short) 6, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 10)) {
            return (String) iPatchRedirector.redirect((short) 10, this);
        }
        return "GProMsgSearchReq{tinyId=" + this.tinyId + ",guildId=" + this.guildId + ",query=" + this.query + ",type=" + this.type + ",cond=" + this.cond + ",cookie=" + this.cookie + ",count=" + this.count + ",}";
    }

    public GProMsgSearchReq(long j, long j2, String str, Integer num, GProMsgSearchCond gProMsgSearchCond, String str2, Integer num2) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, this, Long.valueOf(j), Long.valueOf(j2), str, num, gProMsgSearchCond, str2, num2);
            return;
        }
        this.cookie = "";
        this.tinyId = j;
        this.guildId = j2;
        this.query = str;
        this.type = num;
        this.cond = gProMsgSearchCond;
        this.cookie = str2;
        this.count = num2;
    }
}
