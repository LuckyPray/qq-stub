package com.tencent.mobileqq.msf.sdk;

import com.tencent.qphone.base.BaseConstants;
import com.tencent.qphone.base.remote.ToServiceMsg;

import java.util.ArrayList;

import oicq.wlogin_sdk.request.WFastLoginInfo;

public class MsfMsgUtil {
    public static ToServiceMsg getAppDataIncermentMsg(String str, String str2, String[] strArr, long j) {
        ToServiceMsg toServiceMsg = new ToServiceMsg(str, str2, BaseConstants.CMD_APP_DATAINCERMENT);
        toServiceMsg.setMsfCommand(MsfCommand.appDataIncerment);
        toServiceMsg.getAttributes().put(MsfConstants.ATTRIBUTE_DATAINCERMENT_APP, new Object[]{strArr, Long.valueOf(j)});
        toServiceMsg.setNeedCallback(false);
        return toServiceMsg;
    }

    public static ToServiceMsg getCurrentDataCountMsg(String str, String[] strArr) {
        ToServiceMsg toServiceMsg = new ToServiceMsg(str, "0", BaseConstants.CMD_APP_GETDATACOUNT);
        toServiceMsg.addAttribute(toServiceMsg.getServiceCmd(), strArr);
        toServiceMsg.setMsfCommand(MsfCommand.getAppDataCount);
        return toServiceMsg;
    }

    public static ToServiceMsg getReportLogMsg(String str, String str2, String str3, String str4) {
        ToServiceMsg toServiceMsg = new ToServiceMsg(str, "0", BaseConstants.CMD_APP_REPORTLOG);
        toServiceMsg.setMsfCommand(MsfCommand.appReportLog);
        toServiceMsg.getAttributes().put(toServiceMsg.getServiceCmd(), new String[]{str2, str3, str4});
        toServiceMsg.setNeedCallback(false);
        return toServiceMsg;
    }

    public static ToServiceMsg getNetworkTrafficDebugInfo(String str) {
        ToServiceMsg toServiceMsg = new ToServiceMsg(str, "0", BaseConstants.CMD_NETWORKTRAFFICDEBUGINFO);
        toServiceMsg.setMsfCommand(MsfCommand.getMsfDebugInfo);
        return toServiceMsg;
    }

    public static ToServiceMsg getRdmReportMsg(String str, RdmReq rdmReq) {
        throw new RuntimeException("Stub!");
    }

    public static ToServiceMsg getConnOpenMsg(String str) {
        ToServiceMsg toServiceMsg = new ToServiceMsg(str, "0", BaseConstants.CMD_OPENCONN);
        toServiceMsg.setMsfCommand(MsfCommand.openConn);
        toServiceMsg.setNeedCallback(false);
        toServiceMsg.setTimeout(30000);
        return toServiceMsg;
    }

    public static ToServiceMsg getGatewayIpMsg(String str) {
        ToServiceMsg toServiceMsg = new ToServiceMsg(str, "0", BaseConstants.CMD_GETGATEWAYIP);
        toServiceMsg.setMsfCommand(MsfCommand.getGatewayIp);
        toServiceMsg.setNeedCallback(false);
        toServiceMsg.setTimeout(30000);
        return toServiceMsg;
    }

    public static ToServiceMsg getSetConnStatusMsg(String str, int i) {
        ToServiceMsg toServiceMsg = new ToServiceMsg(str, "0", BaseConstants.CMD_SETMSFCONNSTATUS);
        toServiceMsg.setMsfCommand(MsfCommand.setMsfConnStatus);
        toServiceMsg.setNeedCallback(true);
        toServiceMsg.getAttributes().put("status", Integer.valueOf(i));
        toServiceMsg.setTimeout(30000);
        return toServiceMsg;
    }

