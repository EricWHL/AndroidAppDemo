package com.example.androidappdemo.Fragment.placeholder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class PlaceholderContent {

    /**
     * An array of sample (placeholder) items.
     */
    public static final List<ChatItem> ITEMS = new ArrayList<ChatItem>();

    /**
     * A map of sample (placeholder) items, by ID.
     */
    public static final Map<String, ChatItem> ITEM_MAP = new HashMap<String, ChatItem>();

    private static final int COUNT = 25;

    static {
        // Add some sample items.
        for (int i = 1; i <= COUNT; i++) {
            addItem(createPlaceholderItem(i));
        }
    }

    private static void addItem(ChatItem item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }

    private static ChatItem createPlaceholderItem(int position) {
        return new ChatItem(String.valueOf(position), "Item " + position, makeDetails(position));
    }

    private static String makeDetails(int position) {
        StringBuilder builder = new StringBuilder();
        builder.append("Details about Item: ").append(position);
        for (int i = 0; i < position; i++) {
            builder.append("\nMore details information here.");
        }
        return builder.toString();
    }

    /**
     * A placeholder item representing a piece of content.
     */
    public static class ChatItem {
        public final String id;
        public final String mContent;
        public final String mName;

        public ChatItem(String id, String content, String name) {
            this.id = id;
            this.mContent = content;
            this.mName = name;
        }

        public String getContent() {
            return mContent;
        }

        public String getName() {
            return mName;
        }

        @Override
        public String toString() {
            return mContent;
        }
    }
}