package mqq.app;

import android.content.Context;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.HashMap;

import mqq.manager.TicketManager;
import oicq.wlogin_sdk.request.Ticket;
import oicq.wlogin_sdk.request.WtTicketPromise;

public class TicketManagerImpl implements TicketManager {
    private static final int FAIL_NOT_PSKEY_DOMAIN = -5;
    private static final int FAIL_SDK_EXCEPTION = -4;
    private static final int FAIL_TICKET_NULL = -2;
    private static final int FAIL_TICKET_SIG_NULL = -3;
    private static final int FAIL_UIN_NONE = -1;
    private static final String TAG = "TicketManager";
    private HashMap<String, String> mAlterTicketsMap = new HashMap();
    private final AppRuntime mApp;
    private ArrayList<TicketManagerListener> mTicketListeners = new ArrayList();
//    private WtloginHelper mWtLoginHelper;

    public TicketManagerImpl(AppRuntime app) {
        throw new RuntimeException("Stub!");
    }

    public void reloadCache(Context context) {
        throw new RuntimeException("Stub!");
    }

    public String getA2(String uin) {
        throw new RuntimeException("Stub!");
    }

    @Deprecated
    public String getVkey(String uin) {
        return null;
    }

    public String getSkey(String uin) {
        throw new RuntimeException("Stub!");
    }

    public String getPskey(String uin, String domain) {
        throw new RuntimeException("Stub!");
    }

    public String getPt4Token(String uin, String domain) {
        throw new RuntimeException("Stub!");
    }

    public String getStweb(String uin) {
        throw new RuntimeException("Stub!");
    }

    public String getSuperkey(String uin) {
        throw new RuntimeException("Stub!");
    }

    public void onDestroy() {
    }

    private void reportGetTicketResult(boolean succ, String ticketType, String uin, int failReason) {
    }

    public void setAlterTicket(HashMap<String, String> map) {
        if (map != null && this.mApp != null) {
//            QLog.d(TAG, 1, "set alter tickets for " + MsfSdkUtils.getShortUin(this.mApp.getAccount()));
            String uin = (String) map.get("uin");
            String A2 = (String) map.get("A2");
            String vkey = (String) map.get("vkey");
            String skey = (String) map.get("skey");
            String stweb = (String) map.get("stweb");
            String superkey = (String) map.get("superkey");
            if (this.mApp != null && this.mApp.getAccount() != null && this.mApp.getAccount().equals(uin)) {
                this.mAlterTicketsMap.put("A2", A2);
                this.mAlterTicketsMap.put("vkey", vkey);
                this.mAlterTicketsMap.put("skey", skey);
                this.mAlterTicketsMap.put("stweb", stweb);
                this.mAlterTicketsMap.put("superkey", superkey);
            }
        }
    }

    public byte[] getDA2(String uin) {
        throw new RuntimeException("Stub!");
    }

    public byte[] getSt(String uin, int appid) {
        throw new RuntimeException("Stub!");
    }

    public byte[] getStkey(String uin, int appid) {
        throw new RuntimeException("Stub!");
    }

    public void registTicketManagerListener(TicketManagerListener listener) {
        try {
            if (!this.mTicketListeners.contains(listener)) {
                this.mTicketListeners.add(listener);
            }
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public void unregistTicketManagerListener(TicketManagerListener listener) {
        try {
            if (this.mTicketListeners.contains(listener)) {
                this.mTicketListeners.remove(listener);
            }
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public int sendRPCData(long seq, String uin, String serviceCmd, byte[] data, int timeout) {
        throw new RuntimeException("Stub!");
    }

    public Ticket GetPskey(String userAccount, long appid, String[] domains, WtTicketPromise promise) {
        throw new RuntimeException("Stub!");
    }

    public Ticket GetSkey(String userAccount, long appid, WtTicketPromise promise) {
        throw new RuntimeException("Stub!");
    }

    public Ticket GetTicket(String userAccount, long appid, int sigType, WtTicketPromise promise, Bundle params) {
        throw new RuntimeException("Stub!");
    }

    public Ticket GetLocalTicket(String uin, int ticketType) {
        throw new RuntimeException("Stub!");
    }
}
