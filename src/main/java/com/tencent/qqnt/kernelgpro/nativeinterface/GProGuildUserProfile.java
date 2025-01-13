package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;
import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProGuildUserProfile.class */
public final class GProGuildUserProfile {
    static IPatchRedirector $redirector_;
    public byte age;
    public GProUserAllGiftInfo allGiftInfo;
    public String avatarMeta;
    public String avatarPendant;
    public ArrayList<GProClientAccount> bindClientAccount;
    public short birthDay;
    public short birthMonth;
    public short birthYear;
    public String city;
    public int cityId;
    public int cityZoneId;
    public ArrayList<GProClientArchive> clientArchives;
    public GProClientIdentity clientIdentity;
    public GProClientPresence clientPresence;
    public String constellation;
    public String country;
    public int countryId;
    public int directMsgBlackFlag;
    public int faceAuthStatus;
    public GProArchiveArkData firstArchiveArkData;
    public int gender;
    public boolean hasGuildUserInfo;
    public boolean hasMoreArchive;
    public int isMember;
    public boolean isNlAge;
    public boolean isQQFriend;
    public long joinGroupProTimeStamp;
    public long joinTime;
    public int joinedGuildShowSwitch;
    public GProUserJoinedGuildSummary joinedGuildSummary;
    public ArrayList<GProMedal> medals;
    public String memberName;
    public String nick;
    public String openId;
    public String personalSignature;
    public String province;
    public int provinceId;
    public int publishedFeedShowSwitch;
    public GProUserPublishedFeedSummary publishedFeedSummary;
    public int robotType;
    public GProProfileRoomState roomState;
    public int roomStateShowSwitch;
    public long shutUpExpireTime;
    public GProSignGuildInfo signGuildInfo;
    public String skinPicUrl;
    public long tinyId;
    public long uin;
    public int userType;
    public int verifyFriType;
    public String verifyUrl;

