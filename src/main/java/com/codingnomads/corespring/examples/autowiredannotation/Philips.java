package com.codingnomads.corespring.examples.autowiredannotation;

import lombok.ToString;
import org.springframework.stereotype.Component;

@Component("philips")
@ToString
public class Philips implements Monitor {
}
