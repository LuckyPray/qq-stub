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

/* compiled from: P */
/* loaded from: classes.dex */
public final class VASMsgElement {
    VASMsgAvatarPendant avatarPendantInfo;
    VASMsgBubble bubbleInfo;
    VASMsgIceBreak iceBreakInfo;
    VASMsgNamePlate msgNamePlateInfo;
    VASMsgFont vasFont;

    public VASMsgElement() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(94999, (short) 1);
        if (redirector != null) {
            redirector.redirect((short) 1, this);
            return;
        }
        this.msgNamePlateInfo = new VASMsgNamePlate();
        this.bubbleInfo = new VASMsgBubble();
        this.avatarPendantInfo = new VASMsgAvatarPendant();
        this.vasFont = new VASMsgFont();
        this.iceBreakInfo = new VASMsgIceBreak();
    }

    public VASMsgAvatarPendant getAvatarPendantInfo() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(94999, (short) 5);
        return redirector != null ? (VASMsgAvatarPendant) redirector.redirect((short) 5, this) : this.avatarPendantInfo;
    }

    public VASMsgBubble getBubbleInfo() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(94999, (short) 4);
        return redirector != null ? (VASMsgBubble) redirector.redirect((short) 4, this) : this.bubbleInfo;
    }

    public VASMsgIceBreak getIceBreakInfo() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(94999, (short) 7);
        return redirector != null ? (VASMsgIceBreak) redirector.redirect((short) 7, this) : this.iceBreakInfo;
    }

    public VASMsgNamePlate getMsgNamePlateInfo() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(94999, (short) 3);
        return redirector != null ? (VASMsgNamePlate) redirector.redirect((short) 3, this) : this.msgNamePlateInfo;
    }

    public VASMsgFont getVasFont() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(94999, (short) 6);
        return redirector != null ? (VASMsgFont) redirector.redirect((short) 6, this) : this.vasFont;
    }

    public String toString() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(94999, (short) 8);
        if (redirector != null) {
            return (String) redirector.redirect((short) 8, this);
        }
        return "VASMsgElement{msgNamePlateInfo=" + this.msgNamePlateInfo + ",bubbleInfo=" + this.bubbleInfo + ",avatarPendantInfo=" + this.avatarPendantInfo + ",vasFont=" + this.vasFont + ",iceBreakInfo=" + this.iceBreakInfo + ",}";
    }

    public VASMsgElement(VASMsgNamePlate vASMsgNamePlate, VASMsgBubble vASMsgBubble, VASMsgAvatarPendant vASMsgAvatarPendant, VASMsgFont vASMsgFont, VASMsgIceBreak vASMsgIceBreak) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(94999, (short) 2);
        if (redirector != null) {
            redirector.redirect((short) 2, this, vASMsgNamePlate, vASMsgBubble, vASMsgAvatarPendant, vASMsgFont, vASMsgIceBreak);
            return;
        }
        this.msgNamePlateInfo = new VASMsgNamePlate();
        this.bubbleInfo = new VASMsgBubble();
        this.avatarPendantInfo = new VASMsgAvatarPendant();
        this.vasFont = new VASMsgFont();
        this.iceBreakInfo = new VASMsgIceBreak();
        this.msgNamePlateInfo = vASMsgNamePlate;
        this.bubbleInfo = vASMsgBubble;
        this.avatarPendantInfo = vASMsgAvatarPendant;
        this.vasFont = vASMsgFont;
        this.iceBreakInfo = vASMsgIceBreak;
    }
}
