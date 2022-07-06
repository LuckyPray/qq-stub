package com.tencent.mobileqq.msf.sdk;

import android.content.Context;

import com.tencent.qphone.base.remote.FromServiceMsg;
import com.tencent.qphone.base.remote.SimpleAccount;
import com.tencent.qphone.base.remote.ToServiceMsg;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.net.UnknownHostException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

public class MsfSdkUtils {
    private static final String APP_FILE_PATH = "/data/data/com.tencent.mobileqq/files";
    public static final int MODE_ERR_MANU = -10003;
    public static final int MODE_ERR_SERVICE = -10001;
    public static final int MODE_EXCEPTION = -10000;
    public static final int MODE_LOW_END = -10002;
    public static final int MODE_UNINIT = -9999;
    private static final int OP_AUTO_START_MI_ABOVE_23 = 10008;
    private static final int OP_AUTO_START_MI_BELOW_23 = 50;
    public static final String TAG_COREUTIL_TOMSGE_UID = "__CoreUtil_toMsg_Uid";
    public static final boolean isPublicVersion = false;
    private static final AtomicInteger seqFactory = new AtomicInteger(new Random().nextInt(100000));
    private static final String tag = "MsfSdkUtils";
    public static final SimpleDateFormat timeFormatter = new SimpleDateFormat("yy-MM-dd HH:mm:ss");

    public static boolean isTopActivity(Context context) {
        throw new RuntimeException("Stub!");
    }

    public static boolean isScreenOn(Context context) {
        throw new RuntimeException("Stub!");
    }

    public static boolean isExistMsfProcess(Context context) {
        throw new RuntimeException("Stub!");
    }

    public static String getProcessName(Context context) {
        throw new RuntimeException("Stub!");
    }

    public static synchronized int getNextAppSeq() {
        int incrementAndGet;
        synchronized (MsfSdkUtils.class) {
            incrementAndGet = seqFactory.incrementAndGet();
            if (incrementAndGet > 1000000 /*EIPCModuleManager.INTERVAL*/) {
                seqFactory.set(new Random().nextInt(100000));
            }
            if (incrementAndGet == 50000) {
                incrementAndGet += 10000;
            }
        }
        return incrementAndGet;
    }

    public static boolean killProcess(Context context, String str) {
        throw new RuntimeException("Stub!");
    }

    public static FromServiceMsg constructResponse(String str, String str2, int i, int i2, String str3, Object obj, int i3) {
        FromServiceMsg fromServiceMsg = new FromServiceMsg(str, str2);
        fromServiceMsg.setAppId(i);
        if (i2 != 1000) {
            fromServiceMsg.setBusinessFail(i2, str3);
        } else {
            fromServiceMsg.setMsgSuccess();
        }
        if (obj != null) {
            fromServiceMsg.addAttribute(str2, obj);
        }
        fromServiceMsg.setRequestSsoSeq(i3);
        return fromServiceMsg;
    }

    public static File getNewAppUinStoreFile() {
        throw new RuntimeException("Stub!");
    }

    public static File getAppUinStoreFile() {
        throw new RuntimeException("Stub!");
    }

    public static File getAppUinBackStoreFile() {
        throw new RuntimeException("Stub!");
    }

    public static File getServerConfigFile(String str, int i, String str2) {
        throw new RuntimeException("Stub!");
    }

    public static synchronized ArrayList getLoginedAccountList(File r10) {
        throw new RuntimeException("Stub!");
    }

    private static boolean isAccountFileExist(File file, String str) {
        String[] list = file.list();
        if (list == null || list.length <= 0) {
            return false;
        }
        int i = 0;
        while (i < list.length) {
            if (list[i] != null && (list[i].equals("u_" + str + "_f") || list[i].equals("u_" + str + "_t"))) {
                return true;
            }
            i++;
        }
        return false;
    }

