package com.acuity.rs.api;


//Generated by the injector on run.

public interface RSItemComposite extends RSCacheableNode {

	int getAmbient();

	short[] getColourToReplace();

	short[] getColourToReplaceWith();

	int getContrast();

	int[] getCountCo();

	int[] getCountObj();

	int getFemaleHeadModel();

	int getFemaleHeadModel2();

	int getFemaleModel();

	int getFemaleModel1();

	int getFemaleModel2();

	int getFemaleOffset();

	java.lang.String[] getGroundActions();

	int getId();

	java.lang.String[] getInventoryActions();

	int getInventoryModel();

	int getMaleHeadModel();

	int getMaleHeadModel2();

	int getMaleModel();

	int getMaleModel1();

	int getMaleModel2();

	int getMaleOffset();

	java.lang.String getName();

	int getNote();

	int getNotedTemplate();

	int getOffsetX2d();

	int getOffsetY2d();

	int getPrice();

	com.acuity.rs.api.RS3CopiedNodeTable getProperties();

	int getResizeX();

	int getResizeY();

	int getResizeZ();

	int getTeam();

	short[] getTextToReplaceWith();

	short[] getTextureToReplace();

	com.acuity.api.rs.wrappers.peers.composite.ItemComposite getWrapper();

	int getXan2d();

	int getYan2d();

	int getZan2d();

	int getZoom2d();

	boolean invokeGetEquipmentModel(boolean var0, byte var1);

	com.acuity.rs.api.RSModel invokeGetModel(int var0, int var1);

	com.acuity.rs.api.RSModelComposite invokeGetWornModelData(boolean var0, byte var1);

	void invokeLoadBuffer(com.acuity.rs.api.RSBuffer var0, int var1);

	void invokePopulateFromBuffer(com.acuity.rs.api.RSBuffer var0, int var1, int var2);

	boolean isMembers();

	int isStackable();

	void setAmbient(int var0);

	void setColourToReplace(short[] var0);

	void setColourToReplaceWith(short[] var0);

	void setContrast(int var0);

	void setCountCo(int[] var0);

	void setCountObj(int[] var0);

	void setFemaleHeadModel(int var0);

	void setFemaleHeadModel2(int var0);

	void setFemaleModel(int var0);

	void setFemaleModel1(int var0);

	void setFemaleModel2(int var0);

	void setFemaleOffset(int var0);

	void setGroundActions(java.lang.String[] var0);

	void setId(int var0);

	void setInventoryActions(java.lang.String[] var0);

	void setInventoryModel(int var0);

	void setIsStackable(int var0);

	void setMaleHeadModel(int var0);

	void setMaleHeadModel2(int var0);

	void setMaleModel(int var0);

	void setMaleModel1(int var0);

	void setMaleModel2(int var0);

	void setMaleOffset(int var0);

	void setMembers(boolean var0);

	void setName(java.lang.String var0);

	void setNote(int var0);

	void setNotedTemplate(int var0);

	void setOffsetX2d(int var0);

	void setOffsetY2d(int var0);

	void setPrice(int var0);

	void setProperties(com.acuity.rs.api.RS3CopiedNodeTable var0);

	void setResizeX(int var0);

	void setResizeY(int var0);

	void setResizeZ(int var0);

	void setTeam(int var0);

	void setTextToReplaceWith(short[] var0);

	void setTextureToReplace(short[] var0);

	void setWrapper(com.acuity.api.rs.wrappers.peers.composite.ItemComposite var0);

	void setXan2d(int var0);

	void setYan2d(int var0);

	void setZan2d(int var0);

	void setZoom2d(int var0);
}
