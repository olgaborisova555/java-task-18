package vk;

import javax.swing.*;
import java.awt.*;
import java.net.URL;
import java.util.Date;

public class Post {
    private int id;
    private Date postDate;
    private String text;
    private URL imageUrl;
    private LikesInfo likes;
    private CommentsInfo commentsInfo;
    private RepostInfo reposts;
    private ViewsInfo views;

    public int getId() {
        return id;
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

    public LikesInfo getLikes() {
        return likes;
    }

    public CommentsInfo getCommentsInfo() {
        return commentsInfo;
    }

    public RepostInfo getReposts() {
        return reposts;
    }

    public ViewsInfo getViews() {
        return views;
    }

    public void setId(int id) {
        this.id = id;
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

    public void setLikes(LikesInfo likes) {
        this.likes = likes;
    }

    public void setCommentsInfo(CommentsInfo commentsInfo) {
        this.commentsInfo = commentsInfo;
    }

    public void setReposts(RepostInfo reposts) {
        this.reposts = reposts;
    }

    public void setViews(ViewsInfo views) {
        this.views = views;
    }
}

