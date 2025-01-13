/*
 * QAuxiliary - An Xposed module for QQ/TIM
 * Copyright (C) 2019-2023 QAuxiliary developers
 * https://github.com/cinit/QAuxiliary
 *
 * This software is non-free but opensource software: you can redistribute it
 * and/or modify it under the terms of the GNU Affero General Public License
 * as published by the Free Software Foundation; either
 * version 3 of the License, or any later version and our eula as published
 * by QAuxiliary contributors.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * and eula along with this software.  If not, see
 * <https://www.gnu.org/licenses/>
 * <https://github.com/cinit/QAuxiliary/blob/master/LICENSE.md>.
 */

package com.tencent.qqnt.kernel.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.mobileqq.qfix.redirect.PatchRedirectCenter;
import java.io.Serializable;

/* compiled from: P */
/* loaded from: classes2.dex */
public final class MemberAddGrayElement implements Serializable {
    GrayTipMember otherAdd;
    InviterAndInvited otherAddByOtherQRCode;
    GrayTipMember otherAddByYourQRCode;
    InviterAndInvited otherInviteOther;
    GrayTipMember otherInviteYou;
    long serialVersionUID;
    int showType;
    GrayTipMember youAddByOtherQRCode;
    GrayTipMember youInviteOther;

    public MemberAddGrayElement() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93431, (short) 1);
        if (redirector != null) {
            redirector.redirect((short) 1, this);
        } else {
            this.serialVersionUID = 1L;
        }
    }

    public GrayTipMember getOtherAdd() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93431, (short) 4);
        return redirector != null ? (GrayTipMember) redirector.redirect((short) 4, this) : this.otherAdd;
    }

    public InviterAndInvited getOtherAddByOtherQRCode() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93431, (short) 5);
        return redirector != null ? (InviterAndInvited) redirector.redirect((short) 5, this) : this.otherAddByOtherQRCode;
    }

    public GrayTipMember getOtherAddByYourQRCode() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93431, (short) 6);
        return redirector != null ? (GrayTipMember) redirector.redirect((short) 6, this) : this.otherAddByYourQRCode;
    }

    public InviterAndInvited getOtherInviteOther() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93431, (short) 8);
        return redirector != null ? (InviterAndInvited) redirector.redirect((short) 8, this) : this.otherInviteOther;
    }

    public GrayTipMember getOtherInviteYou() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93431, (short) 9);
        return redirector != null ? (GrayTipMember) redirector.redirect((short) 9, this) : this.otherInviteYou;
    }

    public int getShowType() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93431, (short) 3);
        return redirector != null ? ((Integer) redirector.redirect((short) 3, this)).intValue() : this.showType;
    }

    public GrayTipMember getYouAddByOtherQRCode() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93431, (short) 7);
        return redirector != null ? (GrayTipMember) redirector.redirect((short) 7, this) : this.youAddByOtherQRCode;
    }

    public GrayTipMember getYouInviteOther() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93431, (short) 10);
        return redirector != null ? (GrayTipMember) redirector.redirect((short) 10, this) : this.youInviteOther;
    }

    public String toString() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93431, (short) 11);
        if (redirector != null) {
            return (String) redirector.redirect((short) 11, this);
        }
        return "MemberAddGrayElement{showType=" + this.showType + ",otherAdd=" + this.otherAdd + ",otherAddByOtherQRCode=" + this.otherAddByOtherQRCode + ",otherAddByYourQRCode=" + this.otherAddByYourQRCode + ",youAddByOtherQRCode=" + this.youAddByOtherQRCode + ",otherInviteOther=" + this.otherInviteOther + ",otherInviteYou=" + this.otherInviteYou + ",youInviteOther=" + this.youInviteOther + ",}";
    }

    public MemberAddGrayElement(int i2, GrayTipMember grayTipMember, InviterAndInvited inviterAndInvited, GrayTipMember grayTipMember2, GrayTipMember grayTipMember3, InviterAndInvited inviterAndInvited2, GrayTipMember grayTipMember4, GrayTipMember grayTipMember5) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93431, (short) 2);
        if (redirector != null) {
            redirector.redirect((short) 2, this, Integer.valueOf(i2), grayTipMember, inviterAndInvited, grayTipMember2, grayTipMember3, inviterAndInvited2, grayTipMember4, grayTipMember5);
            return;
        }
        this.serialVersionUID = 1L;
        this.showType = i2;
        this.otherAdd = grayTipMember;
        this.otherAddByOtherQRCode = inviterAndInvited;
        this.otherAddByYourQRCode = grayTipMember2;
        this.youAddByOtherQRCode = grayTipMember3;
        this.otherInviteOther = inviterAndInvited2;
        this.otherInviteYou = grayTipMember4;
        this.youInviteOther = grayTipMember5;
    }
}
