package com.acuity.rs.api;


//Generated by the injector on run.

public interface RSConnection extends java.lang.Runnable {

	void invokeQueueForWrite(byte[] var0, int var1, int var2, int var3);

	int invokeReadByte(int var0);

	void invokeReadInto(byte[] var0, int var1, int var2, int var3);
}