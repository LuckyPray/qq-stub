package oicq.wlogin_sdk.tools;

import android.content.Context;
import android.os.Bundle;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.security.Key;
import java.security.KeyPair;
import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.util.Random;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.InflaterInputStream;

import javax.crypto.Cipher;

public class util {
    public static final int ASYN_CHECK_IMAGE = 2;
    public static final int ASYN_CHECK_SMS = 4;
    public static final int ASYN_EXCEPTION = 11;
    public static final int ASYN_GET_A1_WITH_A1 = 6;
    public static final int ASYN_GET_ST_WITHOUT_PWD = 5;
    public static final int ASYN_GET_ST_WITH_PWD = 0;
    public static final int ASYN_QUICKLOG_WITH_PTSIG = 16;
    public static final int ASYN_QUICKLOG_WITH_QQSIG = 15;
    public static final int ASYN_QUICKLOG_WITH_QRSIG = 17;
    public static final int ASYN_REFLUSH_IMAGE = 1;
    public static final int ASYN_REFLUSH_SMS = 3;
    public static final int ASYN_REPORT = 7;
    public static final int ASYN_REPORT_ERROR = 8;
    public static final int ASYN_SMSLOGIN_CHECK = 12;
    public static final int ASYN_SMSLOGIN_REFRESH = 14;
    public static final int ASYN_SMSLOGIN_VERIFY = 13;
    public static final int ASYN_TRANSPORT = 9;
    public static final int ASYN_TRANSPORT_MSF = 10;
    public static final long BUILD_TIME = 1541504115;
    public static final int D = 2;
    private static final SimpleDateFormat DAYFORMAT = null;
    public static final int E_A1_DECRYPT = -1014;
    public static final int E_A1_FORMAT = -1016;
    public static final int E_ADVANCE_NOTICE = 257;
    public static final int E_APK_CHK_ERR = -1021;
    public static final int E_BUFFER_OVERFLOW = -1023;
    public static final int E_DECRYPT = -1002;
    public static final int E_ENCODING = -1013;
    public static final int E_ENCRYPTION_METHOD = -1024;
    public static final int E_INPUT = -1017;
    public static final int E_LOGIN_THROUGH_QQ = -2001;
    public static final int E_LOGIN_THROUGH_WEB = -2000;
    public static final int E_NAME_INVALID = -1008;
    public static final int E_NEWST_DECRYPT = -1025;
    public static final int E_NO_KEY = -1004;
    public static final int E_NO_NETWORK = -1026;
    public static final int E_NO_REG_CMD = -1010;
    public static final int E_NO_RET = -1000;
    public static final int E_NO_TGTKEY = -1006;
    public static final int E_NO_UIN = -1003;
    public static final int E_PENDING = -1001;
    public static final int E_PK_LEN = -1009;
    public static final int E_PUSH_REG = -1011;
    public static final int E_RESOLVE_ADDR = -1007;
    public static final int E_SAVE_TICKET_ERROR = -1022;
    public static final int E_SHARE_SERVICE_EXCEPTION = -1020;
    public static final int E_SHARE_SERVICE_PARAM = -1019;
    public static final int E_SHARE_SERVICE_UNCHECK = -1018;
    public static final int E_SYSTEM = -1012;
    public static final int E_TLV_DECRYPT = -1015;
    public static final int E_TLV_VERIFY = -1005;
    public static final String FILE_DIR = "wtlogin";
    public static int GUID_DELAY_HOUR = 360;
    private static final int HONEYCOMB = 11;
    public static final int I = 1;
    //    public static LogCallBack LCB = null;
    public static boolean LOGCAT_OUT = false;
    public static final String LOG_DIR = "tencent/wtlogin";
    public static int LOG_LEVEL = 1;
    public static int MAX_APPID = 65535;
    public static final int MAX_CONTENT_SIZE = 25600;
    public static final int MAX_FILE_SIZE = 524288;
    public static int MAX_NAME_LEN = 128;
    private static final int MODE_MULTI_PROCESS = 0;
    public static final String SDK_VERSION = "6.0.0.2342";
    public static final int SSO_VERSION = 5;
    public static final long SVN_VER = 2342;
    public static final int S_BABYLH_EXPIRED = 116;
    public static final int S_GET_IMAGE = 2;
    public static final int S_GET_SMS = 160;
    public static final int S_LH_EXPIRED = 41;
    public static final int S_PWD_WRONG = 1;
    public static final int S_ROLL_BACK = 180;
    public static final int S_SEC_GUID = 204;
    public static final int S_SUCCESS = 0;
    public static final String TAG = "wlogin_sdk";
    public static final int W = 0;
    static final char[] base64_encode_chars = new char[]{'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/'};
    static final char base64_pad_url = '_';
    static final short[] base64_reverse_table_url = new short[]{(short) -1, (short) -1, (short) -1, (short) -1, (short) -1, (short) -1, (short) -1, (short) -1, (short) -1, (short) -1, (short) -1, (short) -1, (short) -1, (short) -1, (short) -1, (short) -1, (short) -1, (short) -1, (short) -1, (short) -1, (short) -1, (short) -1, (short) -1, (short) -1, (short) -1, (short) -1, (short) -1, (short) -1, (short) -1, (short) -1, (short) -1, (short) -1, (short) -1, (short) -1, (short) -1, (short) -1, (short) -1, (short) -1, (short) -1, (short) -1, (short) -1, (short) -1, (short) 62, (short) -1, (short) -1, (short) 63, (short) -1, (short) -1, (short) 52, (short) 53, (short) 54, (short) 55, (short) 56, (short) 57, (short) 58, (short) 59, (short) 60, (short) 61, (short) -1, (short) -1, (short) -1, (short) -1, (short) -1, (short) -1, (short) -1, (short) 0, (short) 1, (short) 2, (short) 3, (short) 4, (short) 5, (short) 6, (short) 7, (short) 8, (short) 9, (short) 10, (short) 11, (short) 12, (short) 13, (short) 14, (short) 15, (short) 16, (short) 17, (short) 18, (short) 19, (short) 20, (short) 21, (short) 22, (short) 23, (short) 24, (short) 25, (short) -1, (short) -1, (short) -1, (short) -1, (short) -1, (short) -1, (short) 26, (short) 27, (short) 28, (short) 29, (short) 30, (short) 31, (short) 32, (short) 33, (short) 34, (short) 35, (short) 36, (short) 37, (short) 38, (short) 39, (short) 40, (short) 41, (short) 42, (short) 43, (short) 44, (short) 45, (short) 46, (short) 47, (short) 48, (short) 49, (short) 50, (short) 51, (short) -1, (short) -1, (short) -1, (short) -1, (short) -1, (short) -1, (short) -1, (short) -1, (short) -1, (short) -1, (short) -1, (short) -1, (short) -1, (short) -1, (short) -1, (short) -1, (short) -1, (short) -1, (short) -1, (short) -1, (short) -1, (short) -1, (short) -1, (short) -1, (short) -1, (short) -1, (short) -1, (short) -1, (short) -1, (short) -1, (short) -1, (short) -1, (short) -1, (short) -1, (short) -1, (short) -1, (short) -1, (short) -1, (short) -1, (short) -1, (short) -1, (short) -1, (short) -1, (short) -1, (short) -1, (short) -1, (short) -1, (short) -1, (short) -1, (short) -1, (short) -1, (short) -1, (short) -1, (short) -1, (short) -1, (short) -1, (short) -1, (short) -1, (short) -1, (short) -1, (short) -1, (short) -1, (short) -1, (short) -1, (short) -1, (short) -1, (short) -1, (short) -1, (short) -1, (short) -1, (short) -1, (short) -1, (short) -1, (short) -1, (short) -1, (short) -1, (short) -1, (short) -1, (short) -1, (short) -1, (short) -1, (short) -1, (short) -1, (short) -1, (short) -1, (short) -1, (short) -1, (short) -1, (short) -1, (short) -1, (short) -1, (short) -1, (short) -1, (short) -1, (short) -1, (short) -1, (short) -1, (short) -1, (short) -1, (short) -1, (short) -1, (short) -1, (short) -1, (short) -1, (short) -1, (short) -1, (short) -1, (short) -1, (short) -1, (short) -1, (short) -1, (short) -1, (short) -1, (short) -1, (short) -1, (short) -1, (short) -1, (short) -1, (short) -1, (short) -1, (short) -1, (short) -1, (short) -1, (short) -1, (short) -1, (short) -1, (short) -1, (short) -1, (short) -1, (short) -1, (short) -1, (short) -1, (short) -1};
    private static final boolean libwtecdh_loaded = false;
    public static boolean loadEncryptSo = true;
    public static String logContent = "";

//    public static byte[] get_os_type() {
//        return XpConfig.DEFAULT_TERMINAL.getBytes();
//    }

