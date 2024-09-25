package org.design.patterns.creational.abstract_factory;

public class View {

    private final Label label;
    private final Button button;

    public View(WidgeFactory widgeFactory) {
        this.label = widgeFactory.createLabel();
        this.button = widgeFactory.createButton();
    }

    public Label getLabel() {
        return label;
    }

    public Button getButton() {
        return button;
    }
}
