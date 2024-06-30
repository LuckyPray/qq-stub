package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProSourceId.class */
public final class GProSourceId {
    static IPatchRedirector $redirector_;
    public int entranceId;
    public String flag1;
    public String openid;
    public String pginSourceName;
    public String sceneId;
    public String sessionId;
    public long sourceApp;
    public String sourceId;
    public int sourceType;
    public String subSourceId;
    public String visitForm;

    public GProSourceId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.sceneId = "";
        this.openid = "";
        this.flag1 = "";
        this.sourceId = "";
        this.subSourceId = "";
        this.pginSourceName = "";
        this.visitForm = "";
        this.sessionId = "";
    }

    public int getEntranceId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 9)) ? this.entranceId : ((Integer) iPatchRedirector.redirect((short) 9, this)).intValue();
    }

    public String getFlag1() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.flag1 : (String) iPatchRedirector.redirect((short) 6, this);
    }

    public String getOpenid() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.openid : (String) iPatchRedirector.redirect((short) 5, this);
    }

    public String getPginSourceName() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 10)) ? this.pginSourceName : (String) iPatchRedirector.redirect((short) 10, this);
    }

    public String getSceneId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.sceneId : (String) iPatchRedirector.redirect((short) 4, this);
    }

    public String getSessionId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 12)) ? this.sessionId : (String) iPatchRedirector.redirect((short) 12, this);
    }

    public long getSourceApp() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.sourceApp : ((Long) iPatchRedirector.redirect((short) 3, this)).longValue();
    }

    public String getSourceId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.sourceId : (String) iPatchRedirector.redirect((short) 7, this);
    }

    public int getSourceType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 13)) ? this.sourceType : ((Integer) iPatchRedirector.redirect((short) 13, this)).intValue();
    }

    public String getSubSourceId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) ? this.subSourceId : (String) iPatchRedirector.redirect((short) 8, this);
    }

    public String getVisitForm() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 11)) ? this.visitForm : (String) iPatchRedirector.redirect((short) 11, this);
    }

    public void setEntranceId(int i) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 20)) {
            this.entranceId = i;
        } else {
            iPatchRedirector.redirect((short) 20, this, i);
        }
    }

    public void setFlag1(String str) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 17)) {
            this.flag1 = str;
        } else {
            iPatchRedirector.redirect((short) 17, this, str);
        }
    }

    public void setOpenid(String str) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 16)) {
            this.openid = str;
        } else {
            iPatchRedirector.redirect((short) 16, this, str);
        }
    }

    public void setPginSourceName(String str) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 21)) {
            this.pginSourceName = str;
        } else {
            iPatchRedirector.redirect((short) 21, this, str);
        }
    }

    public void setSceneId(String str) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 15)) {
            this.sceneId = str;
        } else {
            iPatchRedirector.redirect((short) 15, this, str);
        }
    }

    public void setSessionId(String str) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 23)) {
            this.sessionId = str;
        } else {
            iPatchRedirector.redirect((short) 23, this, str);
        }
    }

    public void setSourceApp(long j) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 14)) {
            this.sourceApp = j;
        } else {
            iPatchRedirector.redirect((short) 14, this, j);
        }
    }

    public void setSourceId(String str) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 18)) {
            this.sourceId = str;
        } else {
            iPatchRedirector.redirect((short) 18, this, str);
        }
    }

    public void setSourceType(int i) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 24)) {
            this.sourceType = i;
        } else {
            iPatchRedirector.redirect((short) 24, this, i);
        }
    }

    public void setSubSourceId(String str) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 19)) {
            this.subSourceId = str;
        } else {
            iPatchRedirector.redirect((short) 19, this, str);
        }
    }

    public void setVisitForm(String str) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 22)) {
            this.visitForm = str;
        } else {
            iPatchRedirector.redirect((short) 22, this, str);
        }
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 25)) {
            return (String) iPatchRedirector.redirect((short) 25, this);
        }
        return "GProSourceId{sourceApp=" + this.sourceApp + ",sceneId=" + this.sceneId + ",openid=" + this.openid + ",flag1=" + this.flag1 + ",sourceId=" + this.sourceId + ",subSourceId=" + this.subSourceId + ",entranceId=" + this.entranceId + ",pginSourceName=" + this.pginSourceName + ",visitForm=" + this.visitForm + ",sessionId=" + this.sessionId + ",sourceType=" + this.sourceType + ",}";
    }

    public GProSourceId(long j, String str, String str2, String str3, String str4, String str5, int i, String str6, String str7, String str8, int i2) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, new Object[]{this, Long.valueOf(j), str, str2, str3, str4, str5, Integer.valueOf(i), str6, str7, str8, Integer.valueOf(i2)});
            return;
        }
        this.sceneId = "";
        this.openid = "";
        this.flag1 = "";
        this.sourceId = "";
        this.subSourceId = "";
        this.pginSourceName = "";
        this.visitForm = "";
        this.sessionId = "";
        this.sourceApp = j;
        this.sceneId = str;
        this.openid = str2;
        this.flag1 = str3;
        this.sourceId = str4;
        this.subSourceId = str5;
        this.entranceId = i;
        this.pginSourceName = str6;
        this.visitForm = str7;
        this.sessionId = str8;
        this.sourceType = i2;
    }
}
