package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import config.ProjectConfig;
import main.Parrot;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = { ProjectConfig.class })
class AppTests {

    @Autowired
    private ApplicationContext context;

    @Test
    @DisplayName("Show that the parrot1 Parrot bean is named Koko.")
    void testParrot1HasTheNameKoko() {
        Parrot p = context.getBean("parrot1", Parrot.class);

        assertThat(p.getName()).isEqualTo("Koko");
    }

    @Test
    @DisplayName("Show that the parrot2 Parrot bean is named Miki.")
    void testParrot2HasTheNameMiki() {
        Parrot p = context.getBean("parrot2", Parrot.class);

        assertThat(p.getName()).isEqualTo("Miki");
    }

    @Test
    @DisplayName("Show that the parrot3 Parrot bean is named Riki.")
    void testParrot3HasTheNameRiki() {
        Parrot p = context.getBean("parrot3", Parrot.class);

        assertThat(p.getName()).isEqualTo("Riki");
    }
}