    public static synchronized void addSimpleAccount(String str) {
        synchronized (MsfSdkUtils.class) {
            File newAppUinStoreFile = getNewAppUinStoreFile();
            if (!newAppUinStoreFile.exists()) {
                newAppUinStoreFile.mkdirs();
            }
            if (newAppUinStoreFile.exists() && !isAccountFileExist(newAppUinStoreFile, str)) {
                try {
                    new File(newAppUinStoreFile.getAbsolutePath() + "/u_" + str + "_f").createNewFile();
//                    if (QLog.isColorLevel()) {
//                        QLog.d(tag, 2, "add user succ " + str);
//                    }
                } catch (Exception e) {
//                    if (QLog.isColorLevel()) {
//                        QLog.d(tag, 2, "add user failed " + str + " " + e);
//                    }
                }
            }
        }
    }

    public static synchronized void addLoginSimpleAccount(String str, boolean z) {
        synchronized (MsfSdkUtils.class) {
            File newAppUinStoreFile = getNewAppUinStoreFile();
            if (!newAppUinStoreFile.exists()) {
                newAppUinStoreFile.mkdirs();
            }
            if (newAppUinStoreFile.exists()) {
                if (isAccountFileExist(newAppUinStoreFile, str)) {
                    updateSimpleAccountNotCreate(str, true);
                } else {
                    try {
                        new File(newAppUinStoreFile.getAbsolutePath() + "/u_" + str + (z ? "_t" : "_f")).createNewFile();
                    } catch (Exception e) {
//                        if (QLog.isColorLevel()) {
//                            QLog.d(tag, 2, "add user failed " + str + " " + e);
//                        }
                    }
                }
            }
        }
    }

    public static synchronized void delSimpleAccount(String str) {
        synchronized (MsfSdkUtils.class) {
            File newAppUinStoreFile = getNewAppUinStoreFile();
            if (newAppUinStoreFile.exists()) {
                for (String str2 : newAppUinStoreFile.list()) {
                    if (str2.equals("u_" + str + "_f") || str2.equals("u_" + str + "_t")) {
                        new File(newAppUinStoreFile.getPath(), str2).delete();
//                        if (QLog.isColorLevel()) {
//                            QLog.d(tag, 2, "del user succ " + str);
//                        }
                    }
                }
            }
        }
    }

    public static synchronized void updateSimpleAccount(String str, boolean z) {
        synchronized (MsfSdkUtils.class) {
            File newAppUinStoreFile = getNewAppUinStoreFile();
            if (newAppUinStoreFile.exists()) {
                String str2 = newAppUinStoreFile.getAbsolutePath() + "/u_" + str + (z ? "_t" : "_f");
                File file = new File(str2);
                if (file.exists()) {
                    file.delete();
//                    if (QLog.isColorLevel()) {
//                        QLog.d(tag, 2, "found want update user exists,del " + str + " " + z);
//                    }
                }
                File[] listFiles = newAppUinStoreFile.listFiles();
                if (listFiles != null) {
                    int length = listFiles.length;
                    int i = 0;
                    while (i < length) {
                        File file2 = listFiles[i];
                        if (file2.getName().equals("u_" + str + "_t") || file2.getName().equals("u_" + str + "_f")) {
                            file2.renameTo(new File(str2));
//                            if (QLog.isColorLevel()) {
//                                QLog.d(tag, 2, "update user succ " + str + " " + z);
//                            }
                        } else {
                            i++;
                        }
                    }
                }
                try {
                    new File(str2).createNewFile();
//                    if (QLog.isColorLevel()) {
//                        QLog.d(tag, 2, "update add user succ " + MD5.toMD5(str));
//                    }
                } catch (Exception e) {
//                    QLog.d(tag, 1, "update add user failed " + MD5.toMD5(str) + " " + e);
                }
            }
        }
        return;
    }

    public static synchronized void updateSimpleAccountNotCreate(String str, boolean z) {
        synchronized (MsfSdkUtils.class) {
            File newAppUinStoreFile = getNewAppUinStoreFile();
            if (newAppUinStoreFile.exists()) {
                String str2 = newAppUinStoreFile.getAbsolutePath() + "/u_" + str + (z ? "_t" : "_f");
                File file = new File(str2);
                File[] listFiles = newAppUinStoreFile.listFiles();
                if (listFiles != null) {
                    for (File file2 : listFiles) {
                        if (file2.getName().equals("u_" + str + "_t") || file2.getName().equals("u_" + str + "_f")) {
                            file2.renameTo(new File(str2));
                            break;
                        }
                    }
                }
            }
        }
    }

