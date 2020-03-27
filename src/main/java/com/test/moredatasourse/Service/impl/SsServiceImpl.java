package com.test.moredatasourse.Service.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.test.moredatasourse.Service.SsService;
import com.test.moredatasourse.Service.TtService;
import com.test.moredatasourse.bean.Ss;
import com.test.moredatasourse.bean.Tt;
import com.test.moredatasourse.mapper.SsMapper;
import com.test.moredatasourse.mapper.TtMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@DS("mysql")
public class SsServiceImpl extends ServiceImpl<SsMapper, Ss> implements SsService {

    @Autowired
    private SsMapper ssMapper;

    @Override
    public List<Ss> info() {
        List<Ss> sses = ssMapper.selectList(null);
        return sses;
    }
}
