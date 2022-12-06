package com.example.long2.models;

import javax.persistence.*;

@Entity
@Table(name = "tbl_comment")
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "commentID")
    private int commentID;
    private String content;
    private int status;
    private String createTime;
    private String author;
    private String email;
    private int postID;

    public Comment() {

    }

    public Comment(int commentID, String content, int status, String createTime, String author, String email, int postID) {
        this.commentID = commentID;
        this.content = content;
        this.status = status;
        this.createTime = createTime;
        this.author = author;
        this.email = email;
        this.postID = postID;
    }

    public int getCommentID() {
        return commentID;
    }

    public void setCommentID(int commentID) {
        this.commentID = commentID;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
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

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPostID() {
        return postID;
    }

    public void setPostID(int postID) {
        this.postID = postID;
    }
}
