package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProVoiceSmobaGameSmobaRoomInfo.class */
public final class GProVoiceSmobaGameSmobaRoomInfo {
    static IPatchRedirector $redirector_;
    public int gameMode;
    public ArrayList<Integer> gradeList;

    public GProVoiceSmobaGameSmobaRoomInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 1)) {
            this.gradeList = new ArrayList<>();
        } else {
            iPatchRedirector.redirect((short) 1, this);
        }
    }

    public int getGameMode() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.gameMode : ((Integer) iPatchRedirector.redirect((short) 3, this)).intValue();
    }

    public ArrayList<Integer> getGradeList() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.gradeList : (ArrayList) iPatchRedirector.redirect((short) 4, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 5)) {
            return (String) iPatchRedirector.redirect((short) 5, this);
        }
        return "GProVoiceSmobaGameSmobaRoomInfo{gameMode=" + this.gameMode + ",gradeList=" + this.gradeList + ",}";
    }

    public GProVoiceSmobaGameSmobaRoomInfo(int i, ArrayList<Integer> arrayList) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, this, i, arrayList);
            return;
        }
        this.gradeList = new ArrayList<>();
        this.gameMode = i;
        this.gradeList = arrayList;
    }
}