    public static ToServiceMsg get_wt_GetStWithPasswd(String str, String str2, long j, String str3, long j2) {
        ToServiceMsg toServiceMsg = new ToServiceMsg(str, str2, BaseConstants.CMD_APPUSEETLOGIN);
        toServiceMsg.setMsfCommand(MsfCommand.wt_GetStWithPasswd);
        toServiceMsg.getAttributes().put("appid", Long.valueOf(j));
        toServiceMsg.getAttributes().put("passwd", str3);
        toServiceMsg.setTimeout(j2);
        return toServiceMsg;
    }

    public static ToServiceMsg get_wt_GetStWithoutPasswd(String str, String str2, long j, long j2, long j3) {
        ToServiceMsg toServiceMsg = new ToServiceMsg(str, str2, BaseConstants.CMD_APPUSEETLOGIN);
        toServiceMsg.setMsfCommand(MsfCommand.wt_GetStWithoutPasswd);
        toServiceMsg.getAttributes().put("dwSrcAppid", Long.valueOf(j));
        toServiceMsg.getAttributes().put("dwDstAppid", Long.valueOf(j2));
        toServiceMsg.setTimeout(j3);
        return toServiceMsg;
    }

    public static ToServiceMsg get_wt_GetOpenKeyWithoutPasswd(String str, String str2, long j, long j2, long j3) {
        ToServiceMsg toServiceMsg = new ToServiceMsg(str, str2, BaseConstants.CMD_APPUSEETLOGIN);
        toServiceMsg.setMsfCommand(MsfCommand.wt_GetOpenKeyWithoutPasswd);
        toServiceMsg.getAttributes().put("dwSrcAppid", Long.valueOf(j));
        toServiceMsg.getAttributes().put("dwDstAppid", Long.valueOf(j2));
        toServiceMsg.setTimeout(j3);
        return toServiceMsg;
    }

    public static ToServiceMsg get_wt_CheckPictureAndGetSt(String str, String str2, byte[] bArr, long j) {
        ToServiceMsg toServiceMsg = new ToServiceMsg(str, str2, BaseConstants.CMD_APPUSEETLOGIN);
        toServiceMsg.setMsfCommand(MsfCommand.wt_CheckPictureAndGetSt);
        toServiceMsg.getAttributes().put("userInput", bArr);
        toServiceMsg.setTimeout(j);
        return toServiceMsg;
    }

    public static ToServiceMsg get_wt_RefreshPictureData(String str, String str2, long j) {
        ToServiceMsg toServiceMsg = new ToServiceMsg(str, str2, BaseConstants.CMD_APPUSEETLOGIN);
        toServiceMsg.setMsfCommand(MsfCommand.wt_RefreshPictureData);
        toServiceMsg.setTimeout(j);
        return toServiceMsg;
    }

    public static ToServiceMsg get_wt_VerifyCode(String str, String str2, long j, boolean z, byte[] bArr, int[] iArr, int i, long j2) {
        ToServiceMsg toServiceMsg = new ToServiceMsg(str, str2, BaseConstants.CMD_APPUSEETLOGIN);
        toServiceMsg.setMsfCommand(MsfCommand.wt_VerifyCode);
        toServiceMsg.getAttributes().put("appid", Long.valueOf(j));
        toServiceMsg.getAttributes().put("close", Boolean.valueOf(z));
        toServiceMsg.getAttributes().put("code", bArr);
        toServiceMsg.getAttributes().put("tlv", iArr);
        toServiceMsg.getAttributes().put("version", Integer.valueOf(i));
        toServiceMsg.getAttributes().put("uinNotMatch"/*MainService.uinNotMatchTag*/, Integer.valueOf(1));
        toServiceMsg.setTimeout(j2);
        return toServiceMsg;
    }

    public static ToServiceMsg get_wt_CloseCode(String str, String str2, long j, byte[] bArr, int i, ArrayList arrayList, long j2) {
        ToServiceMsg toServiceMsg = new ToServiceMsg(str, str2, BaseConstants.CMD_APPUSEETLOGIN);
        toServiceMsg.setMsfCommand(MsfCommand.wt_CloseCode);
        toServiceMsg.getAttributes().put("appid", Long.valueOf(j));
        toServiceMsg.getAttributes().put("code", bArr);
        toServiceMsg.getAttributes().put("version", Integer.valueOf(i));
        toServiceMsg.getAttributes().put("data", arrayList);
        toServiceMsg.getAttributes().put("uinNotMatch"/*MainService.uinNotMatchTag*/, Integer.valueOf(1));
        toServiceMsg.setTimeout(j2);
        return toServiceMsg;
    }

