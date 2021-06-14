package ie.lyit.app.cucumber;

import ie.lyit.app.SmallwindowApp;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.web.WebAppConfiguration;

@CucumberContextConfiguration
@SpringBootTest(classes = SmallwindowApp.class)
@WebAppConfiguration
public class CucumberTestContextConfiguration {}
