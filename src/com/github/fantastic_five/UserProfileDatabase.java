package com.github.fantastic_five;

import java.security.InvalidParameterException;
import java.util.HashSet;

/**
 * Stores all the UserProfiles
 * 
 * @author Fantastic Five
 *
 */
public class UserProfileDatabase
{
	private HashSet<UserProfile> users;

	/**
	 * Creates a UserProfileDatabase objects
	 */
	public UserProfileDatabase()
	{
		users = new HashSet<UserProfile>();
	}

	/**
	 * Checks to see if the implicit parameter has an element with the same userID as userID.
	 * 
	 * @param userID
	 *            The userID that is being searched for
	 * @return Returns true iff users contains an element e such that e.getUserID().equals(userID)
	 */
	public boolean hasUser(String userID)
	{
		boolean rVal = false;
		for (UserProfile e : users)
		{
			String testID = e.getUserID();
			rVal = testID.equals(userID);
			if (rVal)
			{
				break;
			}
		}
		return rVal;
	}

	/**
	 * Adds a new userProfile to the database iff !hasUser(user.getUserID)
	 * @param user The userProfile being added
	 * @return Returns true iff hasUser(user.getUserID)
	 */
	public boolean addUserProfile(UserProfile user)
	{
		String id = user.getUserID();
		boolean hasUser = this.hasUser(id);
		if (!hasUser)
		{
			users.add(user);
			id = user.getUserID();
		}
		return hasUser;
	}
	
	public UserProfile login(String userID, String password)
	{
		for(UserProfile e: users)
		{			
		}
		return null;
	}
	
}