    public static byte[] get_os_version() {
        throw new RuntimeException("Stub!");
    }

    public static void int8_to_buf(byte[] bArr, int i, int i2) {
        bArr[i] = (byte) (i2 >> 0);
    }

    public static void int16_to_buf(byte[] bArr, int i, int i2) {
        bArr[i + 1] = (byte) (i2 >> 0);
        bArr[i] = (byte) (i2 >> 8);
    }

    public static void int32_to_buf(byte[] bArr, int i, int i2) {
        bArr[i + 3] = (byte) (i2 >> 0);
        bArr[i + 2] = (byte) (i2 >> 8);
        bArr[i + 1] = (byte) (i2 >> 16);
        bArr[i] = (byte) (i2 >> 24);
    }

    public static void int64_to_buf(byte[] bArr, int i, long j) {
        bArr[i + 7] = (byte) ((int) (j >> 0));
        bArr[i + 6] = (byte) ((int) (j >> 8));
        bArr[i + 5] = (byte) ((int) (j >> 16));
        bArr[i + 4] = (byte) ((int) (j >> 24));
        bArr[i + 3] = (byte) ((int) (j >> 32));
        bArr[i + 2] = (byte) ((int) (j >> 40));
        bArr[i + 1] = (byte) ((int) (j >> 48));
        bArr[i] = (byte) ((int) (j >> 56));
    }

