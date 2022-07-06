package oicq.wlogin_sdk.request;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.content.Context;
import android.os.Process;

import java.net.Socket;
import java.security.SecureRandom;

import oicq.wlogin_sdk.tools.util;

/* compiled from: request_global */
public class t {
    public static byte[] A = new byte[0];
    static byte[] B = new byte[0];
    public static byte[] C = new byte[0];
    public static int D = 0;
    public static byte[] E = new byte[0];
    public static byte[] F = new byte[0];
    public static byte[] G = new byte[0];
    public static byte[] H = new byte[0];
    public static byte[] I = new byte[0];
    public static byte[] J = new byte[0];
//    public static byte[] K = XpConfig.DEFAULT_TERMINAL.getBytes();
    static byte[] L = new byte[0];
    static byte[] M = new byte[0];
    static byte[] N = new byte[0];
    static byte[] O = new byte[0];
    static byte[] P = new byte[0];
    static byte[] Q = new byte[0];
    static byte[] R = new byte[0];
    static byte[] S = new byte[0];
    static int T = 0;
    static int U = 0;
    static int V = 0;
    static int W = 0;
    static int X = 0;
    public static int Y = 0;
    public static int Z = 0;
    public static SecureRandom a = m();
    static byte[] aa = new byte[0];
    static long ab = 0;
    public static long ac = 0;
    static byte[] ad = new byte[4];
    static int ae = 0;
    static int af = 0;
    public static boolean ag = false;
    public static int ah = 1;
    public static byte[] ai;
//    public static c al = null;
    protected static String am = "";
//    public static Reporter an = new Reporter();
    public static long ao = 0;
//    public static TreeMap<Long, async_context> ap = new TreeMap();
    public static boolean ar = false;
    public static boolean as = true;
    public static String at;
    public static int au = 0;
    private static boolean av = true;
    private static Object aw = new Object();
    static Boolean e = Boolean.valueOf(false);
    public static Context t = null;
    public static int u = 2052;
    public static String v = "";
    static int w = 0;
    static int x = 1;
    static int y = 0;
    static int z = 0;
    Socket aj = null;
    Socket ak = null;
    public int aq;
    public byte[] b = null;
    public byte[] c = new byte[16];
//    public tlv_t150 d = null;
    public long f = 0;
    public String g = "";
    public long h = 0;
    public int i = 0;
    public WFastLoginInfo j;
    public int k = 0;
    public int l = 5000;
    public int m = 0;
    public byte[] n = new byte[16];
    public byte[] o = new byte[16];
    public byte[] p = new byte[16];
    public byte[] q = new byte[0];
    public byte[] r = new byte[0];
    public int s = 0;

    private static SecureRandom m() {
        try {
            return new SecureRandom();
        } catch (Throwable th) {
            return null;
        }
    }

    public t(Context context) {
    }

    public t a(long j) {
        t tVar = new t(null);
        tVar.k = this.k;
        tVar.l = this.l;
        if (this.c != null) {
            tVar.c = (byte[]) this.c.clone();
        }
        if (!(this.n == null || this.p == null)) {
            tVar.n = (byte[]) this.n.clone();
            tVar.p = (byte[]) this.p.clone();
        }
        if (j <= 0) {
            tVar.h = a();
        } else {
            tVar.h = j;
        }
        return tVar;
    }

