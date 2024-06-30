package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;
import com.tencent.qqnt.kernelpublic.nativeinterface.MsgAbstract;
import java.io.Serializable;
import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProRecommendTextChannel.class */
public final class GProRecommendTextChannel implements Serializable {
    static IPatchRedirector $redirector_;
    public ArrayList<String> avatars;
    public boolean isActive;
    public ArrayList<String> memberAvatars;
    public ArrayList<MsgAbstract> msgAbstracts;
    public String msgSummary;
    public int noreadNum;
    long serialVersionUID;
    public String tagMsg;

    public GProRecommendTextChannel() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.serialVersionUID = 1L;
        this.msgAbstracts = new ArrayList<>();
        this.avatars = new ArrayList<>();
        this.tagMsg = "";
        this.msgSummary = "";
        this.memberAvatars = new ArrayList<>();
    }

    public ArrayList<String> getAvatars() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.avatars : (ArrayList) iPatchRedirector.redirect((short) 4, this);
    }

    public boolean getIsActive() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.isActive : ((Boolean) iPatchRedirector.redirect((short) 6, this)).booleanValue();
    }

    public ArrayList<String> getMemberAvatars() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 9)) ? this.memberAvatars : (ArrayList) iPatchRedirector.redirect((short) 9, this);
    }

    public ArrayList<MsgAbstract> getMsgAbstracts() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.msgAbstracts : (ArrayList) iPatchRedirector.redirect((short) 3, this);
    }

    public String getMsgSummary() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) ? this.msgSummary : (String) iPatchRedirector.redirect((short) 8, this);
    }

    public int getNoreadNum() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.noreadNum : ((Integer) iPatchRedirector.redirect((short) 5, this)).intValue();
    }

    public String getTagMsg() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.tagMsg : (String) iPatchRedirector.redirect((short) 7, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 10)) {
            return (String) iPatchRedirector.redirect((short) 10, this);
        }
        return "GProRecommendTextChannel{msgAbstracts=" + this.msgAbstracts + ",avatars=" + this.avatars + ",noreadNum=" + this.noreadNum + ",isActive=" + this.isActive + ",tagMsg=" + this.tagMsg + ",msgSummary=" + this.msgSummary + ",memberAvatars=" + this.memberAvatars + ",}";
    }

    public GProRecommendTextChannel(ArrayList<MsgAbstract> arrayList, ArrayList<String> arrayList2, int i, boolean z, String str, String str2, ArrayList<String> arrayList3) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, new Object[]{this, arrayList, arrayList2, Integer.valueOf(i), Boolean.valueOf(z), str, str2, arrayList3});
            return;
        }
        this.serialVersionUID = 1L;
        this.msgAbstracts = new ArrayList<>();
        this.avatars = new ArrayList<>();
        this.tagMsg = "";
        this.msgSummary = "";
        this.memberAvatars = new ArrayList<>();
        this.msgAbstracts = arrayList;
        this.avatars = arrayList2;
        this.noreadNum = i;
        this.isActive = z;
        this.tagMsg = str;
        this.msgSummary = str2;
        this.memberAvatars = arrayList3;
    }
}