    public static void int64_to_buf32(byte[] bArr, int i, long j) {
        bArr[i + 3] = (byte) ((int) (j >> 0));
        bArr[i + 2] = (byte) ((int) (j >> 8));
        bArr[i + 1] = (byte) ((int) (j >> 16));
        bArr[i] = (byte) ((int) (j >> 24));
    }

    public static int buf_to_int8(byte[] bArr, int i) {
        return bArr[i] & 255;
    }

    public static int buf_to_int16(byte[] bArr, int i) {
        return ((bArr[i] << 8) & 65280) + ((bArr[i + 1] << 0) & 255);
    }

    public static int buf_to_int32(byte[] bArr, int i) {
        return ((((bArr[i] << 24) & -16777216) + ((bArr[i + 1] << 16) & 16711680)) + ((bArr[i + 2] << 8) & 65280)) + ((bArr[i + 3] << 0) & 255);
    }

    public static long buf_to_int64(byte[] bArr, int i) {
        return (((((((((((long) bArr[i]) << 56) & -72057594037927936L)) + ((((long) bArr[i + 1]) << 48) & 71776119061217280L)) + ((((long) bArr[i + 2]) << 40) & 280375465082880L)) + ((((long) bArr[i + 3]) << 32) & 1095216660480L)) + ((((long) bArr[i + 4]) << 24) & 4278190080L)) + ((((long) bArr[i + 5]) << 16) & 16711680)) + ((((long) bArr[i + 6]) << 8) & 65280)) + ((((long) bArr[i + 7]) << 0) & 255);
    }

    public static int get_rand_32() {
        return (int) (Math.random() * 2.147483647E9d);
    }

    public static byte[] get_rand_16byte(byte[] bArr) {
        throw new RuntimeException("Stub!");
    }

    public static byte[] get_rand_16byte(SecureRandom secureRandom) {
        throw new RuntimeException("Stub!");
    }

    public static byte[] get_prand_16byte() {
        throw new RuntimeException("Stub!");
    }

    public static String get_mpasswd() {
        try {
            byte[] seed = SecureRandom.getSeed(16);
            String str = "";
            int i = 0;
            while (true) {
                int i2 = i;
                String str2 = str;
                if (i2 >= seed.length) {
                    return str2;
                }
                boolean nextBoolean = new Random().nextBoolean();
                str = str2 + (char) ((nextBoolean ? 97 : 65) + Math.abs(seed[i2] % 26));
                i = i2 + 1;
            }
        } catch (Throwable th) {
            return "1234567890123456";
        }
    }

    public static long get_server_cur_time() {
        throw new RuntimeException("Stub!");
    }

