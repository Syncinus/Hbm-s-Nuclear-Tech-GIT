// Date: 14.08.2018 11:02:47
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX






package net.minecraft.src;

public class ModelModelRadio extends ModelBase
{
  //fields
    ModelRenderer Box;
    ModelRenderer Plate;
    ModelRenderer Lever;
  
  public ModelModelRadio()
  {
    textureWidth = 32;
    textureHeight = 32;
    
      Box = new ModelRenderer(this, 0, 0);
      Box.addBox(0F, 0F, 0F, 8, 14, 4);
      Box.setRotationPoint(-4F, 9F, -12F);
      Box.setTextureSize(32, 32);
      Box.mirror = true;
      setRotation(Box, 0F, 0F, 0F);
      Plate = new ModelRenderer(this, 0, 18);
      Plate.addBox(0F, 0F, 0F, 7, 13, 1);
      Plate.setRotationPoint(-3.5F, 9.5F, -12.5F);
      Plate.setTextureSize(32, 32);
      Plate.mirror = true;
      setRotation(Plate, 0F, 0F, 0F);
      Lever = new ModelRenderer(this, 16, 18);
      Lever.addBox(0F, -1F, -1F, 2, 8, 2);
      Lever.setRotationPoint(4F, 16F, -10F);
      Lever.setTextureSize(32, 32);
      Lever.mirror = true;
      setRotation(Lever, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    Box.render(f5);
    Plate.render(f5);
    Lever.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity)
  {
    super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
  }

}