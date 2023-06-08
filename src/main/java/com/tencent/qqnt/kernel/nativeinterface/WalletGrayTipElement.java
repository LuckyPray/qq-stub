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
public final class WalletGrayTipElement {
    byte[] authkey;
    byte[] broadcastRichContent;
    int hideFlag;
    int icon;
    byte[] idiom;
    byte[] idiomAlpha;
    int idiomSeq;
    String jumpUrl;
    int luckyFlag;
    long luckyUin;
    int msgType;
    byte[] pcBody;
    byte[] poemRule;
    int random;
    byte[] receiverRichContent;
    long receiverUin;
    byte[] senderRichContent;
    long senderUin;
    int showLastest;
    int subchannel;
    int time;

    public WalletGrayTipElement() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(95130, (short) 1);
        if (redirector != null) {
            redirector.redirect((short) 1, (Object) this);
            return;
        }
        this.senderRichContent = new byte[0];
        this.receiverRichContent = new byte[0];
        this.authkey = new byte[0];
        this.pcBody = new byte[0];
        this.broadcastRichContent = new byte[0];
        this.idiom = new byte[0];
        this.idiomAlpha = new byte[0];
        this.jumpUrl = "";
        this.poemRule = new byte[0];
    }

    public byte[] getAuthkey() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(95130, (short) 8);
        return redirector != null ? (byte[]) redirector.redirect((short) 8, (Object) this) : this.authkey;
    }

    public byte[] getBroadcastRichContent() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(95130, (short) 17);
        return redirector != null ? (byte[]) redirector.redirect((short) 17, (Object) this) : this.broadcastRichContent;
    }

    public int getHideFlag() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(95130, (short) 11);
        return redirector != null ? ((Integer) redirector.redirect((short) 11, (Object) this)).intValue() : this.hideFlag;
    }

    public int getIcon() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(95130, (short) 13);
        return redirector != null ? ((Integer) redirector.redirect((short) 13, (Object) this)).intValue() : this.icon;
    }

    public byte[] getIdiom() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(95130, (short) 18);
        return redirector != null ? (byte[]) redirector.redirect((short) 18, (Object) this) : this.idiom;
    }

    public byte[] getIdiomAlpha() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(95130, (short) 20);
        return redirector != null ? (byte[]) redirector.redirect((short) 20, (Object) this) : this.idiomAlpha;
    }

    public int getIdiomSeq() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(95130, (short) 19);
        return redirector != null ? ((Integer) redirector.redirect((short) 19, (Object) this)).intValue() : this.idiomSeq;
    }

    public String getJumpUrl() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(95130, (short) 21);
        return redirector != null ? (String) redirector.redirect((short) 21, (Object) this) : this.jumpUrl;
    }

    public int getLuckyFlag() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(95130, (short) 10);
        return redirector != null ? ((Integer) redirector.redirect((short) 10, (Object) this)).intValue() : this.luckyFlag;
    }

    public long getLuckyUin() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(95130, (short) 14);
        return redirector != null ? ((Long) redirector.redirect((short) 14, (Object) this)).longValue() : this.luckyUin;
    }

    public int getMsgType() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(95130, (short) 9);
        return redirector != null ? ((Integer) redirector.redirect((short) 9, (Object) this)).intValue() : this.msgType;
    }

    public byte[] getPcBody() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(95130, (short) 12);
        return redirector != null ? (byte[]) redirector.redirect((short) 12, (Object) this) : this.pcBody;
    }

    public byte[] getPoemRule() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(95130, (short) 23);
        return redirector != null ? (byte[]) redirector.redirect((short) 23, (Object) this) : this.poemRule;
    }

    public int getRandom() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(95130, (short) 16);
        return redirector != null ? ((Integer) redirector.redirect((short) 16, (Object) this)).intValue() : this.random;
    }

    public byte[] getReceiverRichContent() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(95130, (short) 7);
        return redirector != null ? (byte[]) redirector.redirect((short) 7, (Object) this) : this.receiverRichContent;
    }

    public long getReceiverUin() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(95130, (short) 5);
        return redirector != null ? ((Long) redirector.redirect((short) 5, (Object) this)).longValue() : this.receiverUin;
    }

    public byte[] getSenderRichContent() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(95130, (short) 6);
        return redirector != null ? (byte[]) redirector.redirect((short) 6, (Object) this) : this.senderRichContent;
    }

    public long getSenderUin() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(95130, (short) 4);
        return redirector != null ? ((Long) redirector.redirect((short) 4, (Object) this)).longValue() : this.senderUin;
    }

    public int getShowLastest() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(95130, (short) 3);
        return redirector != null ? ((Integer) redirector.redirect((short) 3, (Object) this)).intValue() : this.showLastest;
    }

    public int getSubchannel() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(95130, (short) 22);
        return redirector != null ? ((Integer) redirector.redirect((short) 22, (Object) this)).intValue() : this.subchannel;
    }

    public int getTime() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(95130, (short) 15);
        return redirector != null ? ((Integer) redirector.redirect((short) 15, (Object) this)).intValue() : this.time;
    }

    public String toString() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(95130, (short) 24);
        if (redirector != null) {
            return (String) redirector.redirect((short) 24, (Object) this);
        }
        return "WalletGrayTipElement{showLastest=" + this.showLastest + ",senderUin=" + this.senderUin + ",receiverUin=" + this.receiverUin + ",senderRichContent=" + this.senderRichContent + ",receiverRichContent=" + this.receiverRichContent + ",authkey=" + this.authkey + ",msgType=" + this.msgType + ",luckyFlag=" + this.luckyFlag + ",hideFlag=" + this.hideFlag + ",pcBody=" + this.pcBody + ",icon=" + this.icon + ",luckyUin=" + this.luckyUin + ",time=" + this.time + ",random=" + this.random + ",broadcastRichContent=" + this.broadcastRichContent + ",idiom=" + this.idiom + ",idiomSeq=" + this.idiomSeq + ",idiomAlpha=" + this.idiomAlpha + ",jumpUrl=" + this.jumpUrl + ",subchannel=" + this.subchannel + ",poemRule=" + this.poemRule + ",}";
    }

    public WalletGrayTipElement(int i2, long j2, long j3, byte[] bArr, byte[] bArr2, byte[] bArr3, int i3, int i4, int i5, byte[] bArr4, int i6, long j4, int i7, int i8, byte[] bArr5, byte[] bArr6, int i9, byte[] bArr7, String str, int i10, byte[] bArr8) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(95130, (short) 2);
        if (redirector != null) {
            redirector.redirect((short) 2, this, Integer.valueOf(i2), Long.valueOf(j2), Long.valueOf(j3), bArr, bArr2, bArr3, Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), bArr4, Integer.valueOf(i6), Long.valueOf(j4), Integer.valueOf(i7), Integer.valueOf(i8), bArr5, bArr6, Integer.valueOf(i9), bArr7, str, Integer.valueOf(i10), bArr8);
            return;
        }
        this.senderRichContent = new byte[0];
        this.receiverRichContent = new byte[0];
        this.authkey = new byte[0];
        this.pcBody = new byte[0];
        this.broadcastRichContent = new byte[0];
        this.idiom = new byte[0];
        this.idiomAlpha = new byte[0];
        this.jumpUrl = "";
        this.poemRule = new byte[0];
        this.showLastest = i2;
        this.senderUin = j2;
        this.receiverUin = j3;
        this.senderRichContent = bArr;
        this.receiverRichContent = bArr2;
        this.authkey = bArr3;
        this.msgType = i3;
        this.luckyFlag = i4;
        this.hideFlag = i5;
        this.pcBody = bArr4;
        this.icon = i6;
        this.luckyUin = j4;
        this.time = i7;
        this.random = i8;
        this.broadcastRichContent = bArr5;
        this.idiom = bArr6;
        this.idiomSeq = i9;
        this.idiomAlpha = bArr7;
        this.jumpUrl = str;
        this.subchannel = i10;
        this.poemRule = bArr8;
    }
}
