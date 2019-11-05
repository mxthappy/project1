/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: DeBugTest
 * Author:   27259
 * Date:     2019/11/5 18:11
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.mxt;

import java.util.HashMap;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author 27259
 * @create 2019/11/5
 * @since 1.0.0
 */
public class DeBugTest {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("name", "MXT");
        map.put("age", "26");
        map.put("school", "UESTC");
        map.put("major", "MATH");
        map.put("nationality", "Chinese");

        String name = map.get("name");
        System.out.println("name = " + name);

        map.remove("major");
        System.out.println(map);

    }
}