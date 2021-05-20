package com.hyl.shardingspheretest.dao;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.hyl.shardingspheretest.base.AbstractBaseTest;
import com.hyl.shardingspheretest.service.intf.IFirst;

/**
 * @author huangyl25800@yunrong.cn
 * @version V3.0
 * @since 3.0.3 2021-05-19 14:42
 */
public class FirstTest extends AbstractBaseTest {

    @Autowired
    private IFirst first;

    @Test
    public void test(){
        first.add();
    }

}
