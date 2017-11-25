package com.android.inputmethod.database;

public class CustomEmoji {
	String _keyword;
	String _emojiUnicode;

	public CustomEmoji() {
		_keyword = "";
		_emojiUnicode = "";
	}

	public String getEmojiUnicode() {
		return this._emojiUnicode;
	}

	public String getKeyword() {
		return this._keyword;
	}

	public void setEmoji(String keyword, String emojiUnicode) {
		this._emojiUnicode = emojiUnicode;
		this._keyword = keyword;
	}
}
