
package com.lusumdy.cordova.screen;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.json.JSONArray;
import org.json.JSONException;

import android.app.Activity;
import android.view.WindowManager.LayoutParams;
import android.view.WindowManager;

/**
 * LusumdyScreen
 */
public class LusumdyScreen extends CordovaPlugin {

	public static final String TAG = "LusumdyScreen";


	/**
	  * (cordova-execute)
	  */
	@Override
	public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
		boolean result = false;

		switch(true) {
			case action.equals("keepOn"): 
				Log.i(TAG, "KeepOn");
				keepOn();
				break;

			case action.equals("setScreenBrightness"):
				Log.i(TAG, "setScreenBrightness");
				//setScreenBrightness(args, callbackContext);
				break;

			case action.equals("getScreenBrightness"):
				Log.i(TAG, "getScreenBrightness");
				//getBrightness(args, callbackContext);
				break;

			default:
				return false;
		}

		return true;
	}

	/**
      * (keepOn)
	  */
	private boolean keepOn() {
		// initialize
		Activity activity = cordova.getActivity();

		// set flags
		activity.getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);

		// return
		return true;
	},

}