package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProBatchBotGetCommand.class */
public final class GProBatchBotGetCommand {
    static IPatchRedirector $redirector_;
    public long channelId;
    public GProBotClientInfo clientInfo;
    public long filter;
    public long guildId;
    public int num;
    public int page;
    public long scene;
    public ArrayList<Long> tinyIds;
    public ArrayList<Long> uins;

    public GProBatchBotGetCommand() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.uins = new ArrayList<>();
        this.tinyIds = new ArrayList<>();
        this.clientInfo = new GProBotClientInfo();
    }

    public long getChannelId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.channelId : ((Long) iPatchRedirector.redirect((short) 6, this)).longValue();
    }

    public GProBotClientInfo getClientInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.clientInfo : (GProBotClientInfo) iPatchRedirector.redirect((short) 7, this);
    }

    public long getFilter() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 11)) ? this.filter : ((Long) iPatchRedirector.redirect((short) 11, this)).longValue();
    }

    public long getGuildId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.guildId : ((Long) iPatchRedirector.redirect((short) 5, this)).longValue();
    }

    public int getNum() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) ? this.num : ((Integer) iPatchRedirector.redirect((short) 8, this)).intValue();
    }

    public int getPage() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 9)) ? this.page : ((Integer) iPatchRedirector.redirect((short) 9, this)).intValue();
    }

    public long getScene() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 10)) ? this.scene : ((Long) iPatchRedirector.redirect((short) 10, this)).longValue();
    }

    public ArrayList<Long> getTinyIds() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.tinyIds : (ArrayList) iPatchRedirector.redirect((short) 4, this);
    }

    public ArrayList<Long> getUins() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.uins : (ArrayList) iPatchRedirector.redirect((short) 3, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 12)) {
            return (String) iPatchRedirector.redirect((short) 12, this);
        }
        return "GProBatchBotGetCommand{uins=" + this.uins + ",tinyIds=" + this.tinyIds + ",guildId=" + this.guildId + ",channelId=" + this.channelId + ",clientInfo=" + this.clientInfo + ",num=" + this.num + ",page=" + this.page + ",scene=" + this.scene + ",filter=" + this.filter + ",}";
    }

    public GProBatchBotGetCommand(ArrayList<Long> arrayList, ArrayList<Long> arrayList2, long j, long j2, GProBotClientInfo gProBotClientInfo, int i, int i2, long j3, long j4) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, new Object[]{this, arrayList, arrayList2, Long.valueOf(j), Long.valueOf(j2), gProBotClientInfo, Integer.valueOf(i), Integer.valueOf(i2), Long.valueOf(j3), Long.valueOf(j4)});
            return;
        }
        this.uins = new ArrayList<>();
        this.tinyIds = new ArrayList<>();
        this.clientInfo = new GProBotClientInfo();
        this.uins = arrayList;
        this.tinyIds = arrayList2;
        this.guildId = j;
        this.channelId = j2;
        this.clientInfo = gProBotClientInfo;
        this.num = i;
        this.page = i2;
        this.scene = j3;
        this.filter = j4;
    }
}
