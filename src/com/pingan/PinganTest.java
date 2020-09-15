/*******************************************************************************
 * Project Key : DATAPLATFORM
 * Create on 2020年9月10日 下午17:30:36
 * Copyright (c) 2015 - 2020. 平安科技公司版权所有.
 * 注意：本内容仅限于平安科技公司内部传阅，禁止外泄以及用于其他的商业目的
 ******************************************************************************/
package com.pingan;

/**
 * <P>实现类</P>
 * 要求在命令行里输入0或1，输出A或B或C
 * 程序不管跑多少遍，最后出A或者B或者C的总次数概率是相同的
 * @author niezhili 2020年9月10日 下午17:30:36
 * @since 1.0.0.000
 */
public class PinganTest {

    public static void main(String[] args)
    {
        String input = args[0];
        System.out.println("输入为：" + input);
        //如果输入不为0或1,程序给出提示
        if((!input.equals("0")) &&(!input.equals("1"))) {
            System.out.println("请输入0或1!");
        }
        else
        {
            System.out.println("输出为:" + getNumber(Integer.parseInt(input)) );
        }

    }

    /**
     * 返回输出
     * @param i 输入
     * @return 输出
     */
    private static String getNumber(int i) {
        String output = "";
        double d = Math.random();//生成一个0~1的随机数
        System.out.println("生成的随机数为"  + d);
        if(d<=0.33) {
            output = "A";
        }
        else if(d<=0.67){
            output = "B";
        }
        else
        {
            output = "C";
        }
        return output;
    }

}
