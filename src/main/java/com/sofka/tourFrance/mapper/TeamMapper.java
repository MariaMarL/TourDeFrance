package com.sofka.tourFrance.mapper;

import com.sofka.tourFrance.collections.Team;
import com.sofka.tourFrance.dto.TeamDto;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.config.EnableWebFlux;

@Component
@EnableWebFlux
public class TeamMapper {

    private final ModelMapper modelMapper = new ModelMapper();

    private TeamDto toTeamDto (Team team){
        return modelMapper.map(team, TeamDto.class);
    }

    private Team toTeamEntity (TeamDto dto){
        return  modelMapper.map(dto, Team.class);
    }
}
