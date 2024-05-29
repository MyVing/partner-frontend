package com.ving.partner.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ving.partner.model.domain.UserTeam;
import com.ving.partner.service.UserTeamService;
import com.ving.partner.mapper.UserTeamMapper;
import org.springframework.stereotype.Service;

/**
* @author ving
* @description 针对表【user_team(用户队伍关系)】的数据库操作Service实现
* @createDate 2024-05-19 11:43:02
*/
@Service
public class UserTeamServiceImpl extends ServiceImpl<UserTeamMapper, UserTeam>
    implements UserTeamService{

}




