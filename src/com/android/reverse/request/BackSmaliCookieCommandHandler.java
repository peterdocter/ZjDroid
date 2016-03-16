package com.android.reverse.request;

import com.android.reverse.collecter.DexFileInfoCollecter;
import com.android.reverse.collecter.ModuleContext;
import com.android.reverse.util.Logger;

public class BackSmaliCookieCommandHandler implements CommandHandler {

	private String cookie;

	public BackSmaliCookieCommandHandler(String cookie) {
		this.cookie = cookie;
	}

	@Override
	public void doAction() {
		// TODO Auto-generated method stub
		String filename = ModuleContext.getInstance().getAppContext().getFilesDir()+"/dexfile.dex";
		DexFileInfoCollecter.getInstance().backsmaliDexFileWithCookie(filename, cookie);
		Logger.log("the dexfile data save to ="+filename);
	}

}
