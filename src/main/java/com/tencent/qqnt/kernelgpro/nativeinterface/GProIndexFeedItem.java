package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProIndexFeedItem.class */
public final class GProIndexFeedItem {
    static IPatchRedirector $redirector_;
    public int indexType;
    public GProContentRecommendFeed recommendFeed;

    public GProIndexFeedItem() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 1)) {
            this.recommendFeed = new GProContentRecommendFeed();
        } else {
            iPatchRedirector.redirect((short) 1, this);
        }
    }

    public int getIndexType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.indexType : ((Integer) iPatchRedirector.redirect((short) 2, this)).intValue();
    }

    public GProContentRecommendFeed getRecommendFeed() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.recommendFeed : (GProContentRecommendFeed) iPatchRedirector.redirect((short) 3, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 4)) {
            return (String) iPatchRedirector.redirect((short) 4, this);
        }
        return "GProIndexFeedItem{indexType=" + this.indexType + ",recommendFeed=" + this.recommendFeed + ",}";
    }
}
