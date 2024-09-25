package org.design.patterns.creational.abstract_factory;

public class DarkWidgetFactory implements WidgeFactory {

    @Override
    public Label createLabel() {
        return new DarkLabel();
    }

    @Override
    public Button createButton() {
        return new DarkButton();
    }
}