    public static ToServiceMsg get_wt_GetA1WithA1(String str, String str2, long j, long j2, byte[] bArr, long j3, long j4, long j5, byte[] bArr2, byte[] bArr3, WFastLoginInfo wFastLoginInfo, long j6) {
        ToServiceMsg toServiceMsg = new ToServiceMsg(str, str2, BaseConstants.CMD_APPUSEETLOGIN);
        toServiceMsg.setMsfCommand(MsfCommand.wt_GetA1WithA1);
        toServiceMsg.getAttributes().put("dwSrcAppid", Long.valueOf(j));
        toServiceMsg.getAttributes().put("dwSubSrcAppid", Long.valueOf(j2));
        toServiceMsg.getAttributes().put("dstAppName", bArr);
        toServiceMsg.getAttributes().put("dwDstSsoVer", Long.valueOf(j3));
        toServiceMsg.getAttributes().put("dwDstAppid", Long.valueOf(j4));
        toServiceMsg.getAttributes().put("dwSubDstAppid", Long.valueOf(j5));
        toServiceMsg.getAttributes().put("dstAppVer", bArr2);
        toServiceMsg.getAttributes().put("dstAppSign", bArr3);
        toServiceMsg.getAttributes().put("fastLoginInfo", wFastLoginInfo);
        toServiceMsg.setTimeout(j6);
        return toServiceMsg;
    }

    public static ToServiceMsg get_wt_CheckDevLockStatus(String str, String str2, long j, long j2) {
        ToServiceMsg toServiceMsg = new ToServiceMsg(str, str2, BaseConstants.CMD_APPUSEETLOGIN);
        toServiceMsg.setMsfCommand(MsfCommand.wt_CheckDevLockStatus);
        toServiceMsg.getAttributes().put("subAppid", Long.valueOf(j));
        toServiceMsg.setTimeout(j2);
        return toServiceMsg;
    }

    public static ToServiceMsg get_wt_AskDevLockSms(String str, String str2, long j) {
        ToServiceMsg toServiceMsg = new ToServiceMsg(str, str2, BaseConstants.CMD_APPUSEETLOGIN);
        toServiceMsg.setMsfCommand(MsfCommand.wt_AskDevLockSms);
        toServiceMsg.setTimeout(j);
        return toServiceMsg;
    }

    public static ToServiceMsg get_wt_CheckDevLockSms(String str, String str2, long j, String str3, byte[] bArr, long j2) {
        ToServiceMsg toServiceMsg = new ToServiceMsg(str, str2, BaseConstants.CMD_APPUSEETLOGIN);
        toServiceMsg.setMsfCommand(MsfCommand.wt_CheckDevLockSms);
        toServiceMsg.getAttributes().put("subAppid", Long.valueOf(j));
        toServiceMsg.getAttributes().put("smdCode", str3);
        toServiceMsg.getAttributes().put("sppKey", bArr);
        toServiceMsg.setTimeout(j2);
        return toServiceMsg;
    }

    public static ToServiceMsg get_wt_CloseDevLock(String str, String str2, long j, long j2) {
        ToServiceMsg toServiceMsg = new ToServiceMsg(str, str2, BaseConstants.CMD_APPUSEETLOGIN);
        toServiceMsg.setMsfCommand(MsfCommand.wt_CloseDevLock);
        toServiceMsg.getAttributes().put("subAppid", Long.valueOf(j));
        toServiceMsg.setTimeout(j2);
        return toServiceMsg;
    }

