package com.codingnomads.corespring.examples.autowiredannotation;

import lombok.ToString;
import org.springframework.stereotype.Component;

@Component("lg")
@ToString
public class LG implements Monitor {

}
