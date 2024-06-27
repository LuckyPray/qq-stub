package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProDesignatedStreamInfo.class */
public final class GProDesignatedStreamInfo {
    static IPatchRedirector $redirector_;
    public ArrayList<GProLiveGearInfo> GearLIst;
    public ArrayList<Integer> LevelList;
    public Integer isSwitch;
    public ArrayList<GProLiveStream> streams;
    public Integer sugLevel;

    public GProDesignatedStreamInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.streams = new ArrayList<>();
        this.LevelList = new ArrayList<>();
        this.GearLIst = new ArrayList<>();
    }

    public ArrayList<GProLiveGearInfo> getGearLIst() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.GearLIst : (ArrayList) iPatchRedirector.redirect((short) 6, this);
    }

    public Integer getIsSwitch() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.isSwitch : (Integer) iPatchRedirector.redirect((short) 3, this);
    }

    public ArrayList<Integer> getLevelList() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.LevelList : (ArrayList) iPatchRedirector.redirect((short) 4, this);
    }

    public ArrayList<GProLiveStream> getStreams() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.streams : (ArrayList) iPatchRedirector.redirect((short) 2, this);
    }

    public Integer getSugLevel() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.sugLevel : (Integer) iPatchRedirector.redirect((short) 5, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 7)) {
            return (String) iPatchRedirector.redirect((short) 7, this);
        }
        return "GProDesignatedStreamInfo{streams=" + this.streams + ",isSwitch=" + this.isSwitch + ",LevelList=" + this.LevelList + ",sugLevel=" + this.sugLevel + ",GearLIst=" + this.GearLIst + ",}";
    }
}
