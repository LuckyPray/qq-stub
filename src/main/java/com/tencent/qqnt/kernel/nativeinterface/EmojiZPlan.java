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

/* loaded from: classes2.dex */
public final class EmojiZPlan {
    int actionId;
    String actionName;
    int actionType;
    String bytesReserveInfo;
    long peerUid;
    int playerNumber;

    public EmojiZPlan() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(83015, (short) 1);
        if (redirector != null) {
            redirector.redirect((short) 1, (Object) this);
            return;
        }
        this.actionName = "";
        this.bytesReserveInfo = "";
    }

    public int getActionId() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(83015, (short) 3);
        return redirector != null ? ((Integer) redirector.redirect((short) 3, (Object) this)).intValue() : this.actionId;
    }

    public String getActionName() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(83015, (short) 4);
        return redirector != null ? (String) redirector.redirect((short) 4, (Object) this) : this.actionName;
    }

    public int getActionType() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(83015, (short) 5);
        return redirector != null ? ((Integer) redirector.redirect((short) 5, (Object) this)).intValue() : this.actionType;
    }

    public String getBytesReserveInfo() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(83015, (short) 8);
        return redirector != null ? (String) redirector.redirect((short) 8, (Object) this) : this.bytesReserveInfo;
    }

    public long getPeerUid() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(83015, (short) 7);
        return redirector != null ? ((Long) redirector.redirect((short) 7, (Object) this)).longValue() : this.peerUid;
    }

    public int getPlayerNumber() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(83015, (short) 6);
        return redirector != null ? ((Integer) redirector.redirect((short) 6, (Object) this)).intValue() : this.playerNumber;
    }

    public String toString() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(83015, (short) 9);
        if (redirector != null) {
            return (String) redirector.redirect((short) 9, (Object) this);
        }
        return "EmojiZPlan{actionId=" + this.actionId + ",actionName=" + this.actionName + ",actionType=" + this.actionType + ",playerNumber=" + this.playerNumber + ",peerUid=" + this.peerUid + ",bytesReserveInfo=" + this.bytesReserveInfo + ",}";
    }

    public EmojiZPlan(int i2, String str, int i3, int i4, long j2, String str2) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(83015, (short) 2);
        if (redirector != null) {
            redirector.redirect((short) 2, this, Integer.valueOf(i2), str, Integer.valueOf(i3), Integer.valueOf(i4), Long.valueOf(j2), str2);
            return;
        }
        this.actionName = "";
        this.bytesReserveInfo = "";
        this.actionId = i2;
        this.actionName = str;
        this.actionType = i3;
        this.playerNumber = i4;
        this.peerUid = j2;
        this.bytesReserveInfo = str2;
    }
}
