package com.baidu.jprotobuf.pbrpc;

import java.util.logging.Logger;

import com.baidu.jprotobuf.pbrpc.registry.RegisterInfo;

/**
 * Created by chengyongchun on 15/9/25.
 */

public class CommonTest {
    private static final Logger LOGGER = Logger.getLogger(CommonTest.class.getName());
    public static void main(String[] args) {
        testIsEqual(); // 测试字符串比较是否相等
    }

    public static void testIsEqual(){
        RegisterInfo registerInfo = new RegisterInfo();
        LOGGER.info(String.valueOf(registerInfo.isEqual(null, "test")));
        LOGGER.info(String.valueOf(registerInfo.isEqual("test1", "test")));
        LOGGER.info(String.valueOf(registerInfo.isEqual("test", "test")));
        LOGGER.info(String.valueOf(registerInfo.isEqual("test", null)));
    }
}
