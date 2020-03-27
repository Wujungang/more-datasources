package com.test.moredatasourse.Service.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.test.moredatasourse.Service.TtService;
import com.test.moredatasourse.bean.Tt;
import com.test.moredatasourse.mapper.SsMapper;
import com.test.moredatasourse.mapper.TtMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@DS("slave_1")
public class TtServiceImpl extends ServiceImpl<TtMapper, Tt> implements TtService {

    @Autowired
    private TtMapper ttMapper;

    @Override
    public List<Tt> info() {
        List<Tt> tts = ttMapper.selectList(null);
        return tts;

    }
}
