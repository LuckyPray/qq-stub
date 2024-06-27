package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import java.io.Serializable;
import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProBatchGetBlockItemReq.class */
public final class GProBatchGetBlockItemReq implements Serializable {
    static IPatchRedirector $redirector_;
    public int businessType;
    public ArrayList<GProBlockItem> itemList;
    long serialVersionUID;
    public GProBottomTabSourceInfo source;

    public GProBatchGetBlockItemReq() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.serialVersionUID = 1L;
        this.itemList = new ArrayList<>();
        this.source = new GProBottomTabSourceInfo();
    }

    public int getBusinessType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.businessType : ((Integer) iPatchRedirector.redirect((short) 3, this)).intValue();
    }

    public ArrayList<GProBlockItem> getItemList() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.itemList : (ArrayList) iPatchRedirector.redirect((short) 4, this);
    }

    public GProBottomTabSourceInfo getSource() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.source : (GProBottomTabSourceInfo) iPatchRedirector.redirect((short) 5, this);
    }

    public void setBusinessType(int i) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) {
            this.businessType = i;
        } else {
            iPatchRedirector.redirect((short) 6, this, i);
        }
    }

    public void setItemList(ArrayList<GProBlockItem> arrayList) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) {
            this.itemList = arrayList;
        } else {
            iPatchRedirector.redirect((short) 7, this, arrayList);
        }
    }

    public void setSource(GProBottomTabSourceInfo gProBottomTabSourceInfo) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) {
            this.source = gProBottomTabSourceInfo;
        } else {
            iPatchRedirector.redirect((short) 8, this, gProBottomTabSourceInfo);
        }
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 9)) {
            return (String) iPatchRedirector.redirect((short) 9, this);
        }
        return "GProBatchGetBlockItemReq{businessType=" + this.businessType + ",itemList=" + this.itemList + ",source=" + this.source + ",}";
    }

    public GProBatchGetBlockItemReq(int i, ArrayList<GProBlockItem> arrayList, GProBottomTabSourceInfo gProBottomTabSourceInfo) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, new Object[]{this, Integer.valueOf(i), arrayList, gProBottomTabSourceInfo});
            return;
        }
        this.serialVersionUID = 1L;
        this.itemList = new ArrayList<>();
        this.source = new GProBottomTabSourceInfo();
        this.businessType = i;
        this.itemList = arrayList;
        this.source = gProBottomTabSourceInfo;
    }
}
