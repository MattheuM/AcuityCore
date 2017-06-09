package com.acuity.api.peers.mobile;

import com.acuity.rs.api.RSNPC;
import com.acuity.rs.api.RSNPCComposite;
import com.google.common.base.Preconditions;
import com.sun.istack.internal.NotNull;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by Eclipseop.
 * Date: 6/8/2017.
 */
public class Npc extends Actor {

	private RSNPC rsNpc;

	public Npc(@NotNull RSNPC peer) {
		super(peer);
        Preconditions.checkNotNull(peer);
        this.rsNpc = peer;
	}

	@Override
	public String getName() {
		final RSNPCComposite definition = getDefinition();
		if (definition == null) {
			return "";
		}
		return definition.getName();
	}

	@Override
	public int getId() {
		final RSNPCComposite definition = getDefinition();
		if (definition == null) {
			return -1;
		}
		return definition.getId();
	}

	@Override
	public List<String> getActions() {
		final RSNPCComposite definition = getDefinition();
		if (definition == null) {
			return Collections.EMPTY_LIST;
		}

		return Arrays.asList(definition.getActions());
	}

	public RSNPCComposite getDefinition() {
		return getDefinition(); // TODO: 6/8/2017 add transform
	}
}