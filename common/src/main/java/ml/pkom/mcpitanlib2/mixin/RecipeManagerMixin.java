package ml.pkom.mcpitanlib2.mixin;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import ml.pkom.mcpitanlib2.api.util.RecipeManageHelper;
import net.minecraft.recipe.RecipeManager;
import net.minecraft.resource.ResourceManager;
import net.minecraft.util.Identifier;
import net.minecraft.util.profiler.Profiler;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.Map;

@Mixin(RecipeManager.class)
public class RecipeManagerMixin {

    @Inject(method = "apply*", at = @At("HEAD"))
    public void interceptApply(Map<Identifier, JsonElement> map, ResourceManager resourceManager, Profiler profiler, CallbackInfo info) {
        for (Map.Entry<Identifier, JsonObject> recipe : RecipeManageHelper.getRecipes().entrySet()) {
            if (recipe == null) continue;
            map.put(recipe.getKey(), recipe.getValue());
        }
    }
}