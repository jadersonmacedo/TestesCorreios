package br.com.run;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
	monochrome = true, 
	glue = {"br.com"},
	features = {"./src/main/resources/features/" },
	tags = { "@ID0001" })
public class RunTests {
}