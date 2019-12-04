/*
 * Java
 *
 * Copyright 2019 Landis+Gyr. All rights reserved.
 * Landis+Gyr PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.landisgyr.MeterSample;

import java.io.IOException;

import com.landisgyr.lgap.simple.meter.Meter;

import ej.wadapps.app.BackgroundService;

/**
 *
 */
public class MeterSample implements BackgroundService {

	/**
	 * Main thread.
	 */
	private class mainThreadClass extends Thread {

		/**
		 * Run.
		 */
		@Override
		public void run() {
			try {
				main(null);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	/**
	 * Main thread instance.
	 */
	private mainThreadClass mainThread;

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		System.out.println("MeterSample.main()");

		int InstantPowerWatts;

		// Attempt to log current value of INSTANT_POWER_WATTS field
		try {
			InstantPowerWatts = getInstantPower_Watts();
			System.out.println("Instant Watts: " + InstantPowerWatts + " W");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void onStart() {
		System.out.println("MeterSample.onStart()");
		this.mainThread = new mainThreadClass();
		this.mainThread.start();
	}

	@Override
	public void onStop() {
		System.out.println("MeterSample.onStop()");
	}

	/**
	 * Gets the instant power (in watts) from the connected meter
	 *
	 * @return the instant power (in watts)
	 * @throws IOException
	 *             Signals that an I/O exception has occurred.
	 */
	private static int getInstantPower_Watts() throws IOException {
		// MFG Table 13 - Gyrbox Data and Instantaneous Measurements
		final int tableIdentifier = 0x80D;
		// Offset for INSTANT_POWER_WATTS field in table
		final int tableOffset = 24;
		// Length in bytes of INT32 INSTANT_POWER_WATTS field
		final int tableLength = 4;

		int InstantPower_Watts;
		byte[] tableData = new byte[tableLength];

		Meter.readPartialTable(tableIdentifier, tableOffset, tableLength, tableData);

		// Convert returned Byte array to Int
		InstantPower_Watts = byteArrayToInt(tableData, 0, tableLength);
		return InstantPower_Watts;
	}

	/**
	 * Byte array to int.
	 *
	 * @param bytes
	 *            the bytes
	 * @param offset
	 *            the offset
	 * @param length
	 *            the length
	 * @return the int
	 */
	private static int byteArrayToInt(byte[] bytes, int offset, int length) {
		int i = 0;
		for (int j = 0; j < length; ++j) {
			i = (i << 8) | (bytes[offset + j] & 0xFF);
		}
		return i;
	}

}
