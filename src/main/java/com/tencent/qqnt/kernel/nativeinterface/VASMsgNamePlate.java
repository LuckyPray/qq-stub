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
public final class VASMsgNamePlate {
    ArrayList<Integer> carouselNamePlateIds;
    Integer extendNamePlateId;
    Integer gameNamePlateId;
    Integer grayNamePlate;
    Integer msgBigClubFlag;
    Integer msgBigClubLevel;
    Integer msgVipLevel;
    Integer msgVipType;
    Integer namePlateId;
    Integer namePlateType;
    Integer vipStarFlag;

    public VASMsgNamePlate() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(95010, (short) 1);
        if (redirector != null) {
            redirector.redirect((short) 1, this);
        } else {
            this.carouselNamePlateIds = new ArrayList<>();
        }
    }

    public ArrayList<Integer> getCarouselNamePlateIds() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(95010, (short) 11);
        return redirector != null ? (ArrayList) redirector.redirect((short) 11, this) : this.carouselNamePlateIds;
    }

    public Integer getExtendNamePlateId() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(95010, (short) 12);
        return redirector != null ? (Integer) redirector.redirect((short) 12, this) : this.extendNamePlateId;
    }

    public Integer getGameNamePlateId() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(95010, (short) 13);
        return redirector != null ? (Integer) redirector.redirect((short) 13, this) : this.gameNamePlateId;
    }

    public Integer getGrayNamePlate() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(95010, (short) 7);
        return redirector != null ? (Integer) redirector.redirect((short) 7, this) : this.grayNamePlate;
    }

    public Integer getMsgBigClubFlag() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(95010, (short) 5);
        return redirector != null ? (Integer) redirector.redirect((short) 5, this) : this.msgBigClubFlag;
    }

    public Integer getMsgBigClubLevel() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(95010, (short) 6);
        return redirector != null ? (Integer) redirector.redirect((short) 6, this) : this.msgBigClubLevel;
    }

    public Integer getMsgVipLevel() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(95010, (short) 4);
        return redirector != null ? (Integer) redirector.redirect((short) 4, this) : this.msgVipLevel;
    }

    public Integer getMsgVipType() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(95010, (short) 3);
        return redirector != null ? (Integer) redirector.redirect((short) 3, this) : this.msgVipType;
    }

    public Integer getNamePlateId() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(95010, (short) 10);
        return redirector != null ? (Integer) redirector.redirect((short) 10, this) : this.namePlateId;
    }

    public Integer getNamePlateType() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(95010, (short) 8);
        return redirector != null ? (Integer) redirector.redirect((short) 8, this) : this.namePlateType;
    }

    public Integer getVipStarFlag() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(95010, (short) 9);
        return redirector != null ? (Integer) redirector.redirect((short) 9, this) : this.vipStarFlag;
    }

    public String toString() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(95010, (short) 14);
        if (redirector != null) {
            return (String) redirector.redirect((short) 14, this);
        }
        return "VASMsgNamePlate{msgVipType=" + this.msgVipType + ",msgVipLevel=" + this.msgVipLevel + ",msgBigClubFlag=" + this.msgBigClubFlag + ",msgBigClubLevel=" + this.msgBigClubLevel + ",grayNamePlate=" + this.grayNamePlate + ",namePlateType=" + this.namePlateType + ",vipStarFlag=" + this.vipStarFlag + ",namePlateId=" + this.namePlateId + ",carouselNamePlateIds=" + this.carouselNamePlateIds + ",extendNamePlateId=" + this.extendNamePlateId + ",gameNamePlateId=" + this.gameNamePlateId + ",}";
    }

    public VASMsgNamePlate(Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8, ArrayList<Integer> arrayList, Integer num9, Integer num10) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(95010, (short) 2);
        if (redirector != null) {
            redirector.redirect((short) 2, this, num, num2, num3, num4, num5, num6, num7, num8, arrayList, num9, num10);
            return;
        }
        this.carouselNamePlateIds = new ArrayList<>();
        this.msgVipType = num;
        this.msgVipLevel = num2;
        this.msgBigClubFlag = num3;
        this.msgBigClubLevel = num4;
        this.grayNamePlate = num5;
        this.namePlateType = num6;
        this.vipStarFlag = num7;
        this.namePlateId = num8;
        this.carouselNamePlateIds = arrayList;
        this.extendNamePlateId = num9;
        this.gameNamePlateId = num10;
    }
}
