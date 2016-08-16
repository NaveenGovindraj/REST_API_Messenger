package org.java.rest_api.messenger.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.java.rest_api.messenger.database.DatabaseClass;
import org.java.rest_api.messenger.model.Profile;

public class ProfileService {

	private Map<String, Profile> profiles = DatabaseClass.getProfiles();

	public ProfileService() {
		profiles.put("Naveen", new Profile(1L, "Naveen", "Naveen Kumar", "Govindarajan"));
		profiles.put("Admin", new Profile(2L, "Admin", "User", "admininstrator"));
	}

	public List<Profile> getAllProfiles() {
		return new ArrayList<Profile>(profiles.values());
	}

	public Profile getProfile(String profileName) {
		return profiles.get(profileName);
	}

	public Profile addProfile(Profile profile) {
		profile.setId(profiles.size() + 1);
		profiles.put(profile.getProfileName(), profile);
		return profile;
	}

	public Profile updateProfile(Profile profile) {
		if (profile.getProfileName().isEmpty()) {
			return null;
		}
		profiles.put(profile.getProfileName(), profile);
		return profile;
	}

	public Profile removeProfile(String profileName) {

		return profiles.remove(profileName);
	}

}
