package NS_MINI_INTERFACE;

import NS_COMM.COMM;
import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.PBField;
import com.tencent.mobileqq.pb.PBStringField;

/* compiled from: P */
/* loaded from: classes.dex */
public final class INTERFACE$StGetCodeRsp extends MessageMicro<INTERFACE$StGetCodeRsp> {
    static final FieldMap __fieldMap__ = MessageMicro.initFieldMap(new int[]{10, 18}, new String[]{"extInfo", "code"}, new Object[]{null, ""}, INTERFACE$StGetCodeRsp.class);
    public COMM.StCommonExt extInfo = new COMM.StCommonExt();
    public final PBStringField code = PBField.initString("");
}
