package com.sofka.tourFrance.mapper;

import com.sofka.tourFrance.collections.Cyclist;
import com.sofka.tourFrance.dto.CyclistDto;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.config.EnableWebFlux;

@Component
@EnableWebFlux
public class CyclistMapper {

    private final ModelMapper modelMapper = new ModelMapper();

    public CyclistDto toCyclistDto (Cyclist cyclist){
        return  modelMapper.map(cyclist, CyclistDto.class);
    }

    public Cyclist toCyclistEntity (CyclistDto dto){
        return  modelMapper.map(dto, Cyclist.class);
    }
}
