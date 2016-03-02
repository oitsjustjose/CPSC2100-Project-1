package com.github.fantastic_five.Logic;

public class Course
{
	private int CRN;
	private String name;
	private int section;
	private String desc;
	private String day;
	private String time;
	private int capacity;

	/**
	 * 
	 * @param CRN
	 *            Unique CRN number
	 * @param name
	 *            Name of the course
	 * @param section
	 *            The Section number of the course
	 * @param description
	 *            Like "English I", or "Intro to OS"
	 * @param day
	 *            Convention: "MTWTrF"
	 * @param time
	 *            Military Time; Convention: "09:00-13:00"
	 * @param capacity
	 *            Max students that can be in the class
	 */
	public Course(int CRN, String name, int section, String description, String day, String time, int capacity)
	{
		this.CRN = CRN;
		this.name = name;
		this.section = section;
		this.desc = description;
		this.day = day;
		this.time = time;
		this.capacity = capacity;
	}

	public int getCRN()
	{
		return this.CRN;
	}

	public String getName()
	{
		return this.name;
	}

	public int getSection()
	{
		return this.section;
	}

	public String getDesc()
	{
		return this.desc;
	}

	public String getDays()
	{
		return this.day;
	}

	public String getTimes()
	{
		return this.time;
	}

	public int getCap()
	{
		return this.capacity;
	}

	@Override
	public String toString()
	{
		return CRN + " | " + name + " | " + section + " | " + desc + " | " + day + " | " + time + " | " + capacity;
	}
}
