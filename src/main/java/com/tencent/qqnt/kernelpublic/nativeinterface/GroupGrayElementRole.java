package com.tencent.qqnt.kernelpublic.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.mobileqq.qfix.redirect.PatchRedirectCenter;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernelpublic/nativeinterface/GroupGrayElementRole.class */
public final class GroupGrayElementRole {
    private static final GroupGrayElementRole[] $VALUES;
    static IPatchRedirector $redirector_;
    public static final GroupGrayElementRole KADMIN;
    public static final GroupGrayElementRole KMEMBER;
    public static final GroupGrayElementRole KOTHER;

    static {
        GroupGrayElementRole groupGrayElementRole = new GroupGrayElementRole("KOTHER", 0);
        KOTHER = groupGrayElementRole;
        GroupGrayElementRole groupGrayElementRole2 = new GroupGrayElementRole("KMEMBER", 1);
        KMEMBER = groupGrayElementRole2;
        GroupGrayElementRole groupGrayElementRole3 = new GroupGrayElementRole("KADMIN", 2);
        KADMIN = groupGrayElementRole3;
        $VALUES = new GroupGrayElementRole[]{groupGrayElementRole, groupGrayElementRole2, groupGrayElementRole3};
    }

    GroupGrayElementRole(String str, int i) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 1)) {
            return;
        }
        iPatchRedirector.redirect((short) 1, this, str, i);
    }

    public static GroupGrayElementRole valueOf(String str) {
        throw new RuntimeException("Stub!");
    }

    public static GroupGrayElementRole[] values() {
        return $VALUES.clone();
    }
}
