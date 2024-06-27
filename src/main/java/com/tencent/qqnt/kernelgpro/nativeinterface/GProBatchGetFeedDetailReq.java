package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProBatchGetFeedDetailReq.class */
public final class GProBatchGetFeedDetailReq {
    static IPatchRedirector $redirector_;
    public GProStChannelSign channelSign;
    public int detailType;
    public GProStCommonExt extInfo;
    public ArrayList<GProFeedParam> feedParamList;
    public int from;

    public GProBatchGetFeedDetailReq() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.extInfo = new GProStCommonExt();
        this.feedParamList = new ArrayList<>();
        this.channelSign = new GProStChannelSign();
    }

    public GProStChannelSign getChannelSign() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.channelSign : (GProStChannelSign) iPatchRedirector.redirect((short) 6, this);
    }

    public int getDetailType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.detailType : ((Integer) iPatchRedirector.redirect((short) 5, this)).intValue();
    }

    public GProStCommonExt getExtInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.extInfo : (GProStCommonExt) iPatchRedirector.redirect((short) 2, this);
    }

    public ArrayList<GProFeedParam> getFeedParamList() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.feedParamList : (ArrayList) iPatchRedirector.redirect((short) 4, this);
    }

    public int getFrom() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.from : ((Integer) iPatchRedirector.redirect((short) 3, this)).intValue();
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 7)) {
            return (String) iPatchRedirector.redirect((short) 7, this);
        }
        return "GProBatchGetFeedDetailReq{extInfo=" + this.extInfo + ",from=" + this.from + ",feedParamList=" + this.feedParamList + ",detailType=" + this.detailType + ",channelSign=" + this.channelSign + ",}";
    }
}
