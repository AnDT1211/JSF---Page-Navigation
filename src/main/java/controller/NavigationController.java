package controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import java.io.Serializable;

@ManagedBean(name = "navigationController", eager = true)
@RequestScoped
public class NavigationController implements Serializable {
    @ManagedProperty("param.pageId")
    String pageId = "1";

    public String getPageId() {
        if(pageId.equals("1")) return "page1";
        return "page2";
    }
}
