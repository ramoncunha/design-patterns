package org.design.patterns.creational.abstract_factory;

public class LightWidgetFactory implements WidgeFactory {
    @Override
    public Label createLabel() {
        return new LightLabel();
    }

    @Override
    public Button createButton() {
        return new LightButton();
    }
}
