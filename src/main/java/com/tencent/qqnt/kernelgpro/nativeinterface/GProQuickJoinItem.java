package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;
import java.io.Serializable;
import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProQuickJoinItem.class */
public final class GProQuickJoinItem implements Serializable {
    static IPatchRedirector $redirector_;
    public String coverUrl;
    public ArrayList<String> membersAvatar;
    public String name;
    public String onlineNumTag;
    public int order;
    long serialVersionUID;
    public int statusTag;
    public int voiceType;

    public GProQuickJoinItem() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.serialVersionUID = 1L;
        this.name = "";
        this.coverUrl = "";
        this.onlineNumTag = "";
        this.membersAvatar = new ArrayList<>();
    }

    public String getCoverUrl() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.coverUrl : (String) iPatchRedirector.redirect((short) 5, this);
    }

    public ArrayList<String> getMembersAvatar() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.membersAvatar : (ArrayList) iPatchRedirector.redirect((short) 7, this);
    }

    public String getName() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.name : (String) iPatchRedirector.redirect((short) 3, this);
    }

    public String getOnlineNumTag() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.onlineNumTag : (String) iPatchRedirector.redirect((short) 6, this);
    }

    public int getOrder() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 9)) ? this.order : ((Integer) iPatchRedirector.redirect((short) 9, this)).intValue();
    }

    public int getStatusTag() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) ? this.statusTag : ((Integer) iPatchRedirector.redirect((short) 8, this)).intValue();
    }

    public int getVoiceType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.voiceType : ((Integer) iPatchRedirector.redirect((short) 4, this)).intValue();
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 10)) {
            return (String) iPatchRedirector.redirect((short) 10, this);
        }
        return "GProQuickJoinItem{name=" + this.name + ",voiceType=" + this.voiceType + ",coverUrl=" + this.coverUrl + ",onlineNumTag=" + this.onlineNumTag + ",membersAvatar=" + this.membersAvatar + ",statusTag=" + this.statusTag + ",order=" + this.order + ",}";
    }

    public GProQuickJoinItem(String str, int i, String str2, String str3, ArrayList<String> arrayList, int i2, int i3) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, this, str, Integer.valueOf(i), str2, str3, arrayList, Integer.valueOf(i2), Integer.valueOf(i3));
            return;
        }
        this.serialVersionUID = 1L;
        this.name = "";
        this.coverUrl = "";
        this.onlineNumTag = "";
        this.membersAvatar = new ArrayList<>();
        this.name = str;
        this.voiceType = i;
        this.coverUrl = str2;
        this.onlineNumTag = str3;
        this.membersAvatar = arrayList;
        this.statusTag = i2;
        this.order = i3;
    }
}
