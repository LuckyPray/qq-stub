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
/* loaded from: classes2.dex */
public final class GroupHonor {
    ArrayList<Integer> honorIds;
    Integer level;
    Integer oldLevel;
    Long rankSeq;
    Integer richFlag;
    Integer titleId;
    String uniqueTitle;

    public GroupHonor() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(88373, (short) 1);
        if (redirector != null) {
            redirector.redirect((short) 1, this);
        }
    }

    public ArrayList<Integer> getHonorIds() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(88373, (short) 4);
        return redirector != null ? (ArrayList) redirector.redirect((short) 4, this) : this.honorIds;
    }

    public Integer getLevel() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(88373, (short) 5);
        return redirector != null ? (Integer) redirector.redirect((short) 5, this) : this.level;
    }

    public Integer getOldLevel() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(88373, (short) 6);
        return redirector != null ? (Integer) redirector.redirect((short) 6, this) : this.oldLevel;
    }

    public Long getRankSeq() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(88373, (short) 7);
        return redirector != null ? (Long) redirector.redirect((short) 7, this) : this.rankSeq;
    }

    public Integer getRichFlag() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(88373, (short) 3);
        return redirector != null ? (Integer) redirector.redirect((short) 3, this) : this.richFlag;
    }

    public Integer getTitleId() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(88373, (short) 8);
        return redirector != null ? (Integer) redirector.redirect((short) 8, this) : this.titleId;
    }

    public String getUniqueTitle() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(88373, (short) 9);
        return redirector != null ? (String) redirector.redirect((short) 9, this) : this.uniqueTitle;
    }

    public String toString() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(88373, (short) 10);
        if (redirector != null) {
            return (String) redirector.redirect((short) 10, this);
        }
        return "GroupHonor{richFlag=" + this.richFlag + ",honorIds=" + this.honorIds + ",level=" + this.level + ",oldLevel=" + this.oldLevel + ",rankSeq=" + this.rankSeq + ",titleId=" + this.titleId + ",uniqueTitle=" + this.uniqueTitle + ",}";
    }

    public GroupHonor(Integer num, ArrayList<Integer> arrayList, Integer num2, Integer num3, Long l2, Integer num4, String str) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(88373, (short) 2);
        if (redirector != null) {
            redirector.redirect((short) 2, this, num, arrayList, num2, num3, l2, num4, str);
            return;
        }
        this.richFlag = num;
        this.honorIds = arrayList;
        this.level = num2;
        this.oldLevel = num3;
        this.rankSeq = l2;
        this.titleId = num4;
        this.uniqueTitle = str;
    }
}
