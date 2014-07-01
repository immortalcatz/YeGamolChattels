/***************************************************************************************************
 * Copyright (c) 2014, Lukas Tenbrink.
 * http://lukas.axxim.net
 **************************************************************************************************/

// Date: 29-3-2013 21:18:15
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX

package ivorius.yegamolchattels.client.rendering;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelWeaponRackDetailBonemeal extends ModelBase
{
    //fields
    ModelRenderer plant1;
    ModelRenderer plant2;
    ModelRenderer ground;
    ModelRenderer grass1;
    ModelRenderer plant3;
    ModelRenderer grass2;
    ModelRenderer grass3;

    public ModelWeaponRackDetailBonemeal()
    {
        textureWidth = 64;
        textureHeight = 32;

        plant1 = new ModelRenderer(this, 0, 17);
        plant1.addBox(-0.1F, 0F, -0.1F, 3, 7, 3);
        plant1.setRotationPoint(-7F, 17F, -5F);
        plant1.setTextureSize(64, 32);
        plant1.mirror = true;
        setRotation(plant1, 0F, 0F, 0F);
        plant2 = new ModelRenderer(this, 13, 17);
        plant2.addBox(-0.7F, 0F, -0.7F, 3, 4, 3);
        plant2.setRotationPoint(-7F, 13.5F, -5F);
        plant2.setTextureSize(64, 32);
        plant2.mirror = true;
        setRotation(plant2, 0.1487144F, 0F, -0.1487144F);
        ground = new ModelRenderer(this, 0, 0);
        ground.addBox(-8F, -0.1F, -8F, 16, 0, 16);
        ground.setRotationPoint(0F, 24F, 0F);
        ground.setTextureSize(64, 32);
        ground.mirror = true;
        setRotation(ground, 0F, 0F, 0F);
        grass1 = new ModelRenderer(this, 54, 17);
        grass1.addBox(0F, -4F, 0F, 2, 4, 3);
        grass1.setRotationPoint(5F, 24F, 2F);
        grass1.setTextureSize(64, 32);
        grass1.mirror = true;
        setRotation(grass1, 0F, 0.2974289F, 0.1858931F);
        plant3 = new ModelRenderer(this, 26, 17);
        plant3.addBox(-0.1F, -6F, 0F, 0, 6, 5);
        plant3.setRotationPoint(-7F, 17F, -5F);
        plant3.setTextureSize(64, 32);
        plant3.mirror = true;
        setRotation(plant3, 0F, 0F, -0.0743572F);
        grass2 = new ModelRenderer(this, 52, 25);
        grass2.addBox(0F, -3F, 0F, 4, 3, 2);
        grass2.setRotationPoint(-4F, 24.2F, -4F);
        grass2.setTextureSize(64, 32);
        grass2.mirror = true;
        setRotation(grass2, 0.1858931F, 0.2230717F, 0F);
        grass3 = new ModelRenderer(this, 41, 17);
        grass3.addBox(0F, -3F, 0F, 4, 3, 2);
        grass3.setRotationPoint(-4F, 24F, 1F);
        grass3.setTextureSize(64, 32);
        grass3.mirror = true;
        setRotation(grass3, 0F, -0.5576792F, 0.0743572F);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
    {
        super.render(entity, f, f1, f2, f3, f4, f5);
        setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        plant1.render(f5);
        plant2.render(f5);
        ground.render(f5);
        grass1.render(f5);
        plant3.render(f5);
        grass2.render(f5);
        grass3.render(f5);
    }

    private void setRotation(ModelRenderer model, float x, float y, float z)
    {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }
}
