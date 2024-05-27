package com.ving.partner.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ving.partner.model.domain.Tag;
import com.ving.partner.service.TagService;
import com.ving.partner.mapper.TagMapper;
import org.springframework.stereotype.Service;

/**
* @author huawei
* @description 针对表【tag(标签)】的数据库操作Service实现
* @createDate 2024-05-05 23:57:13
*/
@Service
public class TagServiceImpl extends ServiceImpl<TagMapper, Tag>
    implements TagService{

}




