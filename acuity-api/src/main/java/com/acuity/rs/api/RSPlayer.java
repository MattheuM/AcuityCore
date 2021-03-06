package com.acuity.rs.api;


//Generated by the injector on run.

//Extends com/acuity/rs/api/RSActor
public interface RSPlayer extends RSActor {

	java.lang.String[] getActions();

	com.acuity.rs.api.RSPlayerType getAppearance();

	int getCombatLevel();

	java.lang.String getName();

	int getPrayerIcon();

	int getSkullIcon();

	int getTeam();

	int getTotalLevel();

	com.acuity.rs.api.RSModel getTransformedNpcModel();

	com.acuity.api.rs.wrappers.peers.scene.actors.impl.Player getWrapper();

	boolean isHidden();

	void setActions(java.lang.String[] var0);

	void setAppearance(com.acuity.rs.api.RSPlayerType var0);

	void setCombatLevel(int var0);

	void setHidden(boolean var0);

	void setName(java.lang.String var0);

	void setPrayerIcon(int var0);

	void setSkullIcon(int var0);

	void setTeam(int var0);

	void setTotalLevel(int var0);

	void setTransformedNpcModel(com.acuity.rs.api.RSModel var0);

	void setWrapper(com.acuity.api.rs.wrappers.peers.scene.actors.impl.Player var0);
}
