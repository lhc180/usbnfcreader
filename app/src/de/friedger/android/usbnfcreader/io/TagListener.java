package de.friedger.android.usbnfcreader.io;

public interface TagListener {

	void onTag(String tagId);
	
	void onError(String message);
}
