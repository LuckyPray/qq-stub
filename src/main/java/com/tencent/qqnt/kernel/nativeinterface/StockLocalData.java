package com.tencent.qqnt.kernel.nativeinterface;

import java.util.HashMap;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/StockLocalData.class */
public final class StockLocalData {
    public Integer comparePartInt;
    public String compareSpell;
    public Long datetime;
    public HashMap<Integer, String> diyFontConfigMap;
    public HashMap<Integer, Long> diyFontConfigMapTime;
    public byte[] diyFontTimestampBytes;
    public HashMap<Integer, Long> diyFontTimestampMap;
    public Long faceIdUpdateTime;
    public String feedContent;
    public Boolean feedHasPhoto;
    public Long fontEffectLastUpdateTime;
    public Integer gathtertype;
    public Boolean isAddedC2C;
    public Long lastUpdateTime;
    public String medalsInfo;
    public Long medalsInfoTime;
    public Long multiFlags;
    public String nameplateCfgInfo;
    public Long nameplateCfgInfoTime;
    public byte[] sig;
    public Long specialCareDateTime;
    public Boolean supportVideo;
    public Long timestamp;

    public StockLocalData() {
        this.diyFontTimestampMap = new HashMap<>();
        this.diyFontConfigMap = new HashMap<>();
        this.diyFontConfigMapTime = new HashMap<>();
    }

    public Integer getComparePartInt() {
        return this.comparePartInt;
    }

    public String getCompareSpell() {
        return this.compareSpell;
    }

    public Long getDatetime() {
        return this.datetime;
    }

    public HashMap<Integer, String> getDiyFontConfigMap() {
        return this.diyFontConfigMap;
    }

    public HashMap<Integer, Long> getDiyFontConfigMapTime() {
        return this.diyFontConfigMapTime;
    }

    public byte[] getDiyFontTimestampBytes() {
        return this.diyFontTimestampBytes;
    }

    public HashMap<Integer, Long> getDiyFontTimestampMap() {
        return this.diyFontTimestampMap;
    }

    public Long getFaceIdUpdateTime() {
        return this.faceIdUpdateTime;
    }

    public String getFeedContent() {
        return this.feedContent;
    }

    public Boolean getFeedHasPhoto() {
        return this.feedHasPhoto;
    }

    public Long getFontEffectLastUpdateTime() {
        return this.fontEffectLastUpdateTime;
    }

    public Integer getGathtertype() {
        return this.gathtertype;
    }

    public Boolean getIsAddedC2C() {
        return this.isAddedC2C;
    }

    public Long getLastUpdateTime() {
        return this.lastUpdateTime;
    }

    public String getMedalsInfo() {
        return this.medalsInfo;
    }

    public Long getMedalsInfoTime() {
        return this.medalsInfoTime;
    }

    public Long getMultiFlags() {
        return this.multiFlags;
    }

    public String getNameplateCfgInfo() {
        return this.nameplateCfgInfo;
    }

    public Long getNameplateCfgInfoTime() {
        return this.nameplateCfgInfoTime;
    }

    public byte[] getSig() {
        return this.sig;
    }

    public Long getSpecialCareDateTime() {
        return this.specialCareDateTime;
    }

    public Boolean getSupportVideo() {
        return this.supportVideo;
    }

    public Long getTimestamp() {
        return this.timestamp;
    }

    public void setComparePartInt(Integer num) {
        this.comparePartInt = num;
    }

    public void setCompareSpell(String str) {
        this.compareSpell = str;
    }

    public void setDatetime(Long l) {
        this.datetime = l;
    }

    public void setDiyFontConfigMap(HashMap<Integer, String> hashMap) {
        this.diyFontConfigMap = hashMap;
    }

    public void setDiyFontConfigMapTime(HashMap<Integer, Long> hashMap) {
        this.diyFontConfigMapTime = hashMap;
    }

    public void setDiyFontTimestampBytes(byte[] bArr) {
        this.diyFontTimestampBytes = bArr;
    }

    public void setDiyFontTimestampMap(HashMap<Integer, Long> hashMap) {
        this.diyFontTimestampMap = hashMap;
    }

    public void setFaceIdUpdateTime(Long l) {
        this.faceIdUpdateTime = l;
    }

