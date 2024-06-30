package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;
import java.io.Serializable;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProBusinessInfo.class */
public final class GProBusinessInfo implements Serializable {
    static IPatchRedirector $redirector_;
    public GProLobbyMemberInfo lobbyMemberInfo;
    public GProMemberInfoInGame memberInfoInGame;
    public GProRobotStateInfo robotStateInfo;
    long serialVersionUID;
    public long sortKey;
    public String tipsMsg;
    public GProUserAVInfo userAVInfo;
    public GProUserChannelShowState userChannelState;
    public GProUserListGroupInfo userListGroupInfo;

    public GProBusinessInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.serialVersionUID = 1L;
        this.memberInfoInGame = new GProMemberInfoInGame();
        this.userAVInfo = new GProUserAVInfo();
        this.robotStateInfo = new GProRobotStateInfo();
        this.tipsMsg = "";
        this.userListGroupInfo = new GProUserListGroupInfo();
        this.userChannelState = new GProUserChannelShowState();
        this.lobbyMemberInfo = new GProLobbyMemberInfo();
    }

    public GProLobbyMemberInfo getLobbyMemberInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 9)) ? this.lobbyMemberInfo : (GProLobbyMemberInfo) iPatchRedirector.redirect((short) 9, this);
    }

    public GProMemberInfoInGame getMemberInfoInGame() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.memberInfoInGame : (GProMemberInfoInGame) iPatchRedirector.redirect((short) 3, this);
    }

    public GProRobotStateInfo getRobotStateInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.robotStateInfo : (GProRobotStateInfo) iPatchRedirector.redirect((short) 5, this);
    }

    public long getSortKey() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.sortKey : ((Long) iPatchRedirector.redirect((short) 2, this)).longValue();
    }

    public String getTipsMsg() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.tipsMsg : (String) iPatchRedirector.redirect((short) 6, this);
    }

    public GProUserAVInfo getUserAVInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.userAVInfo : (GProUserAVInfo) iPatchRedirector.redirect((short) 4, this);
    }

    public GProUserChannelShowState getUserChannelState() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) ? this.userChannelState : (GProUserChannelShowState) iPatchRedirector.redirect((short) 8, this);
    }

    public GProUserListGroupInfo getUserListGroupInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.userListGroupInfo : (GProUserListGroupInfo) iPatchRedirector.redirect((short) 7, this);
    }

    public void setLobbyMemberInfo(GProLobbyMemberInfo gProLobbyMemberInfo) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 17)) {
            this.lobbyMemberInfo = gProLobbyMemberInfo;
        } else {
            iPatchRedirector.redirect((short) 17, this, gProLobbyMemberInfo);
        }
    }

    public void setMemberInfoInGame(GProMemberInfoInGame gProMemberInfoInGame) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 11)) {
            this.memberInfoInGame = gProMemberInfoInGame;
        } else {
            iPatchRedirector.redirect((short) 11, this, gProMemberInfoInGame);
        }
    }

    public void setRobotStateInfo(GProRobotStateInfo gProRobotStateInfo) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 13)) {
            this.robotStateInfo = gProRobotStateInfo;
        } else {
            iPatchRedirector.redirect((short) 13, this, gProRobotStateInfo);
        }
    }

    public void setSortKey(long j) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 10)) {
            this.sortKey = j;
        } else {
            iPatchRedirector.redirect((short) 10, this, j);
        }
    }

    public void setTipsMsg(String str) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 14)) {
            this.tipsMsg = str;
        } else {
            iPatchRedirector.redirect((short) 14, this, str);
        }
    }

    public void setUserAVInfo(GProUserAVInfo gProUserAVInfo) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 12)) {
            this.userAVInfo = gProUserAVInfo;
        } else {
            iPatchRedirector.redirect((short) 12, this, gProUserAVInfo);
        }
    }

    public void setUserChannelState(GProUserChannelShowState gProUserChannelShowState) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 16)) {
            this.userChannelState = gProUserChannelShowState;
        } else {
            iPatchRedirector.redirect((short) 16, this, gProUserChannelShowState);
        }
    }

    public void setUserListGroupInfo(GProUserListGroupInfo gProUserListGroupInfo) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 15)) {
            this.userListGroupInfo = gProUserListGroupInfo;
        } else {
            iPatchRedirector.redirect((short) 15, this, gProUserListGroupInfo);
        }
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 18)) {
            return (String) iPatchRedirector.redirect((short) 18, this);
        }
        return "GProBusinessInfo{sortKey=" + this.sortKey + ",memberInfoInGame=" + this.memberInfoInGame + ",userAVInfo=" + this.userAVInfo + ",robotStateInfo=" + this.robotStateInfo + ",tipsMsg=" + this.tipsMsg + ",userListGroupInfo=" + this.userListGroupInfo + ",userChannelState=" + this.userChannelState + ",lobbyMemberInfo=" + this.lobbyMemberInfo + ",}";
    }
}
