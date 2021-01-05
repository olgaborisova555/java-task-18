package vk;

import javax.swing.*;
import java.awt.*;
import java.net.URL;
import java.util.Date;

public class Post {
    private int id;
    private String ownerName;
    private URL ownerUrl;
    private Date postDate;
    private String text;
    private URL imageUrl;
    private int likes;
    private CommentsInfo commentsInfo;
    private int reposts;
    private int views;

    public int getId() {
        return id;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public URL getOwnerUrl() {
        return ownerUrl;
    }

    public Date getPostDate() {
        return postDate;
    }

    public String getText() {
        return text;
    }

    public URL getImageUrl() {
        return imageUrl;
    }

    public int getLikes() {
        return likes;
    }

    public CommentsInfo getCommentsInfo() {
        return commentsInfo;
    }

    public int getReposts() {
        return reposts;
    }

    public int getViews() {
        return views;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public void setOwnerUrl(URL ownerUrl) {
        this.ownerUrl = ownerUrl;
    }

    public void setPostDate(Date postDate) {
        this.postDate = postDate;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setImageUrl(URL imageUrl) {
        this.imageUrl = imageUrl;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public void setCommentsInfo(CommentsInfo commentsInfo) {
        this.commentsInfo = commentsInfo;
    }

    public void setReposts(int reposts) {
        this.reposts = reposts;
    }

    public void setViews(int views) {
        this.views = views;
    }
}

