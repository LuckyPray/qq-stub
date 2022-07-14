package com.tencent.mobileqq.guild.message.api;

import com.tencent.mobileqq.data.MessageRecord;
import com.tencent.mobileqq.qroute.QRouteApi;
import mqq.app.AppRuntime;

public interface IGuildNicknameApi extends QRouteApi {
    String getDisplayName(AppRuntime appRuntime, String friendUin, String uin, MessageRecord msg);
}