    public static Boolean check_uin_account(String str) {
        try {
            long parseLong = Long.parseLong(str);
            if (parseLong < 10000 || parseLong > 4000000000L) {
                return Boolean.valueOf(false);
            }
            return Boolean.valueOf(true);
        } catch (NumberFormatException e) {
            return Boolean.valueOf(false);
        }
    }

    public static String buf_to_string(byte[] bArr) {
        if (bArr == null) {
            return "";
        }
        String str = "";
        for (int i = 0; i < bArr.length; i++) {
            str = (str + Integer.toHexString((bArr[i] >> 4) & 15)) + Integer.toHexString(bArr[i] & 15);
        }
        return str;
    }

    public static String buf_to_string(byte[] bArr, int i) {
        if (bArr == null) {
            return "";
        }
        if (i > bArr.length) {
            i = bArr.length;
        }
        String str = "";
        int i2 = 0;
        while (i2 < i) {
            String str2 = (str + Integer.toHexString((bArr[i2] >> 4) & 15)) + Integer.toHexString(bArr[i2] & 15);
            i2++;
            str = str2;
        }
        return str;
    }

    public static long buf_len(byte[] bArr) {
        if (bArr == null) {
            return 0;
        }
        return bArr.length;
    }

    public static byte get_char(byte b) {
        if (b >= (byte) 48 && b <= (byte) 57) {
            return (byte) (b - 48);
        }
        if (b >= (byte) 97 && b <= (byte) 102) {
            return (byte) ((b - 97) + 10);
        }
        if (b < (byte) 65 || b > (byte) 70) {
            return (byte) 0;
        }
        return (byte) ((b - 65) + 10);
    }

    public static byte[] string_to_buf(String str) {
        throw new RuntimeException("Stub!");
    }

    public static byte[] get_mac_addr(Context context) {
        throw new RuntimeException("Stub!");
    }

    public static String getMacAddr(Context context) {
        throw new RuntimeException("Stub!");
    }

    public static byte[] get_bssid_addr(Context context) {
        throw new RuntimeException("Stub!");
    }

    public static byte[] get_ssid_addr(Context context) {
        throw new RuntimeException("Stub!");
    }

    public static byte[] get_imei_id(Context context) {
        throw new RuntimeException("Stub!");
    }

    public static String getImei(Context context) {
        throw new RuntimeException("Stub!");
    }

    public static byte[] get_android_id(Context context) {
        throw new RuntimeException("Stub!");
    }

    public static byte[] get_IMSI(Context context) {
        throw new RuntimeException("Stub!");
    }

    public static byte[] getIccid(Context context) {
        throw new RuntimeException("Stub!");
    }

    public static byte[] generateGuid(Context context) {
        throw new RuntimeException("Stub!");
    }

    public static String getRandomImei(Context context) {
        throw new RuntimeException("Stub!");
    }

    public static boolean needChangeGuid(Context context) {
        throw new RuntimeException("Stub!");
    }

    public static byte[] get_sim_operator_name(Context context) {
        throw new RuntimeException("Stub!");
    }

    public static int get_network_type(Context context) {
        throw new RuntimeException("Stub!");
    }

    public static int get_saved_network_type(Context context) {
        throw new RuntimeException("Stub!");
    }

    public static void save_network_type(Context context, int i) {
        throw new RuntimeException("Stub!");
    }

    public static void set_server_host1(Context context, byte[] bArr) {
        throw new RuntimeException("Stub!");
    }

    public static void set_server_host2(Context context, byte[] bArr) {
        throw new RuntimeException("Stub!");
    }

    public static byte[] get_server_host1(Context context) {
        throw new RuntimeException("Stub!");
    }

    public static byte[] get_server_host2(Context context) {
        throw new RuntimeException("Stub!");
    }

    public static void set_wap_server_host1(Context context, byte[] bArr) {
        throw new RuntimeException("Stub!");
    }

    public static void set_wap_server_host2(Context context, byte[] bArr) {
        throw new RuntimeException("Stub!");
    }

    public static byte[] get_wap_server_host1(Context context) {
        throw new RuntimeException("Stub!");
    }

    public static byte[] get_wap_server_host2(Context context) {
        throw new RuntimeException("Stub!");
    }

    public static void set_net_retry_type(Context context, int i) {
        throw new RuntimeException("Stub!");
    }

    public static int get_net_retry_type(Context context) {
        throw new RuntimeException("Stub!");
    }

    public static boolean is_wap_retry(Context context) {
        return get_net_retry_type(context) != 0;
    }

