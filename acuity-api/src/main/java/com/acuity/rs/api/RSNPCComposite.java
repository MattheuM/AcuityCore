package com.acuity.rs.api;

import java.lang.String;
import com.acuity.api.rs.wrappers.peers.composite.NpcComposite;

//Generated by the injector on run.

//Extends: RSCacheableNode
public interface RSNPCComposite extends RSCacheableNode {

    String[] getActions();

    int getCombatLevel();

    int getId();

    int[] getModels();

    String getName();

    int[] getTransformIds();

    int getVarpbitIndex();

    int getVarpIndex();

    NpcComposite getWrapper();

    boolean isClickable();

    boolean isMinimapVisible();

    boolean isVisible();
}
