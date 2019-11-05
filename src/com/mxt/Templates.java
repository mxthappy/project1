/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: Templates
 * Author:   27259
 * Date:     2019/11/5 16:04
 * Description: Test
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.mxt;

import java.util.ArrayList;

/**
 * 〈一句话功能简述〉<br> 
 * 〈Test〉
 *
 * @author 27259
 * @create 2019/11/5
 * @since 1.0.0
 */
public class Templates {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(123);
        list.add(234);
        list.add(345);
        list.add(456);
        list.add(567);
        for (Integer integer : list) {
            System.out.println(integer);
        }

        System.out.println();

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        System.out.println();

        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.println(list.get(i));
        }
    }
}
