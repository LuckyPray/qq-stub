package com.tencent.qqnt.kernelpublic.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;
import java.io.Serializable;
import java.util.HashMap;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernelpublic/nativeinterface/XmlElement.class */
public final class XmlElement implements Serializable {
    static IPatchRedirector $redirector_;
    public long busiId;
    public long busiType;
    public int c2cType;
    public String content;
    public int ctrlFlag;
    public HashMap<String, String> members;
    public byte[] pbReserv;
    public Long seqId;
    long serialVersionUID;
    public int serviceType;
    public Long templId;
    public HashMap<String, String> templParam;

    public XmlElement() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
        } else {
            this.serialVersionUID = 1L;
            this.content = "";
        }
    }

    public long getBusiId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.busiId : ((Long) iPatchRedirector.redirect((short) 4, this)).longValue();
    }

    public long getBusiType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.busiType : ((Long) iPatchRedirector.redirect((short) 3, this)).longValue();
    }

    public int getC2cType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.c2cType : ((Integer) iPatchRedirector.redirect((short) 5, this)).intValue();
    }

    public String getContent() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) ? this.content : (String) iPatchRedirector.redirect((short) 8, this);
    }

    public int getCtrlFlag() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.ctrlFlag : ((Integer) iPatchRedirector.redirect((short) 7, this)).intValue();
    }

    public HashMap<String, String> getMembers() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 13)) ? this.members : (HashMap) iPatchRedirector.redirect((short) 13, this);
    }

    public byte[] getPbReserv() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 12)) ? this.pbReserv : (byte[]) iPatchRedirector.redirect((short) 12, this);
    }

    public Long getSeqId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 10)) ? this.seqId : (Long) iPatchRedirector.redirect((short) 10, this);
    }

    public int getServiceType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.serviceType : ((Integer) iPatchRedirector.redirect((short) 6, this)).intValue();
    }

    public Long getTemplId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 9)) ? this.templId : (Long) iPatchRedirector.redirect((short) 9, this);
    }

    public HashMap<String, String> getTemplParam() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 11)) ? this.templParam : (HashMap) iPatchRedirector.redirect((short) 11, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 14)) {
            return (String) iPatchRedirector.redirect((short) 14, this);
        }
        return "XmlElement{busiType=" + this.busiType + ",busiId=" + this.busiId + ",c2cType=" + this.c2cType + ",serviceType=" + this.serviceType + ",ctrlFlag=" + this.ctrlFlag + ",content=" + this.content + ",templId=" + this.templId + ",seqId=" + this.seqId + ",templParam=" + this.templParam + ",pbReserv=" + this.pbReserv + ",members=" + this.members + ",}";
    }

    public XmlElement(long j, long j2, int i, int i2, int i3, String str, Long l, Long l2, HashMap<String, String> hashMap, byte[] bArr, HashMap<String, String> hashMap2) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, this, Long.valueOf(j), Long.valueOf(j2), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), str, l, l2, hashMap, bArr, hashMap2);
            return;
        }
        this.serialVersionUID = 1L;
        this.content = "";
        this.busiType = j;
        this.busiId = j2;
        this.c2cType = i;
        this.serviceType = i2;
        this.ctrlFlag = i3;
        this.content = str;
        this.templId = l;
        this.seqId = l2;
        this.templParam = hashMap;
        this.pbReserv = bArr;
        this.members = hashMap2;
    }
}
