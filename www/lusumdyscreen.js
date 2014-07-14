/** 
  * @Name Lusumdy Screen Functions
  * @Description A Cordova 3.x Plugin that helps to control the screen 
  * @Author	Andy Schwarz (flyandi/Lusumdy)
  * @Version 1.0
  */

// (initialize)
var exec = require("cordova/exec"),
	libName = 'LusumdyScreen';

// (class)
var LusumdyScreen = {

 	/** 
 	  * Keep the screen on
 	  */
 	keepOn: function(successCallback, errorCallback) {
 		return cordova.exec(successCallback, errorCallback, libName, 'keepOn', []);
 	},

 	/**
 	  * Set Screen Brightness
 	  */
 	setScreenBrightness: function(value, successCallback, errorCallback) {
 		return cordova.exec(successCallback, errorCallback, libName, 'setScreenBrightness', [value]);
 	},

 	/** 
 	  * Get Screen Brightness
 	  */
 	getScreenBrightness: function(successCallback, errorCallback) {
 		return cordova.exec(successCallback, errorCallback, libName, 'getScreenBrightness', []);
 	}
};

// (export)
module.exports= LusumdyScreen;