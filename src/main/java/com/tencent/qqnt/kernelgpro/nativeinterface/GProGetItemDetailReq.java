package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;
import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProGetItemDetailReq.class */
public final class GProGetItemDetailReq {
    static IPatchRedirector $redirector_;
    public ArrayList<GProItemIdInfo> itemList;
    public GProBottomTabSourceInfo source;
    public String transBuffer;

    public GProGetItemDetailReq() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.source = new GProBottomTabSourceInfo();
        this.itemList = new ArrayList<>();
        this.transBuffer = "";
    }

    public ArrayList<GProItemIdInfo> getItemList() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.itemList : (ArrayList) iPatchRedirector.redirect((short) 4, this);
    }

    public GProBottomTabSourceInfo getSource() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.source : (GProBottomTabSourceInfo) iPatchRedirector.redirect((short) 3, this);
    }

    public String getTransBuffer() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.transBuffer : (String) iPatchRedirector.redirect((short) 5, this);
    }

    public void setItemList(ArrayList<GProItemIdInfo> arrayList) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) {
            this.itemList = arrayList;
        } else {
            iPatchRedirector.redirect((short) 7, this, arrayList);
        }
    }

    public void setSource(GProBottomTabSourceInfo gProBottomTabSourceInfo) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) {
            this.source = gProBottomTabSourceInfo;
        } else {
            iPatchRedirector.redirect((short) 6, this, gProBottomTabSourceInfo);
        }
    }

    public void setTransBuffer(String str) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) {
            this.transBuffer = str;
        } else {
            iPatchRedirector.redirect((short) 8, this, str);
        }
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 9)) {
            return (String) iPatchRedirector.redirect((short) 9, this);
        }
        return "GProGetItemDetailReq{source=" + this.source + ",itemList=" + this.itemList + ",transBuffer=" + this.transBuffer + ",}";
    }

    public GProGetItemDetailReq(GProBottomTabSourceInfo gProBottomTabSourceInfo, ArrayList<GProItemIdInfo> arrayList, String str) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, this, gProBottomTabSourceInfo, arrayList, str);
            return;
        }
        this.source = new GProBottomTabSourceInfo();
        this.itemList = new ArrayList<>();
        this.transBuffer = "";
        this.source = gProBottomTabSourceInfo;
        this.itemList = arrayList;
        this.transBuffer = str;
    }
}
