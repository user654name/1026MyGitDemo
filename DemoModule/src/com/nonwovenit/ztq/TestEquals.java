package com.nonwovenit.ztq;

import org.junit.Test;

/**
 * Create By ${Tianqi.Zhang}
 */
public class TestEquals{

    /*

    1 在【-128~127】的Integer值
    2 并且以Integer x = value;的方式赋值的Integer值在进行==和equals比较时，
    → 都会返回true，

    因为Java里面对处在在-128~127之间的Integer值，
    用的是原生数据类型int，此时调用的是Integer.valueOf()方法，会在内存里供重用，
    也就是说这之间的Integer值进行==比较时只是进行int原生数据类型的数值比较，
    而超出-128~127的范围，进行==比较时是进行地址及数值比较。


    【==和equals的区别】
    ==是进行地址及值比较，无法对==操作符进行重载，
    而对于equals方法，Integer里面的equals方法重写了Object的equals方法，
    查看Integer源码可以看出equals方法进行的是数值比较。
     */
    @Test
    public void demo1() {

        Integer d1 = 126;
        Integer d2 = 126;
        System.out.println(d1==d2);//true


        Integer b1 = 127;
        Integer b2 = 127;
        System.out.println(b1==b2);//true


        Integer a1 = 128;
        Integer a2 = 128;
        System.out.println(a1==a2);//false


        Integer c1 = 129;
        Integer c2 = 129;
        System.out.println(c1==c2);//false


    }
}
