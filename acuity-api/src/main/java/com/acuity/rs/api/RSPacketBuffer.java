package com.acuity.rs.api;


//Generated by the injector on run.

public interface RSPacketBuffer extends RSBuffer {

	int getBitOffset();

	com.acuity.rs.api.RSISAACCipher getCipher();

	int invokeReadOpcode(int var0);

	void invokeSeed(int[] var0, int var1);

	void invokeWriteHeader(int var0, int var1);

	void setBitOffset(int var0);

	void setCipher(com.acuity.rs.api.RSISAACCipher var0);
}
