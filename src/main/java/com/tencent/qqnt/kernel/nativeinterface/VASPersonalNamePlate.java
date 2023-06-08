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

/* loaded from: classes.dex */
public final class VASPersonalNamePlate {
    ArrayList<Integer> carouselNamePlateIds;
    ArrayList<Integer> diyNamePlateContentIds;
    Integer diyNamePlateItemId;
    Integer extendNamePlateId;
    Integer gameNamePlateId;
    Integer isGray;
    Integer namePlateId;
    Integer vipLevel;
    Integer vipStarFlag;
    Integer vipType;

    public VASPersonalNamePlate() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(95029, (short) 1);
        if (redirector != null) {
            redirector.redirect((short) 1, (Object) this);
            return;
        }
        this.carouselNamePlateIds = new ArrayList<>();
        this.diyNamePlateContentIds = new ArrayList<>();
    }

    public ArrayList<Integer> getCarouselNamePlateIds() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(95029, (short) 7);
        return redirector != null ? (ArrayList) redirector.redirect((short) 7, (Object) this) : this.carouselNamePlateIds;
    }

    public ArrayList<Integer> getDiyNamePlateContentIds() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(95029, (short) 9);
        return redirector != null ? (ArrayList) redirector.redirect((short) 9, (Object) this) : this.diyNamePlateContentIds;
    }

    public Integer getDiyNamePlateItemId() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(95029, (short) 8);
        return redirector != null ? (Integer) redirector.redirect((short) 8, (Object) this) : this.diyNamePlateItemId;
    }

    public Integer getExtendNamePlateId() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(95029, (short) 10);
        return redirector != null ? (Integer) redirector.redirect((short) 10, (Object) this) : this.extendNamePlateId;
    }

    public Integer getGameNamePlateId() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(95029, (short) 11);
        return redirector != null ? (Integer) redirector.redirect((short) 11, (Object) this) : this.gameNamePlateId;
    }

    public Integer getIsGray() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(95029, (short) 3);
        return redirector != null ? (Integer) redirector.redirect((short) 3, (Object) this) : this.isGray;
    }

    public Integer getNamePlateId() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(95029, (short) 6);
        return redirector != null ? (Integer) redirector.redirect((short) 6, (Object) this) : this.namePlateId;
    }

    public Integer getVipLevel() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(95029, (short) 5);
        return redirector != null ? (Integer) redirector.redirect((short) 5, (Object) this) : this.vipLevel;
    }

    public Integer getVipStarFlag() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(95029, (short) 12);
        return redirector != null ? (Integer) redirector.redirect((short) 12, (Object) this) : this.vipStarFlag;
    }

    public Integer getVipType() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(95029, (short) 4);
        return redirector != null ? (Integer) redirector.redirect((short) 4, (Object) this) : this.vipType;
    }

    public String toString() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(95029, (short) 13);
        if (redirector != null) {
            return (String) redirector.redirect((short) 13, (Object) this);
        }
        return "VASPersonalNamePlate{isGray=" + this.isGray + ",vipType=" + this.vipType + ",vipLevel=" + this.vipLevel + ",namePlateId=" + this.namePlateId + ",carouselNamePlateIds=" + this.carouselNamePlateIds + ",diyNamePlateItemId=" + this.diyNamePlateItemId + ",diyNamePlateContentIds=" + this.diyNamePlateContentIds + ",extendNamePlateId=" + this.extendNamePlateId + ",gameNamePlateId=" + this.gameNamePlateId + ",vipStarFlag=" + this.vipStarFlag + ",}";
    }

    public VASPersonalNamePlate(Integer num, Integer num2, Integer num3, Integer num4, ArrayList<Integer> arrayList, Integer num5, ArrayList<Integer> arrayList2, Integer num6, Integer num7, Integer num8) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(95029, (short) 2);
        if (redirector != null) {
            redirector.redirect((short) 2, this, num, num2, num3, num4, arrayList, num5, arrayList2, num6, num7, num8);
            return;
        }
        this.carouselNamePlateIds = new ArrayList<>();
        this.diyNamePlateContentIds = new ArrayList<>();
        this.isGray = num;
        this.vipType = num2;
        this.vipLevel = num3;
        this.namePlateId = num4;
        this.carouselNamePlateIds = arrayList;
        this.diyNamePlateItemId = num5;
        this.diyNamePlateContentIds = arrayList2;
        this.extendNamePlateId = num6;
        this.gameNamePlateId = num7;
        this.vipStarFlag = num8;
    }
}
