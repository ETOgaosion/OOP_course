package Assignment0;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class redPacket {
    private double moneySum = 0;    // 红包总金额
    private int packetNum = 0;  //红包总数
    private int way = 0;    // 采用何种随机分配算法
    private ArrayList<Double> moneyPackets = new ArrayList<>();
    private String welcome = "----------\nWelcome to a redPacket program!\n-------------\nPlease enter the sum of money\n(double variable, two decimal places are used)\n> ";
    private String inPacketNum = "Now enter the total number of the red packet\n> ";
    private String inWay = "Now enter which random way you want to allocate red packet\n(1 - First come win more principle result, other - Equal way)\n> ";
    private String errorInputMsg = "Check your input please, and re-enter:";

    // 规格化，保留两位小数
    private double normalizeDouble(double inNum, int bits){
        return (double)((int)(inNum * Math.pow(10, bits)))/Math.pow(10, bits);
    }
    // I/O函数进行封装
    private double sysio(String output, int type, int bits){
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.printf(output);
            try{
                if(type == 0){
                    return (double)sc.nextInt();
                }
                else{
                    return normalizeDouble(sc.nextDouble(), bits);
                }
            }
            catch(Exception e){
                System.out.printf(errorInputMsg);
                sc.nextLine();
            }
        }
    }
    // 准备，交互式输入
    private boolean prepare(){
        moneySum = sysio(welcome, 1, 2);
        packetNum = (int)sysio(inPacketNum, 0, 0);
        way = (int)sysio(inWay, 0, 0);
        return true;
    }
    // 分配红包并输出
    private void launch(int way) {
        Random rnd = new Random();
        double tmp = 0.0;
        for(int i = 0; i < packetNum-1; i++){
            if (way == 1){
                tmp = normalizeDouble(rnd.nextDouble() * moneySum, 2);
                // 采取先到多抢原则
            }
            else{
                tmp = normalizeDouble(rnd.nextDouble() * (2 * moneySum/(packetNum - i)), 2);
                // 采取公平原则
                // 红包随机分配算法：使得每个人随机分到的钱数都是当前平均值
            }
            moneyPackets.add(tmp);
            moneySum = normalizeDouble(moneySum - tmp, 2);
        }
        moneyPackets.add(moneySum);
        System.out.println("Here are red packets for each one:");
        if(way == 1){
            System.out.printf("First come win more principle result:");
        }
        else{
            System.out.printf("Equality principle result:");
        }
        System.out.println(moneyPackets);
    }
    public static void main(String[] args) {
        redPacket inMoney = new redPacket();
        while(!inMoney.prepare()){
            ;   // prepare for multi-thread like accelaration methods
        }
        inMoney.launch(inMoney.way);
    }
}