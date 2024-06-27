package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import java.io.Serializable;
import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProGetAtMeMsgRsp.class */
public final class GProGetAtMeMsgRsp implements Serializable {
    static IPatchRedirector $redirector_;
    public GProRecommendExtInfo extInfo;
    public ArrayList<GProRecommendChannelInfo> msgList;
    public int nextTs;
    long serialVersionUID;

    public GProGetAtMeMsgRsp() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.serialVersionUID = 1L;
        this.msgList = new ArrayList<>();
        this.extInfo = new GProRecommendExtInfo();
    }

    public GProRecommendExtInfo getExtInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.extInfo : (GProRecommendExtInfo) iPatchRedirector.redirect((short) 5, this);
    }

    public ArrayList<GProRecommendChannelInfo> getMsgList() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.msgList : (ArrayList) iPatchRedirector.redirect((short) 3, this);
    }

    public int getNextTs() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.nextTs : ((Integer) iPatchRedirector.redirect((short) 4, this)).intValue();
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 6)) {
            return (String) iPatchRedirector.redirect((short) 6, this);
        }
        return "GProGetAtMeMsgRsp{msgList=" + this.msgList + ",nextTs=" + this.nextTs + ",extInfo=" + this.extInfo + ",}";
    }

    public GProGetAtMeMsgRsp(ArrayList<GProRecommendChannelInfo> arrayList, int i, GProRecommendExtInfo gProRecommendExtInfo) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, new Object[]{this, arrayList, Integer.valueOf(i), gProRecommendExtInfo});
            return;
        }
        this.serialVersionUID = 1L;
        this.msgList = new ArrayList<>();
        this.extInfo = new GProRecommendExtInfo();
        this.msgList = arrayList;
        this.nextTs = i;
        this.extInfo = gProRecommendExtInfo;
    }
}
