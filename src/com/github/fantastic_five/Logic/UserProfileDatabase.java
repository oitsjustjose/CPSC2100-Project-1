package com.github.fantastic_five;

import java.util.HashSet;

/**
@@ -45,7 +44,9 @@ public class UserProfileDatabase

	/**
	 * Adds a new userProfile to the database iff !hasUser(user.getUserID)
	 * 
	 * @param user
	 *            The userProfile being added
	 * @return Returns true iff hasUser(user.getUserID)
	 */
	public boolean addUserProfile(UserProfile user)
@@ -59,14 +60,29 @@ public class UserProfileDatabase
		}
		return hasUser;
	}
	

	/**
	 * Returns a userProfile with the specified userID and password, if such a userProfile exists in the database
	 * @param userID The userID of the userProfile being returned
	 * @param password The password of the userProfile being returned
	 * @return The userProfile associated with the explicit parameters. Returns null if the userID does not exist or the password is incorrect.
	 */
	public UserProfile login(String userID, String password)
	{
		UserProfile user = null;
		for (UserProfile e : users)
		{
			if (e.getUserID().equals(userID))
			{
				if (e.passwordIs(password))
				{
					user = e;
				}
				break;
			}
		}

		return user;
	}
	

}