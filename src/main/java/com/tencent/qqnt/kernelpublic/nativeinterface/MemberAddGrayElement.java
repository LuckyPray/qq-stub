package com.tencent.qqnt.kernelpublic.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import java.io.Serializable;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernelpublic/nativeinterface/MemberAddGrayElement.class */
public final class MemberAddGrayElement implements Serializable {
    static IPatchRedirector $redirector_;
    public GrayTipMember otherAdd;
    public InviterAndInvited otherAddByOtherQRCode;
    public GrayTipMember otherAddByYourQRCode;
    public InviterAndInvited otherInviteOther;
    public GrayTipMember otherInviteYou;
    long serialVersionUID;
    public int showType;
    public GrayTipMember youAddByOtherQRCode;
    public GrayTipMember youInviteOther;

    public MemberAddGrayElement() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 1)) {
            this.serialVersionUID = 1L;
        } else {
            iPatchRedirector.redirect((short) 1, this);
        }
    }

    public GrayTipMember getOtherAdd() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.otherAdd : (GrayTipMember) iPatchRedirector.redirect((short) 4, this);
    }

    public InviterAndInvited getOtherAddByOtherQRCode() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.otherAddByOtherQRCode : (InviterAndInvited) iPatchRedirector.redirect((short) 5, this);
    }

    public GrayTipMember getOtherAddByYourQRCode() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.otherAddByYourQRCode : (GrayTipMember) iPatchRedirector.redirect((short) 6, this);
    }

    public InviterAndInvited getOtherInviteOther() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) ? this.otherInviteOther : (InviterAndInvited) iPatchRedirector.redirect((short) 8, this);
    }

    public GrayTipMember getOtherInviteYou() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 9)) ? this.otherInviteYou : (GrayTipMember) iPatchRedirector.redirect((short) 9, this);
    }

    public int getShowType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.showType : ((Integer) iPatchRedirector.redirect((short) 3, this)).intValue();
    }

    public GrayTipMember getYouAddByOtherQRCode() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.youAddByOtherQRCode : (GrayTipMember) iPatchRedirector.redirect((short) 7, this);
    }

    public GrayTipMember getYouInviteOther() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 10)) ? this.youInviteOther : (GrayTipMember) iPatchRedirector.redirect((short) 10, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 11)) {
            return (String) iPatchRedirector.redirect((short) 11, this);
        }
        return "MemberAddGrayElement{showType=" + this.showType + ",otherAdd=" + this.otherAdd + ",otherAddByOtherQRCode=" + this.otherAddByOtherQRCode + ",otherAddByYourQRCode=" + this.otherAddByYourQRCode + ",youAddByOtherQRCode=" + this.youAddByOtherQRCode + ",otherInviteOther=" + this.otherInviteOther + ",otherInviteYou=" + this.otherInviteYou + ",youInviteOther=" + this.youInviteOther + ",}";
    }

    public MemberAddGrayElement(int i, GrayTipMember grayTipMember, InviterAndInvited inviterAndInvited, GrayTipMember grayTipMember2, GrayTipMember grayTipMember3, InviterAndInvited inviterAndInvited2, GrayTipMember grayTipMember4, GrayTipMember grayTipMember5) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, new Object[]{this, Integer.valueOf(i), grayTipMember, inviterAndInvited, grayTipMember2, grayTipMember3, inviterAndInvited2, grayTipMember4, grayTipMember5});
            return;
        }
        this.serialVersionUID = 1L;
        this.showType = i;
        this.otherAdd = grayTipMember;
        this.otherAddByOtherQRCode = inviterAndInvited;
        this.otherAddByYourQRCode = grayTipMember2;
        this.youAddByOtherQRCode = grayTipMember3;
        this.otherInviteOther = inviterAndInvited2;
        this.otherInviteYou = grayTipMember4;
        this.youInviteOther = grayTipMember5;
    }
}
