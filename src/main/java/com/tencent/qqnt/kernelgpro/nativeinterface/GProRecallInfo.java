package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProRecallInfo.class */
public final class GProRecallInfo {
    static IPatchRedirector $redirector_;
    public float qualityScore;
    public String query;
    public String recallName;
    public float relevanceScore;
    public float score;
    public String traceId;

    public GProRecallInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.query = "";
        this.recallName = "";
        this.traceId = "";
    }

    public float getQualityScore() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.qualityScore : ((Float) iPatchRedirector.redirect((short) 6, this)).floatValue();
    }

    public String getQuery() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.query : (String) iPatchRedirector.redirect((short) 3, this);
    }

    public String getRecallName() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.recallName : (String) iPatchRedirector.redirect((short) 4, this);
    }

    public float getRelevanceScore() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.relevanceScore : ((Float) iPatchRedirector.redirect((short) 5, this)).floatValue();
    }

    public float getScore() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.score : ((Float) iPatchRedirector.redirect((short) 7, this)).floatValue();
    }

    public String getTraceId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) ? this.traceId : (String) iPatchRedirector.redirect((short) 8, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 9)) {
            return (String) iPatchRedirector.redirect((short) 9, this);
        }
        return "GProRecallInfo{query=" + this.query + ",recallName=" + this.recallName + ",relevanceScore=" + this.relevanceScore + ",qualityScore=" + this.qualityScore + ",score=" + this.score + ",traceId=" + this.traceId + ",}";
    }

    public GProRecallInfo(String str, String str2, float f, float f2, float f3, String str3) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, this, str, str2, Float.valueOf(f), Float.valueOf(f2), Float.valueOf(f3), str3);
            return;
        }
        this.query = "";
        this.recallName = "";
        this.traceId = "";
        this.query = str;
        this.recallName = str2;
        this.relevanceScore = f;
        this.qualityScore = f2;
        this.score = f3;
        this.traceId = str3;
    }
}
