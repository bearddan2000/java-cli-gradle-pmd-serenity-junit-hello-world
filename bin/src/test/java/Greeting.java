import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.steps.UIInteractionSteps;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(SerenityJUnit5Extension.class)
public class Greeting {

  @Test
  public void getMessage() {
    String test = example.Greeting.greeting("Steve");
    String expected = "Hello World, Steve";
    Serenity.reportThat("greeting",
            () -> assertThat(test).contains(expected)
    );
  }
}
