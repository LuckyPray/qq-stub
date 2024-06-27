package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import java.io.Serializable;
import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProQuickJoinBlock.class */
public final class GProQuickJoinBlock implements Serializable {
    static IPatchRedirector $redirector_;
    public ArrayList<String> membersAvatar;
    public ArrayList<GProQuickJoinItem> quickJoinItems;
    long serialVersionUID;
    public ArrayList<GProQuickJoinCycleStatusTag> statusTag;

    public GProQuickJoinBlock() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.serialVersionUID = 1L;
        this.membersAvatar = new ArrayList<>();
        this.statusTag = new ArrayList<>();
        this.quickJoinItems = new ArrayList<>();
    }

    public ArrayList<String> getMembersAvatar() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.membersAvatar : (ArrayList) iPatchRedirector.redirect((short) 3, this);
    }

    public ArrayList<GProQuickJoinItem> getQuickJoinItems() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.quickJoinItems : (ArrayList) iPatchRedirector.redirect((short) 5, this);
    }

    public ArrayList<GProQuickJoinCycleStatusTag> getStatusTag() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.statusTag : (ArrayList) iPatchRedirector.redirect((short) 4, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 6)) {
            return (String) iPatchRedirector.redirect((short) 6, this);
        }
        return "GProQuickJoinBlock{membersAvatar=" + this.membersAvatar + ",statusTag=" + this.statusTag + ",quickJoinItems=" + this.quickJoinItems + ",}";
    }

    public GProQuickJoinBlock(ArrayList<String> arrayList, ArrayList<GProQuickJoinCycleStatusTag> arrayList2, ArrayList<GProQuickJoinItem> arrayList3) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, this, arrayList, arrayList2, arrayList3);
            return;
        }
        this.serialVersionUID = 1L;
        this.membersAvatar = new ArrayList<>();
        this.statusTag = new ArrayList<>();
        this.quickJoinItems = new ArrayList<>();
        this.membersAvatar = arrayList;
        this.statusTag = arrayList2;
        this.quickJoinItems = arrayList3;
    }
}
