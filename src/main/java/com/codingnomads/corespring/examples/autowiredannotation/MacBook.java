package com.codingnomads.corespring.examples.autowiredannotation;

import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@ToString
public class MacBook {

    @Autowired
    @Qualifier("nvidia") private VideoCard videoCard;
    @Autowired
    @Qualifier("philips") private Monitor monitor;
}
