package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;
import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProScheduleInfo.class */
public final class GProScheduleInfo {
    static IPatchRedirector $redirector_;
    public int acceptedNums;
    public ArrayList<GProScheduleUser> acceptedUser;
    public GProScheduleChannelInfo channelInfo;
    public String content;
    public long createTimeMs;
    public GProScheduleUser creator;
    public long endTimeMs;
    public int inviteStatus;
    public boolean isNotified;
    public GProOtherJumpAddress otherJumpAddress;
    public int rejectedNums;
    public int reminderTimeType;
    public long scheduleId;
    public long startTimeMs;
    public String title;

    public GProScheduleInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.title = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.content = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.channelInfo = new GProScheduleChannelInfo();
        this.otherJumpAddress = new GProOtherJumpAddress();
        this.creator = new GProScheduleUser();
        this.acceptedUser = new ArrayList<>();
    }

    public int getAcceptedNums() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 14)) ? this.acceptedNums : ((Integer) iPatchRedirector.redirect((short) 14, this)).intValue();
    }

    public ArrayList<GProScheduleUser> getAcceptedUser() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 16)) ? this.acceptedUser : (ArrayList) iPatchRedirector.redirect((short) 16, this);
    }

    public GProScheduleChannelInfo getChannelInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 9)) ? this.channelInfo : (GProScheduleChannelInfo) iPatchRedirector.redirect((short) 9, this);
    }

    public String getContent() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.content : (String) iPatchRedirector.redirect((short) 7, this);
    }

    public long getCreateTimeMs() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 12)) ? this.createTimeMs : ((Long) iPatchRedirector.redirect((short) 12, this)).longValue();
    }

    public GProScheduleUser getCreator() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 13)) ? this.creator : (GProScheduleUser) iPatchRedirector.redirect((short) 13, this);
    }

    public long getEndTimeMs() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.endTimeMs : ((Long) iPatchRedirector.redirect((short) 6, this)).longValue();
    }

    public int getInviteStatus() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 11)) ? this.inviteStatus : ((Integer) iPatchRedirector.redirect((short) 11, this)).intValue();
    }

    public boolean getIsNotified() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 17)) ? this.isNotified : ((Boolean) iPatchRedirector.redirect((short) 17, this)).booleanValue();
    }

    public GProOtherJumpAddress getOtherJumpAddress() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 10)) ? this.otherJumpAddress : (GProOtherJumpAddress) iPatchRedirector.redirect((short) 10, this);
    }

    public int getRejectedNums() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 15)) ? this.rejectedNums : ((Integer) iPatchRedirector.redirect((short) 15, this)).intValue();
    }

    public int getReminderTimeType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) ? this.reminderTimeType : ((Integer) iPatchRedirector.redirect((short) 8, this)).intValue();
    }

    public long getScheduleId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.scheduleId : ((Long) iPatchRedirector.redirect((short) 3, this)).longValue();
    }

    public long getStartTimeMs() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.startTimeMs : ((Long) iPatchRedirector.redirect((short) 5, this)).longValue();
    }

    public String getTitle() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.title : (String) iPatchRedirector.redirect((short) 4, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 18)) {
            return (String) iPatchRedirector.redirect((short) 18, this);
        }
        return "GProScheduleInfo{scheduleId=" + this.scheduleId + ",title=" + this.title + ",startTimeMs=" + this.startTimeMs + ",endTimeMs=" + this.endTimeMs + ",content=" + this.content + ",reminderTimeType=" + this.reminderTimeType + ",channelInfo=" + this.channelInfo + ",otherJumpAddress=" + this.otherJumpAddress + ",inviteStatus=" + this.inviteStatus + ",createTimeMs=" + this.createTimeMs + ",creator=" + this.creator + ",acceptedNums=" + this.acceptedNums + ",rejectedNums=" + this.rejectedNums + ",acceptedUser=" + this.acceptedUser + ",isNotified=" + this.isNotified + ",}";
    }

    public GProScheduleInfo(long j, String str, long j2, long j3, String str2, int i, GProScheduleChannelInfo gProScheduleChannelInfo, int i2, long j4, GProScheduleUser gProScheduleUser, int i3, int i4, ArrayList<GProScheduleUser> arrayList, boolean z) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, new Object[]{this, Long.valueOf(j), str, Long.valueOf(j2), Long.valueOf(j3), str2, Integer.valueOf(i), gProScheduleChannelInfo, Integer.valueOf(i2), Long.valueOf(j4), gProScheduleUser, Integer.valueOf(i3), Integer.valueOf(i4), arrayList, Boolean.valueOf(z)});
            return;
        }
        this.title = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.content = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.channelInfo = new GProScheduleChannelInfo();
        this.otherJumpAddress = new GProOtherJumpAddress();
        this.creator = new GProScheduleUser();
        this.acceptedUser = new ArrayList<>();
        this.scheduleId = j;
        this.title = str;
        this.startTimeMs = j2;
        this.endTimeMs = j3;
        this.content = str2;
        this.reminderTimeType = i;
        this.channelInfo = gProScheduleChannelInfo;
        this.inviteStatus = i2;
        this.createTimeMs = j4;
        this.creator = gProScheduleUser;
        this.acceptedNums = i3;
        this.rejectedNums = i4;
        this.acceptedUser = arrayList;
        this.isNotified = z;
    }
}