    public GProGuildUserProfile() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.nick = "";
        this.country = "";
        this.province = "";
        this.city = "";
        this.memberName = "";
        this.clientPresence = new GProClientPresence();
        this.clientArchives = new ArrayList<>();
        this.bindClientAccount = new ArrayList<>();
        this.firstArchiveArkData = new GProArchiveArkData();
        this.avatarMeta = "";
        this.verifyUrl = "";
        this.openId = "";
        this.avatarPendant = "";
        this.medals = new ArrayList<>();
        this.joinedGuildSummary = new GProUserJoinedGuildSummary();
        this.publishedFeedSummary = new GProUserPublishedFeedSummary();
        this.clientIdentity = new GProClientIdentity();
        this.signGuildInfo = new GProSignGuildInfo();
        this.allGiftInfo = new GProUserAllGiftInfo();
    }

    public byte getAge() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 9)) ? this.age : ((Byte) iPatchRedirector.redirect((short) 9, this)).byteValue();
    }

    public GProUserAllGiftInfo getAllGiftInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 52)) ? this.allGiftInfo : (GProUserAllGiftInfo) iPatchRedirector.redirect((short) 52, this);
    }

    public String getAvatarMeta() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 34)) ? this.avatarMeta : (String) iPatchRedirector.redirect((short) 34, this);
    }

    public String getAvatarPendant() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 46)) ? this.avatarPendant : (String) iPatchRedirector.redirect((short) 46, this);
    }

    public ArrayList<GProClientAccount> getBindClientAccount() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 26)) ? this.bindClientAccount : (ArrayList) iPatchRedirector.redirect((short) 26, this);
    }

    public short getBirthDay() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 12)) ? this.birthDay : ((Short) iPatchRedirector.redirect((short) 12, this)).shortValue();
    }

    public short getBirthMonth() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 11)) ? this.birthMonth : ((Short) iPatchRedirector.redirect((short) 11, this)).shortValue();
    }

    public short getBirthYear() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 10)) ? this.birthYear : ((Short) iPatchRedirector.redirect((short) 10, this)).shortValue();
    }

    public String getCity() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 15)) ? this.city : (String) iPatchRedirector.redirect((short) 15, this);
    }

    public int getCityId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 18)) ? this.cityId : ((Integer) iPatchRedirector.redirect((short) 18, this)).intValue();
    }

    public int getCityZoneId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 19)) ? this.cityZoneId : ((Integer) iPatchRedirector.redirect((short) 19, this)).intValue();
    }

    public ArrayList<GProClientArchive> getClientArchives() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 25)) ? this.clientArchives : (ArrayList) iPatchRedirector.redirect((short) 25, this);
    }

    public GProClientIdentity getClientIdentity() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 50)) ? this.clientIdentity : (GProClientIdentity) iPatchRedirector.redirect((short) 50, this);
    }

    public GProClientPresence getClientPresence() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 24)) ? this.clientPresence : (GProClientPresence) iPatchRedirector.redirect((short) 24, this);
    }

    public String getConstellation() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 37)) ? this.constellation : (String) iPatchRedirector.redirect((short) 37, this);
    }

    public String getCountry() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 13)) ? this.country : (String) iPatchRedirector.redirect((short) 13, this);
    }

    public int getCountryId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 16)) ? this.countryId : ((Integer) iPatchRedirector.redirect((short) 16, this)).intValue();
    }

    public int getDirectMsgBlackFlag() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 30)) ? this.directMsgBlackFlag : ((Integer) iPatchRedirector.redirect((short) 30, this)).intValue();
    }

    public int getFaceAuthStatus() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 35)) ? this.faceAuthStatus : ((Integer) iPatchRedirector.redirect((short) 35, this)).intValue();
    }

    public GProArchiveArkData getFirstArchiveArkData() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 28)) ? this.firstArchiveArkData : (GProArchiveArkData) iPatchRedirector.redirect((short) 28, this);
    }

    public int getGender() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.gender : ((Integer) iPatchRedirector.redirect((short) 7, this)).intValue();
    }

    public boolean getHasGuildUserInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 32)) ? this.hasGuildUserInfo : ((Boolean) iPatchRedirector.redirect((short) 32, this)).booleanValue();
    }

    public boolean getHasMoreArchive() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 27)) ? this.hasMoreArchive : ((Boolean) iPatchRedirector.redirect((short) 27, this)).booleanValue();
    }

    public int getIsMember() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 29)) ? this.isMember : ((Integer) iPatchRedirector.redirect((short) 29, this)).intValue();
    }

    public boolean getIsNlAge() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) ? this.isNlAge : ((Boolean) iPatchRedirector.redirect((short) 8, this)).booleanValue();
    }

    public boolean getIsQQFriend() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 40)) ? this.isQQFriend : ((Boolean) iPatchRedirector.redirect((short) 40, this)).booleanValue();
    }

    public long getJoinGroupProTimeStamp() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 33)) ? this.joinGroupProTimeStamp : ((Long) iPatchRedirector.redirect((short) 33, this)).longValue();
    }

    public long getJoinTime() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 21)) ? this.joinTime : ((Long) iPatchRedirector.redirect((short) 21, this)).longValue();
    }

    public int getJoinedGuildShowSwitch() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 43)) ? this.joinedGuildShowSwitch : ((Integer) iPatchRedirector.redirect((short) 43, this)).intValue();
    }

    public GProUserJoinedGuildSummary getJoinedGuildSummary() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 48)) ? this.joinedGuildSummary : (GProUserJoinedGuildSummary) iPatchRedirector.redirect((short) 48, this);
    }

    public ArrayList<GProMedal> getMedals() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 47)) ? this.medals : (ArrayList) iPatchRedirector.redirect((short) 47, this);
    }

    public String getMemberName() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 23)) ? this.memberName : (String) iPatchRedirector.redirect((short) 23, this);
    }

    public String getNick() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.nick : (String) iPatchRedirector.redirect((short) 5, this);
    }

    public String getOpenId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 44)) ? this.openId : (String) iPatchRedirector.redirect((short) 44, this);
    }

    public String getPersonalSignature() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 38)) ? this.personalSignature : (String) iPatchRedirector.redirect((short) 38, this);
    }

    public String getProvince() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 14)) ? this.province : (String) iPatchRedirector.redirect((short) 14, this);
    }

    public int getProvinceId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 17)) ? this.provinceId : ((Integer) iPatchRedirector.redirect((short) 17, this)).intValue();
    }

    public int getPublishedFeedShowSwitch() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 42)) ? this.publishedFeedShowSwitch : ((Integer) iPatchRedirector.redirect((short) 42, this)).intValue();
    }

    public GProUserPublishedFeedSummary getPublishedFeedSummary() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 49)) ? this.publishedFeedSummary : (GProUserPublishedFeedSummary) iPatchRedirector.redirect((short) 49, this);
    }

    public int getRobotType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 22)) ? this.robotType : ((Integer) iPatchRedirector.redirect((short) 22, this)).intValue();
    }

    public GProProfileRoomState getRoomState() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 39)) ? this.roomState : (GProProfileRoomState) iPatchRedirector.redirect((short) 39, this);
    }

    public int getRoomStateShowSwitch() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 41)) ? this.roomStateShowSwitch : ((Integer) iPatchRedirector.redirect((short) 41, this)).intValue();
    }

    public long getShutUpExpireTime() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 31)) ? this.shutUpExpireTime : ((Long) iPatchRedirector.redirect((short) 31, this)).longValue();
    }

    public GProSignGuildInfo getSignGuildInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 51)) ? this.signGuildInfo : (GProSignGuildInfo) iPatchRedirector.redirect((short) 51, this);
    }

    public String getSkinPicUrl() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 45)) ? this.skinPicUrl : (String) iPatchRedirector.redirect((short) 45, this);
    }

    public long getTinyId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.tinyId : ((Long) iPatchRedirector.redirect((short) 4, this)).longValue();
    }

    public long getUin() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.uin : ((Long) iPatchRedirector.redirect((short) 3, this)).longValue();
    }

    public int getUserType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 20)) ? this.userType : ((Integer) iPatchRedirector.redirect((short) 20, this)).intValue();
    }

    public int getVerifyFriType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.verifyFriType : ((Integer) iPatchRedirector.redirect((short) 6, this)).intValue();
    }

    public String getVerifyUrl() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 36)) ? this.verifyUrl : (String) iPatchRedirector.redirect((short) 36, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 53)) {
            return (String) iPatchRedirector.redirect((short) 53, this);
        }
        return "GProGuildUserProfile{uin=" + this.uin + ",tinyId=" + this.tinyId + ",nick=" + this.nick + ",verifyFriType=" + this.verifyFriType + ",gender=" + this.gender + ",isNlAge=" + this.isNlAge + ",age=" + ((int) this.age) + ",birthYear=" + ((int) this.birthYear) + ",birthMonth=" + ((int) this.birthMonth) + ",birthDay=" + ((int) this.birthDay) + ",country=" + this.country + ",province=" + this.province + ",city=" + this.city + ",countryId=" + this.countryId + ",provinceId=" + this.provinceId + ",cityId=" + this.cityId + ",cityZoneId=" + this.cityZoneId + ",userType=" + this.userType + ",joinTime=" + this.joinTime + ",robotType=" + this.robotType + ",memberName=" + this.memberName + ",clientPresence=" + this.clientPresence + ",clientArchives=" + this.clientArchives + ",bindClientAccount=" + this.bindClientAccount + ",hasMoreArchive=" + this.hasMoreArchive + ",firstArchiveArkData=" + this.firstArchiveArkData + ",isMember=" + this.isMember + ",directMsgBlackFlag=" + this.directMsgBlackFlag + ",shutUpExpireTime=" + this.shutUpExpireTime + ",hasGuildUserInfo=" + this.hasGuildUserInfo + ",joinGroupProTimeStamp=" + this.joinGroupProTimeStamp + ",avatarMeta=" + this.avatarMeta + ",faceAuthStatus=" + this.faceAuthStatus + ",verifyUrl=" + this.verifyUrl + ",constellation=" + this.constellation + ",personalSignature=" + this.personalSignature + ",roomState=" + this.roomState + ",isQQFriend=" + this.isQQFriend + ",roomStateShowSwitch=" + this.roomStateShowSwitch + ",publishedFeedShowSwitch=" + this.publishedFeedShowSwitch + ",joinedGuildShowSwitch=" + this.joinedGuildShowSwitch + ",openId=" + this.openId + ",skinPicUrl=" + this.skinPicUrl + ",avatarPendant=" + this.avatarPendant + ",medals=" + this.medals + ",joinedGuildSummary=" + this.joinedGuildSummary + ",publishedFeedSummary=" + this.publishedFeedSummary + ",clientIdentity=" + this.clientIdentity + ",signGuildInfo=" + this.signGuildInfo + ",allGiftInfo=" + this.allGiftInfo + ",}";
    }

    public GProGuildUserProfile(long j, long j2, String str, int i, int i2, boolean z, byte b, short s, short s2, short s3, String str2, String str3, String str4, int i3, int i4, int i5, int i6, int i7, long j3, int i8, String str5, GProClientPresence gProClientPresence, ArrayList<GProClientArchive> arrayList, ArrayList<GProClientAccount> arrayList2, boolean z2, GProArchiveArkData gProArchiveArkData, int i9, int i10, long j4, boolean z3, long j5, String str6, int i11, String str7, String str8, String str9, GProProfileRoomState gProProfileRoomState, boolean z4, int i12, int i13, int i14, String str10, String str11, String str12, ArrayList<GProMedal> arrayList3, GProUserJoinedGuildSummary gProUserJoinedGuildSummary, GProUserPublishedFeedSummary gProUserPublishedFeedSummary, GProClientIdentity gProClientIdentity, GProSignGuildInfo gProSignGuildInfo, GProUserAllGiftInfo gProUserAllGiftInfo) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, this, Long.valueOf(j), Long.valueOf(j2), str, Integer.valueOf(i), Integer.valueOf(i2), Boolean.valueOf(z), Byte.valueOf(b), Short.valueOf(s), Short.valueOf(s2), Short.valueOf(s3), str2, str3, str4, Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i7), Long.valueOf(j3), Integer.valueOf(i8), str5, gProClientPresence, arrayList, arrayList2, Boolean.valueOf(z2), gProArchiveArkData, Integer.valueOf(i9), Integer.valueOf(i10), Long.valueOf(j4), Boolean.valueOf(z3), Long.valueOf(j5), str6, Integer.valueOf(i11), str7, str8, str9, gProProfileRoomState, Boolean.valueOf(z4), Integer.valueOf(i12), Integer.valueOf(i13), Integer.valueOf(i14), str10, str11, str12, arrayList3, gProUserJoinedGuildSummary, gProUserPublishedFeedSummary, gProClientIdentity, gProSignGuildInfo, gProUserAllGiftInfo);
            return;
        }
        this.nick = "";
        this.country = "";
        this.province = "";
        this.city = "";
        this.memberName = "";
        this.clientPresence = new GProClientPresence();
        this.clientArchives = new ArrayList<>();
        this.bindClientAccount = new ArrayList<>();
        this.firstArchiveArkData = new GProArchiveArkData();
        this.avatarMeta = "";
        this.verifyUrl = "";
        this.openId = "";
        this.avatarPendant = "";
        this.medals = new ArrayList<>();
        this.joinedGuildSummary = new GProUserJoinedGuildSummary();
        this.publishedFeedSummary = new GProUserPublishedFeedSummary();
        this.clientIdentity = new GProClientIdentity();
        this.signGuildInfo = new GProSignGuildInfo();
        this.allGiftInfo = new GProUserAllGiftInfo();
        this.uin = j;
        this.tinyId = j2;
        this.nick = str;
        this.verifyFriType = i;
        this.gender = i2;
        this.isNlAge = z;
        this.age = b;
        this.birthYear = s;
        this.birthMonth = s2;
        this.birthDay = s3;
        this.country = str2;
        this.province = str3;
        this.city = str4;
        this.countryId = i3;
        this.provinceId = i4;
        this.cityId = i5;
        this.cityZoneId = i6;
        this.userType = i7;
        this.joinTime = j3;
        this.robotType = i8;
        this.memberName = str5;
        this.clientPresence = gProClientPresence;
        this.clientArchives = arrayList;
        this.bindClientAccount = arrayList2;
        this.hasMoreArchive = z2;
        this.firstArchiveArkData = gProArchiveArkData;
        this.isMember = i9;
        this.directMsgBlackFlag = i10;
        this.shutUpExpireTime = j4;
        this.hasGuildUserInfo = z3;
        this.joinGroupProTimeStamp = j5;
        this.avatarMeta = str6;
        this.faceAuthStatus = i11;
        this.verifyUrl = str7;
        this.constellation = str8;
        this.personalSignature = str9;
        this.roomState = gProProfileRoomState;
        this.isQQFriend = z4;
        this.roomStateShowSwitch = i12;
        this.publishedFeedShowSwitch = i13;
        this.joinedGuildShowSwitch = i14;
        this.openId = str10;
        this.skinPicUrl = str11;
        this.avatarPendant = str12;
        this.medals = arrayList3;
        this.joinedGuildSummary = gProUserJoinedGuildSummary;
        this.publishedFeedSummary = gProUserPublishedFeedSummary;
        this.clientIdentity = gProClientIdentity;
        this.signGuildInfo = gProSignGuildInfo;
        this.allGiftInfo = gProUserAllGiftInfo;
    }
}
