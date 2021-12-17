package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import org.assertj.core.api.Assertions;

import config.ProjectConfig;
import main.Parrot;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = { ProjectConfig.class })
class Chapter2Example1Test {

    @Test
    @DisplayName("Test that Parrot instance named parrot1 has the name Riki.")
    void parrotTest() {
        var context = new AnnotationConfigApplicationContext();

        Parrot p = new Parrot();

        p.setName("Riki");

        System.out.println(p.getName());

        assertThat(p.getName()).isEqualTo("Riki");
    }

    @Test
    void soutTest() {
        System.out.println("XXXXXXXXXXXXXXXXXXXXXX");
        System.out.println("XXXXXXXXXXXXXXXXXXXXXX");
        System.out.println("XXXXXXXXXXXXXXXXXXXXXX");

        assertThat(true).isTrue();
    }
}
