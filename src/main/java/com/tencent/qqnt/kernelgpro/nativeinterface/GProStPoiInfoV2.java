package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProStPoiInfoV2.class */
public final class GProStPoiInfoV2 {
    static IPatchRedirector $redirector_;
    public String address;
    public String city;
    public String country;
    public String defaultName;
    public String dianPingId;
    public String displayName;
    public int distance;
    public String distanceText;
    public String district;
    public int districtCode;
    public GProStGPSV2 gps;
    public int hotValue;
    public String name;
    public String phone;
    public String poiId;
    public int poiNum;
    public int poiOrderType;
    public int poiType;
    public String province;
    public String typeName;

    public GProStPoiInfoV2() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.poiId = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.name = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.typeName = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.address = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.gps = new GProStGPSV2();
        this.phone = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.country = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.province = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.city = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.defaultName = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.district = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.dianPingId = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.distanceText = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.displayName = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    }

    public String getAddress() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.address : (String) iPatchRedirector.redirect((short) 6, this);
    }

    public String getCity() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 14)) ? this.city : (String) iPatchRedirector.redirect((short) 14, this);
    }

    public String getCountry() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 12)) ? this.country : (String) iPatchRedirector.redirect((short) 12, this);
    }

    public String getDefaultName() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 17)) ? this.defaultName : (String) iPatchRedirector.redirect((short) 17, this);
    }

    public String getDianPingId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 19)) ? this.dianPingId : (String) iPatchRedirector.redirect((short) 19, this);
    }

    public String getDisplayName() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 21)) ? this.displayName : (String) iPatchRedirector.redirect((short) 21, this);
    }

    public int getDistance() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 9)) ? this.distance : ((Integer) iPatchRedirector.redirect((short) 9, this)).intValue();
    }

    public String getDistanceText() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 20)) ? this.distanceText : (String) iPatchRedirector.redirect((short) 20, this);
    }

    public String getDistrict() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 18)) ? this.district : (String) iPatchRedirector.redirect((short) 18, this);
    }

    public int getDistrictCode() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.districtCode : ((Integer) iPatchRedirector.redirect((short) 7, this)).intValue();
    }

    public GProStGPSV2 getGps() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) ? this.gps : (GProStGPSV2) iPatchRedirector.redirect((short) 8, this);
    }

    public int getHotValue() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 10)) ? this.hotValue : ((Integer) iPatchRedirector.redirect((short) 10, this)).intValue();
    }

    public String getName() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.name : (String) iPatchRedirector.redirect((short) 3, this);
    }

    public String getPhone() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 11)) ? this.phone : (String) iPatchRedirector.redirect((short) 11, this);
    }

    public String getPoiId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.poiId : (String) iPatchRedirector.redirect((short) 2, this);
    }

    public int getPoiNum() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 15)) ? this.poiNum : ((Integer) iPatchRedirector.redirect((short) 15, this)).intValue();
    }

    public int getPoiOrderType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 16)) ? this.poiOrderType : ((Integer) iPatchRedirector.redirect((short) 16, this)).intValue();
    }

    public int getPoiType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.poiType : ((Integer) iPatchRedirector.redirect((short) 4, this)).intValue();
    }

    public String getProvince() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 13)) ? this.province : (String) iPatchRedirector.redirect((short) 13, this);
    }

    public String getTypeName() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.typeName : (String) iPatchRedirector.redirect((short) 5, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 22)) {
            return (String) iPatchRedirector.redirect((short) 22, this);
        }
        return "GProStPoiInfoV2{poiId=" + this.poiId + ",name=" + this.name + ",poiType=" + this.poiType + ",typeName=" + this.typeName + ",address=" + this.address + ",districtCode=" + this.districtCode + ",gps=" + this.gps + ",distance=" + this.distance + ",hotValue=" + this.hotValue + ",phone=" + this.phone + ",country=" + this.country + ",province=" + this.province + ",city=" + this.city + ",poiNum=" + this.poiNum + ",poiOrderType=" + this.poiOrderType + ",defaultName=" + this.defaultName + ",district=" + this.district + ",dianPingId=" + this.dianPingId + ",distanceText=" + this.distanceText + ",displayName=" + this.displayName + ",}";
    }
}
