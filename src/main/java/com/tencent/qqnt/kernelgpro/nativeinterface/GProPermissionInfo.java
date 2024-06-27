package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProPermissionInfo.class */
public final class GProPermissionInfo {
    static IPatchRedirector $redirector_;
    public ArrayList<Integer> childIds;
    public int rootId;

    public GProPermissionInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 1)) {
            this.childIds = new ArrayList<>();
        } else {
            iPatchRedirector.redirect((short) 1, this);
        }
    }

    public ArrayList<Integer> getChildIds() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.childIds : (ArrayList) iPatchRedirector.redirect((short) 4, this);
    }

    public int getRootId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.rootId : ((Integer) iPatchRedirector.redirect((short) 3, this)).intValue();
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 5)) {
            return (String) iPatchRedirector.redirect((short) 5, this);
        }
        return "GProPermissionInfo{rootId=" + this.rootId + ",childIds=" + this.childIds + ",}";
    }

    public GProPermissionInfo(int i, ArrayList<Integer> arrayList) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, this, i, arrayList);
            return;
        }
        this.childIds = new ArrayList<>();
        this.rootId = i;
        this.childIds = arrayList;
    }
}
