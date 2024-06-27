package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProUnionResult.class */
public final class GProUnionResult {
    static IPatchRedirector $redirector_;
    public byte[] feedCookie;
    public boolean feedIsEnd;
    public long feedTotal;
    public ArrayList<GProGuildFeedSearchRes> guildFeeds;
    public ArrayList<GProGuildMsgSearchRes> guildMsgs;
    public byte[] msgCookie;
    public boolean msgIsEnd;
    public long msgTotal;

    public GProUnionResult() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.guildMsgs = new ArrayList<>();
        this.msgCookie = new byte[0];
        this.guildFeeds = new ArrayList<>();
        this.feedCookie = new byte[0];
    }

    public byte[] getFeedCookie() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) ? this.feedCookie : (byte[]) iPatchRedirector.redirect((short) 8, this);
    }

    public boolean getFeedIsEnd() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 9)) ? this.feedIsEnd : ((Boolean) iPatchRedirector.redirect((short) 9, this)).booleanValue();
    }

    public long getFeedTotal() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.feedTotal : ((Long) iPatchRedirector.redirect((short) 6, this)).longValue();
    }

    public ArrayList<GProGuildFeedSearchRes> getGuildFeeds() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.guildFeeds : (ArrayList) iPatchRedirector.redirect((short) 7, this);
    }

    public ArrayList<GProGuildMsgSearchRes> getGuildMsgs() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.guildMsgs : (ArrayList) iPatchRedirector.redirect((short) 3, this);
    }

    public byte[] getMsgCookie() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.msgCookie : (byte[]) iPatchRedirector.redirect((short) 4, this);
    }

    public boolean getMsgIsEnd() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.msgIsEnd : ((Boolean) iPatchRedirector.redirect((short) 5, this)).booleanValue();
    }

    public long getMsgTotal() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.msgTotal : ((Long) iPatchRedirector.redirect((short) 2, this)).longValue();
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 10)) {
            return (String) iPatchRedirector.redirect((short) 10, this);
        }
        return "GProUnionResult{msgTotal=" + this.msgTotal + ",guildMsgs=" + this.guildMsgs + ",msgCookie=" + this.msgCookie + ",msgIsEnd=" + this.msgIsEnd + ",feedTotal=" + this.feedTotal + ",guildFeeds=" + this.guildFeeds + ",feedCookie=" + this.feedCookie + ",feedIsEnd=" + this.feedIsEnd + ",}";
    }
}