    public static String get_apn_string(Context context) {
        throw new RuntimeException("Stub!");
    }

    public static boolean is_wap_proxy_retry(Context context) {
        throw new RuntimeException("Stub!");
    }

    public static void chg_retry_type(Context context) {
        if (get_net_retry_type(context) == 0) {
            set_net_retry_type(context, 1);
        } else {
            set_net_retry_type(context, 0);
        }
    }

    public static String get_proxy_ip() {
        throw new RuntimeException("Stub!");
    }

    public static int get_proxy_port() {
        throw new RuntimeException("Stub!");
    }

    public static void set_ksid(Context context, byte[] bArr) {
        throw new RuntimeException("Stub!");
    }

    public static byte[] get_ksid(Context context) {
        throw new RuntimeException("Stub!");
    }

    public static void save_imei(Context context, byte[] bArr) {
        throw new RuntimeException("Stub!");
    }

    public static byte[] get_saved_imei(Context context) {
        throw new RuntimeException("Stub!");
    }

    public static void save_cur_flag(Context context, int i) {
        throw new RuntimeException("Stub!");
    }

    public static int get_last_flag(Context context) {
        throw new RuntimeException("Stub!");
    }

    public static void save_cur_mac(Context context, byte[] bArr) {
        throw new RuntimeException("Stub!");
    }

    public static byte[] get_last_mac(Context context) {
        throw new RuntimeException("Stub!");
    }

    public static void save_cur_imei(Context context, byte[] bArr) {
        throw new RuntimeException("Stub!");
    }

    public static byte[] get_last_imei(Context context) {
        throw new RuntimeException("Stub!");
    }

    public static void save_cur_guid(Context context, byte[] bArr) {
        throw new RuntimeException("Stub!");
    }

    public static byte[] get_last_guid(Context context) {
        throw new RuntimeException("Stub!");
    }

    public static void save_rsa_pubkey(Context context, byte[] bArr) {
        throw new RuntimeException("Stub!");
    }

    public static byte[] get_rsa_pubkey(Context context) {
        throw new RuntimeException("Stub!");
    }

    public static byte[] getGuidFromFile(Context r6) {
        throw new RuntimeException("Stub!");
    }

    public static void saveGuidToFile(Context r4, byte[] r5) {
        throw new RuntimeException("Stub!");
    }

    public static boolean set_cp_pubkey(Context r11, long r12, long r14) {
        throw new RuntimeException("Stub!");
    }

    public static byte[] get_cp_pubkey(Context r9, long r10, long r12) {
        throw new RuntimeException("Stub!");
    }

    public static void save_rsa_privkey(Context context, byte[] bArr) {
        throw new RuntimeException("Stub!");
    }

    public static byte[] get_rsa_privkey(Context context) {
        throw new RuntimeException("Stub!");
    }

    public static byte[] get_apk_id(Context context) {
        throw new RuntimeException("Stub!");
    }

    public static byte[] get_apk_v(Context context, String str) {
        throw new RuntimeException("Stub!");
    }

    public static int format_ret_code(int i) {
        throw new RuntimeException("Stub!");
    }

    public static String get_error_msg(int i) {
        throw new RuntimeException("Stub!");
    }

    public static String getLineInfo(int i) {
        throw new RuntimeException("Stub!");
    }

    public static void LOGI(String str) {
        throw new RuntimeException("Stub!");
    }

    public static void LOGI(String str, String str2) {
        throw new RuntimeException("Stub!");
    }

    public static void LOGD(String str) {
        throw new RuntimeException("Stub!");
    }

    public static void LOGD(String str, String str2) {
        throw new RuntimeException("Stub!");
    }

    public static void LOGW(String str, String str2) {
        throw new RuntimeException("Stub!");
    }

    public static void LOGW(String str, String str2, String str3) {
        throw new RuntimeException("Stub!");
    }

    public static String base64_encode(byte[] bArr) {
        throw new RuntimeException("Stub!");
    }

    public static byte[] base64_decode_url(byte[] bArr, int i) {
        throw new RuntimeException("Stub!");
    }

    public static void printException(Exception exception) {
        throw new RuntimeException("Stub!");
    }

    public static void printException(Exception exception, String str) {
        throw new RuntimeException("Stub!");
    }

