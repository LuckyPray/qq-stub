package mqq.manager;

import android.content.Context;
import android.os.Bundle;
import java.util.HashMap;
import mqq.app.TicketManagerListener;
import oicq.wlogin_sdk.request.Ticket;
import oicq.wlogin_sdk.request.WtTicketPromise;

public interface TicketManager extends Manager {
    Ticket GetLocalTicket(String str, int i);

    Ticket GetPskey(String str, long j, String[] strArr, WtTicketPromise wtTicketPromise);

    Ticket GetSkey(String str, long j, WtTicketPromise wtTicketPromise);

    Ticket GetTicket(String str, long j, int i, WtTicketPromise wtTicketPromise, Bundle bundle);

    String getA2(String str);

    byte[] getDA2(String str);

    String getPskey(String uin, String domain);

    String getPt4Token(String uin, String domain);

    String getSkey(String uin);

    byte[] getSt(String str, int i);

    byte[] getStkey(String str, int i);

    String getStweb(String uin);

    String getSuperkey(String uin);

    String getVkey(String str);

    void registTicketManagerListener(TicketManagerListener ticketManagerListener);

    void reloadCache(Context context);

    int sendRPCData(long j, String str, String str2, byte[] bArr, int i);

    void setAlterTicket(HashMap<String, String> hashMap);

    void unregistTicketManagerListener(TicketManagerListener ticketManagerListener);
}
