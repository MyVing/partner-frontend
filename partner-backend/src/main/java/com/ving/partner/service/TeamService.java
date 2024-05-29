package com.ving.partner.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ving.partner.model.domain.Team;
import com.ving.partner.model.dto.TeamQuery;
import com.ving.partner.model.request.TeamJoinRequest;
import com.ving.partner.model.request.TeamQuitRequest;
import com.ving.partner.model.request.TeamUpdateRequest;
import com.ving.partner.model.vo.TeamUserVO;


import java.util.List;

/**
* @author 86157
* @description 针对表【team(队伍)】的数据库操作Service
* @createDate 2024-01-11 14:52:00
*/
public interface TeamService extends IService<Team> {

    Long addTeam(Team team);

    List<TeamUserVO> listTeams(TeamQuery teamQuery);

    boolean updateTeam(TeamUpdateRequest teamUpdateRequest);

    boolean joinTeam(TeamJoinRequest teamJoinRequest);

    boolean quitTeam(TeamQuitRequest teamQuitRequest);

    boolean deleteTeam(long id);
}