    public static synchronized long a() {
        long j;
        synchronized (t.class) {
            if (ao > 200) {
                ao = 0;
            }
            j = ao + 1;
            ao = j;
        }
        return j;
    }

//    public static async_context b(long j) {
//        async_context async_context;
//        Exception e;
//        synchronized (aw) {
//            async_context async_context2 = (async_context) ap.get(Long.valueOf(j));
//            if (async_context2 == null) {
//                try {
//                    async_context = new async_context();
//                    try {
//                        ap.put(Long.valueOf(j), async_context);
//                    } catch (Exception e2) {
//                        e = e2;
//                        util.printException(e, "");
//                        return async_context;
//                    }
//                } catch (Exception e3) {
//                    Exception exception = e3;
//                    async_context = async_context2;
//                    e = exception;
//                    util.printException(e, "");
//                    return async_context;
//                }
//            }
//            async_context = async_context2;
//        }
//        return async_context;
//    }

//    public static void c(long j) {
//        synchronized (aw) {
//            try {
//                ap.remove(Long.valueOf(j));
//            } catch (Exception e) {
//                util.printException(e, "");
//            }
//        }
//    }

//    public static void b() {
//        String format = new SimpleDateFormat("yyyyMMdd").format(new Date());
//        if (format.compareTo(v) != 0) {
//            v = format;
//            new g(t).start();
//        }
//    }
//
//    public static void c() {
//        byte[] bArr = util.get_mac_addr(t);
//        if (bArr != null && bArr.length > 0) {
//            bArr = MD5.toMD5Byte(bArr);
//        }
//        byte[] bArr2 = util.get_imei_id(t);
//        if (bArr2 != null && bArr2.length > 0) {
//            bArr2 = MD5.toMD5Byte(bArr2);
//        }
//        byte[] generateGuid = util.generateGuid(t);
//        if (generateGuid != null && generateGuid.length > 0) {
//            generateGuid = MD5.toMD5Byte(generateGuid);
//        }
//        if (util.get_last_flag(t) != 0) {
//            byte[] bArr3 = util.get_last_mac(t);
//            byte[] bArr4 = util.get_last_imei(t);
//            byte[] bArr5 = util.get_last_guid(t);
//            if (!Arrays.equals(bArr, bArr3)) {
//                X |= 1;
//            }
//            if (!Arrays.equals(bArr2, bArr4)) {
//                X |= 2;
//            }
//            if (!Arrays.equals(generateGuid, bArr5)) {
//                X |= 4;
//            }
//        }
//        util.save_cur_flag(t, 1);
//        util.save_cur_mac(t, bArr);
//        util.save_cur_imei(t, bArr2);
//        util.save_cur_guid(t, generateGuid);
//    }
//
//    public static byte[] a(Context context) {
//        try {
//            String str = (String) Class.forName("com.tencent.mobileqq.utils.KidInfoUtil").getMethod("getGuid", new Class[0]).invoke(null, new Object[0]);
//            if (str == null) {
//                util.LOGI("get watch guid null", "");
//                return null;
//            }
//            util.saveGuidToFile(context, util.string_to_buf(str));
//            ai = util.string_to_buf(str);
//            util.LOGI("get watch guid " + str, "");
//            return ai;
//        } catch (Exception e) {
//            return null;
//        }
//    }
//
//    public static void d() {
//        String l;
//        int i;
//        util.LOGI("init start", "");
//        Y = 0;
//        a(t);
//        Object guidFromFile = util.getGuidFromFile(t);
//        util.LOGI("get saved guid " + util.buf_to_string(guidFromFile), "");
//        Object generateGuid = util.generateGuid(t);
//        util.LOGI("get current guid " + util.buf_to_string(generateGuid), "");
//        Object bytes = new String("%4;7t>;28<fc.5*6").getBytes();
//        if (guidFromFile == null || guidFromFile.length <= 0) {
//            if (generateGuid == null || generateGuid.length <= 0) {
//                U = 0;
//                W = 20;
//                generateGuid = bytes;
//            } else {
//                U = 1;
//                W = 17;
//            }
//            util.saveGuidToFile(t, generateGuid);
//            V = 0;
//            T = 1;
//            bytes = generateGuid;
//        } else {
//            byte[] generateGuid2;
//            if (generateGuid2 == null || generateGuid2.length <= 0) {
//                generateGuid2 = bytes;
//                bytes = guidFromFile;
//            } else {
//                if (Arrays.equals(bytes, guidFromFile) && av) {
//                    l = l();
//                    if (!TextUtils.isEmpty(l) && l.endsWith(MainService.MSFPROCESSNAMETAG) && util.needChangeGuid(t)) {
//                        util.LOGI("reset guid :" + util.buf_to_string(guidFromFile) + "|" + util.buf_to_string(generateGuid2), "");
//                        c.a(t, (byte[]) guidFromFile, (byte[]) generateGuid2);
//                        util.saveGuidToFile(t, generateGuid2);
//                        bytes = generateGuid2;
//                    }
//                }
//                bytes = guidFromFile;
//            }
//            av = false;
//            if (Arrays.equals(generateGuid2, bytes)) {
//                V = 0;
//            } else {
//                V = 1;
//            }
//            U = 1;
//            T = 0;
//            W = 1;
//        }
//        c();
//        Y |= (W << 24) & -16777216;
//        Y |= (X << 8) & 65280;
//        A = (byte[]) bytes.clone();
//        B = (byte[]) bytes.clone();
//        util.LOGI("guid src " + W, "");
//        M = util.get_imei_id(t);
//        if (M != null && M.length > 0) {
//            M = MD5.toMD5Byte(M);
//        }
//        ae = VERSION.SDK_INT;
//        N = util.get_mac_addr(t);
//        if (N != null && N.length > 0) {
//            N = MD5.toMD5Byte(N);
//        }
//        R = util.get_bssid_addr(t);
//        if (R != null && R.length > 0) {
//            R = MD5.toMD5Byte(R);
//        }
//        S = util.get_ssid_addr(t);
//        O = util.get_android_id(t);
//        if (O != null && O.length > 0) {
//            O = MD5.toMD5Byte(O);
//        }
//        L = util.get_IMSI(t);
//        if (L != null && L.length > 0) {
//            L = MD5.toMD5Byte(L);
//        }
//        C = util.get_sim_operator_name(t);
//        D = util.get_network_type(t);
//        if (util.get_saved_network_type(t) != D) {
//            util.set_net_retry_type(t, 0);
//            util.save_network_type(t, D);
//        }
//        F = util.get_apn_string(t).getBytes();
//        aa = util.get_ksid(t);
//        E = util.get_apk_id(t);
//        G = util.get_apk_v(t, new String(E));
//        H = util.getPkgSigFromApkName(t, t.getPackageName());
//        Q = util.getAppName(t);
//        String str = VERSION.RELEASE;
//        if (str == null) {
//            str = "";
//        }
//        if (16 < str.length()) {
//            str = str.substring(0, 16);
//        }
//        J = str.getBytes();
//        l = Build.MODEL;
//        try {
//            str = a.a(t, "ro.vivo.market.name");
//            if (TextUtils.isEmpty(str)) {
//                str = l;
//            }
//        } catch (Throwable th) {
//            str = l;
//        }
//        if (str == null) {
//            I = new byte[0];
//        } else {
//            I = str.getBytes();
//        }
//        str = Build.BRAND;
//        if (str == null) {
//            P = new byte[0];
//        } else {
//            P = str.getBytes();
//        }
//        if (util.isFileExist("/system/bin/su") || util.isFileExist("/system/xbin/su") || util.isFileExist("/sbin/su")) {
//            i = 1;
//        } else {
//            i = 0;
//        }
//        if (i == 1) {
//            i = 1;
//        } else {
//            i = 0;
//        }
//        Z = i;
//        al = new c(t);
//        an = report_t.read_fromfile(t);
//        if (an == null) {
//            an = new Reporter();
//        }
//        util.LOGI("init ok os ver:" + new String(J) + " cur_guid:" + util.buf_to_string(A) + " svn " + util.SVN_VER + " at " + l(), "");
//    }

