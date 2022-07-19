package com.sofka.tourFrance.dto;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.List;

@Data
public class TeamDto {

    private String id;
    @NotBlank(message = "It can't be a blank team name")
    private String teamName;
    @Size(min=3, max=3)
    private String codTeam;
    @NotBlank(message = "It can't be a blank country")
    private String country;
    @Size(max=8)
    private List<String> cyclistId;
}
