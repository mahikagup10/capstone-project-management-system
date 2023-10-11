package com.example;

import com.vaadin.flow.component.template.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class Capstone {


    @EqualsAndHashCode.Include
    @Id
    private Integer p_id;
    private String domain;
    private String problem_st;
    private String team_id;
    private String team_no;


}
