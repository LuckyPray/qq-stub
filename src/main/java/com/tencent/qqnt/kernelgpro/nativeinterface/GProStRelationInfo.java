package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProStRelationInfo.class */
public final class GProStRelationInfo {
    static IPatchRedirector $redirector_;
    public byte[] busiData;
    public String idd;
    public long imBitMap;
    public boolean isBlock;
    public boolean isBlocked;
    public boolean isFriend;
    public boolean isUncare;
    public int relation;
    public int relationState;
    public int score;

    public GProStRelationInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
        } else {
            this.idd = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
            this.busiData = new byte[0];
        }
    }

    public byte[] getBusiData() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.busiData : (byte[]) iPatchRedirector.redirect((short) 4, this);
    }

    public String getIdd() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.idd : (String) iPatchRedirector.redirect((short) 2, this);
    }

    public long getImBitMap() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 11)) ? this.imBitMap : ((Long) iPatchRedirector.redirect((short) 11, this)).longValue();
    }

    public boolean getIsBlock() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.isBlock : ((Boolean) iPatchRedirector.redirect((short) 7, this)).booleanValue();
    }

    public boolean getIsBlocked() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) ? this.isBlocked : ((Boolean) iPatchRedirector.redirect((short) 8, this)).booleanValue();
    }

    public boolean getIsFriend() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 9)) ? this.isFriend : ((Boolean) iPatchRedirector.redirect((short) 9, this)).booleanValue();
    }

    public boolean getIsUncare() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 10)) ? this.isUncare : ((Boolean) iPatchRedirector.redirect((short) 10, this)).booleanValue();
    }

    public int getRelation() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.relation : ((Integer) iPatchRedirector.redirect((short) 3, this)).intValue();
    }

    public int getRelationState() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.relationState : ((Integer) iPatchRedirector.redirect((short) 5, this)).intValue();
    }

    public int getScore() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.score : ((Integer) iPatchRedirector.redirect((short) 6, this)).intValue();
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 12)) {
            return (String) iPatchRedirector.redirect((short) 12, this);
        }
        return "GProStRelationInfo{idd=" + this.idd + ",relation=" + this.relation + ",busiData=" + this.busiData + ",relationState=" + this.relationState + ",score=" + this.score + ",isBlock=" + this.isBlock + ",isBlocked=" + this.isBlocked + ",isFriend=" + this.isFriend + ",isUncare=" + this.isUncare + ",imBitMap=" + this.imBitMap + ",}";
    }
}
