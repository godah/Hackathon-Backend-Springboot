package com.acn.sustainability.hackathon.dto;

import java.io.Serializable;

public class PageableDto implements Serializable {

    Integer page = 1;
    Integer size = 10;

    public Integer getPage() {
        return this.page;
    }
    
    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getSize() {
        return this.size;
    }
    
    public void setSize(Integer size) {
        this.size = size;
    }
}
