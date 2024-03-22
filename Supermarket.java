package com.runjian.parking.adapter.utils;

public class Supermarket {
    // 假设苹果、草莓和芒果的单价分别设定为每斤的具体金额，您可以根据实际情况修改。
    private static final double PRICE_APPLE_PER_POUND = 8.0;  // 假设苹果的单价是 8.0/斤
    private static final double PRICE_STRAWBERRY_PER_POUND = 13.0; // 假设草莓的单价是 13.0/斤
    private static final double PRICE_MANGO_PER_POUND = 20.0; // 假设芒果的单价是 20.0/斤
    private static final double DISCOUNT_STRAWBERRY = 0.8; // 草莓的折扣是 0.8
    private static final double DISCOUNT_THRESHOLD = 100.0;     // 满减门槛
    private static final double DISCOUNT_AMOUNT = 10.0;         // 满减金额

    public static void main(String[] args) {
        // 顾客C购买水果的斤数，假设为苹果3斤、草莓3斤和芒果3斤
        int poundsApples = 2;
        int poundsStrawberries = 3;
        int poundsMangoes = 3;

        double totalCost = calculateTotalCost(poundsApples, poundsStrawberries, poundsMangoes);
        System.out.println("顾客C的总花费是: " + totalCost + "元");
    }
    // 计算总价的函数
    public static double calculateTotalCost(int poundsApples, int poundsStrawberries, int poundsMangoes) {
        double costApples = poundsApples * PRICE_APPLE_PER_POUND;
        double costStrawberries = poundsStrawberries * PRICE_STRAWBERRY_PER_POUND * DISCOUNT_STRAWBERRY;
        double costMangoes = poundsMangoes * PRICE_MANGO_PER_POUND;
        // 计算总价
        double totalCost = costApples + costStrawberries + costMangoes;
        // 如果满足满减条件，则减去满减金额
        if (totalCost >= DISCOUNT_THRESHOLD) {
            totalCost -= DISCOUNT_AMOUNT;
        }
        return totalCost;
    }
}
