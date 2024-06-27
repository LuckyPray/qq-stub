package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProJumpFloatingLayerDetailRsp.class */
public final class GProJumpFloatingLayerDetailRsp {
    static IPatchRedirector $redirector_;
    public GProCheckinFloatingLayerDetail checkinData;
    public int forceSortTop;
    public GProLiveFloatingLayerDetail liveData;
    public int sceneType;
    public GProScheduleFloatingLayerDetail scheduleData;
    public long sortFeild;
    public GProTopFeedFloatingLayerDetail topFeedData;

    public GProJumpFloatingLayerDetailRsp() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.liveData = new GProLiveFloatingLayerDetail();
        this.checkinData = new GProCheckinFloatingLayerDetail();
        this.scheduleData = new GProScheduleFloatingLayerDetail();
        this.topFeedData = new GProTopFeedFloatingLayerDetail();
    }

    public GProCheckinFloatingLayerDetail getCheckinData() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.checkinData : (GProCheckinFloatingLayerDetail) iPatchRedirector.redirect((short) 6, this);
    }

    public int getForceSortTop() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.forceSortTop : ((Integer) iPatchRedirector.redirect((short) 4, this)).intValue();
    }

    public GProLiveFloatingLayerDetail getLiveData() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.liveData : (GProLiveFloatingLayerDetail) iPatchRedirector.redirect((short) 5, this);
    }

    public int getSceneType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.sceneType : ((Integer) iPatchRedirector.redirect((short) 2, this)).intValue();
    }

    public GProScheduleFloatingLayerDetail getScheduleData() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.scheduleData : (GProScheduleFloatingLayerDetail) iPatchRedirector.redirect((short) 7, this);
    }

    public long getSortFeild() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.sortFeild : ((Long) iPatchRedirector.redirect((short) 3, this)).longValue();
    }

    public GProTopFeedFloatingLayerDetail getTopFeedData() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) ? this.topFeedData : (GProTopFeedFloatingLayerDetail) iPatchRedirector.redirect((short) 8, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 9)) {
            return (String) iPatchRedirector.redirect((short) 9, this);
        }
        return "GProJumpFloatingLayerDetailRsp{sceneType=" + this.sceneType + ",sortFeild=" + this.sortFeild + ",forceSortTop=" + this.forceSortTop + ",liveData=" + this.liveData + ",checkinData=" + this.checkinData + ",scheduleData=" + this.scheduleData + ",topFeedData=" + this.topFeedData + ",}";
    }
}
