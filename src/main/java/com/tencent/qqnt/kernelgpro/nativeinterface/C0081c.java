package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;

/* compiled from: IKernelGProGuildMsgListener.java */
/* renamed from: com.tencent.qqnt.kernelgpro.nativeinterface.c */
/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/c.class */
public final /* synthetic */ class C0081c {
    public static void $default$onFeedEventUpdate(IKernelGProGuildMsgListener iKernelGProGuildMsgListener, FirstViewDirectMsgNotifyInfo firstViewDirectMsgNotifyInfo) {
        IPatchRedirector iPatchRedirector = IKernelGProGuildMsgListener.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 1)) {
            return;
        }
        iPatchRedirector.redirect((short) 1, iKernelGProGuildMsgListener, firstViewDirectMsgNotifyInfo);
    }

    public static void $default$onGuildAvChannelOpenUpdate(IKernelGProGuildMsgListener iKernelGProGuildMsgListener, GProAvChannelStateMsg gProAvChannelStateMsg) {
        IPatchRedirector iPatchRedirector = IKernelGProGuildMsgListener.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) {
            return;
        }
        iPatchRedirector.redirect((short) 6, iKernelGProGuildMsgListener, gProAvChannelStateMsg);
    }

    public static void $default$onGuildInteractiveUpdate(IKernelGProGuildMsgListener iKernelGProGuildMsgListener, GuildInteractiveNotificationItem guildInteractiveNotificationItem) {
        IPatchRedirector iPatchRedirector = IKernelGProGuildMsgListener.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) {
            return;
        }
        iPatchRedirector.redirect((short) 2, iKernelGProGuildMsgListener, guildInteractiveNotificationItem);
    }

    public static void $default$onGuildNotificationAbstractUpdate(IKernelGProGuildMsgListener iKernelGProGuildMsgListener, GuildNotificationAbstractInfo guildNotificationAbstractInfo) {
        IPatchRedirector iPatchRedirector = IKernelGProGuildMsgListener.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) {
            return;
        }
        iPatchRedirector.redirect((short) 3, iKernelGProGuildMsgListener, guildNotificationAbstractInfo);
    }

    public static void $default$onGuildScheduleNotify(IKernelGProGuildMsgListener iKernelGProGuildMsgListener, GProScheduleNotifyInfo gProScheduleNotifyInfo) {
        IPatchRedirector iPatchRedirector = IKernelGProGuildMsgListener.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) {
            return;
        }
        iPatchRedirector.redirect((short) 5, iKernelGProGuildMsgListener, gProScheduleNotifyInfo);
    }

    public static void $default$onGuildTopFeedUpdate(IKernelGProGuildMsgListener iKernelGProGuildMsgListener, GProGuildTopFeedMsg gProGuildTopFeedMsg) {
        IPatchRedirector iPatchRedirector = IKernelGProGuildMsgListener.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) {
            return;
        }
        iPatchRedirector.redirect((short) 4, iKernelGProGuildMsgListener, gProGuildTopFeedMsg);
    }
}
