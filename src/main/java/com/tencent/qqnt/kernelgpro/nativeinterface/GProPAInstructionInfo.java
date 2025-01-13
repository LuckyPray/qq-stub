package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;
import java.io.Serializable;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProPAInstructionInfo.class */
public final class GProPAInstructionInfo implements Serializable {
    static IPatchRedirector $redirector_;
    public String data;
    public long logoutTime;
    public int logoutType;
    public int modal;
    public String msg;
    public String ruleFamily;
    public String ruleName;
    long serialVersionUID;
    public String title;
    public int type;
    public String url;

    public GProPAInstructionInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.serialVersionUID = 1L;
        this.title = "";
        this.msg = "";
        this.url = "";
        this.data = "";
        this.ruleName = "";
        this.ruleFamily = "";
    }

    public String getData() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) ? this.data : (String) iPatchRedirector.redirect((short) 8, this);
    }

    public long getLogoutTime() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 9)) ? this.logoutTime : ((Long) iPatchRedirector.redirect((short) 9, this)).longValue();
    }

    public int getLogoutType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 12)) ? this.logoutType : ((Integer) iPatchRedirector.redirect((short) 12, this)).intValue();
    }

    public int getModal() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.modal : ((Integer) iPatchRedirector.redirect((short) 7, this)).intValue();
    }

    public String getMsg() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.msg : (String) iPatchRedirector.redirect((short) 5, this);
    }

    public String getRuleFamily() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 11)) ? this.ruleFamily : (String) iPatchRedirector.redirect((short) 11, this);
    }

    public String getRuleName() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 10)) ? this.ruleName : (String) iPatchRedirector.redirect((short) 10, this);
    }

    public String getTitle() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.title : (String) iPatchRedirector.redirect((short) 4, this);
    }

    public int getType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.type : ((Integer) iPatchRedirector.redirect((short) 3, this)).intValue();
    }

    public String getUrl() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.url : (String) iPatchRedirector.redirect((short) 6, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 13)) {
            return (String) iPatchRedirector.redirect((short) 13, this);
        }
        return "GProPAInstructionInfo{type=" + this.type + ",title=" + this.title + ",msg=" + this.msg + ",url=" + this.url + ",modal=" + this.modal + ",data=" + this.data + ",logoutTime=" + this.logoutTime + ",ruleName=" + this.ruleName + ",ruleFamily=" + this.ruleFamily + ",logoutType=" + this.logoutType + ",}";
    }

    public GProPAInstructionInfo(int i, String str, String str2, String str3, int i2, String str4, long j, String str5, String str6, int i3) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, this, Integer.valueOf(i), str, str2, str3, Integer.valueOf(i2), str4, Long.valueOf(j), str5, str6, Integer.valueOf(i3));
            return;
        }
        this.serialVersionUID = 1L;
        this.title = "";
        this.msg = "";
        this.url = "";
        this.data = "";
        this.ruleName = "";
        this.ruleFamily = "";
        this.type = i;
        this.title = str;
        this.msg = str2;
        this.url = str3;
        this.modal = i2;
        this.data = str4;
        this.logoutTime = j;
        this.ruleName = str5;
        this.ruleFamily = str6;
        this.logoutType = i3;
    }
}
