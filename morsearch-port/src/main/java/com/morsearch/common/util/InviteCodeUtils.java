package com.morsearch.common.util;

/**
 * 用于生成6位邀请码
 * Created by ywh on 2018-1-22.
 */
public class InviteCodeUtils {

    public static String generateInviteCode(){

        //用字符数组的方式随机
        String randomcode = "";
        String model = "0123456789abcdefghijklmnopqrstuvwxyz";
        char[] m = model.toCharArray();

        for (int j=0;j<6 ;j++ )
        {
            char c = m[(int)(Math.random()*36)];
            randomcode = randomcode + c;
        }

        return  randomcode;
    }

}
