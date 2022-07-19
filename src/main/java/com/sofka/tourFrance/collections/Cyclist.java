package com.sofka.tourFrance.collections;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Data
@Document(collection = "cyclist")
public class Cyclist {

    @Id
    private String id;
    private String cyclistName;
    private String cyclistNumber;
    private String cyclistCountry;
}
