package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/AlbumInfo.class */
public final class AlbumInfo {
    public String albumId;
    public boolean allowShare;
    public String bitmap;
    public int busiType;
    public StMedia cover;
    public long createTime;
    public StUser creator;
    public String desc;
    public FamilyAlbumMeta familyAlbum;
    public boolean isShareAlbum;
    public boolean isSubscribe;
    public long lastUploadTime;
    public LoverAlbumMeta loverAlbum;
    public long modifyTime;
    public String name;
    public String owner;
    public AlbumAccessPermission permission;
    public int qzAlbumType;
    public ShareAlbumMeta shareAlbum;
    public int status;
    public long topFlag;
    public long uploadNumber;

    public AlbumInfo() {
        this.albumId = "";
        this.owner = "";
        this.name = "";
        this.desc = "";
        this.cover = new StMedia();
        this.creator = new StUser();
        this.permission = new AlbumAccessPermission();
        this.bitmap = "";
        this.shareAlbum = new ShareAlbumMeta();
        this.familyAlbum = new FamilyAlbumMeta();
        this.loverAlbum = new LoverAlbumMeta();
    }

    public String getAlbumId() {
        return this.albumId;
    }

    public boolean getAllowShare() {
        return this.allowShare;
    }

    public String getBitmap() {
        return this.bitmap;
    }

    public int getBusiType() {
        return this.busiType;
    }

    public StMedia getCover() {
        return this.cover;
    }

    public long getCreateTime() {
        return this.createTime;
    }

    public StUser getCreator() {
        return this.creator;
    }

    public String getDesc() {
        return this.desc;
    }

    public FamilyAlbumMeta getFamilyAlbum() {
        return this.familyAlbum;
    }

    public boolean getIsShareAlbum() {
        return this.isShareAlbum;
    }

    public boolean getIsSubscribe() {
        return this.isSubscribe;
    }

    public long getLastUploadTime() {
        return this.lastUploadTime;
    }

    public LoverAlbumMeta getLoverAlbum() {
        return this.loverAlbum;
    }

    public long getModifyTime() {
        return this.modifyTime;
    }

    public String getName() {
        return this.name;
    }

    public String getOwner() {
        return this.owner;
    }

    public AlbumAccessPermission getPermission() {
        return this.permission;
    }

    public int getQzAlbumType() {
        return this.qzAlbumType;
    }

    public ShareAlbumMeta getShareAlbum() {
        return this.shareAlbum;
    }

    public int getStatus() {
        return this.status;
    }

    public long getTopFlag() {
        return this.topFlag;
    }

    public long getUploadNumber() {
        return this.uploadNumber;
    }

    public void setAlbumId(String str) {
        this.albumId = str;
    }

    public void setAllowShare(boolean z) {
        this.allowShare = z;
    }

    public void setBitmap(String str) {
        this.bitmap = str;
    }

    public void setBusiType(int i) {
        this.busiType = i;
    }

    public void setCover(StMedia stMedia) {
        this.cover = stMedia;
    }

    public void setCreateTime(long j) {
        this.createTime = j;
    }

    public void setCreator(StUser stUser) {
        this.creator = stUser;
    }

    public void setDesc(String str) {
        this.desc = str;
    }

    public void setFamilyAlbum(FamilyAlbumMeta familyAlbumMeta) {
        this.familyAlbum = familyAlbumMeta;
    }

    public void setIsShareAlbum(boolean z) {
        this.isShareAlbum = z;
    }

    public void setIsSubscribe(boolean z) {
        this.isSubscribe = z;
    }

    public void setLastUploadTime(long j) {
        this.lastUploadTime = j;
    }

    public void setLoverAlbum(LoverAlbumMeta loverAlbumMeta) {
        this.loverAlbum = loverAlbumMeta;
    }

    public void setModifyTime(long j) {
        this.modifyTime = j;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setOwner(String str) {
        this.owner = str;
    }

    public void setPermission(AlbumAccessPermission albumAccessPermission) {
        this.permission = albumAccessPermission;
    }

    public void setQzAlbumType(int i) {
        this.qzAlbumType = i;
    }

    public void setShareAlbum(ShareAlbumMeta shareAlbumMeta) {
        this.shareAlbum = shareAlbumMeta;
    }

    public void setStatus(int i) {
        this.status = i;
    }

    public void setTopFlag(long j) {
        this.topFlag = j;
    }

    public void setUploadNumber(long j) {
        this.uploadNumber = j;
    }

    public AlbumInfo(String str, String str2, String str3, String str4, long j, long j2, long j3, long j4, StMedia stMedia, StUser stUser, long j5, int i, int i2, AlbumAccessPermission albumAccessPermission, boolean z, boolean z2, String str5, boolean z3, ShareAlbumMeta shareAlbumMeta, int i3, FamilyAlbumMeta familyAlbumMeta, LoverAlbumMeta loverAlbumMeta) {
        this.albumId = "";
        this.owner = "";
        this.name = "";
        this.desc = "";
        this.cover = new StMedia();
        this.creator = new StUser();
        this.permission = new AlbumAccessPermission();
        this.bitmap = "";
        this.shareAlbum = new ShareAlbumMeta();
        this.familyAlbum = new FamilyAlbumMeta();
        this.loverAlbum = new LoverAlbumMeta();
        this.albumId = str;
        this.owner = str2;
        this.name = str3;
        this.desc = str4;
        this.createTime = j;
        this.modifyTime = j2;
        this.lastUploadTime = j3;
        this.uploadNumber = j4;
        this.cover = stMedia;
        this.creator = stUser;
        this.topFlag = j5;
        this.busiType = i;
        this.status = i2;
        this.permission = albumAccessPermission;
        this.allowShare = z;
        this.isSubscribe = z2;
        this.bitmap = str5;
        this.isShareAlbum = z3;
        this.shareAlbum = shareAlbumMeta;
        this.qzAlbumType = i3;
        this.familyAlbum = familyAlbumMeta;
        this.loverAlbum = loverAlbumMeta;
    }
}
