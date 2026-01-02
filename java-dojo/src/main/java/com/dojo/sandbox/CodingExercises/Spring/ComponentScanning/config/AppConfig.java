package com.dojo.sandbox.CodingExercises.Spring.ComponentScanning.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration // Tells Spring that this class contains bean definitions.
@ComponentScan(basePackages = "com.dojo.sandbox.CodingExercises.Spring.ComponentScanning") // Tells Spring to scan the ...ComponentScanning package (and its sub-packages) for classes marked with Stereotype annotations. 
public class AppConfig {

}