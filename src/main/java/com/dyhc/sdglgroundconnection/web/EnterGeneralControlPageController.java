package com.dyhc.sdglgroundconnection.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Calendar;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 进入页面-控制器
 **/
@Controller
@RequestMapping("/General")
public class EnterGeneralControlPageController {

    // 日志对象
    private Logger logger = LoggerFactory.getLogger(EnterGeneralControlPageController.class);

    /**
     * git测试页面
     * @return
     */
    @RequestMapping("/index.html")
    public String enterIndex() {
        return "index";
    }

    /**
     * 分页demo1
     * @return
     */
    @RequestMapping("/PageDemo1.html")
    public String enterPageDemo1() {
        return "PageDemo1";
    }


    /**
     * 分页demo2
     * @return
     */
    @RequestMapping("/PageDemo2.html")
    public String enterPageDemo2() {
        return "PageDemo2";
    }

    /**
     * 进入计调首页
     * @return
     */
    @RequestMapping("/count-Adjust-Index.html")
    public String  countAdjustIndex() {
        return "General-control/index/count-Adjust-Index";
    }
    /**
     * 进入管理信息
     * @return
     */
    @RequestMapping("/admin-info.html")
    public String  admininfo() {
        return "General-control/index/admin-info";
    }
    /**
     * 进入article-add页
     * @return
     */
    @RequestMapping("/article-add.html")
    public String  articleadd() {
        return "General-control/index/article-add";
    }
    /**
     * 进入article-detail页
     * @return
     */
    @RequestMapping("/article-detail.html")
    public String  articledetail() {
        return "General-control/index/article-detail";
    }
    /**
     * 进入column-danye-detail页
     * @return
     */
    @RequestMapping("/column-danye-detail.html")
    public String  columndanyedetail() {
        return "General-control/index/column-danye-detail";
    }
    /**
     * 进入danye-detail页
     * @return
     */
    @RequestMapping("/danye-detail.html")
    public String  danyedetail() {
        return "General-control/index/danye-detail";
    }
    /**
     * 进入danye-list页
     * @return
     */
    @RequestMapping("/danye-list.html")
    public String  danyelisthtml() {
        return "General-control/index/danye-list";
    }
    /**
     * 进入email页
     * @return
     */
    @RequestMapping("/email.html")
    public String  email() {
        return "General-control/index/email";
    }
    /**
     * 进入email-write页
     * @return
     */
    @RequestMapping("/email-write.html")
    public String  emailwrite() {
        return "General-control/index/email-write";
    }
    /**
     * 进入login页
     * @return
     */
    @RequestMapping("/login.html")
    public String  login() {
        return "General-control/index/login";
    }
    /**
     * 进入menu1页
     * @return
     */
    @RequestMapping("/menu1.html")
    public String  menu1() {
        return "General-control/index/menu1";
    }
    /**
     * 进入menu2页
     * @return
     */
    @RequestMapping("/menu3.html")
    public String  menu3(Model model) {
        Calendar cale = Calendar.getInstance();
        int year=cale.get(Calendar.YEAR);
        int month = cale.get(Calendar.MONTH) + 1;
        model.addAttribute("year",year);
        model.addAttribute("month",month);
        return "General-control/index/menu3";
    }
    /**
     * 进入menu2页
     * @return
     */
    @RequestMapping("/menu2.html")
    public String  menu2() {
        return "General-control/index/menu2";
    }
    /**
     * 进入menu-add页
     * @return
     */
    @RequestMapping("/menu-add.html")
    public String  menuadd() {
        return "General-control/index/menu-add";
    }
    /**
     * 进入menu-add2页
     * @return
     */
    @RequestMapping("/menu-add2.html")
    public String  menuadd2() {
        return "General-control/index/menu-add2";
    }
    /**
     * 进入rbac-admin页
     * @return
     */
    @RequestMapping("/rbac-admin.html")
    public String  rbacadmin() {
        return "General-control/index/rbac-admin";
    }
    /**
     * 进入rbac-user-list页
     * @return
     */
    @RequestMapping("/rbac-user-list.html")
    public String  rbacuserlist() {
        return "General-control/index/rbac-user-list";
    }
    /**
     * 进入system页
     * @return
     */
    @RequestMapping("/system.html")
    public String  system() {
        return "General-control/index/system";
    }
    /**
     * 进入welcome页
     * @return
     */
    @RequestMapping("/welcome.html")
    public String  welcome() {
        return "General-control/index/welcome";
    }

    /**
     * 进入welcome页
     * @return
     */
    @RequestMapping("/guide-schedule.html")
    public String  guideschedule() {
        return "General-control/index/guide-schedule.html";
    }

}