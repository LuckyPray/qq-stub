package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProSearchCond.class */
public final class GProSearchCond {
    static IPatchRedirector $redirector_;
    public ArrayList<Long> channelIds;
    public ArrayList<Long> fromTinyIds;
    public ArrayList<GProMsgTimeRange> timeRanges;

    public GProSearchCond() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.channelIds = new ArrayList<>();
        this.fromTinyIds = new ArrayList<>();
        this.timeRanges = new ArrayList<>();
    }

    public ArrayList<Long> getChannelIds() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.channelIds : (ArrayList) iPatchRedirector.redirect((short) 3, this);
    }

    public ArrayList<Long> getFromTinyIds() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.fromTinyIds : (ArrayList) iPatchRedirector.redirect((short) 4, this);
    }

    public ArrayList<GProMsgTimeRange> getTimeRanges() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.timeRanges : (ArrayList) iPatchRedirector.redirect((short) 5, this);
    }

    public void setChannelIds(ArrayList<Long> arrayList) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) {
            this.channelIds = arrayList;
        } else {
            iPatchRedirector.redirect((short) 6, this, arrayList);
        }
    }

    public void setFromTinyIds(ArrayList<Long> arrayList) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) {
            this.fromTinyIds = arrayList;
        } else {
            iPatchRedirector.redirect((short) 7, this, arrayList);
        }
    }

    public void setTimeRanges(ArrayList<GProMsgTimeRange> arrayList) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) {
            this.timeRanges = arrayList;
        } else {
            iPatchRedirector.redirect((short) 8, this, arrayList);
        }
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 9)) {
            return (String) iPatchRedirector.redirect((short) 9, this);
        }
        return "GProSearchCond{channelIds=" + this.channelIds + ",fromTinyIds=" + this.fromTinyIds + ",timeRanges=" + this.timeRanges + ",}";
    }

    public GProSearchCond(ArrayList<Long> arrayList, ArrayList<Long> arrayList2, ArrayList<GProMsgTimeRange> arrayList3) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, this, arrayList, arrayList2, arrayList3);
            return;
        }
        this.channelIds = new ArrayList<>();
        this.fromTinyIds = new ArrayList<>();
        this.timeRanges = new ArrayList<>();
        this.channelIds = arrayList;
        this.fromTinyIds = arrayList2;
        this.timeRanges = arrayList3;
    }
}
