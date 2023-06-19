package QQService;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class CARDSETTYPE implements Serializable {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final int _TYPE_SET_BACKGROUND = 2;
    public static final int _TYPE_SET_DEFAUT = -1;
    public static final int _TYPE_SET_SINGLE = 0;
    public static final int _TYPE_SET_TAGS = 1;
    public static final int _TYPE_SET_TEMPLATE = 3;
    private String __T;
    private int __value;

    /* renamed from: e  reason: collision with root package name */
    private static CARDSETTYPE[] f5191e = new CARDSETTYPE[5];
    public static final CARDSETTYPE TYPE_SET_DEFAUT = new CARDSETTYPE(0, -1, "TYPE_SET_DEFAUT");
    public static final CARDSETTYPE TYPE_SET_SINGLE = new CARDSETTYPE(1, 0, "TYPE_SET_SINGLE");
    public static final CARDSETTYPE TYPE_SET_TAGS = new CARDSETTYPE(2, 1, "TYPE_SET_TAGS");
    public static final CARDSETTYPE TYPE_SET_BACKGROUND = new CARDSETTYPE(3, 2, "TYPE_SET_BACKGROUND");
    public static final CARDSETTYPE TYPE_SET_TEMPLATE = new CARDSETTYPE(4, 3, "TYPE_SET_TEMPLATE");

    private CARDSETTYPE(int i2, int i3, String str) {
        throw new RuntimeException("stub");
    }

    public static CARDSETTYPE convert(int i2) {
        throw new RuntimeException("stub");
    }

    public String toString() {
        throw new RuntimeException("stub");
    }

    public int value() {
        throw new RuntimeException("stub");
    }

    public static CARDSETTYPE convert(String str) {
        throw new RuntimeException("stub");
    }
}
