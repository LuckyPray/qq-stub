package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProRecommendH5Game.class */
public final class GProRecommendH5Game {
    static IPatchRedirector $redirector_;
    public GProRecommendGameInfo game;
    public ArrayList<GProRecommendMsg> members;
    public long readyExpireTime;
    public long teamId;
    public int teamStatus;

    public GProRecommendH5Game() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
        } else {
            this.game = new GProRecommendGameInfo();
            this.members = new ArrayList<>();
        }
    }

    public GProRecommendGameInfo getGame() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.game : (GProRecommendGameInfo) iPatchRedirector.redirect((short) 5, this);
    }

    public ArrayList<GProRecommendMsg> getMembers() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.members : (ArrayList) iPatchRedirector.redirect((short) 6, this);
    }

    public long getReadyExpireTime() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.readyExpireTime : ((Long) iPatchRedirector.redirect((short) 7, this)).longValue();
    }

    public long getTeamId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.teamId : ((Long) iPatchRedirector.redirect((short) 3, this)).longValue();
    }

    public int getTeamStatus() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.teamStatus : ((Integer) iPatchRedirector.redirect((short) 4, this)).intValue();
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 8)) {
            return (String) iPatchRedirector.redirect((short) 8, this);
        }
        return "GProRecommendH5Game{teamId=" + this.teamId + ",teamStatus=" + this.teamStatus + ",game=" + this.game + ",members=" + this.members + ",readyExpireTime=" + this.readyExpireTime + ",}";
    }

    public GProRecommendH5Game(long j, int i, GProRecommendGameInfo gProRecommendGameInfo, ArrayList<GProRecommendMsg> arrayList, long j2) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, new Object[]{this, Long.valueOf(j), Integer.valueOf(i), gProRecommendGameInfo, arrayList, Long.valueOf(j2)});
            return;
        }
        this.game = new GProRecommendGameInfo();
        this.members = new ArrayList<>();
        this.teamId = j;
        this.teamStatus = i;
        this.game = gProRecommendGameInfo;
        this.members = arrayList;
        this.readyExpireTime = j2;
    }
}
