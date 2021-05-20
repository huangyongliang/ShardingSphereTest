package com.hyl.shardingspheretest.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hyl.shardingspheretest.dao.example.ShardingFirstDoExample;
import com.hyl.shardingspheretest.dao.intf.ShardingFirstDao;
import com.hyl.shardingspheretest.dao.mapper.ShardingFirstDoMapper;
import com.hyl.shardingspheretest.dao.model.ShardingFirstDo;

/**
 * @author huangyl25800@yunrong.cn
 * @version V3.0
 * @since 3.0.3 2021-05-19 13:55
 */
@Repository
public class ShardingFirstDaoImpl implements ShardingFirstDao {

    @Autowired
    private ShardingFirstDoMapper shardingFirstDoMapper;

    @Override
    public void insert(ShardingFirstDo shardingFirstDo) {
        shardingFirstDoMapper.insert(shardingFirstDo);
    }

    @Override
    public ShardingFirstDo query(int idf) {
        ShardingFirstDoExample example = new ShardingFirstDoExample();
        ShardingFirstDoExample.Criteria criteria = example.createCriteria();
        criteria.andIdfEqualTo(idf);

        List<ShardingFirstDo> shardingFirstDos = shardingFirstDoMapper.selectByExample(example);

        if (shardingFirstDos!=null && !shardingFirstDos.isEmpty()){
            return shardingFirstDos.get(0);
        }
        return null;
    }
}
