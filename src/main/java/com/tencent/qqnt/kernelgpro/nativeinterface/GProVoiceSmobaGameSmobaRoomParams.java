package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProVoiceSmobaGameSmobaRoomParams.class */
public final class GProVoiceSmobaGameSmobaRoomParams {
    static IPatchRedirector $redirector_;
    public int gameMode;

    public GProVoiceSmobaGameSmobaRoomParams() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 1)) {
            return;
        }
        iPatchRedirector.redirect((short) 1, this);
    }

    public int getGameMode() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.gameMode : ((Integer) iPatchRedirector.redirect((short) 3, this)).intValue();
    }

    public void setGameMode(int i) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) {
            this.gameMode = i;
        } else {
            iPatchRedirector.redirect((short) 4, this, i);
        }
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 5)) {
            return (String) iPatchRedirector.redirect((short) 5, this);
        }
        return "GProVoiceSmobaGameSmobaRoomParams{gameMode=" + this.gameMode + ",}";
    }

    public GProVoiceSmobaGameSmobaRoomParams(int i) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) {
            this.gameMode = i;
        } else {
            iPatchRedirector.redirect((short) 2, this, i);
        }
    }
}
