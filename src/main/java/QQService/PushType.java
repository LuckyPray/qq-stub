package QQService;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class PushType implements Serializable {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final int _PUSH_TYPE_NONE = -1;
    public static final int _PUSH_TYPE_VISITOR_INCR = 1;
    public static final int _PUSH_TYPE_VOTE_INCR = 0;
    private final String __T;
    private final int __value;

    /* renamed from: e  reason: collision with root package name */
    private static final PushType[] f5193e = new PushType[3];
    public static final PushType PUSH_TYPE_NONE = new PushType(0, -1, "PUSH_TYPE_NONE");
    public static final PushType PUSH_TYPE_VOTE_INCR = new PushType(1, 0, "PUSH_TYPE_VOTE_INCR");
    public static final PushType PUSH_TYPE_VISITOR_INCR = new PushType(2, 1, "PUSH_TYPE_VISITOR_INCR");

    private PushType(int i2, int i3, String str) {
        throw new RuntimeException("stub");
    }

    public static PushType convert(int i2) {
        throw new RuntimeException("stub");
    }

    public String toString() {
        throw new RuntimeException("stub");
    }

    public int value() {
        throw new RuntimeException("stub");
    }

    public static PushType convert(String str) {
        throw new RuntimeException("stub");
    }
}
