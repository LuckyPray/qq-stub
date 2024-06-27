package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProContentItemType.class */
public final class GProContentItemType {
    static IPatchRedirector $redirector_;
    public static final int CONTENT_ITEM_TYPE_FEED = 1;
    public static final int CONTENT_ITEM_TYPE_FEED_GUILD = 11;
    public static final int CONTENT_ITEM_TYPE_GROUP = 3;
    public static final int CONTENT_ITEM_TYPE_GUILD = 6;
    public static final int CONTENT_ITEM_TYPE_HOT_LIVE = 4;
    public static final int CONTENT_ITEM_TYPE_LIVE = 7;
    public static final int CONTENT_ITEM_TYPE_ROBOT = 2;
    public static final int CONTENT_ITEM_TYPE_SCHEMA_CARD = 9;
    public static final int CONTENT_ITEM_TYPE_SELECTED_GUILD = 5;
    public static final int CONTENT_ITEM_TYPE_TOPIC = 10;
    public static final int CONTENT_ITEM_TYPE_UNKOWN = 0;
    public static final int CONTENT_ITEM_TYPE_VOICE = 8;

    public GProContentItemType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 1)) {
            return;
        }
        iPatchRedirector.redirect((short) 1, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? "GProContentItemType{}" : (String) iPatchRedirector.redirect((short) 2, this);
    }
}
