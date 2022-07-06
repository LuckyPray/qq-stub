package mqq.app;

import com.qq.jce.wup.UniPacket;
import com.qq.taf.jce.JceStruct;
import com.tencent.qphone.base.remote.ToServiceMsg;
import java.util.HashMap;

public class Packet {
    private String SSOCommand;
    private String account = "0";
    private HashMap<String, Object> attributes = new HashMap();
    public boolean autoResend;
    private UniPacket client = new UniPacket(true);
    private boolean noResponse;
    public boolean quickSendEnable;
    public int quickSendStrategy = 0;
    private byte[] sendData;
    private long timeout = 30000;

    Packet(String account) {
        this.client.setEncodeName("UTF-8");
        if (account != null) {
            this.account = account;
        }
    }

    public ToServiceMsg toMsg() {
        ToServiceMsg msg = null;
        if (this.SSOCommand != null) {
            msg = new ToServiceMsg(null, this.account, this.SSOCommand);
            if (this.timeout > 0) {
                msg.setTimeout(this.timeout);
            }
            if (this.noResponse) {
                msg.setNeedCallback(false);
            }
            if (this.sendData == null) {
                this.sendData = this.client.encode();
            }
            msg.putWupBuffer(this.sendData);
            msg.setAttributes(this.attributes);
            msg.setEnableFastResend(this.autoResend);
            msg.setQuickSend(this.quickSendEnable, this.quickSendStrategy);
        }
        return msg;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public void setTimeout(long timeout) {
        this.timeout = timeout;
    }

    public void setNoResponse() {
        this.noResponse = true;
    }

    public void putSendData(byte[] sendData) {
        this.sendData = sendData;
    }

    public void setSSOCommand(String SSOCommand) {
        this.SSOCommand = SSOCommand;
    }

    public void setQuickSend(boolean quickSendEnable, int quickSendStrategy) {
        this.quickSendEnable = quickSendEnable;
        this.quickSendStrategy = quickSendStrategy;
    }

    public String getServantName() {
        return this.client.getServantName();
    }

    public void setServantName(String servantName) {
        this.client.setServantName(servantName);
    }

    public String getFuncName() {
        return this.client.getServantName();
    }

    public void setFuncName(String funcName) {
        this.client.setFuncName(funcName);
    }

    public void addRequestPacket(String key, JceStruct struct) {
        this.client.put(key, struct);
    }

    public static <T> T decodePacket(byte[] wupBuf, String wupRetName, T tmp) {
        UniPacket client = new UniPacket(true);
        client.setEncodeName("utf-8");
        client.decode(wupBuf);
        return client.getByClass(wupRetName, tmp);
    }

    public HashMap<String, Object> getAttributes() {
        return this.attributes;
    }

    public void setAttributes(HashMap<String, Object> attributes) {
        this.attributes = attributes;
    }

    public Object addAttribute(String key, Object value) {
        return this.attributes.put(key, value);
    }
}
