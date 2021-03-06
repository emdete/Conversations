package eu.siacs.conversations;

import android.graphics.Bitmap;

public final class Config {

	public static final String LOGTAG = "conversations";

	public static final int PING_MAX_INTERVAL = 300;
	public static final int PING_MIN_INTERVAL = 30;
	public static final int PING_TIMEOUT = 10;
	public static final int CONNECT_TIMEOUT = 90;
	public static final int CARBON_GRACE_PERIOD = 60;
	public static final int MINI_GRACE_PERIOD = 750;

	public static final int AVATAR_SIZE = 192;
	public static final Bitmap.CompressFormat AVATAR_FORMAT = Bitmap.CompressFormat.WEBP;

	public static final int MESSAGE_MERGE_WINDOW = 60;

	public static final int  PROGRESS_UI_UPDATE_INTERVAL = 750;

	public static final boolean NO_PROXY_LOOKUP = false; //useful to debug ibb

	private Config() {

	}
}
