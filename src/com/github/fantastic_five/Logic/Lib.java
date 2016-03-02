package com.github.fantastic_five.Logic;

import java.util.ArrayList;

public class Lib
{
	public static final ArrayList<Course> masterCourseList = new ArrayList<Course>();

	public static void removeMatchingCRN(int CRN)
	{
		for (int i = 0; i < masterCourseList.size(); i++)
		{
			if (masterCourseList.get(i).getCRN() == CRN)
			{
				masterCourseList.remove(i);
				return;
			}
		}
	}
}
