package NS_QWEB_PROTOCAL;

import NS_COMM.COMM;
import com.tencent.mobileqq.pb.ByteStringMicro;
import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.PBBytesField;
import com.tencent.mobileqq.pb.PBField;
import com.tencent.mobileqq.pb.PBInt64Field;
import com.tencent.mobileqq.pb.PBRepeatMessageField;
import com.tencent.mobileqq.pb.PBStringField;
import com.tencent.mobileqq.pb.PBUInt32Field;
import com.tencent.mobileqq.pb.PBUInt64Field;

/* loaded from: classes.dex */
public final class PROTOCAL {
    public static final int LOGIN_DEFAULT = 0;
    public static final int LOGIN_QQ = 2;
    public static final int LOGIN_QQ_SKEY = 3;
    public static final int LOGIN_WECHAT = 1;

    /* loaded from: classes.dex */
    public static final class StAuthInfo extends MessageMicro<StAuthInfo> {
        static final FieldMap __fieldMap__;
        public final PBRepeatMessageField<COMM.Entry> Extinfo;
        public final PBStringField appid;
        public final PBStringField openid;
        public final PBStringField platform;
        public final PBBytesField sessionkey;
        public final PBBytesField sig;
        public final PBUInt32Field type;
        public final PBStringField uin = PBField.initString("");

        static {
            ByteStringMicro byteStringMicro = ByteStringMicro.EMPTY;
            __fieldMap__ = MessageMicro.initFieldMap(new int[]{10, 18, 26, 32, 42, 50, 58, 66}, new String[]{"uin", "sig", "platform", "type", "appid", "openid", "sessionkey", "Extinfo"}, new Object[]{"", byteStringMicro, "", 0, "", "", byteStringMicro, null}, StAuthInfo.class);
        }

        public StAuthInfo() {
            ByteStringMicro byteStringMicro = ByteStringMicro.EMPTY;
            this.sig = PBField.initBytes(byteStringMicro);
            this.platform = PBField.initString("");
            this.type = PBField.initUInt32(0);
            this.appid = PBField.initString("");
            this.openid = PBField.initString("");
            this.sessionkey = PBField.initBytes(byteStringMicro);
            this.Extinfo = PBField.initRepeatMessage(COMM.Entry.class);
        }
    }

    /* loaded from: classes.dex */
    public static final class StEncryption extends MessageMicro<StEncryption> {
        static final FieldMap __fieldMap__ = MessageMicro.initFieldMap(new int[]{8, 18}, new String[]{"method", "iv"}, new Object[]{0, ""}, StEncryption.class);
        public final PBUInt32Field method = PBField.initUInt32(0);
        public final PBStringField iv = PBField.initString("");
    }

    /* loaded from: classes.dex */
    public static final class StQWebReq extends MessageMicro<StQWebReq> {
        static final FieldMap __fieldMap__ = MessageMicro.initFieldMap(new int[]{8, 18, 26, 34, 42, 50, 58, 66, 74, 82, 88}, new String[]{"Seq", "qua", "deviceInfo", "busiBuff", "traceid", "Module", "Cmdname", "loginSig", "Crypto", "Extinfo", "contentType"}, new Object[]{0L, "", "", ByteStringMicro.EMPTY, "", "", "", null, null, null, 0}, StQWebReq.class);
        public final PBUInt64Field Seq = PBField.initUInt64(0);
        public final PBStringField qua = PBField.initString("");
        public final PBStringField deviceInfo = PBField.initString("");
        public final PBBytesField busiBuff = PBField.initBytes(ByteStringMicro.EMPTY);
        public final PBStringField traceid = PBField.initString("");
        public final PBStringField Module = PBField.initString("");
        public final PBStringField Cmdname = PBField.initString("");
        public StAuthInfo loginSig = new StAuthInfo();
        public StEncryption Crypto = new StEncryption();
        public final PBRepeatMessageField<COMM.Entry> Extinfo = PBField.initRepeatMessage(COMM.Entry.class);
        public final PBUInt32Field contentType = PBField.initUInt32(0);
    }

    /* loaded from: classes.dex */
    public static final class StQWebRsp extends MessageMicro<StQWebRsp> {
        static final FieldMap __fieldMap__;
        public final PBRepeatMessageField<COMM.Entry> Extinfo;
        public final PBBytesField busiBuff;
        public final PBBytesField errMsg;
        public final PBUInt64Field Seq = PBField.initUInt64(0);
        public final PBInt64Field retCode = PBField.initInt64(0);

        static {
            ByteStringMicro byteStringMicro = ByteStringMicro.EMPTY;
            __fieldMap__ = MessageMicro.initFieldMap(new int[]{8, 16, 26, 34, 42}, new String[]{"Seq", "retCode", "errMsg", "busiBuff", "Extinfo"}, new Object[]{0L, 0L, byteStringMicro, byteStringMicro, null}, StQWebRsp.class);
        }

        public StQWebRsp() {
            ByteStringMicro byteStringMicro = ByteStringMicro.EMPTY;
            this.errMsg = PBField.initBytes(byteStringMicro);
            this.busiBuff = PBField.initBytes(byteStringMicro);
            this.Extinfo = PBField.initRepeatMessage(COMM.Entry.class);
        }
    }

    private PROTOCAL() {
    }
}
