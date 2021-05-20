package com.hyl.shardingspheretest.dao.intf;

import com.hyl.shardingspheretest.dao.model.ShardingFirstDo;

/**
 * @author huangyl25800@yunrong.cn
 * @version V3.0
 * @since 3.0.3 2021-05-19 13:53
 */
public interface ShardingFirstDao {
    /**
     * 添加
     *
     * @param shardingFirstDo
     */
    void insert(ShardingFirstDo shardingFirstDo);

    /**
     * 查询
     * @param idf
     * @return
     */
    ShardingFirstDo query(int idf);

}
