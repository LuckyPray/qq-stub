package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;
import java.io.Serializable;
import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProUnifiedEssenceInfo.class */
public final class GProUnifiedEssenceInfo implements Serializable {
    static IPatchRedirector $redirector_;
    public ArrayList<GProEssenceChannel> channels;
    public String content;
    public Long operatorName;
    long serialVersionUID;
    public Integer status;
    public String title;
    public Integer type;
    public long uniqueId;
    public String visitorMsg;

    public GProUnifiedEssenceInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.serialVersionUID = 1L;
        this.content = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.channels = new ArrayList<>();
        this.visitorMsg = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    }

    public ArrayList<GProEssenceChannel> getChannels() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.channels : (ArrayList) iPatchRedirector.redirect((short) 7, this);
    }

    public String getContent() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.content : (String) iPatchRedirector.redirect((short) 5, this);
    }

    public Long getOperatorName() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.operatorName : (Long) iPatchRedirector.redirect((short) 6, this);
    }

    public Integer getStatus() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) ? this.status : (Integer) iPatchRedirector.redirect((short) 8, this);
    }

    public String getTitle() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.title : (String) iPatchRedirector.redirect((short) 4, this);
    }

    public Integer getType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.type : (Integer) iPatchRedirector.redirect((short) 3, this);
    }

    public long getUniqueId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 9)) ? this.uniqueId : ((Long) iPatchRedirector.redirect((short) 9, this)).longValue();
    }

    public String getVisitorMsg() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 10)) ? this.visitorMsg : (String) iPatchRedirector.redirect((short) 10, this);
    }

    public void setChannels(ArrayList<GProEssenceChannel> arrayList) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 15)) {
            this.channels = arrayList;
        } else {
            iPatchRedirector.redirect((short) 15, this, arrayList);
        }
    }

    public void setContent(String str) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 13)) {
            this.content = str;
        } else {
            iPatchRedirector.redirect((short) 13, this, str);
        }
    }

    public void setOperatorName(Long l) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 14)) {
            this.operatorName = l;
        } else {
            iPatchRedirector.redirect((short) 14, this, l);
        }
    }

    public void setStatus(Integer num) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 16)) {
            this.status = num;
        } else {
            iPatchRedirector.redirect((short) 16, this, num);
        }
    }

    public void setTitle(String str) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 12)) {
            this.title = str;
        } else {
            iPatchRedirector.redirect((short) 12, this, str);
        }
    }

    public void setType(Integer num) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 11)) {
            this.type = num;
        } else {
            iPatchRedirector.redirect((short) 11, this, num);
        }
    }

    public void setUniqueId(long j) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 17)) {
            this.uniqueId = j;
        } else {
            iPatchRedirector.redirect((short) 17, this, j);
        }
    }

    public void setVisitorMsg(String str) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 18)) {
            this.visitorMsg = str;
        } else {
            iPatchRedirector.redirect((short) 18, this, str);
        }
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 19)) {
            return (String) iPatchRedirector.redirect((short) 19, this);
        }
        return "GProUnifiedEssenceInfo{type=" + this.type + ",title=" + this.title + ",content=" + this.content + ",operatorName=" + this.operatorName + ",channels=" + this.channels + ",status=" + this.status + ",uniqueId=" + this.uniqueId + ",visitorMsg=" + this.visitorMsg + ",}";
    }

    public GProUnifiedEssenceInfo(Integer num, String str, String str2, Long l, ArrayList<GProEssenceChannel> arrayList, Integer num2, long j, String str3) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, new Object[]{this, num, str, str2, l, arrayList, num2, Long.valueOf(j), str3});
            return;
        }
        this.serialVersionUID = 1L;
        this.content = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.channels = new ArrayList<>();
        this.visitorMsg = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.type = num;
        this.title = str;
        this.content = str2;
        this.operatorName = l;
        this.channels = arrayList;
        this.status = num2;
        this.uniqueId = j;
        this.visitorMsg = str3;
    }
}
