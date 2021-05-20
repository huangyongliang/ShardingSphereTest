package com.hyl.shardingspheretest.dao;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.hyl.shardingspheretest.base.AbstractBaseTest;
import com.hyl.shardingspheretest.dao.intf.ShardingFirstDao;
import com.hyl.shardingspheretest.dao.model.ShardingFirstDo;

import lombok.extern.slf4j.Slf4j;

/**
 * @author huangyl25800@yunrong.cn
 * @version V3.0
 * @since 3.0.3 2021-05-19 13:59
 */
@Slf4j
public class ShardingFirstDaoTest extends AbstractBaseTest {

    @Autowired
    private ShardingFirstDao shardingFirstDao;

    @Test
    public void test(){
        ShardingFirstDo shardingFirstDo = new ShardingFirstDo();


        shardingFirstDao.insert(shardingFirstDo);

        ShardingFirstDo query = shardingFirstDao.query(1);

        log.info(query.toString());

    }

}
