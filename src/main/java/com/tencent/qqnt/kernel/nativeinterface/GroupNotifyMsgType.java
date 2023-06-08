/*
 * QAuxiliary - An Xposed module for QQ/TIM
 * Copyright (C) 2019-2023 QAuxiliary developers
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

package com.tencent.qqnt.kernel.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.mobileqq.qfix.redirect.PatchRedirectCenter;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* compiled from: P */
/* loaded from: classes2.dex */
public final class GroupNotifyMsgType {
    private static final /* synthetic */ GroupNotifyMsgType[] $VALUES;
    public static final GroupNotifyMsgType AGREEDTOJOINBYADMINISTRATOR;
    public static final GroupNotifyMsgType AGREEDTOJOINDIRECT;
    public static final GroupNotifyMsgType CANCELADMINNOTIFYADMIN;
    public static final GroupNotifyMsgType CANCELADMINNOTIFYCANCELED;
    public static final GroupNotifyMsgType INVITEDBYMEMBER;
    public static final GroupNotifyMsgType INVITEDNEEDADMINISTRATORPASS;
    public static final GroupNotifyMsgType KICKMEMBERNOTIFYADMIN;
    public static final GroupNotifyMsgType KICKMEMBERNOTIFYKICKED;
    public static final GroupNotifyMsgType MEMBERLEAVENOTIFYADMIN;
    public static final GroupNotifyMsgType REFUSEDBYADMINISTRATOR;
    public static final GroupNotifyMsgType REFUSEINVITED;
    public static final GroupNotifyMsgType REQUESTJOINNEEDADMINISTRATORPASS;
    public static final GroupNotifyMsgType SETADMIN;
    public static final GroupNotifyMsgType TRANSFERGROUPNOTIFYADMIN;
    public static final GroupNotifyMsgType TRANSFERGROUPNOTIFYOLDOWNER;
    public static final GroupNotifyMsgType UNSPECIFIED;

    static {
        GroupNotifyMsgType groupNotifyMsgType = new GroupNotifyMsgType("UNSPECIFIED", 0);
        UNSPECIFIED = groupNotifyMsgType;
        GroupNotifyMsgType groupNotifyMsgType2 = new GroupNotifyMsgType("INVITEDBYMEMBER", 1);
        INVITEDBYMEMBER = groupNotifyMsgType2;
        GroupNotifyMsgType groupNotifyMsgType3 = new GroupNotifyMsgType("REFUSEINVITED", 2);
        REFUSEINVITED = groupNotifyMsgType3;
        GroupNotifyMsgType groupNotifyMsgType4 = new GroupNotifyMsgType("REFUSEDBYADMINISTRATOR", 3);
        REFUSEDBYADMINISTRATOR = groupNotifyMsgType4;
        GroupNotifyMsgType groupNotifyMsgType5 = new GroupNotifyMsgType("AGREEDTOJOINDIRECT", 4);
        AGREEDTOJOINDIRECT = groupNotifyMsgType5;
        GroupNotifyMsgType groupNotifyMsgType6 = new GroupNotifyMsgType("INVITEDNEEDADMINISTRATORPASS", 5);
        INVITEDNEEDADMINISTRATORPASS = groupNotifyMsgType6;
        GroupNotifyMsgType groupNotifyMsgType7 = new GroupNotifyMsgType("AGREEDTOJOINBYADMINISTRATOR", 6);
        AGREEDTOJOINBYADMINISTRATOR = groupNotifyMsgType7;
        GroupNotifyMsgType groupNotifyMsgType8 = new GroupNotifyMsgType("REQUESTJOINNEEDADMINISTRATORPASS", 7);
        REQUESTJOINNEEDADMINISTRATORPASS = groupNotifyMsgType8;
        GroupNotifyMsgType groupNotifyMsgType9 = new GroupNotifyMsgType("SETADMIN", 8);
        SETADMIN = groupNotifyMsgType9;
        GroupNotifyMsgType groupNotifyMsgType10 = new GroupNotifyMsgType("KICKMEMBERNOTIFYADMIN", 9);
        KICKMEMBERNOTIFYADMIN = groupNotifyMsgType10;
        GroupNotifyMsgType groupNotifyMsgType11 = new GroupNotifyMsgType("KICKMEMBERNOTIFYKICKED", 10);
        KICKMEMBERNOTIFYKICKED = groupNotifyMsgType11;
        GroupNotifyMsgType groupNotifyMsgType12 = new GroupNotifyMsgType("MEMBERLEAVENOTIFYADMIN", 11);
        MEMBERLEAVENOTIFYADMIN = groupNotifyMsgType12;
        GroupNotifyMsgType groupNotifyMsgType13 = new GroupNotifyMsgType("CANCELADMINNOTIFYCANCELED", 12);
        CANCELADMINNOTIFYCANCELED = groupNotifyMsgType13;
        GroupNotifyMsgType groupNotifyMsgType14 = new GroupNotifyMsgType("CANCELADMINNOTIFYADMIN", 13);
        CANCELADMINNOTIFYADMIN = groupNotifyMsgType14;
        GroupNotifyMsgType groupNotifyMsgType15 = new GroupNotifyMsgType("TRANSFERGROUPNOTIFYOLDOWNER", 14);
        TRANSFERGROUPNOTIFYOLDOWNER = groupNotifyMsgType15;
        GroupNotifyMsgType groupNotifyMsgType16 = new GroupNotifyMsgType("TRANSFERGROUPNOTIFYADMIN", 15);
        TRANSFERGROUPNOTIFYADMIN = groupNotifyMsgType16;
        $VALUES = new GroupNotifyMsgType[]{groupNotifyMsgType, groupNotifyMsgType2, groupNotifyMsgType3, groupNotifyMsgType4, groupNotifyMsgType5, groupNotifyMsgType6, groupNotifyMsgType7, groupNotifyMsgType8, groupNotifyMsgType9, groupNotifyMsgType10, groupNotifyMsgType11, groupNotifyMsgType12, groupNotifyMsgType13, groupNotifyMsgType14, groupNotifyMsgType15, groupNotifyMsgType16};
    }

    GroupNotifyMsgType(String str, int i2) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(88489, (short) 1);
        if (redirector != null) {
            redirector.redirect((short) 1, (Object) this, (Object) str, i2);
        }
    }

    public static GroupNotifyMsgType valueOf(String str) {
        return null;
    }

    public static GroupNotifyMsgType[] values() {
        return (GroupNotifyMsgType[]) $VALUES.clone();
    }
}
