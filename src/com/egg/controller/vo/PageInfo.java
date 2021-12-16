package com.egg.controller.vo;

import com.butegg.service.impl.AllServiceImpl;
import lombok.Data;

@Data
public class PageInfo {
    int page;
    final int size;
    int start;
    int end;
    int allEmp;
    int allPage;

    public PageInfo(int size,int page) {
        this.size = size;
        this.page = page;
        this.allEmp = new AllServiceImpl().sellectAllEmp().size();
        this.start = size*(page-1);
        this.end = (size*page)-1;
        if(allEmp%size==0){
            this.allPage=allEmp/size;
        }else {
            this.allPage = ((allEmp / size) + 1);
        }
    }

}
