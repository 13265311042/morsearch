package com.morsearch.common.util.umeng;

import java.util.Arrays;
import java.util.HashSet;

import org.json.JSONObject;

public abstract class IOSNotification extends UmengNotification {

	// Keys can be set in the aps level
	protected static final HashSet<String> APS_KEYS = new HashSet<String>(Arrays.asList(new String[]{
			 "badge", "sound", "content-available"
	}));
	protected static final HashSet<String> ALERT_KEYS = new HashSet<String>(Arrays.asList(new String[]{
			"title", "subtitle", "body"}));



	@Override
	public boolean setPredefinedKeyValue(String key, Object value) throws Exception {
		if (ROOT_KEYS.contains(key)) {
			// This key should be in the root level
			rootJson.put(key, value);
		} else if (APS_KEYS.contains(key)) {
			// This key should be in the aps level
			JSONObject apsJson = null;
			JSONObject payloadJson = null;
			if (rootJson.has("payload")) {
				payloadJson = rootJson.getJSONObject("payload");
			} else {
				payloadJson = new JSONObject();
				rootJson.put("payload", payloadJson);
			}
			if (payloadJson.has("aps")) {
				apsJson = payloadJson.getJSONObject("aps");
			} else {
				apsJson = new JSONObject();
				payloadJson.put("aps", apsJson);
			}
			apsJson.put(key, value);
		} else if (ALERT_KEYS.contains(key)) {
			// This key should be in the body level
			JSONObject apsJson = null;
			JSONObject payloadJson = null;
			payloadJson = rootJson.getJSONObject("payload");
			apsJson = payloadJson.getJSONObject("aps");

			JSONObject alertJson = null;
			if (apsJson.has("alert")) {
				alertJson = apsJson.getJSONObject("alert");
			} else {
				alertJson = new JSONObject();
				apsJson.put("alert", alertJson);
			}
			alertJson.put(key, value);

		}

		else if (POLICY_KEYS.contains(key)) {
			// This key should be in the body level
			JSONObject policyJson = null;
			if (rootJson.has("policy")) {
				policyJson = rootJson.getJSONObject("policy");
			} else {
				policyJson = new JSONObject();
				rootJson.put("policy", policyJson);
			}
			policyJson.put(key, value);
		} else {
			if (key == "payload" || key == "aps" || key == "policy") {
				throw new Exception("You don't need to set value for " + key + " , just set values for the sub keys in it.");
			} else {
				throw new Exception("Unknownd key: " + key);
			}
		}
		
		return true;
	}
	// Set customized key/value for IOS notification
	public boolean setCustomizedField(String key, String value) throws Exception {
		//rootJson.put(key, value);
		JSONObject payloadJson = null;
		if (rootJson.has("payload")) {
			payloadJson = rootJson.getJSONObject("payload");
		} else {
			payloadJson = new JSONObject();
			rootJson.put("payload", payloadJson);
		}
		payloadJson.put(key, value);
		return true;
	}

}
