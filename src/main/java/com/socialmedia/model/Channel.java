package com.socialmedia.model;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class Channel {
    private static final int MAX_CONTENT_LENGTH = 280;
    private final String name;
    private final Set<User> subscribers;
    private final List<Post> posts;

    public Channel(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Channel name cannot be null or empty");
        }
        this.name = name;
        this.subscribers = Collections.synchronizedSet(new HashSet<>());
        this.posts = new CopyOnWriteArrayList<>();
    }

    public String getName() {
        return name;
    }

    public boolean subscribe(User user) {
        return false;
    }

    public boolean unsubscribe(User user) {
        return false;
    }

    public void addPost(Post post) {

    }

    public void postContent(String content) {

    }

    private void notifySubscribers(Post post) {

    }

    public Set<User> getSubscribers() {
        return Collections.unmodifiableSet(subscribers);
    }

    public List<Post> getPosts() {
        return Collections.unmodifiableList(posts);
    }

    public int getMaxContentLength() {
        return MAX_CONTENT_LENGTH;
    }
}
