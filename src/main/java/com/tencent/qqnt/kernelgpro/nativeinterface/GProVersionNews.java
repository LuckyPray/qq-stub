package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;
import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProVersionNews.class */
public final class GProVersionNews {
    static IPatchRedirector $redirector_;
    public String jumpFeedUrl;
    public ArrayList<String> newsUrlList;
    public String subtitle;
    public String title;

    public GProVersionNews() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.title = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.subtitle = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.newsUrlList = new ArrayList<>();
        this.jumpFeedUrl = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    }

    public String getJumpFeedUrl() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.jumpFeedUrl : (String) iPatchRedirector.redirect((short) 6, this);
    }

    public ArrayList<String> getNewsUrlList() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.newsUrlList : (ArrayList) iPatchRedirector.redirect((short) 5, this);
    }

    public String getSubtitle() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.subtitle : (String) iPatchRedirector.redirect((short) 4, this);
    }

    public String getTitle() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.title : (String) iPatchRedirector.redirect((short) 3, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 7)) {
            return (String) iPatchRedirector.redirect((short) 7, this);
        }
        return "GProVersionNews{title=" + this.title + ",subtitle=" + this.subtitle + ",newsUrlList=" + this.newsUrlList + ",jumpFeedUrl=" + this.jumpFeedUrl + ",}";
    }

    public GProVersionNews(String str, String str2, ArrayList<String> arrayList, String str3) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, new Object[]{this, str, str2, arrayList, str3});
            return;
        }
        this.title = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.subtitle = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.newsUrlList = new ArrayList<>();
        this.jumpFeedUrl = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.title = str;
        this.subtitle = str2;
        this.newsUrlList = arrayList;
        this.jumpFeedUrl = str3;
    }
}
