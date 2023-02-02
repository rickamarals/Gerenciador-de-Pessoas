package com.api.peoplecontrol.dto;


import com.api.peoplecontrol.entity.Pessoa;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class CadastroDTO {
    private Pessoa pessoa;
}
