package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;
import java.io.Serializable;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProGiftInfo.class */
public final class GProGiftInfo implements Serializable {
    static IPatchRedirector $redirector_;
    public int allComboCnt;
    public boolean comboOver;
    public long comboSeq;
    public int effectLevel;
    public int giftId;
    public String giftName;
    public int giftNum;
    public long giftPrice;
    public int giftType;
    public int materialId;
    public int sendType;
    long serialVersionUID;

    public GProGiftInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
        } else {
            this.serialVersionUID = 1L;
            this.giftName = "";
        }
    }

    public int getAllComboCnt() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 10)) ? this.allComboCnt : ((Integer) iPatchRedirector.redirect((short) 10, this)).intValue();
    }

    public boolean getComboOver() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 9)) ? this.comboOver : ((Boolean) iPatchRedirector.redirect((short) 9, this)).booleanValue();
    }

    public long getComboSeq() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) ? this.comboSeq : ((Long) iPatchRedirector.redirect((short) 8, this)).longValue();
    }

    public int getEffectLevel() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 12)) ? this.effectLevel : ((Integer) iPatchRedirector.redirect((short) 12, this)).intValue();
    }

    public int getGiftId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.giftId : ((Integer) iPatchRedirector.redirect((short) 4, this)).intValue();
    }

    public String getGiftName() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.giftName : (String) iPatchRedirector.redirect((short) 5, this);
    }

    public int getGiftNum() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.giftNum : ((Integer) iPatchRedirector.redirect((short) 6, this)).intValue();
    }

    public long getGiftPrice() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 13)) ? this.giftPrice : ((Long) iPatchRedirector.redirect((short) 13, this)).longValue();
    }

    public int getGiftType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.giftType : ((Integer) iPatchRedirector.redirect((short) 3, this)).intValue();
    }

    public int getMaterialId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 11)) ? this.materialId : ((Integer) iPatchRedirector.redirect((short) 11, this)).intValue();
    }

    public int getSendType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.sendType : ((Integer) iPatchRedirector.redirect((short) 7, this)).intValue();
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 14)) {
            return (String) iPatchRedirector.redirect((short) 14, this);
        }
        return "GProGiftInfo{giftType=" + this.giftType + ",giftId=" + this.giftId + ",giftName=" + this.giftName + ",giftNum=" + this.giftNum + ",sendType=" + this.sendType + ",comboSeq=" + this.comboSeq + ",comboOver=" + this.comboOver + ",allComboCnt=" + this.allComboCnt + ",materialId=" + this.materialId + ",effectLevel=" + this.effectLevel + ",giftPrice=" + this.giftPrice + ",}";
    }

    public GProGiftInfo(int i, int i2, String str, int i3, int i4, long j, boolean z, int i5, int i6, int i7, long j2) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, new Object[]{this, Integer.valueOf(i), Integer.valueOf(i2), str, Integer.valueOf(i3), Integer.valueOf(i4), Long.valueOf(j), Boolean.valueOf(z), Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i7), Long.valueOf(j2)});
            return;
        }
        this.serialVersionUID = 1L;
        this.giftName = "";
        this.giftType = i;
        this.giftId = i2;
        this.giftName = str;
        this.giftNum = i3;
        this.sendType = i4;
        this.comboSeq = j;
        this.comboOver = z;
        this.allComboCnt = i5;
        this.materialId = i6;
        this.effectLevel = i7;
        this.giftPrice = j2;
    }
}