    public static ToServiceMsg get_wt_setRegDevLockFlag(String str, int i, long j) {
        ToServiceMsg toServiceMsg = new ToServiceMsg(str, "0", BaseConstants.CMD_APPUSEETLOGIN);
        toServiceMsg.setMsfCommand(MsfCommand.wt_setRegDevLockFlag);
        toServiceMsg.getAttributes().put("flag", Integer.valueOf(i));
        toServiceMsg.setTimeout(j);
        toServiceMsg.setNeedCallback(false);
        return toServiceMsg;
    }

    public static ToServiceMsg get_wt_SetDevlockMobileType(String str, int i, long j) {
        ToServiceMsg toServiceMsg = new ToServiceMsg(str, "0", BaseConstants.CMD_APPUSEETLOGIN);
        toServiceMsg.setMsfCommand(MsfCommand.wt_SetDevlockMobileType);
        toServiceMsg.getAttributes().put("mobile_type", Integer.valueOf(i));
        toServiceMsg.setTimeout(j);
        toServiceMsg.setNeedCallback(false);
        return toServiceMsg;
    }

    public static ToServiceMsg get_wt_RefreshSMSData(String str, String str2, long j) {
        ToServiceMsg toServiceMsg = new ToServiceMsg(str, str2, BaseConstants.CMD_APPUSEETLOGIN);
        toServiceMsg.setMsfCommand(MsfCommand.wt_RefreshSMSData);
        toServiceMsg.setTimeout(j);
        return toServiceMsg;
    }

    public static ToServiceMsg get_wt_CheckSMSAndGetSt(String str, String str2, byte[] bArr, long j) {
        ToServiceMsg toServiceMsg = new ToServiceMsg(str, str2, BaseConstants.CMD_APPUSEETLOGIN);
        toServiceMsg.setMsfCommand(MsfCommand.wt_CheckSMSAndGetSt);
        toServiceMsg.getAttributes().put("userInput", bArr);
        toServiceMsg.setTimeout(j);
        return toServiceMsg;
    }

    public static ToServiceMsg get_wt_CheckSMSAndGetStExt(String str, String str2, byte[] bArr, long j) {
        ToServiceMsg toServiceMsg = new ToServiceMsg(str, str2, BaseConstants.CMD_APPUSEETLOGIN);
        toServiceMsg.setMsfCommand(MsfCommand.wt_CheckSMSAndGetStExt);
        toServiceMsg.getAttributes().put("userInput", bArr);
        toServiceMsg.setTimeout(j);
        return toServiceMsg;
    }

    public static ToServiceMsg get_wt_RegGetSMSVerifyLoginAccount(String str, byte[] bArr, byte[] bArr2, long j) {
        ToServiceMsg toServiceMsg = new ToServiceMsg(str, "0", BaseConstants.CMD_APPUSEETLOGIN);
        toServiceMsg.setMsfCommand(MsfCommand.wt_RegGetSMSVerifyLoginAccount);
        toServiceMsg.getAttributes().put("msgchk", bArr);
        toServiceMsg.getAttributes().put("nick", bArr2);
        toServiceMsg.setTimeout(j);
        return toServiceMsg;
    }

    public static ToServiceMsg get_wt_RegGetSMSVerifyLoginAccount(String str, byte[] bArr, byte[] bArr2, String str2, String str3, long j) {
        ToServiceMsg toServiceMsg = new ToServiceMsg(str, "0", BaseConstants.CMD_APPUSEETLOGIN);
        toServiceMsg.setMsfCommand(MsfCommand.wt_RegGetSMSVerifyLoginAccount);
        toServiceMsg.getAttributes().put("msgchk", bArr);
        toServiceMsg.getAttributes().put("nick", bArr2);
        if (str2 != null && str2.length() > 0) {
            toServiceMsg.getAttributes().put(MsfConstants.ATTRIBUTE_REGISTER_LH_UIN, str2);
        } else if (str3 != null && str3.length() > 0) {
            toServiceMsg.getAttributes().put(MsfConstants.ATTRIBUTE_REGISTER_UNBIND_LH_UIN, str3);
        }
        toServiceMsg.setTimeout(j);
        return toServiceMsg;
    }

