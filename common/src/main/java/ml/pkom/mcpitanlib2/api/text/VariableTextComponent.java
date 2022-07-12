package ml.pkom.mcpitanlib2.api.text;

import ml.pkom.mcpitanlib2.api.util.TextUtil;

// 可変TextComponent
public class VariableTextComponent extends TextComponent {

    public VariableTextComponent(TextComponent textComponent) {
        setText(textComponent.getText());
    }

    public void append(String string) {
        setText(TextUtil.literal(getString() + string));
    }

    public void addLine(String string) {
        setText(TextUtil.literal(getString() + "\n" + string));
    }
}
