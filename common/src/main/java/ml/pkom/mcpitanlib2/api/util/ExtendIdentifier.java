package ml.pkom.mcpitanlib2.api.util;

public class ExtendIdentifier {
    private net.minecraft.util.Identifier identifier;

    public ExtendIdentifier(net.minecraft.util.Identifier identifier) {
        setIdentifier(identifier);
    }

    public ExtendIdentifier(String id) {
        setIdentifier(new net.minecraft.util.Identifier(id));
    }

    public ExtendIdentifier(String namespace, String path) {
        setIdentifier(new net.minecraft.util.Identifier(namespace, path));
    }

    public String getNamespace() {
        return getIdentifier().getNamespace();
    }

    public String getPath() {
        return getIdentifier().getPath();
    }

    public String toString() {
        return getNamespace() + ":" + getPath();
    }

    public net.minecraft.util.Identifier getIdentifier() {
        return identifier;
    }

    public void setIdentifier(net.minecraft.util.Identifier identifier) {
        this.identifier = identifier;
    }
}
