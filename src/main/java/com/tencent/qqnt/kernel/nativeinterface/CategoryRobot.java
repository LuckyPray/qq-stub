package com.tencent.qqnt.kernel.nativeinterface;

import java.util.ArrayList;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/CategoryRobot.class */
public final class CategoryRobot {
    public int categoryId;
    public String categoryName = "";
    public ArrayList<GroupRobot> robots = new ArrayList<>();

    public int getCategoryId() {
        return this.categoryId;
    }

    public String getCategoryName() {
        return this.categoryName;
    }

    public ArrayList<GroupRobot> getRobots() {
        return this.robots;
    }

    public String toString() {
        return "CategoryRobot{categoryId=" + this.categoryId + ",categoryName=" + this.categoryName + ",robots=" + this.robots + ",}";
    }
}