    public static synchronized ArrayList getLoginedAccountList() {
        ArrayList loginedAccountList;
        synchronized (MsfSdkUtils.class) {
            File newAppUinStoreFile = getNewAppUinStoreFile();
            if (newAppUinStoreFile == null || !newAppUinStoreFile.exists()) {
                loginedAccountList = getLoginedAccountList(getAppUinStoreFile());
                if (loginedAccountList == null || loginedAccountList.size() == 0) {
                    loginedAccountList = getLoginedAccountList(getAppUinBackStoreFile());
//                    if (loginedAccountList != null && QLog.isColorLevel()) {
//                        QLog.d(tag, 2, "load accountList " + loginedAccountList.size() + " from backFile");
//                    }
                } else {
//                    QLog.d(tag, 1, "load accountList " + loginedAccountList.size());
                }
            } else {
                String[] list = newAppUinStoreFile.list();
                loginedAccountList = new ArrayList();
                if (list != null) {
                    for (String str : list) {
                        try {
                            if (str.startsWith("u_")) {
                                String substring = str.substring(2, str.length() - 2);
                                boolean endsWith = str.endsWith("_t");
                                SimpleAccount simpleAccount = new SimpleAccount();
                                simpleAccount.setUin(substring);
                                simpleAccount.setAttribute(SimpleAccount._ISLOGINED, String.valueOf(endsWith));
                                if (isUinLong(substring)) {
                                    loginedAccountList.add(simpleAccount);
                                } else {
//                                    QLog.d(tag, 1, "found invalid uin: " + substring);
                                }
                            }
                        } catch (Exception e) {
//                            if (QLog.isColorLevel()) {
//                                QLog.d(tag, 2, "parse user failed " + e + " " + str);
//                            }
                        }
                    }
                }
            }
        }
        return loginedAccountList;
    }

