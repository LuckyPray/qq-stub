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
import java.util.ArrayList;

/* compiled from: P */
/* loaded from: classes.dex */
public final class WalletElement {
    String authkey;
    String billNo;
    int channelId;
    int confType;
    int envelopeId;
    int grabState;
    long grabbedAmount;
    ArrayList<Long> grapUin;
    int msgFrom;
    int msgPriority;
    int msgType;
    String name;
    byte[] pbReserve;
    byte[] pcBody;
    WalletAio receiver;
    int redChannel;
    int redType;
    int resend;
    long sendUin;
    WalletAio sender;
    int sessiontype;
    byte[] stringIndex;
    int templateId;

    public WalletElement() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(95129, (short) 1);
        if (redirector != null) {
            redirector.redirect((short) 1, (Object) this);
            return;
        }
        this.sender = new WalletAio();
        this.receiver = new WalletAio();
        this.billNo = "";
        this.authkey = "";
        this.name = "";
        this.pcBody = new byte[0];
        this.stringIndex = new byte[0];
        this.grapUin = new ArrayList<>();
        this.pbReserve = new byte[0];
    }

    public String getAuthkey() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(95129, (short) 12);
        return redirector != null ? (String) redirector.redirect((short) 12, (Object) this) : this.authkey;
    }

    public String getBillNo() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(95129, (short) 11);
        return redirector != null ? (String) redirector.redirect((short) 11, (Object) this) : this.billNo;
    }

    public int getChannelId() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(95129, (short) 6);
        return redirector != null ? ((Integer) redirector.redirect((short) 6, (Object) this)).intValue() : this.channelId;
    }

    public int getConfType() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(95129, (short) 17);
        return redirector != null ? ((Integer) redirector.redirect((short) 17, (Object) this)).intValue() : this.confType;
    }

    public int getEnvelopeId() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(95129, (short) 15);
        return redirector != null ? ((Integer) redirector.redirect((short) 15, (Object) this)).intValue() : this.envelopeId;
    }

    public int getGrabState() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(95129, (short) 24);
        return redirector != null ? ((Integer) redirector.redirect((short) 24, (Object) this)).intValue() : this.grabState;
    }

    public long getGrabbedAmount() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(95129, (short) 25);
        return redirector != null ? ((Long) redirector.redirect((short) 25, (Object) this)).longValue() : this.grabbedAmount;
    }

    public ArrayList<Long> getGrapUin() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(95129, (short) 22);
        return redirector != null ? (ArrayList) redirector.redirect((short) 22, (Object) this) : this.grapUin;
    }

    public int getMsgFrom() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(95129, (short) 18);
        return redirector != null ? ((Integer) redirector.redirect((short) 18, (Object) this)).intValue() : this.msgFrom;
    }

    public int getMsgPriority() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(95129, (short) 9);
        return redirector != null ? ((Integer) redirector.redirect((short) 9, (Object) this)).intValue() : this.msgPriority;
    }

    public int getMsgType() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(95129, (short) 14);
        return redirector != null ? ((Integer) redirector.redirect((short) 14, (Object) this)).intValue() : this.msgType;
    }

    public String getName() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(95129, (short) 16);
        return redirector != null ? (String) redirector.redirect((short) 16, (Object) this) : this.name;
    }

    public byte[] getPbReserve() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(95129, (short) 23);
        return redirector != null ? (byte[]) redirector.redirect((short) 23, (Object) this) : this.pbReserve;
    }

    public byte[] getPcBody() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(95129, (short) 19);
        return redirector != null ? (byte[]) redirector.redirect((short) 19, (Object) this) : this.pcBody;
    }

    public WalletAio getReceiver() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(95129, (short) 5);
        return redirector != null ? (WalletAio) redirector.redirect((short) 5, (Object) this) : this.receiver;
    }

    public int getRedChannel() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(95129, (short) 21);
        return redirector != null ? ((Integer) redirector.redirect((short) 21, (Object) this)).intValue() : this.redChannel;
    }

    public int getRedType() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(95129, (short) 10);
        return redirector != null ? ((Integer) redirector.redirect((short) 10, (Object) this)).intValue() : this.redType;
    }

    public int getResend() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(95129, (short) 8);
        return redirector != null ? ((Integer) redirector.redirect((short) 8, (Object) this)).intValue() : this.resend;
    }

    public long getSendUin() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(95129, (short) 3);
        return redirector != null ? ((Long) redirector.redirect((short) 3, (Object) this)).longValue() : this.sendUin;
    }

    public WalletAio getSender() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(95129, (short) 4);
        return redirector != null ? (WalletAio) redirector.redirect((short) 4, (Object) this) : this.sender;
    }

    public int getSessiontype() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(95129, (short) 13);
        return redirector != null ? ((Integer) redirector.redirect((short) 13, (Object) this)).intValue() : this.sessiontype;
    }

    public byte[] getStringIndex() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(95129, (short) 20);
        return redirector != null ? (byte[]) redirector.redirect((short) 20, (Object) this) : this.stringIndex;
    }

    public int getTemplateId() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(95129, (short) 7);
        return redirector != null ? ((Integer) redirector.redirect((short) 7, (Object) this)).intValue() : this.templateId;
    }

    public String toString() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(95129, (short) 26);
        if (redirector != null) {
            return (String) redirector.redirect((short) 26, (Object) this);
        }
        return "WalletElement{sendUin=" + this.sendUin + ",sender=" + this.sender + ",receiver=" + this.receiver + ",channelId=" + this.channelId + ",templateId=" + this.templateId + ",resend=" + this.resend + ",msgPriority=" + this.msgPriority + ",redType=" + this.redType + ",billNo=" + this.billNo + ",authkey=" + this.authkey + ",sessiontype=" + this.sessiontype + ",msgType=" + this.msgType + ",envelopeId=" + this.envelopeId + ",name=" + this.name + ",confType=" + this.confType + ",msgFrom=" + this.msgFrom + ",pcBody=" + this.pcBody + ",stringIndex=" + this.stringIndex + ",redChannel=" + this.redChannel + ",grapUin=" + this.grapUin + ",pbReserve=" + this.pbReserve + ",grabState=" + this.grabState + ",grabbedAmount=" + this.grabbedAmount + ",}";
    }

    public WalletElement(long j2, WalletAio walletAio, WalletAio walletAio2, int i2, int i3, int i4, int i5, int i6, String str, String str2, int i7, int i8, int i9, String str3, int i10, int i11, byte[] bArr, byte[] bArr2, int i12, ArrayList<Long> arrayList, byte[] bArr3, int i13, long j3) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(95129, (short) 2);
        if (redirector != null) {
            redirector.redirect((short) 2, this, Long.valueOf(j2), walletAio, walletAio2, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), str, str2, Integer.valueOf(i7), Integer.valueOf(i8), Integer.valueOf(i9), str3, Integer.valueOf(i10), Integer.valueOf(i11), bArr, bArr2, Integer.valueOf(i12), arrayList, bArr3, Integer.valueOf(i13), Long.valueOf(j3));
            return;
        }
        this.sender = new WalletAio();
        this.receiver = new WalletAio();
        this.billNo = "";
        this.authkey = "";
        this.name = "";
        this.pcBody = new byte[0];
        this.stringIndex = new byte[0];
        this.grapUin = new ArrayList<>();
        this.pbReserve = new byte[0];
        this.sendUin = j2;
        this.sender = walletAio;
        this.receiver = walletAio2;
        this.channelId = i2;
        this.templateId = i3;
        this.resend = i4;
        this.msgPriority = i5;
        this.redType = i6;
        this.billNo = str;
        this.authkey = str2;
        this.sessiontype = i7;
        this.msgType = i8;
        this.envelopeId = i9;
        this.name = str3;
        this.confType = i10;
        this.msgFrom = i11;
        this.pcBody = bArr;
        this.stringIndex = bArr2;
        this.redChannel = i12;
        this.grapUin = arrayList;
        this.pbReserve = bArr3;
        this.grabState = i13;
        this.grabbedAmount = j3;
    }
}
