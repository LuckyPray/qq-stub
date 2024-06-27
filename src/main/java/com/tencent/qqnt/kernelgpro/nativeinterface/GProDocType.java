package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProDocType.class */
public final class GProDocType {
    static IPatchRedirector $redirector_;
    public static final int DOC_TYPE_ADDON = 110;
    public static final int DOC_TYPE_BOARD = 12;
    public static final int DOC_TYPE_DRAWING = 89;
    public static final int DOC_TYPE_DRIVE = 101;
    public static final int DOC_TYPE_EXCEL = 1;
    public static final int DOC_TYPE_FILE = 100;
    public static final int DOC_TYPE_FLOWCHART = 91;
    public static final int DOC_TYPE_FOLDER = 3;
    public static final int DOC_TYPE_FORM = 2;
    public static final int DOC_TYPE_MIND = 90;
    public static final int DOC_TYPE_MINI_PROGRAM = 7;
    public static final int DOC_TYPE_NOTE = 5;
    public static final int DOC_TYPE_PDF = 6;
    public static final int DOC_TYPE_RESUME = 11;
    public static final int DOC_TYPE_SLIDES = 4;
    public static final int DOC_TYPE_SMARTCANVAS = 8;
    public static final int DOC_TYPE_SMARTSHEET = 9;
    public static final int DOC_TYPE_SOGOU_SPEECH = 102;
    public static final int DOC_TYPE_UNKNOW = 10;
    public static final int DOC_TYPE_WORD = 0;

    public GProDocType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 1)) {
            return;
        }
        iPatchRedirector.redirect((short) 1, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? "GProDocType{}" : (String) iPatchRedirector.redirect((short) 2, this);
    }
}
