package com.sofka.tourFrance.dto;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Data
public class CyclistDto {

    private String id;
    @NotBlank(message = "Please type a cyclist name")
    private String cyclistName;
    @Size(min=3, max=3)
    private String cyclistNumber;
    @NotBlank(message = "Please type a cyclist country")
    private String cyclistCountry;


}
