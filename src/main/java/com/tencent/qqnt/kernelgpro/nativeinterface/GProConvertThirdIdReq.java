package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProConvertThirdIdReq.class */
public final class GProConvertThirdIdReq {
    static IPatchRedirector $redirector_;
    public long appId;
    public ArrayList<String> ids;
    public ArrayList<String> stringIds;
    public int type;

    public GProConvertThirdIdReq() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
        } else {
            this.ids = new ArrayList<>();
            this.stringIds = new ArrayList<>();
        }
    }

    public long getAppId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.appId : ((Long) iPatchRedirector.redirect((short) 5, this)).longValue();
    }

    public ArrayList<String> getIds() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.ids : (ArrayList) iPatchRedirector.redirect((short) 4, this);
    }

    public ArrayList<String> getStringIds() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.stringIds : (ArrayList) iPatchRedirector.redirect((short) 6, this);
    }

    public int getType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.type : ((Integer) iPatchRedirector.redirect((short) 3, this)).intValue();
    }

    public void setAppId(long j) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 9)) {
            this.appId = j;
        } else {
            iPatchRedirector.redirect((short) 9, this, j);
        }
    }

    public void setIds(ArrayList<String> arrayList) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) {
            this.ids = arrayList;
        } else {
            iPatchRedirector.redirect((short) 8, this, arrayList);
        }
    }

    public void setStringIds(ArrayList<String> arrayList) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 10)) {
            this.stringIds = arrayList;
        } else {
            iPatchRedirector.redirect((short) 10, this, arrayList);
        }
    }

    public void setType(int i) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) {
            this.type = i;
        } else {
            iPatchRedirector.redirect((short) 7, this, i);
        }
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 11)) {
            return (String) iPatchRedirector.redirect((short) 11, this);
        }
        return "GProConvertThirdIdReq{type=" + this.type + ",ids=" + this.ids + ",appId=" + this.appId + ",stringIds=" + this.stringIds + ",}";
    }

    public GProConvertThirdIdReq(int i, ArrayList<String> arrayList, long j, ArrayList<String> arrayList2) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, new Object[]{this, Integer.valueOf(i), arrayList, Long.valueOf(j), arrayList2});
            return;
        }
        this.ids = new ArrayList<>();
        this.stringIds = new ArrayList<>();
        this.type = i;
        this.ids = arrayList;
        this.appId = j;
        this.stringIds = arrayList2;
    }
}
