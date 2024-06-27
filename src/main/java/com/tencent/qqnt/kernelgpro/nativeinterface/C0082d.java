package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import java.util.ArrayList;

/* compiled from: IKernelGProGuildMsgService.java */
/* renamed from: com.tencent.qqnt.kernelgpro.nativeinterface.d */
/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/d.class */
public final /* synthetic */ class C0082d {
    public static void $default$clearFeedNoticeRedPoint(IKernelGProGuildMsgService iKernelGProGuildMsgService, ArrayList arrayList, IGuildOperateCallback iGuildOperateCallback) {
        IPatchRedirector iPatchRedirector = IKernelGProGuildMsgService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) {
            return;
        }
        iPatchRedirector.redirect((short) 3, iKernelGProGuildMsgService, arrayList, iGuildOperateCallback);
    }

    public static void $default$clearFeedSquareRead(IKernelGProGuildMsgService iKernelGProGuildMsgService, long j, long j2, int i, IGuildOperateCallback iGuildOperateCallback) {
        IPatchRedirector iPatchRedirector = IKernelGProGuildMsgService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) {
            return;
        }
        iPatchRedirector.redirect((short) 4, new Object[]{iKernelGProGuildMsgService, Long.valueOf(j), Long.valueOf(j2), Integer.valueOf(i), iGuildOperateCallback});
    }

    public static void $default$clearGuildCommonAbstractReadScene(IKernelGProGuildMsgService iKernelGProGuildMsgService, ArrayList arrayList, int i, IGuildOperateCallback iGuildOperateCallback) {
        IPatchRedirector iPatchRedirector = IKernelGProGuildMsgService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) {
            return;
        }
        iPatchRedirector.redirect((short) 8, new Object[]{iKernelGProGuildMsgService, arrayList, Integer.valueOf(i), iGuildOperateCallback});
    }

    public static void $default$clearGuildNoticeRedPoint(IKernelGProGuildMsgService iKernelGProGuildMsgService, ArrayList arrayList, IGuildOperateCallback iGuildOperateCallback) {
        IPatchRedirector iPatchRedirector = IKernelGProGuildMsgService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) {
            return;
        }
        iPatchRedirector.redirect((short) 2, iKernelGProGuildMsgService, arrayList, iGuildOperateCallback);
    }

    public static void $default$clearGuildVoiceChannelRedPoint(IKernelGProGuildMsgService iKernelGProGuildMsgService, ArrayList arrayList, IGuildOperateCallback iGuildOperateCallback) {
        IPatchRedirector iPatchRedirector = IKernelGProGuildMsgService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) {
            return;
        }
        iPatchRedirector.redirect((short) 5, iKernelGProGuildMsgService, arrayList, iGuildOperateCallback);
    }

    public static void $default$getGuildInteractiveNotification(IKernelGProGuildMsgService iKernelGProGuildMsgService, String str, int i, IGuildInteractiveNotificationCallback iGuildInteractiveNotificationCallback) {
        IPatchRedirector iPatchRedirector = IKernelGProGuildMsgService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) {
            return;
        }
        iPatchRedirector.redirect((short) 6, new Object[]{iKernelGProGuildMsgService, str, Integer.valueOf(i), iGuildInteractiveNotificationCallback});
    }

    public static void $default$getGuildNotificationAbstract(IKernelGProGuildMsgService iKernelGProGuildMsgService, String str, IGuildNotificationAbstractCallback iGuildNotificationAbstractCallback) {
        IPatchRedirector iPatchRedirector = IKernelGProGuildMsgService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) {
            return;
        }
        iPatchRedirector.redirect((short) 7, iKernelGProGuildMsgService, str, iGuildNotificationAbstractCallback);
    }

    public static void $default$removeKernelGProGuildMsgListener(IKernelGProGuildMsgService iKernelGProGuildMsgService, long j) {
        IPatchRedirector iPatchRedirector = IKernelGProGuildMsgService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 1)) {
            return;
        }
        iPatchRedirector.redirect((short) 1, iKernelGProGuildMsgService, j);
    }
}
