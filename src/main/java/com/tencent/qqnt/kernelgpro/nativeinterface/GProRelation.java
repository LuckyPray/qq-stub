package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.mobileqq.qfix.redirect.PatchRedirectCenter;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProRelation.class */
public final class GProRelation {
    private static final GProRelation[] $VALUES;
    static IPatchRedirector $redirector_;

    /* renamed from: EQ */
    public static final GProRelation f75EQ;
    public static final GProRelation GTE;

    static {
        GProRelation gProRelation = new GProRelation("EQ", 0);
        f75EQ = gProRelation;
        GProRelation gProRelation2 = new GProRelation("GTE", 1);
        GTE = gProRelation2;
        $VALUES = new GProRelation[]{gProRelation, gProRelation2};
    }

    GProRelation(String str, int i) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 1)) {
            return;
        }
        iPatchRedirector.redirect((short) 1, this, str, i);
    }

    public static GProRelation valueOf(String str) {
        throw new RuntimeException("Stub!");
    }

    public static GProRelation[] values() {
        return $VALUES.clone();
    }
}
