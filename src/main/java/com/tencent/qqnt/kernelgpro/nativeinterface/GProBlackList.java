package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;
import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProBlackList.class */
public final class GProBlackList {
    static IPatchRedirector $redirector_;
    public int listId;
    public String listName;
    public ArrayList<GProBlackUserInfo> memberList;

    public GProBlackList() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
        } else {
            this.listName = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
            this.memberList = new ArrayList<>();
        }
    }

    public int getListId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.listId : ((Integer) iPatchRedirector.redirect((short) 3, this)).intValue();
    }

    public String getListName() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.listName : (String) iPatchRedirector.redirect((short) 4, this);
    }

    public ArrayList<GProBlackUserInfo> getMemberList() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.memberList : (ArrayList) iPatchRedirector.redirect((short) 5, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 6)) {
            return (String) iPatchRedirector.redirect((short) 6, this);
        }
        return "GProBlackList{listId=" + this.listId + ",listName=" + this.listName + ",memberList=" + this.memberList + ",}";
    }

    public GProBlackList(int i, String str, ArrayList<GProBlackUserInfo> arrayList) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, new Object[]{this, Integer.valueOf(i), str, arrayList});
            return;
        }
        this.listName = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.memberList = new ArrayList<>();
        this.listId = i;
        this.listName = str;
        this.memberList = arrayList;
    }
}
