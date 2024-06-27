package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProLocation.class */
public final class GProLocation {
    static IPatchRedirector $redirector_;
    public String city;
    public int cityId;
    public String cityZone;
    public int cityZoneId;
    public String country;
    public int countryId;
    public String province;
    public int provinceId;

    public GProLocation() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.country = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.province = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.city = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.cityZone = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    }

    public String getCity() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 9)) ? this.city : (String) iPatchRedirector.redirect((short) 9, this);
    }

    public int getCityId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.cityId : ((Integer) iPatchRedirector.redirect((short) 5, this)).intValue();
    }

    public String getCityZone() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 10)) ? this.cityZone : (String) iPatchRedirector.redirect((short) 10, this);
    }

    public int getCityZoneId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.cityZoneId : ((Integer) iPatchRedirector.redirect((short) 6, this)).intValue();
    }

    public String getCountry() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.country : (String) iPatchRedirector.redirect((short) 7, this);
    }

    public int getCountryId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.countryId : ((Integer) iPatchRedirector.redirect((short) 3, this)).intValue();
    }

    public String getProvince() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) ? this.province : (String) iPatchRedirector.redirect((short) 8, this);
    }

    public int getProvinceId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.provinceId : ((Integer) iPatchRedirector.redirect((short) 4, this)).intValue();
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 11)) {
            return (String) iPatchRedirector.redirect((short) 11, this);
        }
        return "GProLocation{countryId=" + this.countryId + ",provinceId=" + this.provinceId + ",cityId=" + this.cityId + ",cityZoneId=" + this.cityZoneId + ",country=" + this.country + ",province=" + this.province + ",city=" + this.city + ",cityZone=" + this.cityZone + ",}";
    }

    public GProLocation(int i, int i2, int i3, int i4, String str, String str2, String str3, String str4) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, new Object[]{this, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), str, str2, str3, str4});
            return;
        }
        this.country = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.province = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.city = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.cityZone = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.countryId = i;
        this.provinceId = i2;
        this.cityId = i3;
        this.cityZoneId = i4;
        this.country = str;
        this.province = str2;
        this.city = str3;
        this.cityZone = str4;
    }
}
