
/** 
  * @Name Lusumdy RTL SDR
  * @Description A Cordova 3.x Plugin that implements RTL SDR functionality
  * @Author	Andy Schwarz (flyandi/Lusumdy)
  * @Version 1.0
  */

// (initialize)
var exec = require("cordova/exec"),
	libName = 'LusumdyRTLSDR';

// (class)
var LusumdyRTLSDR = {

	/**
	  * construct
	  */
	construct: function() {
		// create some meta data
		this.requestId = Math.floor((Math.random() * 1024) + 1);
	},


 	/** 
 	  * open
 	  */
 	open: function(connectionParams, successCallback, errorCallback) {
 		// format 
 		return cordova.exec(successCallback, errorCallback, libName, 'open', [
 			connectionParams
 		]);
 	},

 	
};

// (constructor)
LusumdyRTLSDR.construct();

// (export)
module.exports= LusumdyRTLSDR;