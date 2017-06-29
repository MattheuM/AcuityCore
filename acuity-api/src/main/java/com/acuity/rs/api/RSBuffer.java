package com.acuity.rs.api;


//Generated by the injector on run.

public interface RSBuffer extends RSNode {

	int getOffset();

	byte[] getPayload();

	void invokeDecryptXtea(int[] var0, byte var1);

	void invokeEncryptXtea(int[] var0, int var1, int var2, int var3);

	void invokeEncryptXtea2(int[] var0, int var1);

	void invokePut24bitInt(int var0, int var1);

	void invokePutByte(int var0, byte var1);

	void invokePutBytes(byte[] var0, int var1, int var2, int var3);

	void invokePutInt(int var0, byte var1);

	void invokePutLong(long var0);

	void invokePutShort(int var0, int var1);

	void invokePutVarInt(int var0, int var1);

	int invokeRead24BitInt(short var0);

	byte invokeReadByte(int var0);

	void invokeReadBytes(byte[] var0, int var1, int var2, int var3);

	int invokeReadInt(int var0);

	long invokeReadLong(int var0);

	int invokeReadShort(int var0);

	int invokeReadShortSmart(byte var0);

	java.lang.String invokeReadString(byte var0);

	int invokeReadUnsignedByte(int var0);

	int invokeReadUnsignedShort(short var0);

	int invokeReadVarInt(int var0);

	void setOffset(int var0);

	void setPayload(byte[] var0);
}
