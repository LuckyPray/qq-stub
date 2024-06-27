package com.tencent.qqnt.kernel.nativeinterface;

import java.util.ArrayList;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/RobotRecommendCard.class */
public final class RobotRecommendCard {
    public RobotRecommendCardType cardType = RobotRecommendCardType.values()[0];
    public ArrayList<RobotRecommendCardInfo> cards = new ArrayList<>();

    public RobotRecommendCardType getCardType() {
        return this.cardType;
    }

    public ArrayList<RobotRecommendCardInfo> getCards() {
        return this.cards;
    }

    public String toString() {
        return "RobotRecommendCard{cardType=" + this.cardType + ",cards=" + this.cards + ",}";
    }
}
