package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProGuildListSortInfo.class */
public final class GProGuildListSortInfo {
    static IPatchRedirector $redirector_;
    public ArrayList<Long> sortList;
    public ArrayList<Long> topList;

    public GProGuildListSortInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
        } else {
            this.sortList = new ArrayList<>();
            this.topList = new ArrayList<>();
        }
    }

    public ArrayList<Long> getSortList() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.sortList : (ArrayList) iPatchRedirector.redirect((short) 3, this);
    }

    public ArrayList<Long> getTopList() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.topList : (ArrayList) iPatchRedirector.redirect((short) 4, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 5)) {
            return (String) iPatchRedirector.redirect((short) 5, this);
        }
        return "GProGuildListSortInfo{sortList=" + this.sortList + ",topList=" + this.topList + ",}";
    }

    public GProGuildListSortInfo(ArrayList<Long> arrayList, ArrayList<Long> arrayList2) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, this, arrayList, arrayList2);
            return;
        }
        this.sortList = new ArrayList<>();
        this.topList = new ArrayList<>();
        this.sortList = arrayList;
        this.topList = arrayList2;
    }
}
