package com.tencent.qqnt.kernel.nativeinterface;

import java.util.ArrayList;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/VasInfo.class */
public final class VasInfo {
    public boolean bigClub;
    public int bigClubLevel;
    public int diyFontId;
    public ArrayList<Integer> diyNameplateIDs;
    public int extendNameplateId;
    public int faceId;
    public int fontEffect;
    public long gameCardId;
    public boolean gameIconShowFlag;
    public long gameLastLoginTime;
    public long gameNameplateId;
    public int gameRank;
    public int grayNameplateFlag;
    public int magicFont;
    public int nameplateVipType;
    public int newLoverDiamondFlag;
    public int pendantDiyId;
    public int pendantId;
    public int superVipTemplateId;
    public boolean svipFlag;
    public int vipDataFlag;
    public boolean vipFlag;
    public int vipFont;
    public int vipFontType;
    public int vipLevel;
    public int vipStartFlag;
    public boolean yearVipFlag;

    public VasInfo() {
        this.diyNameplateIDs = new ArrayList<>();
    }

    public boolean getBigClub() {
        return this.bigClub;
    }

    public int getBigClubLevel() {
        return this.bigClubLevel;
    }

    public int getDiyFontId() {
        return this.diyFontId;
    }

    public ArrayList<Integer> getDiyNameplateIDs() {
        return this.diyNameplateIDs;
    }

    public int getExtendNameplateId() {
        return this.extendNameplateId;
    }

    public int getFaceId() {
        return this.faceId;
    }

    public int getFontEffect() {
        return this.fontEffect;
    }

    public long getGameCardId() {
        return this.gameCardId;
    }

    public boolean getGameIconShowFlag() {
        return this.gameIconShowFlag;
    }

    public long getGameLastLoginTime() {
        return this.gameLastLoginTime;
    }

    public long getGameNameplateId() {
        return this.gameNameplateId;
    }

    public int getGameRank() {
        return this.gameRank;
    }

    public int getGrayNameplateFlag() {
        return this.grayNameplateFlag;
    }

    public int getMagicFont() {
        return this.magicFont;
    }

    public int getNameplateVipType() {
        return this.nameplateVipType;
    }

    public int getNewLoverDiamondFlag() {
        return this.newLoverDiamondFlag;
    }

    public int getPendantDiyId() {
        return this.pendantDiyId;
    }

    public int getPendantId() {
        return this.pendantId;
    }

    public int getSuperVipTemplateId() {
        return this.superVipTemplateId;
    }

    public boolean getSvipFlag() {
        return this.svipFlag;
    }

    public int getVipDataFlag() {
        return this.vipDataFlag;
    }

    public boolean getVipFlag() {
        return this.vipFlag;
    }

    public int getVipFont() {
        return this.vipFont;
    }

    public int getVipFontType() {
        return this.vipFontType;
    }

    public int getVipLevel() {
        return this.vipLevel;
    }

    public int getVipStartFlag() {
        return this.vipStartFlag;
    }

    public boolean getYearVipFlag() {
        return this.yearVipFlag;
    }

    public String toString() {
        return "VasInfo{vipFlag=" + this.vipFlag + ",yearVipFlag=" + this.yearVipFlag + ",svipFlag=" + this.svipFlag + ",vipLevel=" + this.vipLevel + ",bigClub=" + this.bigClub + ",bigClubLevel=" + this.bigClubLevel + ",nameplateVipType=" + this.nameplateVipType + ",grayNameplateFlag=" + this.grayNameplateFlag + ",superVipTemplateId=" + this.superVipTemplateId + ",diyFontId=" + this.diyFontId + ",pendantId=" + this.pendantId + ",pendantDiyId=" + this.pendantDiyId + ",faceId=" + this.faceId + ",vipFont=" + this.vipFont + ",vipFontType=" + this.vipFontType + ",magicFont=" + this.magicFont + ",fontEffect=" + this.fontEffect + ",newLoverDiamondFlag=" + this.newLoverDiamondFlag + ",extendNameplateId=" + this.extendNameplateId + ",diyNameplateIDs=" + this.diyNameplateIDs + ",vipStartFlag=" + this.vipStartFlag + ",vipDataFlag=" + this.vipDataFlag + ",gameNameplateId=" + this.gameNameplateId + ",gameLastLoginTime=" + this.gameLastLoginTime + ",gameRank=" + this.gameRank + ",gameIconShowFlag=" + this.gameIconShowFlag + ",gameCardId=" + this.gameCardId + ",}";
    }

    public VasInfo(boolean z, boolean z2, boolean z3, int i, boolean z4, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, ArrayList<Integer> arrayList, int i16, int i17, long j, long j2, int i18, boolean z5, long j3) {
        this.diyNameplateIDs = new ArrayList<>();
        this.vipFlag = z;
        this.yearVipFlag = z2;
        this.svipFlag = z3;
        this.vipLevel = i;
        this.bigClub = z4;
        this.bigClubLevel = i2;
        this.nameplateVipType = i3;
        this.grayNameplateFlag = i4;
        this.superVipTemplateId = i5;
        this.diyFontId = i6;
        this.pendantId = i7;
        this.pendantDiyId = i8;
        this.faceId = i9;
        this.vipFont = i10;
        this.vipFontType = i11;
        this.magicFont = i12;
        this.fontEffect = i13;
        this.newLoverDiamondFlag = i14;
        this.extendNameplateId = i15;
        this.diyNameplateIDs = arrayList;
        this.vipStartFlag = i16;
        this.vipDataFlag = i17;
        this.gameNameplateId = j;
        this.gameLastLoginTime = j2;
        this.gameRank = i18;
        this.gameIconShowFlag = z5;
        this.gameCardId = j3;
    }
}
