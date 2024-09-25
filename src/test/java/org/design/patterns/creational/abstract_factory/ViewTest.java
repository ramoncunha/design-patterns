package org.design.patterns.creational.abstract_factory;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ViewTest {

    @Test
    void view_deveCriarTemaLight() {
        WidgeFactory widgeFactory = new LightWidgetFactory();
        View actual = new View(widgeFactory);
        Assertions.assertEquals("black", actual.getLabel().color);
        Assertions.assertEquals("white", actual.getButton().color);
        Assertions.assertEquals("blue", actual.getButton().backgroundColor);
    }

    @Test
    void view_deveCriarTemaDark() {
        WidgeFactory widgeFactory = new DarkWidgetFactory();
        View actual = new View(widgeFactory);
        Assertions.assertEquals("white", actual.getLabel().color);
        Assertions.assertEquals("white", actual.getButton().color);
        Assertions.assertEquals("black", actual.getButton().backgroundColor);
    }
}
