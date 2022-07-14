/*
 * QAuxiliary - An Xposed module for QQ/TIM
 * Copyright (C) 2019-2022 qwq233@qwq2333.top
 * https://github.com/cinit/QAuxiliary
 *
 * This software is non-free but opensource software: you can redistribute it
 * and/or modify it under the terms of the GNU Affero General Public License
 * as published by the Free Software Foundation; either
 * version 3 of the License, or any later version and our eula as published
 * by QAuxiliary contributors.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * and eula along with this software.  If not, see
 * <https://www.gnu.org/licenses/>
 * <https://github.com/cinit/QAuxiliary/blob/master/LICENSE.md>.
 */

package tencent.im.group_pro_proto.common;

import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.PBField;
import com.tencent.mobileqq.pb.PBUInt64Field;

public class common {
    public static final class Event extends MessageMicro<Event> {
        static final MessageMicro.FieldMap __fieldMap__ = MessageMicro.initFieldMap(new int[]{8, 16, 26}, new String[]{"type", "version", "op_info"}, new Object[]{0L, 0L, null}, Event.class);
        public final PBUInt64Field type = PBField.initUInt64(0);
        public final PBUInt64Field version = PBField.initUInt64(0);
        public MsgOpInfo op_info = new MsgOpInfo();
    }

    public static final class MsgOpInfo extends MessageMicro<MsgOpInfo> {
        static final MessageMicro.FieldMap __fieldMap__ = MessageMicro.initFieldMap(new int[]{8, 16, 24, 32, 40}, new String[]{"operator_tinyid", "operator_role", "reason", "timestamp", "at_type"}, new Object[]{0L, 0L, 0L, 0L, 0L}, MsgOpInfo.class);
        public final PBUInt64Field operator_tinyid = PBField.initUInt64(0);
        public final PBUInt64Field operator_role = PBField.initUInt64(0);
        public final PBUInt64Field reason = PBField.initUInt64(0);
        public final PBUInt64Field timestamp = PBField.initUInt64(0);
        public final PBUInt64Field at_type = PBField.initUInt64(0);
    }
}
