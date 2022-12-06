package com.example.long2.models;

import javax.persistence.*;

@Entity
@Table(name = "tbl_post")
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "postID")
    private int postID;
    private String title;
    private String content;
    private String tags;
    private int status;
    private String createTime;
    private String updateTime;
    private int authorID;

    public Post() {

    }

    public Post(int postID, String title, String content, String tags, int status, String createTime, String updateTime, int authorID) {
        this.postID = postID;
        this.title = title;
        this.content = content;
        this.tags = tags;
        this.status = status;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.authorID = authorID;
    }

    public int getPostID() {
        return postID;
    }

    public void setPostID(int postID) {
        this.postID = postID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public int getAuthorID() {
        return authorID;
    }

    public void setAuthorID(int authorID) {
        this.authorID = authorID;
    }
}
