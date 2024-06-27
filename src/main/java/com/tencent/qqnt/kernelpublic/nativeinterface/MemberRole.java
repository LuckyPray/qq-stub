package com.tencent.qqnt.kernelpublic.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.mobileqq.qfix.redirect.PatchRedirectCenter;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernelpublic/nativeinterface/MemberRole.class */
public final class MemberRole {
    private static final MemberRole[] $VALUES;
    static IPatchRedirector $redirector_;
    public static final MemberRole ADMIN;
    public static final MemberRole MEMBER;
    public static final MemberRole OWNER;
    public static final MemberRole STRANGER;
    public static final MemberRole UNSPECIFIED;

    static {
        MemberRole memberRole = new MemberRole("UNSPECIFIED", 0);
        UNSPECIFIED = memberRole;
        MemberRole memberRole2 = new MemberRole("STRANGER", 1);
        STRANGER = memberRole2;
        MemberRole memberRole3 = new MemberRole("MEMBER", 2);
        MEMBER = memberRole3;
        MemberRole memberRole4 = new MemberRole("ADMIN", 3);
        ADMIN = memberRole4;
        MemberRole memberRole5 = new MemberRole("OWNER", 4);
        OWNER = memberRole5;
        $VALUES = new MemberRole[]{memberRole, memberRole2, memberRole3, memberRole4, memberRole5};
    }

    MemberRole(String str, int i) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 1)) {
            return;
        }
        iPatchRedirector.redirect((short) 1, this, str, i);
    }

    public static MemberRole valueOf(String str) {
        throw new RuntimeException("Stub!");
    }

    public static MemberRole[] values() {
        return (MemberRole[]) $VALUES.clone();
    }
}
