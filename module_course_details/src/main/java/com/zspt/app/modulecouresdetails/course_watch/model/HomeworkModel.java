package com.zspt.app.modulecouresdetails.course_watch.model;

/**
 * Created by yuequan on 2017/10/23.
 */

public class HomeworkModel {
    private String title;
    private String id;

    private String content;
    private String time;

    public HomeworkModel() {
    }

    public HomeworkModel(String title, String id, String content, String time) {
        this.title = title;
        this.id = id;

        this.content = content;
        this.time = time;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
