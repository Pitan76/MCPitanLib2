package ml.pkom.mcpitanlib2.api.event;

import dev.architectury.registry.registries.RegistrySupplier;

public class RegistryEvent<T> extends BaseEvent {
    private RegistrySupplier<T> supplier;

    public RegistryEvent(RegistrySupplier<T> registrySupplier) {
        setSupplier(registrySupplier);
    }


    public RegistrySupplier<T> getSupplier() {
        return supplier;
    }

    public void setSupplier(RegistrySupplier<T> supplier) {
        this.supplier = supplier;
    }
}
