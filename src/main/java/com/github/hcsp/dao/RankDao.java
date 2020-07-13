package com.github.hcsp.dao;

import com.github.hcsp.entity.SellRankItem;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RankDao {
    @Autowired
    private SqlSession sqlSession;

    public List<SellRankItem> getSellRank (){
        return sqlSession.selectList("MyMapper.selectPrice");
    }
}
