package com.cn.sangshi.springCore.boot;

import com.cn.sangshi.springCore.context.ApplicationContext;

public class SangshiSpringApplication {

    public ApplicationContext run(String... args){
        ApplicationContext applicationContext = null;
        applicationContext = createApplicationContext();
        refreshContext(applicationContext);
        return applicationContext;
    }

    private ApplicationContext createApplicationContext(){
        return null;
    }

    private void refreshContext(ApplicationContext context){
        context.refresh();
    }

}
