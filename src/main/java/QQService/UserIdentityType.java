package QQService;

import java.io.Serializable;

/* compiled from: P */
/* loaded from: classes.dex */
public final class UserIdentityType implements Serializable {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final int _UserIdentityType_Merchant = 1;
    public static final int _UserIdentityType_Nomal = 0;
    public static final int _UserIdentityType_Official = 2;
    private String __T;
    private int __value;

    /* renamed from: e  reason: collision with root package name */
    private static UserIdentityType[] f5194e = new UserIdentityType[3];
    public static final UserIdentityType UserIdentityType_Nomal = new UserIdentityType(0, 0, "UserIdentityType_Nomal");
    public static final UserIdentityType UserIdentityType_Merchant = new UserIdentityType(1, 1, "UserIdentityType_Merchant");
    public static final UserIdentityType UserIdentityType_Official = new UserIdentityType(2, 2, "UserIdentityType_Official");

    private UserIdentityType(int i2, int i3, String str) {
        throw new RuntimeException("stub");
    }

    public static UserIdentityType convert(int i2) {
        throw new RuntimeException("stub");
    }

    public String toString() {
        throw new RuntimeException("stub");
    }

    public int value() {
        throw new RuntimeException("stub");
    }

    public static UserIdentityType convert(String str) {
        throw new RuntimeException("stub");
    }
}
