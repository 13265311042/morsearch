package com.morsearch.vo;



import java.util.List;

/**
 * 树 json model 数据
 * @author
 *
 */
public class JsonTreeData {
    private String id;       //json id
    private String pid;      //
    private String text;     //json 显示文本
    private String state;    //json 'open','closed'
    private List<JsonTreeData> children;       //



    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getText() {
        return text;
    }
    public void setText(String text) {
        this.text = text;
    }
    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }
    public List<JsonTreeData> getChildren() {
        return children;
    }
    public void setChildren(List<JsonTreeData> children) {
        this.children = children;
    }
    public String getPid() {
        return pid;
    }
    public void setPid(String pid) {
        this.pid = pid;
    }
}
