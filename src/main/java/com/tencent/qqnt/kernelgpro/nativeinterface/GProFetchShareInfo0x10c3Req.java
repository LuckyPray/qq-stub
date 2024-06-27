package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProFetchShareInfo0x10c3Req.class */
public final class GProFetchShareInfo0x10c3Req {
    static IPatchRedirector $redirector_;
    public byte[] businessParam;
    public int businessType;
    public GProCmd0x10c3Filter filter;
    public boolean isShortLink;
    public ArrayList<GProURLParam> urlParams;

    public GProFetchShareInfo0x10c3Req() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.businessParam = new byte[0];
        this.urlParams = new ArrayList<>();
        this.filter = new GProCmd0x10c3Filter();
    }

    public byte[] getBusinessParam() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.businessParam : (byte[]) iPatchRedirector.redirect((short) 4, this);
    }

    public int getBusinessType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.businessType : ((Integer) iPatchRedirector.redirect((short) 3, this)).intValue();
    }

    public GProCmd0x10c3Filter getFilter() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.filter : (GProCmd0x10c3Filter) iPatchRedirector.redirect((short) 7, this);
    }

    public boolean getIsShortLink() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.isShortLink : ((Boolean) iPatchRedirector.redirect((short) 5, this)).booleanValue();
    }

    public ArrayList<GProURLParam> getUrlParams() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.urlParams : (ArrayList) iPatchRedirector.redirect((short) 6, this);
    }

    public void setBusinessParam(byte[] bArr) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 9)) {
            this.businessParam = bArr;
        } else {
            iPatchRedirector.redirect((short) 9, this, bArr);
        }
    }

    public void setBusinessType(int i) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) {
            this.businessType = i;
        } else {
            iPatchRedirector.redirect((short) 8, this, i);
        }
    }

    public void setFilter(GProCmd0x10c3Filter gProCmd0x10c3Filter) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 12)) {
            this.filter = gProCmd0x10c3Filter;
        } else {
            iPatchRedirector.redirect((short) 12, this, gProCmd0x10c3Filter);
        }
    }

    public void setIsShortLink(boolean z) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 10)) {
            this.isShortLink = z;
        } else {
            iPatchRedirector.redirect((short) 10, this, z);
        }
    }

    public void setUrlParams(ArrayList<GProURLParam> arrayList) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 11)) {
            this.urlParams = arrayList;
        } else {
            iPatchRedirector.redirect((short) 11, this, arrayList);
        }
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 13)) {
            return (String) iPatchRedirector.redirect((short) 13, this);
        }
        return "GProFetchShareInfo0x10c3Req{businessType=" + this.businessType + ",businessParam=" + this.businessParam + ",isShortLink=" + this.isShortLink + ",urlParams=" + this.urlParams + ",filter=" + this.filter + ",}";
    }

    public GProFetchShareInfo0x10c3Req(int i, byte[] bArr, boolean z, ArrayList<GProURLParam> arrayList, GProCmd0x10c3Filter gProCmd0x10c3Filter) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, new Object[]{this, Integer.valueOf(i), bArr, Boolean.valueOf(z), arrayList, gProCmd0x10c3Filter});
            return;
        }
        this.businessParam = new byte[0];
        this.urlParams = new ArrayList<>();
        this.filter = new GProCmd0x10c3Filter();
        this.businessType = i;
        this.businessParam = bArr;
        this.isShortLink = z;
        this.urlParams = arrayList;
        this.filter = gProCmd0x10c3Filter;
    }
}
