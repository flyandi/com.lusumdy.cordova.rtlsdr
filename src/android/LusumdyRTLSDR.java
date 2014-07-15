
package com.lusumdy.cordova;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.LinearLayoutSoftKeyboardDetect;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.PluginResult;
import org.apache.cordova.PluginResult.Status;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import android.app.Activity;
import android.view.WindowManager.LayoutParams;
import android.view.WindowManager;

import android.util.Log;
import android.view.View;
import android.content.Intent;
import android.net.Uri;

import java.util.Iterator;



/**
 * LusumdyRTLSDR
 */
public class LusumdyRTLSDR extends CordovaPlugin {

	public static final String TAG = "LusumdyRTLSDR";

	/** Cordova Actions. */
	public static final String ACTION_OPEN= "open";

	/**
	  * (cordova-execute)
	  */
	@Override
	public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
		// locals
		boolean result = false;

		// main
		try {
			// record action
			Log.d(TAG, action);

			// (open)
			if(ACTION_OPEN.equals(action)) {
				// arguments
				int INDEX_CONNECTIONPARAMS = 0;
			
				// run driver activity
				/*cordova.getActivity().runOnUiThread(new Runnable() {
					@Override 
					public void run() {*/

				callbackContext.error(args.getString(INDEX_CONNECTIONPARAMS));

				return false;


				// start activity
				//cordova.getActivity().startActivityForResult(new Intent(Intent.ACTION_VIEW).setData(Uri.parse("iqsrc://"+args.getString(AIX_ARGUMENTS))), args.getInt(AIX_REQCODE));

				// start tcp client 

				// success
				//callbackContext.success("OK");
				
			}

		}  catch (Exception ex) {
			callbackContext.error(ex.toString());
			return false;
		}

		return true;
	}
}