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
public final class TofuRecordElement {
    String background;
    int beancurstyle;
    String busiExtra;
    long busiid;
    String busiuuid;
    ArrayList<TofuContent> contentlist;
    long dependedmsgid;
    TofuContent descriptionContent;
    String icon;
    long msgtime;
    boolean onscreennotify;
    int type;
    ArrayList<String> uidlist;
    ArrayList<Long> uinlist;
    long updateTime;

    public TofuRecordElement() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(94847, (short) 1);
        if (redirector != null) {
            redirector.redirect((short) 1, this);
            return;
        }
        this.busiuuid = "";
        this.uinlist = new ArrayList<>();
        this.uidlist = new ArrayList<>();
    }

    public String getBackground() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(94847, (short) 9);
        return redirector != null ? (String) redirector.redirect((short) 9, this) : this.background;
    }

    public int getBeancurstyle() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(94847, (short) 6);
        return redirector != null ? ((Integer) redirector.redirect((short) 6, this)).intValue() : this.beancurstyle;
    }

    public String getBusiExtra() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(94847, (short) 13);
        return redirector != null ? (String) redirector.redirect((short) 13, this) : this.busiExtra;
    }

    public long getBusiid() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(94847, (short) 4);
        return redirector != null ? ((Long) redirector.redirect((short) 4, this)).longValue() : this.busiid;
    }

    public String getBusiuuid() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(94847, (short) 5);
        return redirector != null ? (String) redirector.redirect((short) 5, this) : this.busiuuid;
    }

    public ArrayList<TofuContent> getContentlist() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(94847, (short) 8);
        return redirector != null ? (ArrayList) redirector.redirect((short) 8, this) : this.contentlist;
    }

    public long getDependedmsgid() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(94847, (short) 15);
        return redirector != null ? ((Long) redirector.redirect((short) 15, this)).longValue() : this.dependedmsgid;
    }

    public TofuContent getDescriptionContent() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(94847, (short) 7);
        return redirector != null ? (TofuContent) redirector.redirect((short) 7, this) : this.descriptionContent;
    }

    public String getIcon() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(94847, (short) 10);
        return redirector != null ? (String) redirector.redirect((short) 10, this) : this.icon;
    }

    public long getMsgtime() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(94847, (short) 16);
        return redirector != null ? ((Long) redirector.redirect((short) 16, this)).longValue() : this.msgtime;
    }

    public boolean getOnscreennotify() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(94847, (short) 17);
        return redirector != null ? ((Boolean) redirector.redirect((short) 17, this)).booleanValue() : this.onscreennotify;
    }

    public int getType() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(94847, (short) 3);
        return redirector != null ? ((Integer) redirector.redirect((short) 3, this)).intValue() : this.type;
    }

    public ArrayList<String> getUidlist() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(94847, (short) 12);
        return redirector != null ? (ArrayList) redirector.redirect((short) 12, this) : this.uidlist;
    }

    public ArrayList<Long> getUinlist() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(94847, (short) 11);
        return redirector != null ? (ArrayList) redirector.redirect((short) 11, this) : this.uinlist;
    }

    public long getUpdateTime() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(94847, (short) 14);
        return redirector != null ? ((Long) redirector.redirect((short) 14, this)).longValue() : this.updateTime;
    }

    public String toString() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(94847, (short) 18);
        if (redirector != null) {
            return (String) redirector.redirect((short) 18, this);
        }
        return "TofuRecordElement{type=" + this.type + ",busiid=" + this.busiid + ",busiuuid=" + this.busiuuid + ",beancurstyle=" + this.beancurstyle + ",descriptionContent=" + this.descriptionContent + ",contentlist=" + this.contentlist + ",background=" + this.background + ",icon=" + this.icon + ",uinlist=" + this.uinlist + ",uidlist=" + this.uidlist + ",busiExtra=" + this.busiExtra + ",updateTime=" + this.updateTime + ",dependedmsgid=" + this.dependedmsgid + ",msgtime=" + this.msgtime + ",onscreennotify=" + this.onscreennotify + ",}";
    }

    public TofuRecordElement(int i2, long j2, String str, int i3, TofuContent tofuContent, ArrayList<TofuContent> arrayList, String str2, String str3, ArrayList<Long> arrayList2, ArrayList<String> arrayList3, String str4, long j3, long j4, long j5, boolean z) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(94847, (short) 2);
        if (redirector != null) {
            redirector.redirect((short) 2, this, Integer.valueOf(i2), Long.valueOf(j2), str, Integer.valueOf(i3), tofuContent, arrayList, str2, str3, arrayList2, arrayList3, str4, Long.valueOf(j3), Long.valueOf(j4), Long.valueOf(j5), Boolean.valueOf(z));
            return;
        }
        this.busiuuid = "";
        this.uinlist = new ArrayList<>();
        this.uidlist = new ArrayList<>();
        this.type = i2;
        this.busiid = j2;
        this.busiuuid = str;
        this.beancurstyle = i3;
        this.descriptionContent = tofuContent;
        this.contentlist = arrayList;
        this.background = str2;
        this.icon = str3;
        this.uinlist = arrayList2;
        this.uidlist = arrayList3;
        this.busiExtra = str4;
        this.updateTime = j3;
        this.dependedmsgid = j4;
        this.msgtime = j5;
        this.onscreennotify = z;
    }
}
