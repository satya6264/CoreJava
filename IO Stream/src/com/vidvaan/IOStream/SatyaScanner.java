package com.vidvaan.IOStream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SatyaScanner {
	private BufferedReader br = null;
	private InputStreamReader isr = null;

	{
		isr = new InputStreamReader(System.in);
		br = new BufferedReader(isr);
	}

	public String next() {
		try {
			return br.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

	public int nextInt() {
		try {
			String data = br.readLine();
			return Integer.parseInt(data);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return 0;
	}

	public double nextDouble() {
		try {
			String data = br.readLine();
			return Double.parseDouble(data);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return 0.0;
	}

	@Override
	protected void finalize() throws Throwable {
		isr.close();
		br.close();
	}

}
