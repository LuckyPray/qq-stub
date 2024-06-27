package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;
import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProStLike.class */
public final class GProStLike {
    static IPatchRedirector $redirector_;
    public byte[] busiData;
    public int count;
    public int hasLikedCount;
    public String idd;
    public String jumpUrl;
    public int ownerStatus;
    public GProStUser postUser;
    public int status;
    public ArrayList<GProStUser> vecUserList;

    public GProStLike() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.idd = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.vecUserList = new ArrayList<>();
        this.busiData = new byte[0];
        this.postUser = new GProStUser();
        this.jumpUrl = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    }

    public byte[] getBusiData() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.busiData : (byte[]) iPatchRedirector.redirect((short) 6, this);
    }

    public int getCount() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.count : ((Integer) iPatchRedirector.redirect((short) 3, this)).intValue();
    }

    public int getHasLikedCount() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) ? this.hasLikedCount : ((Integer) iPatchRedirector.redirect((short) 8, this)).intValue();
    }

    public String getIdd() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.idd : (String) iPatchRedirector.redirect((short) 2, this);
    }

    public String getJumpUrl() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 10)) ? this.jumpUrl : (String) iPatchRedirector.redirect((short) 10, this);
    }

    public int getOwnerStatus() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 9)) ? this.ownerStatus : ((Integer) iPatchRedirector.redirect((short) 9, this)).intValue();
    }

    public GProStUser getPostUser() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.postUser : (GProStUser) iPatchRedirector.redirect((short) 7, this);
    }

    public int getStatus() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.status : ((Integer) iPatchRedirector.redirect((short) 4, this)).intValue();
    }

    public ArrayList<GProStUser> getVecUserList() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.vecUserList : (ArrayList) iPatchRedirector.redirect((short) 5, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 11)) {
            return (String) iPatchRedirector.redirect((short) 11, this);
        }
        return "GProStLike{idd=" + this.idd + ",count=" + this.count + ",status=" + this.status + ",vecUserList=" + this.vecUserList + ",busiData=" + this.busiData + ",postUser=" + this.postUser + ",hasLikedCount=" + this.hasLikedCount + ",ownerStatus=" + this.ownerStatus + ",jumpUrl=" + this.jumpUrl + ",}";
    }
}