    private static boolean isUinLong(String str) {
        try {
            Long.parseLong(str);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public static void writeServerConfig(String r5, int r6, String r7, String r8) throws IOException {
        throw new RuntimeException("Stub!");
    }

    public static String getServerConfig(String r5, int r6, String r7) {
        throw new RuntimeException("Stub!");
    }

    public static void addFromMsgProcessName(String str, FromServiceMsg fromServiceMsg) {
        if (fromServiceMsg != null) {
            fromServiceMsg.getAttributes().put(MsfConstants.ATTRIBUTE_SENDERPROCESSNAME, str);
        }
    }

    public static void addToMsgProcessName(String str, ToServiceMsg toServiceMsg) {
        if (toServiceMsg != null) {
            toServiceMsg.getAttributes().put(MsfConstants.ATTRIBUTE_SENDERPROCESSNAME, str);
        }
    }

    public static byte[] convertInt2Bytes(int i) {
        return new byte[]{(byte) ((i >>> 24) & 255), (byte) ((i >>> 16) & 255), (byte) ((i >>> 8) & 255), (byte) (i & 255)};
    }

    public static int convertBytes2Int(byte[] bArr) {
        return ((((bArr[0] << 24) & -16777216) | ((bArr[1] << 16) & 16711680)) | ((bArr[2] << 8) & 65280)) | ((bArr[3] << 0) & 255);
    }

    public static int convertBytes2Int(byte[] bArr, int i) {
        return ((((bArr[i + 0] << 24) & -16777216) | ((bArr[i + 1] << 16) & 16711680)) | ((bArr[i + 2] << 8) & 65280)) | ((bArr[i + 3] << 0) & 255);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x001b  */
    public static void saveConfig(String r3, java.util.Properties r4) throws Exception {
        throw new RuntimeException("Stub!");
    }

    public static java.util.Properties loadConfig(String r3) throws Exception {
        throw new RuntimeException("Stub!");
    }

    public static FromServiceMsg constructResponse(ToServiceMsg toServiceMsg, int i, String str, Object obj) {
        if (toServiceMsg == null) {
            return new FromServiceMsg();
        }
        FromServiceMsg constructResponse = constructResponse(toServiceMsg.getUin(), toServiceMsg.getServiceCmd(), toServiceMsg.getAppId(), i, str, obj, toServiceMsg.getRequestSsoSeq());
        constructResponse.setAppSeq(toServiceMsg.getAppSeq());
        return constructResponse;
    }

    public static String getResolutionString(Context context) {
        throw new RuntimeException("Stub!");
    }

    public static String getTotalMemory() {
        String readLine;
        IOException e;
        String str = "";
        String str2 = "";
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("/proc/meminfo"), 8192);
            readLine = bufferedReader.readLine();
            if (readLine != null) {
                readLine = readLine.trim();
            } else {
                readLine = str;
            }
            try {
                bufferedReader.close();
            } catch (IOException e2) {
                e = e2;
                e.printStackTrace();
                return readLine;
            }
        } catch (IOException e3) {
            IOException iOException = e3;
            readLine = str;
            e = iOException;
            e.printStackTrace();
            return readLine;
        }
        return readLine;
    }

    public static String getShortUin(String str) {
        throw new RuntimeException("Stub!");
    }

    public static String getShortKey(byte[] bArr) {
        throw new RuntimeException("Stub!");
//        if (bArr == null || bArr.length < 4) {
//            return MsfConstants.ProcessNameAll;
//        }
//        return MD5.toMD5(new String(bArr)).substring(0, 4) + MsfConstants.ProcessNameAll;
    }

    public static String getShortStringKey(byte[] bArr) {
        if (bArr == null || bArr.length < 4) {
            return MsfConstants.ProcessNameAll;
        }
        return new String(bArr, 0, 4);
    }

    public static String getShortHexKey(byte[] bArr) {
        if (bArr == null || bArr.length < 4) {
            return MsfConstants.ProcessNameAll;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(Integer.toHexString(bArr[0]));
        stringBuilder.append(Integer.toHexString(bArr[1]));
        stringBuilder.append(Integer.toHexString(bArr[2]));
        stringBuilder.append(Integer.toHexString(bArr[3]));
        return stringBuilder.toString();
    }

    public static String insertMtype(String str, String str2) {
        if (str2.contains("mType=") || str == null) {
            return str2;
        }
        int indexOf = str2.indexOf("?");
        if (indexOf > 0) {
            if (str2.length() == indexOf + 1) {
                return str2.substring(0, indexOf + 1) + "mType=" + str;
            }
            String str3;
            indexOf = str2.indexOf("#", indexOf);
            if (indexOf > -1) {
                str3 = str2.substring(0, indexOf) + "&mType=" + str + str2.substring(indexOf);
            } else {
                str3 = str2 + "&mType=" + str;
            }
            return str3;
        } else if (str2.length() > 0) {
            return str2 + "?mType=" + str;
        } else {
            return str2;
        }
    }

    public static String getStackTraceString(Throwable th) {
        if (th == null) {
            return "";
        }
        for (Throwable th2 = th; th2 != null; th2 = th2.getCause()) {
            if (th2 instanceof UnknownHostException) {
                return "";
            }
        }
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        th.printStackTrace(printWriter);
        printWriter.flush();
        return stringWriter.toString();
    }

    public static String getThreadStackString(String r6) {
        throw new RuntimeException("Stub!");
    }

    public static String getCurrentThreadStackString() {
        StringBuilder stringBuilder = null;
        try {
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            if (stackTrace != null) {
                stringBuilder = new StringBuilder(1024);
            }
            for (StackTraceElement stackTraceElement : stackTrace) {
                stringBuilder.append(stackTraceElement.toString()).append("#");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return stringBuilder == null ? "" : stringBuilder.toString();
    }

    public static int getThreadCounts(String str) {
        int i = 0;
        try {
            for (Thread name : Thread.getAllStackTraces().keySet()) {
                int i2;
                if (str.equals(name.getName())) {
                    i2 = i + 1;
                } else {
                    i2 = i;
                }
                i = i2;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return i;
    }

    public static String getAppBuildNum() {
        throw new RuntimeException("Stub!");
    }

    public static String getAppChannelId() {
        throw new RuntimeException("Stub!");
    }

    public static String getAppVersion() {
        throw new RuntimeException("Stub!");
    }

    public static String getAppid() {
        throw new RuntimeException("Stub!");
    }

    public static int getAutoStartMode(Context context) {
        throw new RuntimeException("Stub!");
    }
}
