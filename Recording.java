//filename: Recording.java
//date : 2/13/19
//Author: Eric 
//Class that defines a single recording and contains getter and setter methods for each field of data

public class Recording
{
	//private data fields
	private String songTitle;
	private String artist;
	private int playingTime; //playing time in seconds
	
	//Mutator methods (setters) for the fields in this class
	public void setSongTitle(String song)
	{
		songTitle = song;
	}
	
	public void setArtist(String a)
	{
		artist = a;
	}
	
	public void setPlayingTime(int time)
	{
		playingTime = time;
	}
	
	
	//Accessor methods (getters) for the fields in this class
	public String getSongTitle()
	{
		return songTitle;
	}

	public String getArtist()
	{
		return artist;
	}
	
	public int getPlayingTime()
	{
		return playingTime;
	}
}