    public static void printThrowable(Throwable th, String str) {
        throw new RuntimeException("Stub!");
    }

    public static byte[] getPkgSigFromApkName(Context context, String str) {
        throw new RuntimeException("Stub!");
    }

    public static byte[] getAppName(Context context) {
        throw new RuntimeException("Stub!");
    }

    public static String get_release_time() {
        return "2018/11/06 19:35:15";
    }

    public static String getDate() {
        String str = "";
        try {
            return "[" + System.currentTimeMillis() + "]";
        } catch (Exception e) {
            return str;
        }
    }

    public static String getThreadId() {
        return "[" + Thread.currentThread().getId() + "]";
    }

    public static String getCurrentPid() {
        throw new RuntimeException("Stub!");
    }

    public static String getSvnVersion() {
        return "[2342]";
    }

    public static String getUser(String str) {
        if (str != null) {
            return "[" + str + "]";
        }
        return "[]";
    }

    public static boolean ExistSDCard() {
        throw new RuntimeException("Stub!");
    }

    public static String getCurrentDay() {
        throw new RuntimeException("Stub!");
    }

    public static boolean isFileExist(String str) {
        try {
            return new File(str).exists();
        } catch (Exception e) {
            return false;
        }
    }

    public static int getFileSize(String str) {
        try {
            File file = new File(str);
            if (file.exists() && file.isFile()) {
                return (int) file.length();
            }
            return 0;
        } catch (Exception e) {
            return 0;
        }
    }

