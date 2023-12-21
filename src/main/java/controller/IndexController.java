package controller;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class IndexController {
    String toSecondPage = "page2";

    public String getToSecondPage() {
        return toSecondPage;
    }

    public void setToSecondPage(String toSecondPage) {
        this.toSecondPage = toSecondPage;
    }
}
