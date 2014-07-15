
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
public class LusumdyRTLSDR extends CordovaPlugin {

	public static final String TAG = "LusumdyRTLSDR";


	/**
	  * (cordova-execute)
	  */
	@Override
	public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
		boolean result = false;

		Log.d(TAG, action);

		switch(true) {
			case action.equals("initialize"): 
				initialize(args);
				break;

			default:
				return false;
		}

		return true;
	}

	/**
      * (initialize)
	  */
	private boolean initialize(args) {
		// arguments
		int AIX_REQCODE = 1, AIX_ARGUMENTS = 0;
		
		// initialize
		Activity activity = cordova.getActivity();

		// start activity
		*startActivityForResult(new Intent(Intent.ACTION_VIEW).setData(Uri.parse("iqsrc://"+args.getString(AIX_ARGUMENTS), args.getInt(AIX_REQCODE));

		// parse result

		// return
		return true;
	},

}