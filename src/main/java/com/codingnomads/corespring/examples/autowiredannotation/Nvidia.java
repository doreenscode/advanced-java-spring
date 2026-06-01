package com.codingnomads.corespring.examples.autowiredannotation;

import lombok.ToString;
import org.springframework.stereotype.Component;

@Component("nvidia")
@ToString
public class Nvidia implements VideoCard {}
