package test;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.json.JSONArray;
import org.json.JSONException;


public class TestAppPlugin2 extends CordovaPlugin {
	
    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        if (action.equals("show")) {
        callbackContext.success("now its working...");
            return true;
        }
        return false;
    }   
}