package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;
import java.io.Serializable;
import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProUserFreeGiftInfoRsp.class */
public final class GProUserFreeGiftInfoRsp implements Serializable {
    static IPatchRedirector $redirector_;
    public String checkContext;
    public int countdownSecond;
    public int currFreeGiftNum;
    public int dayFreeGiftNum;
    public ArrayList<Long> freeGiftIds;
    public int gotFreeGiftNum;
    public int maxFreeGiftNum;
    public ArrayList<Integer> needCheckThemeTypes;
    public long nextCheckTimeMS;
    public int reminderFreeGiftNum;
    long serialVersionUID;

    public GProUserFreeGiftInfoRsp() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.serialVersionUID = 1L;
        this.checkContext = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.needCheckThemeTypes = new ArrayList<>();
        this.freeGiftIds = new ArrayList<>();
    }

    public String getCheckContext() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.checkContext : (String) iPatchRedirector.redirect((short) 3, this);
    }

    public int getCountdownSecond() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 9)) ? this.countdownSecond : ((Integer) iPatchRedirector.redirect((short) 9, this)).intValue();
    }

    public int getCurrFreeGiftNum() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.currFreeGiftNum : ((Integer) iPatchRedirector.redirect((short) 5, this)).intValue();
    }

    public int getDayFreeGiftNum() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.dayFreeGiftNum : ((Integer) iPatchRedirector.redirect((short) 6, this)).intValue();
    }

    public ArrayList<Long> getFreeGiftIds() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 12)) ? this.freeGiftIds : (ArrayList) iPatchRedirector.redirect((short) 12, this);
    }

    public int getGotFreeGiftNum() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.gotFreeGiftNum : ((Integer) iPatchRedirector.redirect((short) 7, this)).intValue();
    }

    public int getMaxFreeGiftNum() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.maxFreeGiftNum : ((Integer) iPatchRedirector.redirect((short) 4, this)).intValue();
    }

    public ArrayList<Integer> getNeedCheckThemeTypes() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 11)) ? this.needCheckThemeTypes : (ArrayList) iPatchRedirector.redirect((short) 11, this);
    }

    public long getNextCheckTimeMS() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) ? this.nextCheckTimeMS : ((Long) iPatchRedirector.redirect((short) 8, this)).longValue();
    }

    public int getReminderFreeGiftNum() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 10)) ? this.reminderFreeGiftNum : ((Integer) iPatchRedirector.redirect((short) 10, this)).intValue();
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 13)) {
            return (String) iPatchRedirector.redirect((short) 13, this);
        }
        return "GProUserFreeGiftInfoRsp{checkContext=" + this.checkContext + ",maxFreeGiftNum=" + this.maxFreeGiftNum + ",currFreeGiftNum=" + this.currFreeGiftNum + ",dayFreeGiftNum=" + this.dayFreeGiftNum + ",gotFreeGiftNum=" + this.gotFreeGiftNum + ",nextCheckTimeMS=" + this.nextCheckTimeMS + ",countdownSecond=" + this.countdownSecond + ",reminderFreeGiftNum=" + this.reminderFreeGiftNum + ",needCheckThemeTypes=" + this.needCheckThemeTypes + ",freeGiftIds=" + this.freeGiftIds + ",}";
    }

    public GProUserFreeGiftInfoRsp(String str, int i, int i2, int i3, int i4, long j, int i5, int i6, ArrayList<Integer> arrayList, ArrayList<Long> arrayList2) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, new Object[]{this, str, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Long.valueOf(j), Integer.valueOf(i5), Integer.valueOf(i6), arrayList, arrayList2});
            return;
        }
        this.serialVersionUID = 1L;
        this.checkContext = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.needCheckThemeTypes = new ArrayList<>();
        this.freeGiftIds = new ArrayList<>();
        this.checkContext = str;
        this.maxFreeGiftNum = i;
        this.currFreeGiftNum = i2;
        this.dayFreeGiftNum = i3;
        this.gotFreeGiftNum = i4;
        this.nextCheckTimeMS = j;
        this.countdownSecond = i5;
        this.reminderFreeGiftNum = i6;
        this.needCheckThemeTypes = arrayList;
        this.freeGiftIds = arrayList2;
    }
}
