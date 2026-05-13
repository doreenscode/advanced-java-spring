package com.codingnomads.ioc.lab.initial;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.web.service.annotation.GetExchange;

@AllArgsConstructor
@Getter
@Setter
@Builder
public class OperationSystem {
    private String name;
    private String version;

}
