package com.tencent.qqnt.kernelpublic.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;
import java.io.Serializable;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernelpublic/nativeinterface/CalendarElement.class */
public final class CalendarElement implements Serializable {
    static IPatchRedirector $redirector_;
    public long expireTimeMs;
    public String msg;
    public String schema;
    public int schemaType;
    long serialVersionUID;
    public String summary;

    public CalendarElement() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.serialVersionUID = 1L;
        this.summary = "";
        this.msg = "";
        this.schema = "";
    }

    public long getExpireTimeMs() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.expireTimeMs : ((Long) iPatchRedirector.redirect((short) 5, this)).longValue();
    }

    public String getMsg() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.msg : (String) iPatchRedirector.redirect((short) 4, this);
    }

    public String getSchema() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.schema : (String) iPatchRedirector.redirect((short) 7, this);
    }

    public int getSchemaType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.schemaType : ((Integer) iPatchRedirector.redirect((short) 6, this)).intValue();
    }

    public String getSummary() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.summary : (String) iPatchRedirector.redirect((short) 3, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 8)) {
            return (String) iPatchRedirector.redirect((short) 8, this);
        }
        return "CalendarElement{summary=" + this.summary + ",msg=" + this.msg + ",expireTimeMs=" + this.expireTimeMs + ",schemaType=" + this.schemaType + ",schema=" + this.schema + ",}";
    }

    public CalendarElement(String str, String str2, long j, int i, String str3) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, new Object[]{this, str, str2, Long.valueOf(j), Integer.valueOf(i), str3});
            return;
        }
        this.serialVersionUID = 1L;
        this.summary = "";
        this.msg = "";
        this.schema = "";
        this.summary = str;
        this.msg = str2;
        this.expireTimeMs = j;
        this.schemaType = i;
        this.schema = str3;
    }
}
