package com.tencent.qqnt.kernelpublic.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;
import java.io.Serializable;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernelpublic/nativeinterface/RevokeElement.class */
public final class RevokeElement implements Serializable {
    static IPatchRedirector $redirector_;
    public boolean isSelfOperate;
    public String operatorMemRemark;
    public String operatorNick;
    public String operatorRemark;
    public long operatorRole;
    public long operatorTinyId;
    public String operatorUid;
    public String origMsgSenderMemRemark;
    public String origMsgSenderNick;
    public String origMsgSenderRemark;
    public String origMsgSenderUid;
    long serialVersionUID;
    public String wording;

    public RevokeElement() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.serialVersionUID = 1L;
        this.operatorUid = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.origMsgSenderUid = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.wording = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    }

    public boolean getIsSelfOperate() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 13)) ? this.isSelfOperate : ((Boolean) iPatchRedirector.redirect((short) 13, this)).booleanValue();
    }

    public String getOperatorMemRemark() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) ? this.operatorMemRemark : (String) iPatchRedirector.redirect((short) 8, this);
    }

    public String getOperatorNick() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.operatorNick : (String) iPatchRedirector.redirect((short) 6, this);
    }

    public String getOperatorRemark() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.operatorRemark : (String) iPatchRedirector.redirect((short) 7, this);
    }

    public long getOperatorRole() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.operatorRole : ((Long) iPatchRedirector.redirect((short) 4, this)).longValue();
    }

    public long getOperatorTinyId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.operatorTinyId : ((Long) iPatchRedirector.redirect((short) 3, this)).longValue();
    }

    public String getOperatorUid() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.operatorUid : (String) iPatchRedirector.redirect((short) 5, this);
    }

    public String getOrigMsgSenderMemRemark() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 12)) ? this.origMsgSenderMemRemark : (String) iPatchRedirector.redirect((short) 12, this);
    }

    public String getOrigMsgSenderNick() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 10)) ? this.origMsgSenderNick : (String) iPatchRedirector.redirect((short) 10, this);
    }

    public String getOrigMsgSenderRemark() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 11)) ? this.origMsgSenderRemark : (String) iPatchRedirector.redirect((short) 11, this);
    }

    public String getOrigMsgSenderUid() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 9)) ? this.origMsgSenderUid : (String) iPatchRedirector.redirect((short) 9, this);
    }

    public String getWording() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 14)) ? this.wording : (String) iPatchRedirector.redirect((short) 14, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 15)) {
            return (String) iPatchRedirector.redirect((short) 15, this);
        }
        return "RevokeElement{operatorTinyId=" + this.operatorTinyId + ",operatorRole=" + this.operatorRole + ",operatorUid=" + this.operatorUid + ",operatorNick=" + this.operatorNick + ",operatorRemark=" + this.operatorRemark + ",operatorMemRemark=" + this.operatorMemRemark + ",origMsgSenderUid=" + this.origMsgSenderUid + ",origMsgSenderNick=" + this.origMsgSenderNick + ",origMsgSenderRemark=" + this.origMsgSenderRemark + ",origMsgSenderMemRemark=" + this.origMsgSenderMemRemark + ",isSelfOperate=" + this.isSelfOperate + ",wording=" + this.wording + ",}";
    }

    public RevokeElement(long j, long j2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z, String str9) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, new Object[]{this, Long.valueOf(j), Long.valueOf(j2), str, str2, str3, str4, str5, str6, str7, str8, Boolean.valueOf(z), str9});
            return;
        }
        this.serialVersionUID = 1L;
        this.operatorUid = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.origMsgSenderUid = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.wording = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.operatorTinyId = j;
        this.operatorRole = j2;
        this.operatorUid = str;
        this.operatorNick = str2;
        this.operatorRemark = str3;
        this.operatorMemRemark = str4;
        this.origMsgSenderUid = str5;
        this.origMsgSenderNick = str6;
        this.origMsgSenderRemark = str7;
        this.origMsgSenderMemRemark = str8;
        this.isSelfOperate = z;
        this.wording = str9;
    }
}