    public static byte[] compress(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return bArr;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream);
            deflaterOutputStream.write(bArr);
            deflaterOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            return new byte[0];
        }
    }

    public static void decompress(byte[] bArr) {
        if (bArr != null && bArr.length != 0) {
            LOGI("data len:" + bArr.length);
            int i = 0;
            int i2 = 0;
            while (bArr.length > i2 + 3) {
                int buf_to_int32 = buf_to_int32(bArr, i2);
                if (bArr.length > (i2 + buf_to_int32) + 3) {
                    byte[] bArr2 = new byte[buf_to_int32];
                    System.arraycopy(bArr, i2 + 4, bArr2, 0, buf_to_int32);
                    i2 = (i2 + 4) + buf_to_int32;
                    i++;
                    LOGI("len:" + buf_to_int32);
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        InflaterInputStream inflaterInputStream = new InflaterInputStream(new ByteArrayInputStream(bArr2));
                        byte[] bArr3 = new byte[1024];
                        while (true) {
                            int read = inflaterInputStream.read(bArr3);
                            if (read == -1) {
                                break;
                            }
                            byteArrayOutputStream.write(bArr3, 0, read);
                        }
                        LOGI(i + byteArrayOutputStream.toString());
                    } catch (IOException e) {
                    }
                } else {
                    return;
                }
            }
        }
    }

    public static String getLogDir(Context context) {
        throw new RuntimeException("Stub!");
    }

    public static String getLogFileName(Context context, String str) {
        if (context == null || str == null || str.length() == 0) {
            return null;
        }
        return getLogDir(context) + "/wtlogin_" + str + ".log";
    }

    /* JADX WARNING: Missing block: B:16:0x0028, code skipped:
            if (r2.isDirectory() != false) goto L_0x002a;
     */
    public static synchronized void writeFile(String r4, byte[] r5) {
        throw new RuntimeException("Stub!");
    }

    public static byte[] readFile(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        try {
            File file = new File(str);
            if (!file.exists() || !file.isFile()) {
                return null;
            }
            FileInputStream fileInputStream = new FileInputStream(str);
            int available = fileInputStream.available();
            if (available > 528384) {
                fileInputStream.close();
                return null;
            }
            byte[] bArr = new byte[available];
            fileInputStream.read(bArr);
            fileInputStream.close();
            return bArr;
        } catch (Exception e) {
            return null;
        }
    }

    public static byte[] readLog(Context context, String str) {
        if (context == null || str == null || str.length() == 0) {
            return null;
        }
        return readFile(getLogFileName(context, str));
    }

    public static long getFileModifyTime(String str) {
        if (str == null || str.length() == 0) {
            return 0;
        }
        try {
            File file = new File(str);
            if (file.exists() && file.isFile()) {
                return file.lastModified();
            }
            return 0;
        } catch (Exception e) {
            return 0;
        }
    }

    public static long getLogModifyTime(Context context, String str) {
        if (context == null || str == null || str.length() == 0) {
            return 0;
        }
        return getFileModifyTime(getLogFileName(context, str));
    }

    public static void deleteExpireFile(String str, int i) {
        throw new RuntimeException("Stub!");
    }

    public static void deleteExpireLog(Context context) {
        throw new RuntimeException("Stub!");
    }

    public static KeyPair generateRSAKeyPair() {
        throw new RuntimeException("Stub!");
    }

    public static byte[] RSAEncrypt(byte[] bArr, Key key) {
        if (bArr == null || key == null) {
            return null;
        }
        try {
            Cipher instance = Cipher.getInstance("RSA/ECB/PKCS1Padding");
            instance.init(1, key);
            int length = bArr.length;
            int round = (int) Math.round(((double) (length / 117)) + 0.5d);
            byte[] bArr2 = new byte[(128 * round)];
            int i = 0;
            int i2 = 117;
            while (i < round) {
                if (length < 117) {
                    i2 = length;
                }
                byte[] bArr3 = new byte[i2];
                System.arraycopy(bArr, i * 117, bArr3, 0, i2);
                System.arraycopy(instance.doFinal(bArr3), 0, bArr2, 128 * i, 128);
                i++;
                length -= i2;
            }
            return bArr2;
        } catch (Exception e) {
            return null;
        }
    }

    public static byte[] RSADecrypt(byte[] bArr, Key key) {
        int i = 0;
        if (bArr == null || key == null) {
            return null;
        }
        try {
            Cipher instance = Cipher.getInstance("RSA/ECB/PKCS1Padding");
            instance.init(2, key);
            int length = bArr.length;
            byte[] bArr2 = new byte[length];
            if (length % 128 != 0) {
                return null;
            }
            int i2 = 0;
            while (i < length / 128) {
                byte[] bArr3 = new byte[128];
                System.arraycopy(bArr, i * 128, bArr3, 0, 128);
                bArr3 = instance.doFinal(bArr3);
                System.arraycopy(bArr3, 0, bArr2, i2, bArr3.length);
                i2 += bArr3.length;
                i++;
            }
            byte[] bArr4 = new byte[i2];
            System.arraycopy(bArr2, 0, bArr4, 0, i2);
            return bArr4;
        } catch (Exception e) {
            return null;
        }
    }

    public static byte[] RSAPubKeyFromJava(byte[] bArr) {
        throw new RuntimeException("Stub!");
    }

    public static Key RSAPubKeyFromJNI(byte[] bArr) {
        throw new RuntimeException("Stub!");
    }

    public static byte[] RSAPrivKeyFromJava(byte[] bArr) {
        throw new RuntimeException("Stub!");
    }

    public static Key RSAPrivKeyFromJNI(byte[] bArr) {
        throw new RuntimeException("Stub!");
    }

    public static boolean isPackageExist(Context context, String str) {
        throw new RuntimeException("Stub!");
    }

    public static boolean isMQQExist(Context context) {
        throw new RuntimeException("Stub!");
    }

    public static boolean loadLibrary(String r6, Context r7) {
        throw new RuntimeException("Stub!");
    }

    public static Bundle packBundle(byte[][] bArr) {
        throw new RuntimeException("Stub!");
    }

    public static byte[][] unpackBundle(Bundle bundle) {
        throw new RuntimeException("Stub!");
    }

    public static String getChannelId(Context context, String str) {
        throw new RuntimeException("Stub!");
    }

    public static boolean shouldKick(int i) {
        return i != -1000 && i != 257 && i != -1026;
    }

    public static long constructSalt() {
        return (((long) get_rand_32()) << 32) + ((long) get_rand_32());
    }

    public static byte[] getRequestInitTime() {
        throw new RuntimeException("Stub!");
    }

    public static String getLanguage(Context context) {
        throw new RuntimeException("Stub!");
    }

    public static String getMaskString(String str, int i, int i2) {
        if (i + i2 > str.length()) {
            return "***";
        }
        return str.substring(0, i) + "***" + str.substring(str.length() - i2);
    }

    public static String getMaskBytes(byte[] bArr, int i, int i2) {
        if (bArr == null) {
            return "null";
        }
        String str = new String(bArr);
        if (i + i2 > str.length()) {
            return "***";
        }
        return str.substring(0, i) + "***" + str.substring(str.length() - i2);
    }
}
