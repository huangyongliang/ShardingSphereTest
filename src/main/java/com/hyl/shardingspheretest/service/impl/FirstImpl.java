package com.hyl.shardingspheretest.service.impl;

import java.util.Date;
import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hyl.shardingspheretest.dao.intf.ShardingFirstDao;
import com.hyl.shardingspheretest.dao.model.ShardingFirstDo;
import com.hyl.shardingspheretest.service.intf.IFirst;

import lombok.extern.slf4j.Slf4j;

/**
 * @author huangyl25800@yunrong.cn
 * @version V3.0
 * @since 3.0.3 2021-05-19 14:38
 */
@Service
@Slf4j
public class FirstImpl implements IFirst {


    private final static AtomicInteger atomicInteger = new AtomicInteger(0 );
    private final static AtomicInteger tableInteger = new AtomicInteger(0 );
    private final static AtomicInteger dbInteger = new AtomicInteger(0 );

    @Autowired
    private ShardingFirstDao shardingFirstDao;

    @Override
    public String add() {

        ShardingFirstDo shardingFirstDo = new ShardingFirstDo();
        int count = atomicInteger.getAndIncrement();
        if (count%2==0){
            tableInteger.getAndIncrement();
        }else {
            dbInteger.getAndIncrement();
        }

        shardingFirstDo.setIdf(count);
        shardingFirstDo.setAuthor("hyl");
        shardingFirstDo.setColumnId(dbInteger.get());
        shardingFirstDo.setDate(new Date());
        shardingFirstDo.setTitle("test");
        shardingFirstDo.setTitleId(tableInteger.get());

        shardingFirstDao.insert(shardingFirstDo);
        log.info(shardingFirstDo.toString());
        return shardingFirstDo.toString();
    }

    @Override
    public String select(int id) {

        ShardingFirstDo query = shardingFirstDao.query(id);

        log.info(query.toString());

        return query.toString();
    }
}