    public boolean e() {
        return this.k != 0;
    }

    public static long f() {
        return System.currentTimeMillis() / 1000;
    }

    public static long g() {
        return (System.currentTimeMillis() / 1000) + ac;
    }

    public void a(byte[] bArr, byte[] bArr2) {
        ab = (((long) util.buf_to_int32(bArr, 0)) & 4294967295L) - (System.currentTimeMillis() / 1000);
        ac = ab;
        ad = bArr2;
    }

    public void b(Context context) {
        t = context;
        byte[] bArr = util.get_rand_16byte(a);
        System.arraycopy(bArr, 0, this.c, 0, bArr.length);
    }

    public void h() {
        util.LOGD("close_connect", "close_connect");
        if (this.aj != null) {
            try {
                util.LOGD("close_connect", this.aj.toString());
                this.aj.close();
            } catch (Exception e) {
                util.printException(e, "");
            }
            this.aj = null;
        }
    }

    public void i() {
        if (this.ak != null) {
            try {
                util.LOGD("close_transport_connect", this.ak.toString());
                this.ak.close();
            } catch (Exception e) {
                util.printException(e, "");
            }
            this.ak = null;
        }
    }

//    public synchronized int a(long j, long j2, long j3, long j4, byte[] bArr, byte[] bArr2) {
//        return al.a(j, j2, j3, j4, bArr, bArr2);
//    }
//
//    public synchronized WloginSigInfo a(long j, long j2) {
//        WloginSigInfo d;
//        d = al.d(j, j2);
//        if (d != null) {
//        }
//        return d;
//    }
//
//    public synchronized void j() {
//        al.a();
//    }
//
//    public synchronized WloginSimpleInfo d(long j) {
//        WloginSimpleInfo b;
//        b = al.b(j);
//        if (b != null) {
//        }
//        return b;
//    }
//
//    public synchronized void a(String str) {
//        al.a(str);
//    }
//
//    public synchronized long b(String str) {
//        long j = 0;
//        synchronized (this) {
//            UinInfo a = al.a(str, true);
//            if (!(a == null || a._uin.longValue() == 0)) {
//                j = a._uin.longValue();
//            }
//        }
//        return j;
//    }
//
//    public synchronized UinInfo c(String str) {
//        return al.a(str, false);
//    }
//
//    public synchronized String e(long j) {
//        return al.b(Long.valueOf(j));
//    }
//
//    public synchronized List<WloginLoginInfo> k() {
//        return al.a(true);
//    }
//
//    public synchronized int a(long j, long j2, byte[][] bArr, long j3, long j4, long j5, long j6, long j7, WloginSimpleInfo wloginSimpleInfo, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6, byte[] bArr7, byte[] bArr8, byte[] bArr9, byte[] bArr10, byte[] bArr11, byte[] bArr12, byte[] bArr13, byte[][] bArr14, long[] jArr, int i) {
//        al.d = this.aq;
//        return al.a(j, j2, bArr, j3, j4, j5, j6, j7, wloginSimpleInfo, bArr2, bArr3, bArr4, bArr5, bArr6, bArr7, bArr8, bArr9, bArr10, bArr11, bArr12, bArr13, bArr14, jArr, i);
//    }
//
//    public synchronized void a(long j, long j2, byte[] bArr) {
//        al.a(j, j2, bArr);
//    }
//
//    public synchronized int b(long j, long j2) {
//        return al.a(j, j2);
//    }
//
//    public synchronized void c(long j, long j2) {
//        al.b(j, j2);
//    }
//
//    public void d(long j, long j2) {
//        al.c(j, j2);
//    }
//
//    public synchronized void e(long j, long j2) {
//        al.a(Long.valueOf(j), Long.valueOf(j2));
//    }
//
//    public synchronized void a(String str, Long l) {
//        al.a(str, l, true);
//    }
//
//    public synchronized void a(String str, Long l, boolean z) {
//        al.a(str, l, z);
//    }
//
//    public synchronized void d(String str) {
//        al.b(str);
//    }

    @SuppressLint({"NewApi", "WrongConstant"})
    public static String l() {
        if (am != null && am.length() > 0) {
            return am;
        }
        try {
            int myPid = Process.myPid();
            for (RunningAppProcessInfo runningAppProcessInfo : ((ActivityManager) t.getSystemService("activity")).getRunningAppProcesses()) {
                if (runningAppProcessInfo.pid == myPid) {
                    am = runningAppProcessInfo.processName;
                    return am;
                }
            }
        } catch (Throwable th) {
            util.printThrowable(th, "");
        }
        return "";
    }
}
