package com.codingnomads.corespring.examples.springbeans;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Team {
    private String department;

    public Team(String department) {
        this.department = department;
    }
}
