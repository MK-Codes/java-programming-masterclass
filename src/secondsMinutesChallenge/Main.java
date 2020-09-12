package secondsMinutesChallenge;

public class Main {

	public static void main(String[] args) {

		System.out.println(getDurationString(7199));
		System.out.println(getDurationString(7200));
		System.out.println(getDurationString(0));
		System.out.println(getDurationString(40));
	}

	public static String getDurationString(int minutes, int seconds) {
		if ((minutes < 0) || (seconds < 0) || (seconds > 59)) {
			return "Invalid value";
		}

		int mHours = minutes/60;
		int mMinutes = minutes - (mHours*60);
		return String.format("%02dh ", mHours) + String.format("%02dm ", mMinutes) + String.format("%02ds", seconds);
	}

	public static String getDurationString(int seconds) {

		if (seconds < 0) {
			return "Invalid value";
		}

		int mMinutes = seconds / 60;
		int mSeconds = seconds - (mMinutes * 60);
		return getDurationString(mMinutes, mSeconds);
	}
}
