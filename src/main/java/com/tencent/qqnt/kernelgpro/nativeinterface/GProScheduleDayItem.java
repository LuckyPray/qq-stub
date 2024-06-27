package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProScheduleDayItem.class */
public final class GProScheduleDayItem {
    static IPatchRedirector $redirector_;
    public long dateMs;
    public ArrayList<GProScheduleListItem> scheduleListItems;

    public GProScheduleDayItem() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 1)) {
            this.scheduleListItems = new ArrayList<>();
        } else {
            iPatchRedirector.redirect((short) 1, this);
        }
    }

    public long getDateMs() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.dateMs : ((Long) iPatchRedirector.redirect((short) 2, this)).longValue();
    }

    public ArrayList<GProScheduleListItem> getScheduleListItems() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.scheduleListItems : (ArrayList) iPatchRedirector.redirect((short) 3, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 4)) {
            return (String) iPatchRedirector.redirect((short) 4, this);
        }
        return "GProScheduleDayItem{dateMs=" + this.dateMs + ",scheduleListItems=" + this.scheduleListItems + ",}";
    }
}
