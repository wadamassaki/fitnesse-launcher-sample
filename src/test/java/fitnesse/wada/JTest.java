package fitnesse.wada;

import fitnesse.junit.FitNesseRunner;
import org.junit.runner.RunWith;

@RunWith(FitNesseRunner.class)
@FitNesseRunner.FitnesseDir("target/fitnesse")
@FitNesseRunner.OutputDir("target/fitnesse")
@FitNesseRunner.Suite("SampleTestSuites.CalculatorFitTest")
public class JTest {
}