    public void setFeedContent(String str) {
        this.feedContent = str;
    }

    public void setFeedHasPhoto(Boolean bool) {
        this.feedHasPhoto = bool;
    }

    public void setFontEffectLastUpdateTime(Long l) {
        this.fontEffectLastUpdateTime = l;
    }

    public void setGathtertype(Integer num) {
        this.gathtertype = num;
    }

    public void setIsAddedC2C(Boolean bool) {
        this.isAddedC2C = bool;
    }

    public void setLastUpdateTime(Long l) {
        this.lastUpdateTime = l;
    }

    public void setMedalsInfo(String str) {
        this.medalsInfo = str;
    }

    public void setMedalsInfoTime(Long l) {
        this.medalsInfoTime = l;
    }

    public void setMultiFlags(Long l) {
        this.multiFlags = l;
    }

    public void setNameplateCfgInfo(String str) {
        this.nameplateCfgInfo = str;
    }

    public void setNameplateCfgInfoTime(Long l) {
        this.nameplateCfgInfoTime = l;
    }

    public void setSig(byte[] bArr) {
        this.sig = bArr;
    }

    public void setSpecialCareDateTime(Long l) {
        this.specialCareDateTime = l;
    }

    public void setSupportVideo(Boolean bool) {
        this.supportVideo = bool;
    }

    public void setTimestamp(Long l) {
        this.timestamp = l;
    }

    public String toString() {
        return "StockLocalData{supportVideo=" + this.supportVideo + ",sig=" + this.sig + ",datetime=" + this.datetime + ",feedContent=" + this.feedContent + ",feedHasPhoto=" + this.feedHasPhoto + ",gathtertype=" + this.gathtertype + ",comparePartInt=" + this.comparePartInt + ",compareSpell=" + this.compareSpell + ",multiFlags=" + this.multiFlags + ",isAddedC2C=" + this.isAddedC2C + ",specialCareDateTime=" + this.specialCareDateTime + ",faceIdUpdateTime=" + this.faceIdUpdateTime + ",timestamp=" + this.timestamp + ",lastUpdateTime=" + this.lastUpdateTime + ",diyFontTimestampBytes=" + this.diyFontTimestampBytes + ",fontEffectLastUpdateTime=" + this.fontEffectLastUpdateTime + ",diyFontTimestampMap=" + this.diyFontTimestampMap + ",medalsInfo=" + this.medalsInfo + ",medalsInfoTime=" + this.medalsInfoTime + ",nameplateCfgInfo=" + this.nameplateCfgInfo + ",nameplateCfgInfoTime=" + this.nameplateCfgInfoTime + ",diyFontConfigMap=" + this.diyFontConfigMap + ",diyFontConfigMapTime=" + this.diyFontConfigMapTime + ",}";
    }

    public StockLocalData(Boolean bool, byte[] bArr, Long l, String str, Boolean bool2, Integer num, Integer num2, String str2, Long l2, Boolean bool3, Long l3, Long l4, Long l5, byte[] bArr2, Long l6, HashMap<Integer, Long> hashMap, String str3, Long l7, String str4, Long l8, HashMap<Integer, String> hashMap2, HashMap<Integer, Long> hashMap3) {
        this.diyFontTimestampMap = new HashMap<>();
        this.diyFontConfigMap = new HashMap<>();
        this.diyFontConfigMapTime = new HashMap<>();
        this.supportVideo = bool;
        this.sig = bArr;
        this.datetime = l;
        this.feedContent = str;
        this.feedHasPhoto = bool2;
        this.gathtertype = num;
        this.comparePartInt = num2;
        this.compareSpell = str2;
        this.multiFlags = l2;
        this.isAddedC2C = bool3;
        this.faceIdUpdateTime = l3;
        this.timestamp = l4;
        this.lastUpdateTime = l5;
        this.diyFontTimestampBytes = bArr2;
        this.fontEffectLastUpdateTime = l6;
        this.diyFontTimestampMap = hashMap;
        this.medalsInfo = str3;
        this.medalsInfoTime = l7;
        this.nameplateCfgInfo = str4;
        this.nameplateCfgInfoTime = l8;
        this.diyFontConfigMap = hashMap2;
        this.diyFontConfigMapTime = hashMap3;
    }
}
