package com.sofka.tourFrance.collections;

import lombok.Data;
import org.hibernate.validator.constraints.UniqueElements;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.List;

@Data
@Document(collection = "team")
public class Team {

    @Id
    private String id;
    private String teamName;
    private String codTeam;
    private String country;
    private List<String> cyclistId;

}
