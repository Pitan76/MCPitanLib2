package ml.pkom.mcpitanlib2.api.util;

import com.google.gson.JsonObject;
import net.minecraft.util.Identifier;

import java.util.HashMap;
import java.util.Map;

public class RecipeManageHelper {
    private static Map<Identifier, JsonObject> recipes = new HashMap();

    public static Map<Identifier, JsonObject> getRecipes() {
        return recipes;
    }

    public static void addRecipe(Identifier id, JsonObject recipe) {
        getRecipes().put(id, recipe);
    }
}