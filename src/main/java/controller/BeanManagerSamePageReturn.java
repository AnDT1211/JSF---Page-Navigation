package controller;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class BeanManagerSamePageReturn {
    public String toPage1() { return "page"; }
    public String toPage2() { return "page"; }
}
