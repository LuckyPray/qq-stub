package mqq.observer;

import android.os.Bundle;
import mqq.app.Constants.Action;

public abstract class TicketObserver implements BusinessObserver, Action {
    public void onChangeTicket(String uin) {
    }

    public void onReceive(int type, boolean isSuccess, Bundle data) {
        onChangeTicket(data.getString("uin"));
    }
}
