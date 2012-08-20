package traversals;

import tester.ISame;

/**
 * A class to represent a song recording
 */
public class Song implements ISame<Song> {
	/**
	 * the title of the song
	 */
	protected String title;
	/**
	 * the playing time for this song -- in seconds
	 */
	private int time;
	/**
	 * A counter
	 */
	public static int counter = 0;

	/**
	 * Constructor
	 *
	 * @param title the title of the song
	 * @param time  the playing time for this song
	 */
	public Song(String title, int time) {
		this.title = title;
		this.time = time;
		counter = counter + 1;
	}

	/**
	 * A method that does unusual comparison of this
	 * <CODE>{@link Song Song}</CODE> object with two others --
	 * succeeds if the total playing time is 10
	 *
	 * @param two   the second <CODE>{@link Song Song}</CODE> to
	 *              contribute to the total playing time
	 * @param three the third <CODE>{@link Song Song}</CODE> to
	 *              contribute to the total playing time
	 * @return true if the total playing time of all three
	 *         <CODE>{@link Song Song}</CODE>s is 10
	 */
	public boolean tenMinutesTotal(Song two, Song three) {
		return this.time + two.time + three.time == 10;
	}

	/**
	 * A method used to test protected method invocation
	 * and a return value other than boolean
	 *
	 * @param that a song to compare with
	 * @return the shorter song between this and that
	 */
	@SuppressWarnings("unused")
	private Song shorter(Song that) {
		if (this.time < that.time)
			return this;
		else
			return that;
	}

	/**
	 * Is this song the same as that song?
	 *
	 * @param that the song to compare with
	 * @return true if this song is the same as that song
	 */
	public boolean same(Song that) {
		return this.sameTitle(that.title) &&
		this.time == that.time;
	}

	/**
	 * Does this song have same title as that song
	 * 
	 * @param that the song to compare with
	 * @return true if title of this song is same as that song
	 */
	private boolean sameTitle(String that) {
		return this.title.equals(that);
	}
}