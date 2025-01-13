package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProMsgSearchCond.class */
public final class GProMsgSearchCond {
    static IPatchRedirector $redirector_;
    public ArrayList<Long> channelIds;
    public ArrayList<Integer> channelTypes;
    public ArrayList<Long> fromTinyids;
    public GProSeqCond seqCond;
    public ArrayList<GProMsgTimeRange> timeRanges;

    public GProMsgSearchCond() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 1)) {
            return;
        }
        iPatchRedirector.redirect((short) 1, this);
    }

    public ArrayList<Long> getChannelIds() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.channelIds : (ArrayList) iPatchRedirector.redirect((short) 3, this);
    }

    public ArrayList<Integer> getChannelTypes() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.channelTypes : (ArrayList) iPatchRedirector.redirect((short) 6, this);
    }

    public ArrayList<Long> getFromTinyids() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.fromTinyids : (ArrayList) iPatchRedirector.redirect((short) 4, this);
    }

    public GProSeqCond getSeqCond() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.seqCond : (GProSeqCond) iPatchRedirector.redirect((short) 7, this);
    }

    public ArrayList<GProMsgTimeRange> getTimeRanges() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.timeRanges : (ArrayList) iPatchRedirector.redirect((short) 5, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 8)) {
            return (String) iPatchRedirector.redirect((short) 8, this);
        }
        return "GProMsgSearchCond{channelIds=" + this.channelIds + ",fromTinyids=" + this.fromTinyids + ",timeRanges=" + this.timeRanges + ",channelTypes=" + this.channelTypes + ",seqCond=" + this.seqCond + ",}";
    }

    public GProMsgSearchCond(ArrayList<Long> arrayList, ArrayList<Long> arrayList2, ArrayList<GProMsgTimeRange> arrayList3, ArrayList<Integer> arrayList4, GProSeqCond gProSeqCond) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, this, arrayList, arrayList2, arrayList3, arrayList4, gProSeqCond);
            return;
        }
        this.channelIds = arrayList;
        this.fromTinyids = arrayList2;
        this.timeRanges = arrayList3;
        this.channelTypes = arrayList4;
        this.seqCond = gProSeqCond;
    }
}
