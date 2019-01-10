/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Work;

/**
 *
 * @author Ngo Huy
 */
public class Work {
    private int id;
    private String name;
    private String address;
    private String web;
    private String title;
    private String content;
    private String image;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getWeb() {
        return web;
    }

    public void setWeb(String web) {
        this.web = web;
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

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "Work{" + "id=" + id + ", name=" + name + ", address=" + address + ", web=" + web + ", title=" + title + ", content=" + content + ", image=" + image + '}';
    }

    public Work(int id, String name, String address, String web, String title, String content, String image) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.web = web;
        this.title = title;
        this.content = content;
        this.image = image;
    }

    public Work() {
    }
}
