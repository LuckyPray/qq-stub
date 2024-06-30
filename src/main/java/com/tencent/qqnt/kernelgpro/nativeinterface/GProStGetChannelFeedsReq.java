package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;
import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProStGetChannelFeedsReq.class */
public final class GProStGetChannelFeedsReq {
    static IPatchRedirector $redirector_;
    public GProStChannelSign channelSign;
    public int count;
    public GProStCommonExt extInfo;
    public String feedAttchInfo;
    public int from;
    public ArrayList<String> groupTransDataList;
    public boolean needChannelList;
    public int sortOption;

    public GProStGetChannelFeedsReq() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.extInfo = new GProStCommonExt();
        this.channelSign = new GProStChannelSign();
        this.feedAttchInfo = "";
        this.groupTransDataList = new ArrayList<>();
    }

    public GProStChannelSign getChannelSign() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.channelSign : (GProStChannelSign) iPatchRedirector.redirect((short) 5, this);
    }

    public int getCount() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.count : ((Integer) iPatchRedirector.redirect((short) 3, this)).intValue();
    }

    public GProStCommonExt getExtInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.extInfo : (GProStCommonExt) iPatchRedirector.redirect((short) 2, this);
    }

    public String getFeedAttchInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.feedAttchInfo : (String) iPatchRedirector.redirect((short) 6, this);
    }

    public int getFrom() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.from : ((Integer) iPatchRedirector.redirect((short) 4, this)).intValue();
    }

    public ArrayList<String> getGroupTransDataList() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) ? this.groupTransDataList : (ArrayList) iPatchRedirector.redirect((short) 8, this);
    }

    public boolean getNeedChannelList() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 9)) ? this.needChannelList : ((Boolean) iPatchRedirector.redirect((short) 9, this)).booleanValue();
    }

    public int getSortOption() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.sortOption : ((Integer) iPatchRedirector.redirect((short) 7, this)).intValue();
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 10)) {
            return (String) iPatchRedirector.redirect((short) 10, this);
        }
        return "GProStGetChannelFeedsReq{extInfo=" + this.extInfo + ",count=" + this.count + ",from=" + this.from + ",channelSign=" + this.channelSign + ",feedAttchInfo=" + this.feedAttchInfo + ",sortOption=" + this.sortOption + ",groupTransDataList=" + this.groupTransDataList + ",needChannelList=" + this.needChannelList + ",}";
    }
}
