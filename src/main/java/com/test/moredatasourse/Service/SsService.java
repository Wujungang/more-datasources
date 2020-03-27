package com.test.moredatasourse.Service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.test.moredatasourse.bean.Ss;
import com.test.moredatasourse.bean.Tt;

import java.util.List;

public interface SsService extends IService<Ss> {
    List<Ss> info();
}