    public static ToServiceMsg get_wt_CheckSMSVerifyLoginAccount(String str, String str2, String str3, int i, long j) {
        ToServiceMsg toServiceMsg = new ToServiceMsg(str, "0", BaseConstants.CMD_APPUSEETLOGIN);
        toServiceMsg.setMsfCommand(MsfCommand.wt_CheckSMSVerifyLoginAccount);
        toServiceMsg.getAttributes().put("countryCode", str3);
        toServiceMsg.getAttributes().put("userAccount", str2);
        toServiceMsg.getAttributes().put("appid", Integer.valueOf(i));
        toServiceMsg.setTimeout(j);
        return toServiceMsg;
    }

    public static ToServiceMsg get_wt_RefreshSMSVerifyLoginCode(String str, String str2, String str3, long j) {
        ToServiceMsg toServiceMsg = new ToServiceMsg(str, "0", BaseConstants.CMD_APPUSEETLOGIN);
        toServiceMsg.setMsfCommand(MsfCommand.wt_RefreshSMSVerifyLoginCode);
        toServiceMsg.getAttributes().put("userAccount", str3);
        toServiceMsg.getAttributes().put("countryCode", str2);
        toServiceMsg.setTimeout(j);
        return toServiceMsg;
    }

    public static ToServiceMsg get_wt_VerifySMSVerifyLoginCode(String str, String str2, String str3, String str4, long j) {
        ToServiceMsg toServiceMsg = new ToServiceMsg(str, "0", BaseConstants.CMD_APPUSEETLOGIN);
        toServiceMsg.setMsfCommand(MsfCommand.wt_VerifySMSVerifyLoginCode);
        toServiceMsg.getAttributes().put("code", str4);
        toServiceMsg.getAttributes().put("userAccount", str3);
        toServiceMsg.getAttributes().put("countryCode", str2);
        toServiceMsg.setTimeout(j);
        return toServiceMsg;
    }

    public static ToServiceMsg get_wt_GetStViaSMSVerifyLogin(String str, String str2, String str3, int i, long j) {
        ToServiceMsg toServiceMsg = new ToServiceMsg(str, "0", BaseConstants.CMD_APPUSEETLOGIN);
        toServiceMsg.setMsfCommand(MsfCommand.wt_GetStViaSMSVerifyLogin);
        toServiceMsg.getAttributes().put("userAccount", str3);
        toServiceMsg.getAttributes().put("countryCode", str2);
        toServiceMsg.getAttributes().put("appid", Integer.valueOf(i));
        toServiceMsg.setTimeout(j);
        return toServiceMsg;
    }

    public static ToServiceMsg get_wt_GetSubaccountStViaSMSVerifyLogin(String str, String str2, String str3, String str4, int i, long j) {
        ToServiceMsg toServiceMsg = new ToServiceMsg(str, "0", BaseConstants.CMD_APPUSEETLOGIN);
        toServiceMsg.setMsfCommand(MsfCommand.wt_GetStViaSMSVerifyLogin);
        toServiceMsg.getAttributes().put("userAccount", str4);
        toServiceMsg.getAttributes().put("countryCode", str3);
        toServiceMsg.getAttributes().put("appid", Integer.valueOf(i));
        toServiceMsg.getAttributes().put("from_where", "subaccount");
        toServiceMsg.getAttributes().put("mainaccount", str2);
        toServiceMsg.setTimeout(j);
        return toServiceMsg;
    }

    public static boolean hasResendBy10008(ToServiceMsg toServiceMsg) {
        if (toServiceMsg.getAttributes().get(BaseConstants.ATTRIBUTE_MSG_HAS_RESEND_BY_10008) != null) {
            return ((Boolean) toServiceMsg.getAttributes().get(BaseConstants.ATTRIBUTE_MSG_HAS_RESEND_BY_10008)).booleanValue();
        }
        return false;
    }
}
