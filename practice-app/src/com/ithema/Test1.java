package com.ithema;

import java.util.Scanner;

/*
* 需求：机票分淡季、旺季（5-10月），头等舱、经济舱，输入票价，月份，舱位，输出价格
*       旺季：头等舱9折，经济舱8.5折
*       淡季：     7        6.5
* */
public class Test1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("机票价格");
        double price= sc.nextDouble();
        System.out.println("月份");
        int month= sc.nextInt();
        System.out.println("舱位");
        String type=sc.next();
        double rt =calc(price,month,type);
        System.out.println("价格是"+rt);

    }
    /*1.定义个方法，形参（价格，月份，舱位） 返回值类型：double，有小数*/
    public static double calc(double money,int month,String type) {
        /*2.判断月份*/
        if (month >= 5 & month <= 10) {/*短路与 逻辑与都可以 短路更好*/
            /*旺季*/
            switch (type) {
                case "经济舱":
                    money *= 0.85;
                    break;
                case "头等舱":
                    money *= 0.9;
                    break;
                default:
                    money = -1;
                    System.out.println("输入有误！");
            }
        }
        else if (month == 11 | month == 12 | month >= 1 & month <= 4) {/*逻辑或 短路或都可以 短路的更好*/
            /*淡季*/
            switch (type) {
                case "经济舱":
                    money *= 0.65;
                    break;
                case "头等舱":
                    money *= 0.7;
                    break;
                default:
                    money = -1;
                    System.out.println("输入有误！");
            }

        }
        else {
            money=-1;
            System.out.println("输入有误");
        }
        return money;
    }
}